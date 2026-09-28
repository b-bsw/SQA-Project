package org.mockito.internal.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "1) test3001(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "1) test3001(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "1) test3001(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "1) test3001(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "1) test3001(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "2) test3002(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "2) test3002(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "2) test3002(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "2) test3002(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
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
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "3) test3005(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "4) test3007(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "5) test3008(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "3) test3008(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "6) test3009(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "4) test3009(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "3) test3009(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "3) test3009(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "7) test3010(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "5) test3010(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "4) test3010(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "8) test3013(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "6) test3013(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "9) test3014(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "7) test3014(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "10) test3020(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "11) test3023(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        boolean boolean2 = false; // flaky "12) test3024(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass20 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "13) test3028(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "14) test3029(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "15) test3030(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "8) test3030(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "16) test3034(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "17) test3038(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "18) test3039(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "9) test3039(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        boolean boolean2 = false; // flaky "19) test3040(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
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
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "20) test3042(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "10) test3042(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean14 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "21) test3043(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "11) test3043(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
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
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "22) test3045(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "12) test3045(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "23) test3047(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "13) test3047(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "24) test3048(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "14) test3048(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "5) test3048(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "25) test3049(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "15) test3049(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "6) test3049(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "26) test3051(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "16) test3051(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "7) test3051(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "4) test3051(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "27) test3054(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "28) test3057(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "17) test3057(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "8) test3057(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "5) test3057(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "29) test3058(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "18) test3058(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "9) test3058(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "6) test3058(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "30) test3059(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "31) test3064(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "19) test3064(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "32) test3065(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "20) test3065(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "33) test3066(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "21) test3066(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "10) test3066(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "7) test3066(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
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
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "34) test3069(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "22) test3069(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "35) test3070(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "23) test3070(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "36) test3071(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "24) test3071(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "11) test3071(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "8) test3071(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "2) test3071(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean7 = false; // flaky "1) test3071(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean8 = false; // flaky "1) test3071(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "37) test3078(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "25) test3078(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "38) test3081(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "26) test3081(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "39) test3083(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "40) test3085(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "27) test3085(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "41) test3086(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "28) test3086(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "42) test3087(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "29) test3087(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "12) test3087(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "9) test3087(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "43) test3089(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        java.lang.Class<?> wildcardClass20 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "44) test3092(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "45) test3094(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "30) test3094(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "46) test3099(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "31) test3099(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "47) test3105(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "48) test3106(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "32) test3106(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "49) test3107(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "33) test3107(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "13) test3107(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "10) test3107(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "3) test3107(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean7 = false; // flaky "2) test3107(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean8 = false; // flaky "2) test3107(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "50) test3108(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass20 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "51) test3112(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "52) test3113(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "53) test3114(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "34) test3114(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "54) test3115(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "35) test3115(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "55) test3116(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "36) test3116(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        timer1.start();
        timer1.start();
        boolean boolean23 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "56) test3119(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "37) test3119(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "14) test3119(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "11) test3119(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "57) test3121(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "38) test3121(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "15) test3121(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "58) test3123(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "39) test3123(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "59) test3124(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "60) test3127(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "40) test3127(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "16) test3127(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "12) test3127(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "4) test3127(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean7 = false; // flaky "3) test3127(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
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
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "61) test3130(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "62) test3135(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "41) test3135(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "63) test3136(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "64) test3137(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "42) test3137(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "65) test3141(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "43) test3141(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "66) test3142(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "44) test3142(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        boolean boolean20 = timer1.isCounting();
        boolean boolean21 = timer1.isCounting();
        java.lang.Class<?> wildcardClass22 = timer1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "67) test3143(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "68) test3146(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "45) test3146(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "17) test3146(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "13) test3146(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "69) test3151(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "46) test3151(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        boolean boolean27 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "70) test3154(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "47) test3154(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "18) test3154(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "14) test3154(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "71) test3157(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "48) test3157(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "19) test3157(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "15) test3157(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        boolean boolean20 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "72) test3160(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "49) test3160(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "73) test3164(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "50) test3164(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "74) test3165(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "75) test3166(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "76) test3168(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "51) test3168(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "77) test3170(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "52) test3170(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "78) test3173(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "53) test3173(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "20) test3173(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "16) test3173(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "5) test3173(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean7 = false; // flaky "4) test3173(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean8 = false; // flaky "3) test3173(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "79) test3174(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "54) test3174(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass21 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "80) test3176(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "81) test3178(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "55) test3178(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "21) test3178(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "17) test3178(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "82) test3181(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "83) test3184(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
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
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "84) test3191(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "56) test3192(org.mockito.internal.util.RegressionTest6)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "85) test3194(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "57) test3194(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "86) test3195(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "58) test3195(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "87) test3197(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "59) test3197(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "88) test3199(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "89) test3204(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "60) test3204(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "90) test3210(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "91) test3214(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "92) test3215(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "61) test3215(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "93) test3216(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
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
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "94) test3218(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "62) test3218(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "95) test3219(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "96) test3223(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "63) test3223(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "97) test3228(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "64) test3228(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "98) test3229(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "65) test3229(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "99) test3231(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "66) test3231(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "100) test3232(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "67) test3232(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "101) test3233(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "68) test3233(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "102) test3234(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "69) test3234(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        timer1.start();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        boolean boolean20 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "103) test3238(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "70) test3238(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "104) test3239(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "71) test3239(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "22) test3239(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "18) test3239(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "6) test3239(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean7 = false; // flaky "5) test3239(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean8 = false; // flaky "4) test3239(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
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
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "105) test3245(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "72) test3245(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "23) test3245(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "19) test3245(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "106) test3246(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "107) test3247(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "73) test3247(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "24) test3247(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "108) test3248(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "74) test3248(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "109) test3250(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "75) test3250(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
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
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "110) test3254(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "111) test3255(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "112) test3256(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "76) test3256(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "113) test3260(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "114) test3261(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "77) test3261(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "25) test3261(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "20) test3261(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "115) test3262(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "116) test3263(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "117) test3265(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "118) test3269(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "78) test3269(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "119) test3270(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "79) test3270(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "120) test3271(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "121) test3273(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "122) test3278(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "123) test3279(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean21 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "124) test3281(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "80) test3281(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "26) test3281(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "125) test3282(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "81) test3282(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "126) test3283(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "82) test3283(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        boolean boolean20 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean23 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "127) test3284(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "83) test3284(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "27) test3284(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "128) test3285(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "84) test3285(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "129) test3286(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "85) test3286(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "130) test3287(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "131) test3288(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "132) test3289(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "86) test3289(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "28) test3289(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "21) test3289(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "133) test3292(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "87) test3292(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "134) test3293(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "88) test3293(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "29) test3293(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
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
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "135) test3299(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
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
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "136) test3304(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "89) test3304(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "137) test3305(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "90) test3305(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "30) test3305(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "22) test3305(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "138) test3307(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "91) test3307(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "139) test3308(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "140) test3310(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "141) test3314(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "92) test3314(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "142) test3315(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "143) test3321(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "144) test3323(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "93) test3323(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "31) test3323(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "23) test3323(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "7) test3323(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean7 = false; // flaky "6) test3323(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "145) test3324(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "146) test3326(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "94) test3326(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "32) test3326(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "24) test3326(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "147) test3327(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "95) test3327(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "33) test3327(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "25) test3327(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "8) test3327(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
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
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "148) test3331(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "149) test3332(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "96) test3332(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
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
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "150) test3334(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "151) test3336(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "97) test3336(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
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
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
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
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "152) test3340(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "98) test3340(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "153) test3341(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "99) test3341(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "34) test3341(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "154) test3346(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "100) test3346(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "35) test3346(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "26) test3346(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "155) test3347(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "101) test3347(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "36) test3347(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "27) test3347(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "156) test3348(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "157) test3350(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "102) test3350(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "158) test3351(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "103) test3351(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
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
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "159) test3353(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "104) test3353(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "160) test3357(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "161) test3358(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "162) test3359(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "105) test3359(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
        java.lang.Class<?> wildcardClass21 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "163) test3364(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "106) test3364(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "37) test3364(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "28) test3364(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "9) test3364(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "164) test3368(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "165) test3376(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "107) test3376(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "166) test3377(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "108) test3377(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
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
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "167) test3381(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "168) test3386(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "109) test3386(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "169) test3387(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "110) test3387(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "38) test3387(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "170) test3388(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "111) test3388(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "171) test3390(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "112) test3390(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "39) test3390(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "172) test3392(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "173) test3393(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "113) test3393(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "40) test3393(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "29) test3393(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "10) test3393(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "174) test3394(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "114) test3394(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        java.lang.Class<?> wildcardClass20 = timer1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "175) test3395(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "115) test3395(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "41) test3395(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "30) test3395(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "11) test3395(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
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
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "176) test3398(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "116) test3398(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "177) test3399(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "117) test3399(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "178) test3400(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "118) test3400(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "42) test3400(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "31) test3400(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "179) test3401(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "119) test3401(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "43) test3401(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
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
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "180) test3403(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "120) test3403(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "181) test3404(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 0);
        boolean boolean2 = false; // flaky "182) test3410(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "121) test3410(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "183) test3411(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "122) test3411(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "184) test3416(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "123) test3416(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "185) test3417(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "124) test3417(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "186) test3418(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "125) test3418(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "187) test3419(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "126) test3419(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "188) test3420(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "127) test3420(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        boolean boolean20 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass23 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "189) test3422(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "128) test3422(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "190) test3423(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "129) test3423(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "44) test3423(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "191) test3425(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "192) test3426(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "193) test3428(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "194) test3429(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "130) test3429(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "45) test3429(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "195) test3430(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "196) test3431(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        timer1.start();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass20 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "197) test3434(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "131) test3434(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "198) test3435(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
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
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        timer1.start();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "199) test3439(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "132) test3439(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "200) test3440(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "133) test3440(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "46) test3440(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "32) test3440(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "201) test3441(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "134) test3441(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "202) test3443(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "135) test3443(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "47) test3443(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "203) test3446(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "204) test3447(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "136) test3447(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "205) test3448(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "137) test3448(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "48) test3448(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "33) test3448(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean17 = timer1.isCounting();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "206) test3450(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "138) test3450(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
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
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "207) test3453(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "139) test3453(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
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
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "208) test3455(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "140) test3455(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "49) test3455(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "34) test3455(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "12) test3455(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean7 = false; // flaky "7) test3455(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean8 = false; // flaky "5) test3455(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean9 = false; // flaky "1) test3455(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean10 = false; // flaky "1) test3455(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean11 = false; // flaky "1) test3455(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "209) test3457(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "141) test3457(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "210) test3459(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "142) test3459(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "211) test3460(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "143) test3460(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "212) test3462(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "144) test3462(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "213) test3465(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "214) test3467(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "145) test3467(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "50) test3467(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "215) test3468(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "146) test3468(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "216) test3471(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "147) test3471(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "217) test3472(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "148) test3472(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "51) test3472(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "35) test3472(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "13) test3472(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "218) test3477(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "149) test3477(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "52) test3477(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "219) test3478(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "150) test3478(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "53) test3478(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "36) test3478(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "14) test3478(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean7 = false; // flaky "8) test3478(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean8 = false; // flaky "6) test3478(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "220) test3479(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "151) test3479(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "54) test3479(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "221) test3480(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "152) test3480(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "222) test3484(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "153) test3484(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "55) test3484(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "37) test3484(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "15) test3484(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
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
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
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
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "223) test3491(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "224) test3492(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "154) test3492(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "225) test3493(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "155) test3493(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean4 = false; // flaky "56) test3493(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean5 = false; // flaky "38) test3493(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean6 = false; // flaky "16) test3493(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean7 = false; // flaky "9) test3493(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "226) test3495(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "227) test3496(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "156) test3496(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
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
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "228) test3499(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        boolean boolean3 = false; // flaky "157) test3499(org.mockito.internal.util.RegressionTest6)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
    }
}
