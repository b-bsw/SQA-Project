package org.mockito.internal.invocation;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), 100L, 100.0d, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray7, (int) (byte) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, 100, 100.0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, 100, 100.0, false]");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, (-1.0f), 10, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, -1.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, -1.0, 10, 4]");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", 1.0d, obj4, (byte) 100, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 10.0]");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, 100.0f, 1, 0, (short) 1, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 100.0, 1, 0, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 100.0, 1, 0, 1, 100]");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray2, (int) '4', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 10]");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), ' ', 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1,  , 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1,  , 1]");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, ]");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, 0.0f, 0L, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, 0.0, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, 0.0, 0, -1]");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, (-1), (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, -1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, -1, -1]");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, 1.0f, (-1), false, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 1.0, -1, false, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 1.0, -1, false, 1]");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d), (byte) 10, 10L, (byte) 1, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, 10, 10, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, 10, 10, 1, -1]");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0d, (-1.0f), 1.0d, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, -1.0, 1.0, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, -1.0, 1.0, a]");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, 'a', 100, (-1.0f), 100L, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, a, 100, -1.0, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, a, 100, -1.0, 100, 100]");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, 100.0f, (-1L), (-1.0f), 1L, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 100.0, -1, -1.0, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 100.0, -1, -1.0, 1, -1]");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (-1.0d), 10.0f, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, -1.0, 10.0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, -1.0, 10.0, false]");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, true, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, true, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, true, 100]");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray2, (int) ' ', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray4, (int) (short) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (byte) 1, ' ', 1L, false, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 1,  , 1, false, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 1,  , 1, false, 0]");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, 10.0d, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[true, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[true, 10.0, 1]");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, (-1), wildcardClass5, (byte) 1, obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, 10.0d, 100, (short) -1, (-1L), 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[false, 10.0, 100, -1, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[false, 10.0, 100, -1, -1, 0]");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0d, false, false, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, false, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, false, false, 10]");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 10.0d, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray5, (int) (byte) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 10.0, 0]");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, (short) -1, 1, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, -1, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, -1, 1, ]");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', true, (-1.0d), (-1), (byte) 10, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , true, -1.0, -1, 10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , true, -1.0, -1, 10, 1.0]");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, (-1.0d), (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, -1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, -1.0, 0]");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, 10.0f, true, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10.0, true, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10.0, true, -1.0]");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 1, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray5, (int) (short) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, (-1L), (byte) -1, (byte) 0, 0.0f, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1, -1, 0, 0.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1, -1, 0, 0.0, 10]");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, 0, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (byte) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 0, #]");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, 0.0d, false, obj5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, 0.0f, "", false, 1L, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 0.0, , false, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 0.0, , false, 1, 100]");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, ]");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, (short) 0, (short) 10, (short) 100, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 0, 10, 100, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 0, 10, 100, 100.0]");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0d, false, 'a', 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, false, a, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, false, a, 1]");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, 1.0d, (short) 0, 10.0d, (-1.0f), (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 1.0, 0, 10.0, -1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 1.0, 0, 10.0, -1.0, 0]");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, (-1.0f), '4', 10L, 100, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, -1.0, 4, 10, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, -1.0, 4, 10, 100, 1]");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 100L, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100, -1]");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, '4', (-1.0f), "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 4, -1.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 4, -1.0, hi!]");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, (-1L), 1.0f, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) (short) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, -1, 1.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, -1, 1.0, true]");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 0L, 10L, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 0, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 0, 10, 10]");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, 1]");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, obj3, 100, 1, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, "", (short) 1, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, , 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, , 1, -1]");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', 10L, "hi!", '4', 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 10, hi!, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 10, hi!, 4, 100]");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L), 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray4, (int) 'a', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 100]");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, (byte) 100, 10, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 100, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 100, 10, 100]");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, (-1), (-1L), (-1), "hi!", 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, -1, -1, -1, hi!, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, -1, -1, -1, hi!, 100]");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 10]");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, 10.0d, 1.0d, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 10.0, 1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 10.0, 1.0, 1]");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, 100.0d, (byte) 1, (byte) 1, 1.0f, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[false, 100.0, 1, 1, 1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[false, 100.0, 1, 1, 1.0, 0]");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, (byte) -1, 0.0d, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1, 0.0, 0]");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, false, (byte) -1, 100L, (short) -1, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, false, -1, 100, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, false, -1, 100, -1, 0]");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, '#', 1, (-1L), (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, #, 1, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, #, 1, -1, 0]");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, (-1L), 'a', (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, -1, a, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, -1, a, -1.0]");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', 10, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray5, (int) '#', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[a, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[a, 10, -1]");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, "hi!", (byte) 1, 0, "", (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, hi!, 1, 0, , 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, hi!, 1, 0, , 10]");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray2, (int) '4', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 0L, '4', (-1), (short) 10, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 0, 4, -1, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 0, 4, -1, 10, -1]");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, (-1.0d), 0.0f, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, -1.0, 0.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, -1.0, 0.0,  ]");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1.0d, 10, (byte) 0, (byte) 10, ' ', (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray9, (int) '4', realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0, 10, 0, 10,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0, 10, 0, 10,  , 0]");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, 10, obj4, '4', 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, 1.0f, "hi!", 100.0d, 100.0f, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 1.0, hi!, 100.0, 100.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 1.0, hi!, 100.0, 100.0, hi!]");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 100]");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 10]");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), (short) 10, 0, (short) 10, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 10, 0, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 10, 0, 10, -1.0]");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', 1L, 0.0f, 1, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[ , 1, 0.0, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[ , 1, 0.0, 1, 1]");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, (byte) 0, '#', (-1L), 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 0, #, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 0, #, -1, 10]");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 10]");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, 1.0d, 0L, 1.0d, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 1.0, 0, 1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 1.0, 0, 1.0, 0]");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 10.0f, '#', "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 0]");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", (byte) 100, 10.0f, (-1), 0.0d, obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, ' ', 1.0d, 100L, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[class java.lang.Object,  , 1.0, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[class java.lang.Object,  , 1.0, 100, 100]");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, 1, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray5, 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 1, 100]");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, 10.0f, (short) 10, 0.0f, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10.0, 10, 0.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10.0, 10, 0.0, -1]");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 0, (-1), (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 0, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 0, -1, 0]");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', (byte) 100, 100L, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, 100, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, 100, 100, 1]");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, -1]");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 1]");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, 10L, ' ', (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10,  , 0]");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 0.0]");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (-1L), true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, -1, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, -1, true]");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), ' ', 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0,  , 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0,  , 100]");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (-1.0f), 100, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, -1.0, 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, -1.0, 100, 0]");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, (byte) 0, (-1L), 10, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 0, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 0, -1, 10, 0.0]");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, (byte) 1, 0.0d, (-1.0f), (short) 1, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 1, 0.0, -1.0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 1, 0.0, -1.0, 1, 100.0]");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, true, (short) 0, (short) 100, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, true, 0, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, true, 0, 100, 100]");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, "hi!", (short) 100, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, hi!, 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, hi!, 100, 0]");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, 10.0d, 10, obj5, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 0]");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[, -1.0]");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, "", 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray5, (int) 'a', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, , a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, , a]");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 10, wildcardClass4, 0.0f, 1.0d, 'a', (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray9, (int) (short) 100, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, class java.lang.Object, 0.0, 1.0, a, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, class java.lang.Object, 0.0, 1.0, a, -1.0]");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (int) '4', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, 100, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 100,  ]");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { wildcardClass3, 100.0f, 0L, (byte) 0, (-1L), 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray9, 10, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[class java.lang.Object, 100.0, 0, 0, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[class java.lang.Object, 100.0, 0, 0, -1, 0]");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, (short) 100, (byte) 0, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[true, 100, 0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[true, 100, 0, 0.0]");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray4, (int) 'a', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, -1.0]");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, (byte) -1, (short) -1, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, -1, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, -1, -1, 100]");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, (byte) 100, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray5, (int) '#', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 100, 100]");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[false, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[false, true]");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, (short) 100, '4', "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 100, 4, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 100, 4, hi!]");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, false, true, 10, "", true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, false, true, 10, , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, false, true, 10, , true]");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, 100.0d, 1, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 100.0, 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 100.0, 1, 10.0]");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 0]");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray2, (int) (short) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, (short) 100, 100.0f, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 100, 100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 100, 100.0, 10]");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, 10.0f, (short) 0, '4', "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 10.0, 0, 4, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 10.0, 0, 4, ]");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 10]");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , -1]");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, (byte) 100, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 100, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 100, 0.0]");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray2, (int) ' ', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, 10.0f, (byte) -1, 10.0d, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray7, (int) (byte) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 10.0, -1, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 10.0, -1, 10.0, 1]");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 4]");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, 10]");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 100, (-1L), (byte) 1, false, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 100, -1, 1, false, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 100, -1, 1, false, 100]");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, (byte) 0, 10.0d, 100L, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 0, 10.0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 0, 10.0, 100, -1]");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, 10, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10, -1]");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), 100.0f, 1.0d, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 100.0, 1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 100.0, 1.0, 10]");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 100.0f, 0.0d, (short) 100, 100L, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 100.0, 0.0, 100, 100, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 100.0, 0.0, 100, 100, ]");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray4, 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 10]");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, (byte) 1, (byte) 10, 10.0f, "hi!", (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 1, 10, 10.0, hi!, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 1, 10, 10.0, hi!, -1.0]");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1]");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray4, (int) 'a', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, 1]");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, 0]");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, 1.0d, false, (-1), 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 1.0, false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 1.0, false, -1, 1]");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, 10, false, 10.0d, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray7, (int) (byte) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10, false, 10.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10, false, 10.0, -1]");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, '#', (byte) 0, 1.0f, (short) 0, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, #, 0, 1.0, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, #, 0, 1.0, 0, -1]");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, (-1.0f), wildcardClass5, (byte) 10, "", true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray9, 0, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, -1.0, class java.lang.Object, 10, , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, -1.0, class java.lang.Object, 10, , true]");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, 0.0f, 10, 100.0d, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray7, (int) (short) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 0.0, 10, 100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 0.0, 10, 100.0, 10]");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (short) 100, ' ', (short) 10, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100,  , 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100,  , 10, -1]");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 100]");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (-1.0d), (byte) 100, obj5, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[true]");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, ' ', obj4, 100.0d, (-1L), true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, ' ', (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray5, (int) (short) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1,  , -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1,  , -1.0]");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), 100L, 0.0f, (byte) 1, (short) 0, wildcardClass8 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray9, (int) '4', realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, 100, 0.0, 1, 0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, 100, 0.0, 1, 0, class java.lang.Object]");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, '#', 10.0d, (short) -1, (short) 100, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, #, 10.0, -1, 100, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, #, 10.0, -1, 100, 4]");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", '#', 100.0d, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, #, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, #, 100.0, 100]");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, 10.0f, 0L, 1, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 10.0, 0, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 10.0, 0, 1, 100]");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, 0.0f, "", ' ', true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray7, (int) (byte) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 0.0, ,  , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 0.0, ,  , true]");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, true, 100.0f, '4', 10.0d, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, true, 100.0, 4, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, true, 100.0, 4, 10.0, 0]");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, "", '4', 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, , 4, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, , 4, 100.0]");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, 1L, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray5, (int) 'a', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 1, 100.0]");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), obj3, (short) 0, (short) 0, obj6, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 0, (-1L), (short) 1, (byte) 1, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray8, (int) ' ', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 0, -1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 0, -1, 1, 1, 0]");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, ' ', "", 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0,  , , 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0,  , , 10]");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[hi!, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[hi!, 0]");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, '#', 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (byte) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, #, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, #, 100.0]");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 100, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 100, -1]");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 1]");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, 'a', 10.0f, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, a, 10.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, a, 10.0, 4]");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 0]");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (short) 10, (-1), "hi!", 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10, -1, hi!, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10, -1, hi!, 1.0]");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, -1.0]");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, (short) 0, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray5, (int) (short) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 0, 0]");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, (short) 10, (byte) 10, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10, 10, 10]");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, 10.0d, 100.0d, obj5, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray2, (int) (byte) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, (short) 1, 10L, (short) 100, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 1, 10, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 1, 10, 100, 10]");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, (short) 100, 10L, 10, false, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 100, 10, 10, false, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 100, 10, 10, false, 1]");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, (short) 10, (byte) 10, 100L, ' ', 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 10, 10, 100,  , 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 10, 10, 100,  , 10.0]");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, 'a', (byte) 0, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, a, 0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, a, 0, hi!]");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, (short) 1, (short) 100, 0.0f, 'a', 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray8, (int) (byte) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 1, 100, 0.0, a, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 1, 100, 0.0, a, 1.0]");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray4, (int) (short) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, 1]");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', 1, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray5, (int) 'a', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, 1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, 1, 0.0]");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), (-1), wildcardClass5, 100.0f, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, -1, class java.lang.Object, 100.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, -1, class java.lang.Object, 100.0, -1.0]");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 1.0]");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (byte) 1, (-1L), 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 1, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 1, -1, 0.0]");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", (short) 100, 1L, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 100, 1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 100, 1, 1.0]");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#, 100.0]");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, 'a', (-1.0f), 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, a, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, a, -1.0, 100]");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, a]");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray3 = new java.lang.Object[] { obj2 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, 10.0d, 0L, (-1.0d), 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10.0, 0, -1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10.0, 0, -1.0, 1]");
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), (short) 10, obj4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray5, (int) (byte) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 0]");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, (short) 10, (short) 10, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, 10, 10, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, 10, 10, 10.0]");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray2, (int) ' ', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), ' ', 1.0d, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, (int) (short) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1,  , 1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1,  , 1.0, 0]");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, '#', ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, #,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, #,  ]");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0, 100]");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, (short) -1, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, -1, 1]");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, 0L, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 0, 1]");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, 10, (short) 10, (-1.0d), 10.0d, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 10, 10, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 10, 10, -1.0, 10.0, 10]");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', (-1.0d), (byte) 1, obj6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L, 10, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 10, 0.0]");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, obj3, 100, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[true]");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), 'a', "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray5, (int) 'a', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, a, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, a, ]");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, (-1L), 0, 0L, "", (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, -1, 0, 0, , 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, -1, 0, 0, , 100]");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', "hi!", (-1), (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, hi!, -1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, hi!, -1, -1.0]");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, 100, 1L, 100.0d, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100, 1, 100.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100, 1, 100.0, 10.0]");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[true]");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, "", "hi!", (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, , hi!, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, , hi!, 1]");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, (-1.0f), obj4, 10, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[false]");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, ' ', 1.0f, wildcardClass6, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10,  , 1.0, class java.lang.Object, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10,  , 1.0, class java.lang.Object, 0]");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L), 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 100.0]");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, 1.0f, false, 10, obj6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 100]");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', false, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[ , false, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[ , false, 0]");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 1, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, 0.0f, (-1.0d), 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 0.0, -1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 0.0, -1.0, 10]");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, (-1L), 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, -1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, -1, a]");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), 1, (byte) 1, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 1, 1, 0]");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray2, (int) (short) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, (-1.0d), obj4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, (short) 100, (-1), 1, true, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 100, -1, 1, true, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 100, -1, 1, true, -1]");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, 10.0d, 10.0d, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 10.0, 10.0, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 10.0, 10.0, a]");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', (-1L), (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[#, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[#, -1, 0]");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, (-1L), 0, 1.0f, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 0, 1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 0, 1.0, 1]");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, (short) -1, 10.0f, "", (byte) 100, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, -1, 10.0, , 100, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, -1, 10.0, , 100, hi!]");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, 10.0f, 1.0d, (short) 0, 'a', (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 10.0, 1.0, 0, a, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 10.0, 1.0, 0, a, 10]");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { wildcardClass3, 10, '#', 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray7, 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[class java.lang.Object, 10, #, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[class java.lang.Object, 10, #, 0]");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, '#', (byte) 0, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, #, 0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, #, 0, #]");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, (short) 0, 10.0f, 0L, 100.0f, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 0, 10.0, 0, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 0, 10.0, 0, 100.0, 100]");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (short) -1, 10, 1.0d, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 1.0, 0]");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, ' ', obj4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", (byte) -1, 'a', (short) 100, '#', (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[, -1, a, 100, #, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[, -1, a, 100, #, -1]");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, (-1.0d), 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[true, -1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[true, -1.0, 0]");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray2, (int) '4', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[,  ]");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, 1L, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 1, 1]");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, 10.0d, (short) 100, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, 10.0, 100, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, 10.0, 100, 10.0]");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, (byte) 1, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 1, 4]");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, (short) 1, (-1.0f), 0, 100, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray8, (int) ' ', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 1, -1.0, 0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 1, -1.0, 0, 100, -1]");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, (-1L), (short) 0, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, -1, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, -1, 0, 100]");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, (short) 10, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 10, 100]");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", 0.0f, 10.0f, (-1.0d), (byte) 0, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 0.0, 10.0, -1.0, 0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 0.0, 10.0, -1.0, 0, -1.0]");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', 10.0d, (byte) 10, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, 10.0, 10, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, 10.0, 10, #]");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), (short) 0, true, 100.0f, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray7, (int) (short) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 0, true, 100.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 0, true, 100.0, -1]");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, 1.0f, 0L, 100L, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 1.0, 0, 100, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 1.0, 0, 100, 10.0]");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", (-1.0d), 1L, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, -1.0, 1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, -1.0, 1, 1.0]");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, 100.0f, true, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 100.0, true, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 100.0, true, 0]");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, 'a', 1.0d, ' ', 1L, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray9, 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, a, 1.0,  , 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, a, 1.0,  , 1, 100]");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, true, (byte) -1, (short) 0, "", (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, true, -1, 0, , 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, true, -1, 0, , 1]");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 0L, 1, '#', 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (int) (short) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 0, 1, #, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 0, 1, #, 0.0]");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, 0.0]");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, 10.0d, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 10.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 10.0, 1.0]");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray4, 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#, 0]");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, 1.0f, false, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 1.0, false, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 1.0, false, 0.0]");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, 1, 1.0d, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 1, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 1, 1.0, 4]");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', obj3, (short) 10, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, '4', 10L, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 4, 10, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 4, 10, hi!]");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, 100.0f, ' ', true, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray7, (int) (byte) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 100.0,  , true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 100.0,  , true, 10]");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, '#', (short) -1, 0, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), true, (short) 1, (short) -1, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, true, 1, -1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, true, 1, -1, a]");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 100, 10, (byte) 0, "", (byte) 100, wildcardClass9 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation13 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray10, (int) ' ', realMethod12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100, 10, 0, , 100, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100, 10, 0, , 100, class java.lang.Object]");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray2, (int) 'a', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, (short) 1, (short) -1, ' ', (-1L), "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 1, -1,  , -1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 1, -1,  , -1, ]");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, 0.0f, 1L, obj5, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, "hi!", 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray5, (int) (byte) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, hi!, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, hi!, 1]");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, (byte) -1, 0.0f, (short) 1, (byte) -1, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1, 0.0, 1, -1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1, 0.0, 1, -1, -1.0]");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[#]");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), 100.0d, 'a', 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 100.0, a, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 100.0, a, 100.0]");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, (short) 100, (byte) 0, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 100, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 100, 0, 100]");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray5, (int) (byte) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, 1]");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, 0.0f, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 0.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 0.0, 10]");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, (-1.0f), ' ', 0.0f, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[class java.lang.Object, -1.0,  , 0.0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[class java.lang.Object, -1.0,  , 0.0, #]");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', 10L, (byte) 1, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ , 10, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ , 10, 1, -1]");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray4, (int) (short) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, 0]");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', 0L, "", "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, 0, , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, 0, , ]");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, 100L, 10.0d, (byte) 100, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (byte) 100, (-1.0f), (short) 100, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100, -1.0, 100, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100, -1.0, 100, hi!]");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray3 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray4, (int) 'a', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10.0]");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 100.0d, 1.0d, (byte) 10, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0, 1.0, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0, 1.0, 10, -1]");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, 100L, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 100, -1]");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 'a', 10.0f, 0, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, a, 10.0, 0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, a, 10.0, 0, 10]");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 10.0f, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray5, (int) 'a', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 10.0, 1]");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, 10.0d, (byte) 100, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, 10.0, 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, 10.0, 100, 0]");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, (-1.0f), '4', "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, -1.0, 4, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, -1.0, 4, ]");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (short) -1, (byte) 10, (short) 1, 0.0f, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1, 10, 1, 0.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1, 10, 1, 0.0, true]");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, ' ', (-1.0d), 10.0f, false, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1,  , -1.0, 10.0, false, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1,  , -1.0, 10.0, false, false]");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 100]");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray4, (int) (short) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[, 0.0]");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', 100.0d, (short) 0, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#, 100.0, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#, 100.0, 0, 100]");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (short) 100, (-1.0d), false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 100, -1.0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 100, -1.0, false]");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', (short) 100, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[ , 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[ , 100, 1.0]");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (short) 10, (short) -1, ' ', '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10, -1,  , 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10, -1,  , 4]");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, 100.0d, "hi!", 100.0f, 10L, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 100.0, hi!, 100.0, 10, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 100.0, hi!, 100.0, 10, 10.0]");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', (-1), 10, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ , -1, 10, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ , -1, 10, ]");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), (byte) 1, 0.0f, (short) -1, 10.0d, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray8, (int) 'a', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 1, 0.0, -1, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, 1, 0.0, -1, 10.0, 0]");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, 1.0f, wildcardClass5, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 1.0, class java.lang.Object, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 1.0, class java.lang.Object, -1]");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, false, (byte) -1, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, false, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, false, -1, 0.0]");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, '#', true, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, #, true, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, #, true, #]");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, 0.0d, wildcardClass5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, 0.0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, 0.0, class java.lang.Object]");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 10]");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, (-1.0d), 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, -1.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, -1.0, 100.0]");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1L), 1.0f, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 1.0, 0]");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, '#', (short) 1, 10L, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray7, (int) (byte) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, #, 1, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, #, 1, 10, 4]");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, -1.0]");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, (-1.0f), (byte) 100, obj5, (short) 10, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, 100.0d, (short) 1, false, '#', 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 100.0, 1, false, #, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 100.0, 1, false, #, 1]");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 100.0]");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { true, (byte) 1, wildcardClass5, '4', 0L, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray9, 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[true, 1, class java.lang.Object, 4, 0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[true, 1, class java.lang.Object, 4, 0, ]");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray2, (int) 'a', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, (short) 1, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 1, 4]");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, 1.0d, 1.0d, (short) -1, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 1.0, 1.0, -1, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 1.0, 1.0, -1, hi!]");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, 0.0f, 10.0f, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 0.0, 10.0, 10.0]");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { ' ', 'a', (short) -1, (short) 10, obj6, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray9, (int) (byte) 10, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, (short) 100, 10.0d, 'a', obj6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[true]");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, (short) 100, wildcardClass6, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[class java.lang.Object, 100, class java.lang.Object, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[class java.lang.Object, 100, class java.lang.Object, 10]");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, 1, false, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 1, false, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 1, false, 100]");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d), 10, 0.0d, (-1.0d), 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (int) (byte) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, 10, 0.0, -1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, 10, 0.0, -1.0, 0]");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { wildcardClass3, "", wildcardClass6, 100L, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray9, (int) (short) -1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[class java.lang.Object, , class java.lang.Object, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[class java.lang.Object, , class java.lang.Object, 100, 1]");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L, obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, (short) 0, 100, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 0, 100, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 0, 100, ]");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, 1, "hi!", '4', (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 1, hi!, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 1, hi!, 4, 100]");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, (-1), (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray5, (int) (short) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, -1]");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 100.0d, 10L, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 100.0, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 100.0, 10, 0.0]");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, 1.0d, 10.0d, 10L, obj6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0f), (-1.0f), 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray5, (int) 'a', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, -1.0, 1.0]");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), (-1), true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, -1, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, -1, true]");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 100L, 1L, 100L, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 100, 1, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 100, 1, 100, 100]");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (short) 10, 100, (-1L), (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10, 100, -1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10, 100, -1, -1]");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, 10.0f, 100L, '4', (short) 1, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 10.0, 100, 4, 1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 10.0, 100, 4, 1, 0.0]");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", false, '#', 100.0f, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, false, #, 100.0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, false, #, 100.0, #]");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), "", 10, obj5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', (-1.0f), 1L, 10, (-1L), (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , -1.0, 1, 10, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , -1.0, 1, 10, -1, 10]");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), (-1.0f), "hi!", 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, -1.0, hi!, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, -1.0, hi!, 10]");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray2, (int) '4', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, (byte) 10, (short) 0, (byte) 0, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10, 0, 0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10, 0, 0, ]");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray2, (int) 'a', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 1]");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, (byte) 10, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray5, 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 10, 0]");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, 0.0d, ' ', (byte) 0, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 0.0,  , 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 0.0,  , 0, 1]");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 100.0d, obj5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, 100L, 0L, (byte) -1, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 100, 0, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 100, 0, -1, 10]");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, -1.0]");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { wildcardClass3, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[class java.lang.Object, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[class java.lang.Object, false]");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", (short) 100, (-1L), (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!, 100, -1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!, 100, -1, -1]");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, (short) -1, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, -1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, -1, -1.0]");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, (-1L), "", (-1L), 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, , -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, , -1, 10.0]");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 10.0d, 1.0d, "hi!", 0.0d, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 10.0, 1.0, hi!, 0.0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 10.0, 1.0, hi!, 0.0, false]");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', 100, 100L, "hi!", "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, 100, 100, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4, 100, 100, hi!, hi!]");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray2, (int) (short) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[class java.lang.Object]");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, (byte) -1, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray5, 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, true]");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, 1, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 1, 100]");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, 10.0d, obj4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, -1]");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray4, (int) (short) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[false,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[false,  ]");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, (short) 0, (byte) 10, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray6, (int) (short) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, 0, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, 0, 10, -1.0]");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 1.0f, (-1.0f), obj5, 0.0d, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray4, (int) 'a', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 0]");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, (byte) 100, (short) -1, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 100, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 100, -1, 10]");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray4, (int) (short) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 100.0]");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, 0]");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, hi!]");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray4, (int) (short) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 10.0]");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, 10, 10, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 10, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 10, 10, 1]");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (-1.0f), (byte) 1, '4', (byte) 10, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1.0, 1, 4, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1.0, 1, 4, 10, 100]");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, 100L, (short) 100, 'a', (byte) 0, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100, 100, a, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100, 100, a, 0, 100.0]");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, 0.0d, 'a', 10.0d, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 0.0, a, 10.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 0.0, a, 10.0, -1]");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, (short) 100, (short) -1, "", 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100, -1, , 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100, -1, , 100]");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, 0.0d, 1L, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 0.0, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 0.0, 1, 0]");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, (short) -1, (byte) -1, "hi!", '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, -1, hi!, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, -1, hi!, #]");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, (-1.0f), (-1.0f), 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, -1.0, -1.0, 1.0]");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[, 1]");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (short) 0, (-1L), (byte) 10, 1L, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 0, -1, 10, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 0, -1, 10, 1, 100]");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d), (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0, -1.0]");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, (short) 10, ' ', 10.0d, (short) 0, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 10,  , 10.0, 0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 10,  , 10.0, 0, 10]");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 100.0f, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, 1.0f, "hi!", '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, 1.0, hi!, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, 1.0, hi!, #]");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 0.0]");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, 'a', (short) 1, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[true, a, 1,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[true, a, 1,  ]");
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', (byte) 100, 0L, 1.0d, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 100, 0, 1.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 100, 0, 1.0, -1.0]");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), (-1L), 1.0d, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, -1, 1.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, -1, 1.0, ]");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray4, 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 10]");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, (-1), (byte) 10, (byte) 100, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, -1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, -1, 10, 100, -1]");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, "", '4', wildcardClass6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, , 4, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, , 4, class java.lang.Object]");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", 0.0d, "", (-1.0d), true, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[, 0.0, , -1.0, true, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[, 0.0, , -1.0, true, 1]");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, '4', 100.0f, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 4, 100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 4, 100.0, 1]");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, 'a', (byte) 0, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, a, 0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, a, 0,  ]");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', 1L, (byte) 0, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, 1, 0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, 1, 0, 0.0]");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), ' ', true, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1,  , true, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1,  , true, 100]");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, false, true, (byte) 0, 100L, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, false, true, 0, 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, false, true, 0, 100, 0]");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (short) 100, ' ', "", "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 100,  , , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 100,  , , ]");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, 0.0d, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 0.0, 100.0]");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[a]");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1L), (-1.0f), (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, -1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, -1.0, 1]");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1L), obj4, 1, obj6, (short) -1, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation13 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray10, (int) (short) 100, realMethod12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', obj3, 'a', wildcardClass6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray7, (int) (short) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', (byte) 100, wildcardClass5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ , 100, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ , 100, class java.lang.Object]");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 1]");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (short) 10, (-1), (-1.0d), 100L, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, 10, -1, -1.0, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, 10, -1, -1.0, 100, 1]");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 100, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100, 100]");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, 100L, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray5, (int) '#', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 100, 1]");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 0]");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (byte) 100, 100.0d, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 100, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 100, 100.0, 100]");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100.0]");
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }
}

