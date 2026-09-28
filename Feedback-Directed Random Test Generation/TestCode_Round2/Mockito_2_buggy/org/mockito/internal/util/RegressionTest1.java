package org.mockito.internal.util;

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
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "1) test0501(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "1) test0501(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "2) test0502(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "3) test0504(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "2) test0504(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "4) test0506(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "3) test0506(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "5) test0507(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "4) test0507(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "6) test0508(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "5) test0508(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "7) test0510(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "6) test0510(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "8) test0512(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "7) test0512(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "1) test0512(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "1) test0512(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "1) test0512(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "9) test0513(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "10) test0516(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "11) test0519(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "8) test0519(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "12) test0521(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "13) test0522(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "14) test0523(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "9) test0523(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "2) test0523(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "15) test0524(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "10) test0524(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "3) test0524(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "16) test0526(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "17) test0527(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "18) test0528(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "11) test0528(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "19) test0535(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "12) test0535(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "20) test0536(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "13) test0536(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "21) test0537(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "14) test0537(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "22) test0538(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "15) test0538(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "4) test0538(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "23) test0541(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "16) test0541(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "5) test0541(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "2) test0541(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "24) test0545(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "25) test0547(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "17) test0547(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "26) test0549(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "27) test0552(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "18) test0552(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "28) test0553(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "29) test0554(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "19) test0554(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "6) test0554(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "3) test0554(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "30) test0557(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "20) test0557(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "7) test0557(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "4) test0557(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "2) test0557(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean7 = false; // flaky "1) test0557(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean8 = false; // flaky "1) test0557(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "31) test0558(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "21) test0558(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "8) test0558(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "5) test0558(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "32) test0559(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "33) test0564(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "22) test0564(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "34) test0566(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "23) test0566(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "9) test0566(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "35) test0568(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "24) test0568(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "10) test0568(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "6) test0568(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "36) test0569(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "25) test0569(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "11) test0569(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "7) test0569(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "3) test0569(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean7 = false; // flaky "2) test0569(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "37) test0570(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "38) test0572(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "39) test0573(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "26) test0573(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "12) test0573(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "8) test0573(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "4) test0573(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "40) test0574(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "27) test0574(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "13) test0574(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "41) test0576(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "28) test0576(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "14) test0576(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "9) test0576(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "42) test0580(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "2) test0580(org.mockito.internal.util.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        boolean boolean2 = false; // flaky "43) test0582(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "29) test0582(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "15) test0582(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "10) test0582(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "44) test0583(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "30) test0583(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "45) test0584(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "31) test0584(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "46) test0585(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "32) test0585(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "16) test0585(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "11) test0585(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "47) test0586(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "48) test0588(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "33) test0588(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "17) test0588(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "12) test0588(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "5) test0588(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "49) test0591(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "34) test0591(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "50) test0592(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "35) test0592(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        boolean boolean2 = false; // flaky "51) test0595(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "52) test0596(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "36) test0596(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "18) test0596(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "53) test0601(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "54) test0603(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "37) test0603(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "55) test0605(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "38) test0605(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "56) test0606(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "39) test0606(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "57) test0608(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "40) test0608(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "58) test0610(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "41) test0610(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "19) test0610(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "13) test0610(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "6) test0610(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "59) test0611(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "42) test0611(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "20) test0611(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "14) test0611(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "60) test0614(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "61) test0616(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "62) test0617(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "43) test0617(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "63) test0618(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "64) test0619(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "44) test0619(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "21) test0619(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "15) test0619(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "65) test0621(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "66) test0622(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "45) test0622(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "22) test0622(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "16) test0622(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "67) test0623(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "68) test0626(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "46) test0626(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "69) test0627(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "47) test0627(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "23) test0627(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "17) test0627(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        boolean boolean14 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "70) test0630(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "48) test0630(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "24) test0630(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "71) test0633(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "49) test0633(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "72) test0634(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "50) test0634(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "25) test0634(org.mockito.internal.util.RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "73) test0635(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "74) test0637(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "51) test0637(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "75) test0640(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "52) test0640(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "76) test0641(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "77) test0643(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "53) test0643(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "26) test0643(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "18) test0643(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "7) test0643(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "78) test0645(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "79) test0654(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "54) test0654(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "80) test0656(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "55) test0656(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "81) test0657(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "82) test0658(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "56) test0658(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "83) test0659(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "84) test0662(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "57) test0662(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "27) test0662(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "85) test0663(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "58) test0663(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
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
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "86) test0666(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "59) test0666(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "87) test0669(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "60) test0669(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "28) test0669(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "19) test0669(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "8) test0669(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean7 = false; // flaky "3) test0669(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "88) test0670(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "61) test0670(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "29) test0670(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "89) test0675(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "62) test0675(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "30) test0675(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "20) test0675(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "9) test0675(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "90) test0677(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "63) test0677(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "91) test0678(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "92) test0679(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "64) test0679(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "93) test0688(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "94) test0689(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "65) test0689(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "95) test0690(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "96) test0693(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "66) test0693(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "97) test0694(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "67) test0694(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "31) test0694(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "21) test0694(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "98) test0695(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "68) test0695(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        java.lang.Class<?> wildcardClass20 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "99) test0697(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "100) test0698(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "69) test0698(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "101) test0699(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "102) test0700(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "70) test0700(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "32) test0700(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "22) test0700(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "10) test0700(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean7 = false; // flaky "4) test0700(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean8 = false; // flaky "3) test0700(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "103) test0703(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "71) test0703(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        java.lang.Class<?> wildcardClass22 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "104) test0705(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "72) test0705(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "33) test0705(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "23) test0705(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "105) test0707(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "106) test0709(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "73) test0709(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "107) test0713(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "74) test0713(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
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
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "108) test0716(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "75) test0716(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "34) test0716(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "24) test0716(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
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
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "109) test0722(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "110) test0723(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "76) test0723(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "111) test0724(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "112) test0725(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "77) test0725(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "35) test0725(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "113) test0726(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "114) test0727(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "78) test0727(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "36) test0727(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "25) test0727(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "11) test0727(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean7 = false; // flaky "5) test0727(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean8 = false; // flaky "4) test0727(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean9 = false; // flaky "1) test0727(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "115) test0728(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "79) test0728(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "116) test0730(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "80) test0730(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "37) test0730(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "117) test0731(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "118) test0732(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "81) test0732(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "38) test0732(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "26) test0732(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "12) test0732(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean7 = false; // flaky "6) test0732(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean8 = false; // flaky "5) test0732(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "119) test0736(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "82) test0736(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "120) test0737(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "121) test0739(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "83) test0739(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "122) test0741(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "84) test0741(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "123) test0743(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "85) test0743(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "39) test0743(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "27) test0743(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "13) test0743(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "124) test0745(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "86) test0745(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "125) test0746(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "126) test0748(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "87) test0748(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "127) test0750(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "128) test0752(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "129) test0753(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "130) test0754(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "88) test0754(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "131) test0755(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "89) test0755(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
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
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "132) test0758(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "133) test0759(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "134) test0761(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "90) test0761(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "135) test0762(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "91) test0762(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "40) test0762(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "136) test0767(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "92) test0767(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "41) test0767(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "137) test0768(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "138) test0770(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "93) test0770(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "42) test0770(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "139) test0773(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "94) test0773(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "140) test0774(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "95) test0774(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "43) test0774(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "141) test0777(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "96) test0777(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        boolean boolean2 = false; // flaky "142) test0779(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "143) test0780(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "144) test0782(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "97) test0782(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "145) test0785(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "98) test0785(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "44) test0785(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "146) test0787(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "99) test0787(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "147) test0789(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "100) test0789(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "148) test0792(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
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
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        boolean boolean2 = false; // flaky "149) test0798(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "150) test0799(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "101) test0799(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "45) test0799(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "151) test0800(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "102) test0800(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "152) test0801(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "103) test0801(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "46) test0801(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "28) test0801(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "153) test0803(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "104) test0803(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "154) test0804(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "105) test0804(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "47) test0804(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "29) test0804(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "155) test0805(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "156) test0807(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
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
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
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
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "157) test0810(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "106) test0810(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "48) test0810(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "158) test0812(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 10);
        boolean boolean2 = false; // flaky "159) test0815(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "160) test0816(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "107) test0816(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "161) test0817(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "162) test0819(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "108) test0819(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "163) test0820(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "164) test0823(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "109) test0823(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "49) test0823(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "30) test0823(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "14) test0823(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean7 = false; // flaky "7) test0823(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean8 = false; // flaky "6) test0823(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "165) test0824(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "110) test0824(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "50) test0824(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "31) test0824(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "166) test0827(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "111) test0827(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "167) test0828(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "168) test0829(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "112) test0829(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "169) test0830(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "113) test0830(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "51) test0830(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "32) test0830(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "170) test0831(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "171) test0832(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "114) test0832(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "52) test0832(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "172) test0835(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        boolean boolean2 = false; // flaky "173) test0838(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "174) test0839(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "115) test0839(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "53) test0839(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "33) test0839(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "15) test0839(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "175) test0840(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "116) test0840(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "54) test0840(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "34) test0840(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "176) test0843(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "177) test0844(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "178) test0846(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "117) test0846(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "55) test0846(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "35) test0846(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "16) test0846(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        boolean boolean2 = false; // flaky "179) test0849(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "118) test0849(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "56) test0849(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "180) test0852(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "119) test0852(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "181) test0857(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "182) test0858(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "120) test0858(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "183) test0859(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "121) test0859(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "184) test0860(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "185) test0861(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "186) test0862(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "122) test0862(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "57) test0862(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "187) test0864(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "188) test0865(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "123) test0865(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "58) test0865(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "36) test0865(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "17) test0865(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean7 = false; // flaky "8) test0865(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "189) test0867(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "124) test0867(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "190) test0868(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "125) test0868(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "59) test0868(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "191) test0872(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "192) test0875(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "193) test0879(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "126) test0879(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "194) test0881(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "195) test0883(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "127) test0883(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "60) test0883(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "37) test0883(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "18) test0883(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean7 = false; // flaky "9) test0883(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean8 = false; // flaky "7) test0883(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "196) test0885(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "128) test0885(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "61) test0885(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "197) test0888(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "129) test0888(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "198) test0889(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
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
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        java.lang.Class<?> wildcardClass19 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "199) test0895(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "130) test0895(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "200) test0897(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "131) test0897(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "201) test0898(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "132) test0898(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "62) test0898(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "202) test0899(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "133) test0899(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "203) test0901(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "134) test0901(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "63) test0901(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "38) test0901(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "204) test0904(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        boolean boolean2 = false; // flaky "205) test0905(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "206) test0906(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "135) test0906(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "64) test0906(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "39) test0906(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "19) test0906(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "207) test0907(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "136) test0907(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "208) test0908(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "137) test0908(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "209) test0911(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "138) test0911(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "65) test0911(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "40) test0911(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "210) test0912(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "139) test0912(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "66) test0912(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        boolean boolean2 = false; // flaky "211) test0913(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "212) test0914(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "140) test0914(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "67) test0914(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "41) test0914(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "213) test0915(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "141) test0915(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "68) test0915(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "42) test0915(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "20) test0915(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "214) test0916(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "142) test0916(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "69) test0916(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "43) test0916(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "21) test0916(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "215) test0918(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "216) test0919(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "143) test0919(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "70) test0919(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 0);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
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
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "217) test0927(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "144) test0927(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "218) test0928(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "219) test0931(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "145) test0931(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "220) test0932(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "221) test0935(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "146) test0935(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "71) test0935(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "44) test0935(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "22) test0935(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "222) test0936(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "147) test0936(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "72) test0936(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "45) test0936(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        boolean boolean13 = timer1.isCounting();
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        boolean boolean2 = false; // flaky "223) test0937(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "224) test0938(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "225) test0939(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "148) test0939(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "73) test0939(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "226) test0942(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "149) test0942(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "227) test0945(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "150) test0945(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        java.lang.Class<?> wildcardClass20 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "228) test0954(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "229) test0955(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "230) test0956(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "151) test0956(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "74) test0956(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "46) test0956(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "23) test0956(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "231) test0959(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "152) test0959(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "75) test0959(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "47) test0959(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean6 = false; // flaky "24) test0959(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "232) test0960(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "153) test0960(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        boolean boolean15 = timer1.isCounting();
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "233) test0961(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "234) test0963(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "235) test0964(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "154) test0964(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "236) test0965(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "155) test0965(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "76) test0965(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "237) test0967(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "156) test0967(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "77) test0967(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean5 = false; // flaky "48) test0967(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "238) test0969(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "157) test0969(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "239) test0975(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
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
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "240) test0979(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "158) test0979(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "241) test0981(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "159) test0981(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "242) test0982(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "243) test0984(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "160) test0984(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "78) test0984(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "244) test0985(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "161) test0985(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "245) test0986(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "246) test0993(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "162) test0993(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "247) test0995(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "163) test0995(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "79) test0995(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "248) test0999(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean3 = false; // flaky "164) test0999(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
        boolean boolean4 = false; // flaky "80) test0999(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "249) test1000(org.mockito.internal.util.RegressionTest1)": timer1.isCounting();
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
}
