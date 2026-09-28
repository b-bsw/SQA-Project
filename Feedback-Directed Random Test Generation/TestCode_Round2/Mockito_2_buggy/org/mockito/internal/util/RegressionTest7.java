package org.mockito.internal.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "1) test3501(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "1) test3501(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass21 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "2) test3502(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "2) test3502(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "1) test3502(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "1) test3502(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "1) test3502(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean7 = false; // flaky "1) test3502(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean8 = false; // flaky "1) test3502(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "3) test3505(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "4) test3510(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "5) test3512(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "3) test3512(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "6) test3515(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "4) test3515(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "7) test3516(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        boolean boolean2 = false; // flaky "8) test3520(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        boolean boolean2 = false; // flaky "9) test3521(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "5) test3521(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "2) test3521(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "10) test3522(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "6) test3522(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "3) test3522(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "2) test3522(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "2) test3522(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "11) test3524(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "12) test3525(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "13) test3526(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "7) test3526(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "4) test3526(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "14) test3527(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "8) test3527(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "15) test3529(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "9) test3529(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass22 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "16) test3530(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "10) test3530(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "5) test3530(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "17) test3531(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "11) test3531(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "6) test3531(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "3) test3531(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        boolean boolean2 = false; // flaky "18) test3533(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "19) test3534(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "12) test3534(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "7) test3534(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "20) test3536(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "21) test3537(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "13) test3537(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "22) test3538(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "23) test3539(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "14) test3539(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "24) test3543(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "15) test3543(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "25) test3544(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "26) test3547(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "16) test3547(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "27) test3548(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "17) test3548(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "28) test3556(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "18) test3556(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "29) test3558(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "19) test3558(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "30) test3559(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "20) test3559(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "31) test3560(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "32) test3561(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "33) test3562(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "21) test3562(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "8) test3562(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "34) test3568(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "22) test3568(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "35) test3573(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "23) test3573(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        timer1.start();
        boolean boolean21 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "36) test3576(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "24) test3576(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "37) test3577(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "38) test3579(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "25) test3579(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "39) test3580(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "40) test3581(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "41) test3584(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "26) test3584(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass21 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "42) test3586(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "43) test3588(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "44) test3589(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "45) test3591(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "46) test3593(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "27) test3593(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass21 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 0);
        boolean boolean2 = false; // flaky "47) test3598(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "28) test3598(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
// flaky "4) test3599(org.mockito.internal.util.RegressionTest7)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "48) test3600(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "29) test3600(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "49) test3601(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "50) test3605(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "51) test3606(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "30) test3606(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass21 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "52) test3612(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "53) test3613(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "31) test3613(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "54) test3617(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "32) test3617(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "9) test3617(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "55) test3620(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "56) test3622(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "33) test3622(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "10) test3622(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "5) test3622(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "57) test3623(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "34) test3623(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "58) test3625(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "59) test3626(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "35) test3626(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "60) test3627(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "36) test3627(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "11) test3627(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "6) test3627(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "3) test3627(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "61) test3628(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "37) test3628(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "12) test3628(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "62) test3631(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "38) test3631(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "63) test3634(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "64) test3637(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "39) test3637(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "65) test3640(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "40) test3640(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "66) test3641(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "41) test3641(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "13) test3641(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "7) test3641(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "67) test3644(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "42) test3644(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "68) test3646(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "43) test3646(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "14) test3646(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "8) test3646(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        timer1.start();
        boolean boolean21 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "69) test3648(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "44) test3648(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "15) test3648(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "9) test3648(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "70) test3649(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "71) test3650(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "72) test3651(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "73) test3652(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "45) test3652(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "74) test3653(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "75) test3655(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "46) test3655(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "76) test3657(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "77) test3658(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "47) test3658(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "78) test3660(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "48) test3660(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "79) test3661(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "49) test3661(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "16) test3661(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "10) test3661(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "80) test3662(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "81) test3663(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "50) test3663(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "82) test3664(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "51) test3664(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        java.lang.Class<?> wildcardClass20 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "83) test3665(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "84) test3667(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "52) test3667(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "17) test3667(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "11) test3667(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "85) test3670(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "53) test3670(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "18) test3670(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "12) test3670(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "86) test3671(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "54) test3671(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "19) test3671(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "87) test3674(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "55) test3674(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "20) test3674(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "88) test3675(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "56) test3675(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "89) test3677(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "57) test3677(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "90) test3678(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "58) test3678(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "91) test3680(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "59) test3680(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "92) test3685(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "93) test3686(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "60) test3686(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "21) test3686(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "13) test3686(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "4) test3686(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean7 = false; // flaky "2) test3686(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        boolean boolean20 = timer1.isCounting();
        timer1.start();
        boolean boolean22 = timer1.isCounting();
        boolean boolean23 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean26 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass29 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        boolean boolean20 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        boolean boolean2 = false; // flaky "94) test3694(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "61) test3694(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "95) test3695(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "96) test3697(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "62) test3697(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "22) test3697(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "14) test3697(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "5) test3697(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "97) test3698(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "98) test3699(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "63) test3699(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "23) test3699(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "99) test3700(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "64) test3700(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "24) test3700(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "15) test3700(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "100) test3701(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "65) test3701(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "101) test3703(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "66) test3703(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        boolean boolean2 = false; // flaky "102) test3705(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "103) test3710(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "67) test3710(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "104) test3711(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "68) test3711(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "105) test3718(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "106) test3720(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "107) test3721(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "69) test3721(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "108) test3722(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "70) test3722(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "25) test3722(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "16) test3722(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "109) test3723(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "110) test3724(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "71) test3724(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "26) test3724(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "17) test3724(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "6) test3724(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "111) test3726(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "72) test3726(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "112) test3727(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "113) test3728(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "73) test3728(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "114) test3729(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "74) test3729(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "27) test3729(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "18) test3729(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "7) test3729(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "115) test3731(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "116) test3732(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "117) test3734(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "75) test3734(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "28) test3734(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "118) test3736(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "76) test3736(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "119) test3739(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "77) test3739(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        boolean boolean20 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "120) test3740(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "78) test3740(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass21 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "121) test3741(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "79) test3741(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "122) test3742(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "80) test3742(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "123) test3743(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "81) test3743(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "29) test3743(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "124) test3744(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "82) test3744(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "30) test3744(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "19) test3744(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "125) test3745(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "83) test3745(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "126) test3748(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "84) test3748(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "31) test3748(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "20) test3748(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "8) test3748(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "127) test3750(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "85) test3750(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "32) test3750(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "128) test3752(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "86) test3752(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "129) test3753(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "87) test3753(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "130) test3754(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "88) test3754(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "131) test3758(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "89) test3758(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "33) test3758(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "21) test3758(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "9) test3758(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "132) test3760(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "90) test3760(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "34) test3760(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "22) test3760(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "133) test3761(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "91) test3761(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "134) test3763(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "92) test3763(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "35) test3763(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "23) test3763(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "10) test3763(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean7 = false; // flaky "3) test3763(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "135) test3765(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "93) test3765(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "136) test3767(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "94) test3767(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "36) test3767(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "137) test3770(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "138) test3771(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "95) test3771(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "37) test3771(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "24) test3771(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "139) test3774(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "96) test3774(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "38) test3774(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "140) test3776(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "97) test3776(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "141) test3777(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "98) test3777(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "39) test3777(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "142) test3781(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "99) test3781(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "40) test3781(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "25) test3781(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "143) test3783(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "100) test3783(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "144) test3784(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "145) test3786(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "101) test3786(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "41) test3786(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "146) test3788(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "102) test3788(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "42) test3788(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "147) test3789(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "103) test3789(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "43) test3789(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "148) test3790(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "104) test3790(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "44) test3790(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "26) test3790(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "11) test3790(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean7 = false; // flaky "4) test3790(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "149) test3791(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "105) test3791(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "150) test3796(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "151) test3797(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "106) test3797(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "152) test3799(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "153) test3800(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "107) test3800(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "45) test3800(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "154) test3802(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "155) test3804(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "108) test3804(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "156) test3805(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "157) test3809(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "158) test3810(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "109) test3810(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "159) test3811(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "110) test3811(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "160) test3814(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "111) test3814(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "161) test3817(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "162) test3820(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "112) test3820(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "163) test3821(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "164) test3823(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "113) test3823(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "165) test3824(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        boolean boolean2 = false; // flaky "166) test3826(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "167) test3830(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "168) test3832(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "114) test3832(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        boolean boolean20 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "169) test3834(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "115) test3834(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        boolean boolean20 = timer1.isCounting();
        timer1.start();
        boolean boolean22 = timer1.isCounting();
        boolean boolean23 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean26 = timer1.isCounting();
        java.lang.Class<?> wildcardClass27 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "170) test3839(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "116) test3839(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "46) test3839(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "27) test3839(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "12) test3839(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "171) test3840(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "172) test3842(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "173) test3843(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "174) test3846(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "117) test3846(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "47) test3846(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "175) test3847(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "118) test3847(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "48) test3847(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "28) test3847(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "13) test3847(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean7 = false; // flaky "5) test3847(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean8 = false; // flaky "2) test3847(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "176) test3848(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "119) test3848(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "49) test3848(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "29) test3848(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean22 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "177) test3851(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "178) test3852(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "120) test3852(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "179) test3854(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "121) test3854(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "50) test3854(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "180) test3855(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "122) test3855(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "181) test3858(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "123) test3858(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "51) test3858(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "182) test3859(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "124) test3859(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "183) test3861(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "125) test3861(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "184) test3862(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "185) test3864(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "186) test3865(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "126) test3865(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "187) test3867(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "127) test3867(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "188) test3868(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "128) test3868(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "52) test3868(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "30) test3868(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "14) test3868(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "189) test3870(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "129) test3870(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "190) test3872(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "130) test3872(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "53) test3872(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "31) test3872(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "15) test3872(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean7 = false; // flaky "6) test3872(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "191) test3875(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "192) test3876(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "131) test3876(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "193) test3877(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "132) test3877(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "194) test3878(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "133) test3878(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "54) test3878(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "32) test3878(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "16) test3878(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean7 = false; // flaky "7) test3878(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "195) test3879(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "134) test3879(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "55) test3879(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "33) test3879(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "17) test3879(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        boolean boolean2 = false; // flaky "196) test3883(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "197) test3891(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "198) test3892(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "199) test3893(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "135) test3893(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "56) test3893(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        boolean boolean2 = false; // flaky "200) test3899(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "201) test3900(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "202) test3903(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "203) test3904(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "136) test3904(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "57) test3904(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "34) test3904(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "18) test3904(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean7 = false; // flaky "8) test3904(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "204) test3905(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "137) test3905(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "58) test3905(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "205) test3912(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "138) test3912(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "59) test3912(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "206) test3913(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "207) test3915(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "208) test3916(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "139) test3916(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean21 = timer1.isCounting();
        boolean boolean22 = timer1.isCounting();
        boolean boolean23 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "209) test3917(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "140) test3917(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "210) test3918(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "141) test3918(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "60) test3918(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "35) test3918(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "211) test3920(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "142) test3920(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "212) test3921(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "143) test3921(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "213) test3922(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "144) test3922(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "214) test3925(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "215) test3926(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "145) test3926(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "216) test3928(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "146) test3928(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "61) test3928(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "36) test3928(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "19) test3928(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean7 = false; // flaky "9) test3928(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean8 = false; // flaky "3) test3928(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "217) test3929(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "218) test3931(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "147) test3931(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "219) test3932(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "148) test3932(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass20 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "220) test3934(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "221) test3935(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "149) test3935(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "222) test3937(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "150) test3937(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "62) test3937(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "223) test3938(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "151) test3938(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "63) test3938(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "224) test3941(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "152) test3941(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "64) test3941(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "225) test3944(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "153) test3944(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean22 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "226) test3945(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "227) test3946(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "154) test3946(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "228) test3947(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "155) test3947(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        boolean boolean2 = false; // flaky "229) test3951(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "230) test3952(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "156) test3952(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "65) test3952(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "37) test3952(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean6 = false; // flaky "20) test3952(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean7 = false; // flaky "10) test3952(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean8 = false; // flaky "4) test3952(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "231) test3954(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "232) test3956(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "157) test3956(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "233) test3958(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "158) test3958(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        boolean boolean20 = timer1.isCounting();
        boolean boolean21 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "234) test3959(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "159) test3959(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "235) test3960(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "160) test3960(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "236) test3961(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "161) test3961(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "66) test3961(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "237) test3963(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "162) test3963(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "67) test3963(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "238) test3964(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "163) test3964(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "68) test3964(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "239) test3965(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "164) test3965(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        boolean boolean2 = false; // flaky "240) test3966(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "241) test3967(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "165) test3967(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "69) test3967(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "38) test3967(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "242) test3970(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "166) test3970(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "70) test3970(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "39) test3970(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "243) test3975(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "167) test3975(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "71) test3975(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "40) test3975(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "244) test3979(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "245) test3980(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "246) test3982(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "168) test3982(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        boolean boolean2 = false; // flaky "247) test3986(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "169) test3986(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean4 = false; // flaky "72) test3986(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean5 = false; // flaky "41) test3986(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "248) test3989(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "249) test3991(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "170) test3991(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "250) test3993(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "171) test3993(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "251) test3994(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "252) test3996(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        boolean boolean3 = false; // flaky "172) test3996(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "253) test4000(org.mockito.internal.util.RegressionTest7)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}
