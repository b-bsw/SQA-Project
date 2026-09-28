package org.mockito.internal.util;

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
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "1) test5001(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "2) test5002(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "1) test5002(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "1) test5002(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "1) test5002(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
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
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "3) test5006(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "2) test5006(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "4) test5009(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "3) test5009(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "2) test5009(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "5) test5010(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "4) test5010(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "3) test5010(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "6) test5012(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "5) test5012(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
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
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
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
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "7) test5015(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "6) test5015(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "8) test5017(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "7) test5017(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean17 = timer1.isCounting();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "9) test5018(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "10) test5019(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "8) test5019(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "4) test5019(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "11) test5021(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "9) test5021(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "5) test5021(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
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
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
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
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
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
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "12) test5028(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "10) test5028(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "13) test5029(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "11) test5029(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "6) test5029(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "2) test5029(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "1) test5029(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
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
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "14) test5034(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "12) test5034(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
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
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "15) test5036(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "13) test5036(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "16) test5039(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "14) test5039(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "7) test5039(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "17) test5041(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "15) test5041(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "8) test5041(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "3) test5041(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "2) test5041(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "1) test5041(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean8 = false; // flaky "1) test5041(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "18) test5042(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "16) test5042(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "19) test5044(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "20) test5046(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
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
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
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
        boolean boolean20 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
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
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
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
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "21) test5052(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
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
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "22) test5053(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "17) test5053(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
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
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "23) test5058(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "24) test5060(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "18) test5060(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "9) test5060(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "4) test5060(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
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
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "25) test5063(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
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
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
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
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "26) test5068(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "19) test5068(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "27) test5070(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "28) test5071(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "20) test5071(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "10) test5071(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
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
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "29) test5072(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "21) test5072(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "11) test5072(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "5) test5072(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
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
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "30) test5075(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "31) test5077(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        boolean boolean20 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "32) test5078(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
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
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "33) test5079(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
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
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "34) test5083(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "35) test5084(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "22) test5084(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "12) test5084(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "6) test5084(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
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
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "36) test5086(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "23) test5086(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
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
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "37) test5089(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "24) test5089(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "38) test5090(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "39) test5091(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "25) test5091(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "13) test5091(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "40) test5092(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "26) test5092(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "41) test5093(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "42) test5094(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "27) test5094(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean20 = timer1.isCounting();
        boolean boolean21 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass24 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        boolean boolean2 = false; // flaky "43) test5095(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "44) test5096(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "45) test5097(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
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
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
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
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
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
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "46) test5103(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "28) test5103(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "14) test5103(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "7) test5103(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "47) test5104(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "29) test5104(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
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
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "48) test5107(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "30) test5107(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
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
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "49) test5111(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "31) test5111(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
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
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "50) test5114(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "32) test5114(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "51) test5115(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "33) test5115(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "52) test5117(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        boolean boolean20 = timer1.isCounting();
        boolean boolean21 = timer1.isCounting();
        java.lang.Class<?> wildcardClass22 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "53) test5118(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "34) test5118(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean18 = timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "54) test5119(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "35) test5119(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "15) test5119(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "8) test5119(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
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
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "55) test5121(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "36) test5121(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "56) test5122(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "37) test5122(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
// flaky "2) test5122(org.mockito.internal.util.RegressionTest10)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "57) test5125(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "38) test5125(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "16) test5125(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
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
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
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
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
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
        timer1.start();
        java.lang.Class<?> wildcardClass18 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "58) test5130(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "39) test5130(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "59) test5132(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "40) test5132(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "17) test5132(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "60) test5133(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "41) test5133(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "18) test5133(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "9) test5133(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "3) test5133(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "2) test5133(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
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
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "61) test5135(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "62) test5136(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "42) test5136(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "63) test5137(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "43) test5137(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "19) test5137(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "10) test5137(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "4) test5137(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "3) test5137(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
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
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
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
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "64) test5140(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "44) test5140(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "65) test5143(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "66) test5145(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "45) test5145(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "20) test5145(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "11) test5145(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
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
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "67) test5147(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "46) test5147(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
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
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "68) test5149(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "47) test5149(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass20 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
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
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "69) test5153(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "48) test5153(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "70) test5154(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "71) test5155(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "49) test5155(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
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
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "72) test5157(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "50) test5157(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "73) test5158(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "51) test5158(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
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
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "74) test5161(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "52) test5161(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "75) test5162(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "53) test5162(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "21) test5162(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "76) test5163(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "77) test5164(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "54) test5164(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean21 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "78) test5165(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "55) test5165(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "22) test5165(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "79) test5166(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "56) test5166(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "80) test5167(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "81) test5168(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "57) test5168(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "23) test5168(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "12) test5168(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "5) test5168(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "4) test5168(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean8 = false; // flaky "3) test5168(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean9 = false; // flaky "1) test5168(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "82) test5169(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "58) test5169(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
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
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "83) test5171(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
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
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "84) test5175(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "59) test5175(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "24) test5175(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "85) test5176(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "60) test5176(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "25) test5176(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
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
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "86) test5178(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "61) test5178(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "87) test5179(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "62) test5179(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "88) test5180(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "63) test5180(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "89) test5181(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
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
        timer1.start();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "90) test5183(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "64) test5183(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "26) test5183(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "13) test5183(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "91) test5184(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "65) test5184(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "27) test5184(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "14) test5184(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "6) test5184(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "5) test5184(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "92) test5186(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "93) test5187(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
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
        boolean boolean22 = timer1.isCounting();
        boolean boolean23 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "94) test5189(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "66) test5189(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "95) test5190(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "67) test5190(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "28) test5190(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "15) test5190(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "7) test5190(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "6) test5190(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean8 = false; // flaky "4) test5190(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean9 = false; // flaky "2) test5190(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "96) test5191(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
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
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        boolean boolean20 = timer1.isCounting();
        timer1.start();
        boolean boolean22 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "97) test5194(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "68) test5194(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "29) test5194(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "16) test5194(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "8) test5194(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "98) test5196(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "69) test5196(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "30) test5196(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "17) test5196(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "99) test5197(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "70) test5197(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "31) test5197(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "100) test5198(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "71) test5198(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "101) test5199(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
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
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "102) test5201(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "72) test5201(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "32) test5201(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "103) test5202(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "73) test5202(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "33) test5202(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "18) test5202(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "9) test5202(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "7) test5202(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "104) test5203(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "105) test5206(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "74) test5206(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "106) test5207(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "75) test5207(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean19 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
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
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
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
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "107) test5211(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "76) test5211(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "34) test5211(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "19) test5211(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "10) test5211(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "8) test5211(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "108) test5213(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "109) test5215(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "77) test5215(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "110) test5216(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "111) test5217(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "78) test5217(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "35) test5217(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "20) test5217(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "11) test5217(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "112) test5219(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "113) test5220(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        boolean boolean2 = false; // flaky "114) test5221(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "115) test5222(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "79) test5222(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "36) test5222(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "21) test5222(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
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
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "116) test5225(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "80) test5225(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "37) test5225(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "22) test5225(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "12) test5225(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "117) test5226(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "81) test5226(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean20 = timer1.isCounting();
        java.lang.Class<?> wildcardClass21 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "118) test5227(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "82) test5227(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean22 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "119) test5230(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "83) test5230(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "38) test5230(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "23) test5230(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
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
        boolean boolean18 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "120) test5232(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "84) test5232(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "121) test5233(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "122) test5234(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
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
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "123) test5237(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "85) test5237(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "39) test5237(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
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
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
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
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "124) test5240(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "86) test5240(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "40) test5240(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "125) test5241(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "87) test5241(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "41) test5241(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "126) test5242(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "88) test5242(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "127) test5243(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "128) test5244(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "129) test5245(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "130) test5248(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "131) test5250(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
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
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "132) test5253(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        boolean boolean19 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
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
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "133) test5256(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "89) test5256(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "42) test5256(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "24) test5256(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "13) test5256(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "134) test5257(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "90) test5257(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "43) test5257(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "25) test5257(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "14) test5257(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "135) test5258(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
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
        timer1.start();
        java.lang.Class<?> wildcardClass22 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "136) test5263(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "91) test5263(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "44) test5263(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
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
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "137) test5267(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "92) test5267(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "45) test5267(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "26) test5267(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "15) test5267(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "9) test5267(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean8 = false; // flaky "5) test5267(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "138) test5268(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
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
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "139) test5270(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "93) test5270(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "46) test5270(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "27) test5270(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "16) test5270(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "10) test5270(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean8 = false; // flaky "6) test5270(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "140) test5272(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "94) test5272(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
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
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "141) test5274(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "142) test5275(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        boolean boolean2 = false; // flaky "143) test5278(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "144) test5279(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "95) test5279(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "47) test5279(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
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
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "145) test5284(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "96) test5284(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
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
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "146) test5286(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "97) test5286(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "147) test5287(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "98) test5287(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "48) test5287(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "28) test5287(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "17) test5287(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "11) test5287(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "148) test5288(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "149) test5289(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "150) test5291(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
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
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
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
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
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
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "151) test5297(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "99) test5297(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "49) test5297(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "29) test5297(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "18) test5297(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "12) test5297(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "152) test5298(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
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
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "153) test5300(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "100) test5300(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
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
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "154) test5302(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "155) test5304(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "101) test5304(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "156) test5305(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
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
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "157) test5307(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "102) test5307(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "158) test5309(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "103) test5309(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "50) test5309(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "30) test5309(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "159) test5310(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "104) test5310(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "51) test5310(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "31) test5310(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "19) test5310(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "13) test5310(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean8 = false; // flaky "7) test5310(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "160) test5311(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "105) test5311(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "52) test5311(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "161) test5313(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "106) test5313(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "53) test5313(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "32) test5313(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
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
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "162) test5317(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "107) test5317(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "54) test5317(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "33) test5317(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "20) test5317(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "163) test5318(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "108) test5318(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        boolean boolean2 = false; // flaky "164) test5320(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "109) test5320(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "55) test5320(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "34) test5320(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "165) test5321(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "110) test5321(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "166) test5322(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "111) test5322(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "56) test5322(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
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
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "167) test5325(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "112) test5325(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "168) test5326(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "113) test5326(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "57) test5326(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "169) test5327(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "170) test5329(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "114) test5329(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "171) test5331(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "172) test5332(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "173) test5333(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "115) test5333(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "174) test5334(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "116) test5334(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "58) test5334(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
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
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
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
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "175) test5337(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
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
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
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
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
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
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
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
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "176) test5344(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "117) test5344(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean15 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
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
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
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
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "177) test5348(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "118) test5348(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
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
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean17 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "178) test5350(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "119) test5350(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "59) test5350(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "35) test5350(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "179) test5351(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "120) test5351(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "60) test5351(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "36) test5351(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
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
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "180) test5353(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean18 = timer1.isCounting();
        boolean boolean19 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "181) test5355(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "121) test5355(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "61) test5355(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "182) test5356(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "122) test5356(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean20 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
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
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
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
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
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
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "183) test5362(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "123) test5362(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "62) test5362(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "37) test5362(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "21) test5362(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "14) test5362(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean8 = false; // flaky "8) test5362(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "184) test5363(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "124) test5363(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "185) test5364(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "186) test5366(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "187) test5368(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "188) test5369(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "125) test5369(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "189) test5370(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "126) test5370(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "190) test5371(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "127) test5371(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean14 = timer1.isCounting();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "191) test5374(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "128) test5374(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "63) test5374(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "38) test5374(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
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
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "192) test5377(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "129) test5377(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "193) test5379(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "194) test5381(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "130) test5381(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "64) test5381(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "39) test5381(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "195) test5384(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "196) test5385(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "131) test5385(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "197) test5386(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
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
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "198) test5390(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "132) test5390(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "65) test5390(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "40) test5390(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "199) test5391(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "133) test5391(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "66) test5391(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "41) test5391(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "22) test5391(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "200) test5394(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "134) test5394(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
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
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "201) test5398(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "202) test5399(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "135) test5399(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "67) test5399(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "42) test5399(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "23) test5399(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
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
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
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
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
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
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
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
        java.lang.Class<?> wildcardClass20 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "203) test5406(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "136) test5406(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "68) test5406(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "43) test5406(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "204) test5407(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "205) test5408(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "137) test5408(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "69) test5408(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "44) test5408(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "206) test5409(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "138) test5409(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
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
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "207) test5411(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
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
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "208) test5413(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "139) test5413(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean20 = timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "209) test5414(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "210) test5416(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "140) test5416(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "211) test5417(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "212) test5418(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "141) test5418(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "213) test5420(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "142) test5420(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
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
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "214) test5422(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "143) test5422(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "70) test5422(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "45) test5422(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "215) test5424(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "144) test5424(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "216) test5426(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "217) test5427(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "145) test5427(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "71) test5427(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "218) test5428(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
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
        boolean boolean17 = timer1.isCounting();
        boolean boolean18 = timer1.isCounting();
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
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
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
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
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
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
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
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
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "219) test5435(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "146) test5435(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "220) test5439(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "221) test5440(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "147) test5440(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "222) test5441(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "148) test5441(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "72) test5441(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean16 = timer1.isCounting();
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "223) test5442(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "149) test5442(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "73) test5442(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "46) test5442(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
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
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "224) test5444(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "225) test5445(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "150) test5445(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean22 = timer1.isCounting();
        boolean boolean23 = timer1.isCounting();
        java.lang.Class<?> wildcardClass24 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
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
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "226) test5449(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "151) test5449(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
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
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "227) test5451(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
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
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
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
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
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
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "228) test5456(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "152) test5456(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "229) test5458(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "153) test5458(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "74) test5458(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "230) test5459(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "231) test5460(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "154) test5460(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
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
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
        timer1.start();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "232) test5465(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
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
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
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
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
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
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "233) test5469(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "155) test5469(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "75) test5469(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "234) test5471(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "235) test5476(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "156) test5476(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "76) test5476(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "47) test5476(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
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
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "236) test5478(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "157) test5478(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "77) test5478(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "48) test5478(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean6 = false; // flaky "24) test5478(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean7 = false; // flaky "15) test5478(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean8 = false; // flaky "9) test5478(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean9 = false; // flaky "3) test5478(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "237) test5481(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "158) test5481(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "78) test5481(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "238) test5482(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
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
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
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
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
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
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "239) test5488(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean14 = timer1.isCounting();
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "240) test5489(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "159) test5489(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        timer1.start();
        java.lang.Class<?> wildcardClass21 = timer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "241) test5490(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "160) test5490(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "79) test5490(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean15 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean18 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "242) test5491(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean16 = timer1.isCounting();
        boolean boolean17 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
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
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        boolean boolean2 = false; // flaky "243) test5494(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
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
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "244) test5496(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "161) test5496(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "80) test5496(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean5 = false; // flaky "49) test5496(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "245) test5497(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "162) test5497(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "81) test5497(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "246) test5499(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "163) test5499(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean4 = false; // flaky "82) test5499(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "247) test5500(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
        boolean boolean3 = false; // flaky "164) test5500(org.mockito.internal.util.RegressionTest10)": timer1.isCounting();
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
        boolean boolean14 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }
}
