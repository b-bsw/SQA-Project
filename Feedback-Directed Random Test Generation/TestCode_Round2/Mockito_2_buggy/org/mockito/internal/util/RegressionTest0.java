package org.mockito.internal.util;

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
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "1) test0001(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "2) test0007(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "1) test0007(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "3) test0008(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "4) test0009(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "2) test0009(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "5) test0010(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "3) test0010(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "1) test0010(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "1) test0010(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "6) test0015(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "7) test0016(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "4) test0016(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "8) test0019(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "9) test0021(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "10) test0023(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "11) test0024(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "12) test0026(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "13) test0028(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "14) test0029(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "5) test0029(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "15) test0033(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "16) test0035(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "6) test0035(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "17) test0039(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "7) test0039(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "18) test0041(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "19) test0044(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "8) test0044(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "2) test0044(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "20) test0046(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "21) test0047(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "9) test0047(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "22) test0049(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "10) test0049(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "3) test0049(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "2) test0049(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean6 = false; // flaky "1) test0049(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "23) test0050(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "11) test0050(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "4) test0050(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "3) test0050(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "24) test0052(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "12) test0052(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "25) test0055(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "26) test0057(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "13) test0057(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "5) test0057(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "27) test0059(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "14) test0059(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "6) test0059(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "4) test0059(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "28) test0061(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "15) test0061(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "29) test0062(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "30) test0063(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "16) test0063(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "31) test0067(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "32) test0068(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "17) test0068(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "33) test0069(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "34) test0071(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "18) test0071(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "7) test0071(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "35) test0072(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "36) test0074(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "19) test0074(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "37) test0075(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "20) test0075(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "38) test0076(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "39) test0077(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "40) test0079(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "41) test0081(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "21) test0081(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "42) test0082(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "43) test0086(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "22) test0086(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "8) test0086(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "44) test0091(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "45) test0095(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "23) test0095(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "9) test0095(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "5) test0095(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean6 = false; // flaky "2) test0095(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        boolean boolean2 = false; // flaky "46) test0101(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "47) test0102(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "48) test0103(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "24) test0103(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "49) test0105(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "25) test0105(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "10) test0105(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "50) test0106(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "26) test0106(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "51) test0107(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "27) test0107(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "52) test0108(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "28) test0108(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "53) test0109(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "29) test0109(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "11) test0109(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "54) test0110(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "30) test0110(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "12) test0110(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "6) test0110(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean6 = false; // flaky "3) test0110(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean7 = false; // flaky "1) test0110(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "55) test0113(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "56) test0114(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "31) test0114(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "57) test0116(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "32) test0116(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "58) test0117(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "33) test0117(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "59) test0121(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "60) test0122(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "61) test0124(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "34) test0124(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "13) test0124(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "7) test0124(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "62) test0126(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 0);
        boolean boolean2 = false; // flaky "63) test0128(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "64) test0129(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "65) test0130(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "35) test0130(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "66) test0131(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "67) test0132(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "36) test0132(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "68) test0133(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "37) test0133(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "69) test0134(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "38) test0134(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "14) test0134(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "8) test0134(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "70) test0137(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "39) test0137(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "71) test0140(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "40) test0140(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "72) test0141(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "41) test0141(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "73) test0144(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "42) test0144(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "15) test0144(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "9) test0144(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "74) test0146(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "43) test0146(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "75) test0147(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "76) test0148(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "44) test0148(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "16) test0148(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "77) test0150(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "78) test0152(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "45) test0152(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "17) test0152(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "10) test0152(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean6 = false; // flaky "4) test0152(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "79) test0155(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "46) test0155(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "80) test0156(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "47) test0156(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "81) test0157(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "82) test0158(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "83) test0161(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "48) test0161(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "84) test0166(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "49) test0166(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "85) test0173(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "50) test0173(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "86) test0174(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "51) test0174(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "87) test0175(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
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
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "88) test0177(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "52) test0177(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "18) test0177(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "89) test0182(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "53) test0182(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "19) test0182(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "90) test0184(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "54) test0184(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "91) test0186(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "55) test0186(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "92) test0188(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "56) test0188(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "93) test0189(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "57) test0189(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "94) test0191(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "95) test0193(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "96) test0197(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "97) test0200(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "58) test0200(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "20) test0200(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "98) test0201(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "59) test0201(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "21) test0201(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "99) test0202(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "60) test0202(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "100) test0203(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 0);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "101) test0207(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "61) test0207(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "102) test0209(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "62) test0209(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "22) test0209(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "11) test0209(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "103) test0210(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "63) test0210(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "23) test0210(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "12) test0210(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "104) test0211(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "64) test0211(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "24) test0211(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "13) test0211(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "105) test0212(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 1);
        boolean boolean2 = false; // flaky "106) test0215(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "65) test0215(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        boolean boolean2 = false; // flaky "107) test0216(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        boolean boolean2 = false; // flaky "108) test0217(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "109) test0218(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "110) test0221(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "66) test0221(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "111) test0225(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "112) test0226(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "113) test0227(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "67) test0227(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "114) test0229(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "115) test0231(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "68) test0231(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "25) test0231(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "116) test0232(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "69) test0232(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "117) test0233(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "70) test0233(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "118) test0236(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "119) test0237(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "71) test0237(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "26) test0237(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 0);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "120) test0240(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "72) test0240(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "121) test0241(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "73) test0241(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "122) test0244(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "74) test0244(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "123) test0247(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "75) test0247(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "27) test0247(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "14) test0247(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "124) test0248(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "76) test0248(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "125) test0249(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "77) test0249(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "28) test0249(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "15) test0249(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "126) test0251(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "78) test0251(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "29) test0251(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "127) test0253(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "79) test0253(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "128) test0257(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "129) test0258(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "80) test0258(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "130) test0260(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "81) test0260(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "131) test0262(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "132) test0263(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "82) test0263(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "30) test0263(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "16) test0263(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "133) test0266(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "83) test0266(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "31) test0266(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "17) test0266(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean6 = false; // flaky "5) test0266(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "134) test0269(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "135) test0270(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "84) test0270(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "136) test0272(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "85) test0272(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "137) test0273(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "86) test0273(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "138) test0274(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "87) test0274(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "139) test0275(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "88) test0275(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "32) test0275(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "18) test0275(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "140) test0276(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "141) test0278(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "89) test0278(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        boolean boolean2 = false; // flaky "142) test0281(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "143) test0284(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "90) test0284(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "33) test0284(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "144) test0287(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "145) test0289(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "146) test0290(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "91) test0290(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "147) test0292(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "148) test0294(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "92) test0294(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "34) test0294(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "149) test0295(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "93) test0295(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "35) test0295(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "150) test0296(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "151) test0297(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "94) test0297(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "152) test0299(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "95) test0299(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "153) test0300(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "96) test0300(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "154) test0301(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "97) test0301(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "155) test0305(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "98) test0305(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "36) test0305(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "19) test0305(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "156) test0306(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "157) test0307(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "158) test0308(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "99) test0308(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
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
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "159) test0312(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "160) test0315(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "100) test0315(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "161) test0317(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "162) test0318(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "163) test0319(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "164) test0322(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "101) test0322(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "165) test0326(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "102) test0326(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "166) test0329(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "167) test0331(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "103) test0331(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "37) test0331(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "168) test0332(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "104) test0332(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "38) test0332(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "20) test0332(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean6 = false; // flaky "6) test0332(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean7 = false; // flaky "2) test0332(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean8 = false; // flaky "1) test0332(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "169) test0333(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "105) test0333(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "39) test0333(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "21) test0333(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "170) test0335(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "171) test0336(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "106) test0336(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "40) test0336(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 0);
        boolean boolean2 = false; // flaky "172) test0337(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "107) test0337(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "173) test0339(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "174) test0341(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "175) test0343(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "176) test0346(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "108) test0346(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "41) test0346(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "177) test0348(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "109) test0348(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "178) test0350(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "110) test0350(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "42) test0350(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "22) test0350(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean6 = false; // flaky "7) test0350(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean7 = false; // flaky "3) test0350(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean8 = false; // flaky "2) test0350(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "179) test0351(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "111) test0351(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "43) test0351(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "180) test0352(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "181) test0353(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "112) test0353(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "182) test0355(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "113) test0355(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "183) test0357(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "114) test0357(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "44) test0357(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "23) test0357(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "184) test0361(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "185) test0362(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "115) test0362(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        boolean boolean2 = false; // flaky "186) test0364(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "116) test0364(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "187) test0365(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "117) test0365(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "188) test0366(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "189) test0368(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "118) test0368(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "190) test0369(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "191) test0371(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "119) test0371(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "192) test0372(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "120) test0372(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "45) test0372(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "193) test0373(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "121) test0373(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "46) test0373(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "194) test0374(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "122) test0374(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "195) test0375(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "123) test0375(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "196) test0376(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "124) test0376(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "197) test0380(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "125) test0380(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "198) test0381(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "199) test0382(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "200) test0383(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "126) test0383(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "201) test0385(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "127) test0385(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "202) test0386(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "128) test0386(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "203) test0388(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "129) test0388(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "204) test0390(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "205) test0391(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "130) test0391(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "47) test0391(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "206) test0393(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "131) test0393(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "48) test0393(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "24) test0393(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "207) test0399(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "208) test0400(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "209) test0401(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass15 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 10);
        java.lang.Class<?> wildcardClass2 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "210) test0403(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "132) test0403(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "211) test0404(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "133) test0404(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '#');
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "212) test0408(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "134) test0408(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "49) test0408(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "213) test0409(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "214) test0411(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "215) test0415(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "216) test0416(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "135) test0416(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        boolean boolean2 = false; // flaky "217) test0417(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "136) test0417(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "218) test0420(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "219) test0422(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "137) test0422(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "50) test0422(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "220) test0423(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "138) test0423(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "221) test0424(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "139) test0424(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "51) test0424(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "222) test0425(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass8 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "223) test0428(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "140) test0428(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "52) test0428(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "25) test0428(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean6 = false; // flaky "8) test0428(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean7 = false; // flaky "4) test0428(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean8 = false; // flaky "3) test0428(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "224) test0430(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "141) test0430(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "225) test0431(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "142) test0431(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "53) test0431(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "226) test0433(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "143) test0433(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "54) test0433(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 0);
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "227) test0438(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "228) test0439(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "144) test0439(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        boolean boolean2 = false; // flaky "229) test0440(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "230) test0444(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "145) test0444(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "55) test0444(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "26) test0444(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "231) test0445(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "146) test0445(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "56) test0445(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "27) test0445(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean6 = false; // flaky "9) test0445(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean7 = false; // flaky "5) test0445(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "232) test0449(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "147) test0449(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "57) test0449(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "233) test0450(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "148) test0450(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 10);
        boolean boolean2 = false; // flaky "234) test0451(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "235) test0452(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) -1);
        boolean boolean2 = false; // flaky "236) test0453(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "149) test0453(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "58) test0453(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "237) test0454(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "150) test0454(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        java.lang.Class<?> wildcardClass3 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "238) test0457(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "151) test0457(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "239) test0458(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "240) test0460(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "241) test0461(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass17 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "242) test0462(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "152) test0462(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        boolean boolean11 = timer1.isCounting();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "243) test0463(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "153) test0463(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "59) test0463(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "28) test0463(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "244) test0466(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "154) test0466(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "245) test0467(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "155) test0467(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        boolean boolean11 = timer1.isCounting();
        boolean boolean12 = timer1.isCounting();
        java.lang.Class<?> wildcardClass13 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "246) test0468(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "156) test0468(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "60) test0468(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "29) test0468(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean6 = false; // flaky "10) test0468(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean7 = false; // flaky "6) test0468(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean8 = false; // flaky "4) test0468(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) 100);
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "247) test0473(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(1L);
        boolean boolean2 = false; // flaky "248) test0474(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "157) test0474(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "61) test0474(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean5 = false; // flaky "30) test0474(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "249) test0475(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "158) test0475(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (short) 100);
        boolean boolean2 = false; // flaky "250) test0476(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.lang.Class<?> wildcardClass16 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
        boolean boolean2 = false; // flaky "251) test0478(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "159) test0478(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "62) test0478(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) '4');
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "252) test0480(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "253) test0481(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 0);
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        java.lang.Class<?> wildcardClass4 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((-1L));
        timer1.start();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 'a');
        boolean boolean2 = false; // flaky "254) test0484(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "255) test0485(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(100L);
        boolean boolean2 = false; // flaky "256) test0487(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "257) test0488(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "160) test0488(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean8 = timer1.isCounting();
        java.lang.Class<?> wildcardClass9 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "258) test0489(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "161) test0489(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
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
        java.lang.Class<?> wildcardClass14 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (byte) -1);
        boolean boolean2 = false; // flaky "259) test0491(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "162) test0491(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        java.lang.Class<?> wildcardClass12 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        timer1.start();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 100);
        boolean boolean2 = false; // flaky "260) test0494(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "163) test0494(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean4 = false; // flaky "63) test0494(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        java.lang.Class<?> wildcardClass5 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "261) test0495(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "164) test0495(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        boolean boolean7 = timer1.isCounting();
        timer1.start();
        boolean boolean9 = timer1.isCounting();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) (-1));
        timer1.start();
        boolean boolean3 = timer1.isCounting();
        boolean boolean4 = timer1.isCounting();
        boolean boolean5 = timer1.isCounting();
        timer1.start();
        timer1.start();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass10 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(10L);
        boolean boolean2 = false; // flaky "262) test0498(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "165) test0498(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass6 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 1);
        boolean boolean2 = false; // flaky "263) test0499(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean4 = timer1.isCounting();
        timer1.start();
        timer1.start();
        java.lang.Class<?> wildcardClass7 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        boolean boolean2 = false; // flaky "264) test0500(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        boolean boolean3 = false; // flaky "166) test0500(org.mockito.internal.util.RegressionTest0)": timer1.isCounting();
        timer1.start();
        boolean boolean5 = timer1.isCounting();
        boolean boolean6 = timer1.isCounting();
        boolean boolean7 = timer1.isCounting();
        boolean boolean8 = timer1.isCounting();
        timer1.start();
        boolean boolean10 = timer1.isCounting();
        java.lang.Class<?> wildcardClass11 = timer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}
