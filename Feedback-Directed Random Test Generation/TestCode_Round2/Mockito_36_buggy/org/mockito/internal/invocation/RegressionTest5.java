package org.mockito.internal.invocation;

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
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (byte) 0, (short) -1, (byte) 0, (-1.0d), 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, 0, -1, 0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, 0, -1, 0, -1.0, 100]");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { wildcardClass3, 0.0d, (-1.0f), 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[class java.lang.Object, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[class java.lang.Object, 0.0, -1.0, 0.0]");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, 10, (short) -1, 0.0d, 1.0d, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 10, -1, 0.0, 1.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 10, -1, 0.0, 1.0, ]");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, 10L, 100.0f, (-1.0f), (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray7, (int) (byte) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 10, 100.0, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 10, 100.0, -1.0, -1]");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100, 1.0d, (byte) -1, 0L, obj6, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray9, (int) (short) -1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, -1.0]");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", 0, '#', 100.0d, "hi!", (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[, 0, #, 100.0, hi!, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[, 0, #, 100.0, hi!, -1.0]");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 100.0f, (byte) 100, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 100.0, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 100.0, 100, 10]");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 1.0]");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, (short) 1, 100.0f, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 1, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 1, 100.0, 100]");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (-1L), (-1.0f), 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, -1, -1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, -1, -1.0, 1.0]");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', 1.0d, 10L, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ , 1.0, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ , 1.0, 10, 10]");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, 0L, 'a', (short) 100, 1L, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray8, 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[false, 0, a, 100, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[false, 0, a, 100, 1, 100.0]");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, (byte) 10, wildcardClass6, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 10, class java.lang.Object, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 10, class java.lang.Object, 10.0]");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), (short) -1, (short) 10, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, -1, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, -1, 10, 10]");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, -1.0]");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray2, (int) (byte) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', (byte) 0, (byte) 100, 0.0f, (byte) 0, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 0, 100, 0.0, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 0, 100, 0.0, 0, false]");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, 0, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 0, 0]");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, 100, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100, 0.0]");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[false]");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[#]");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, 10]");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, true]");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, (byte) 10, '4', (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 10, 4, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 10, 4, 0]");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (byte) 100, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 100, 10]");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', 10.0f, "hi!", '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, 10.0, hi!, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, 10.0, hi!, #]");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[, 0.0]");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, 100L, ' ', 0L, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, 100,  , 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, 100,  , 0, 1]");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, (short) 100, 100.0d, (short) 100, (byte) 1, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray9, (int) (short) 10, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, 100, 100.0, 100, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, 100, 100.0, 100, 1, 10]");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), 0L, 0, 100, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray7, (int) (byte) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 0, 0, 100, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 0, 0, 100, 100.0]");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, 10, 0.0f, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray7, (int) ' ', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 10, 0.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 10, 0.0, 100]");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray2, (int) ' ', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", 0.0f, 100L, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!, 0.0, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!, 0.0, 100, 1]");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, 0.0d, (byte) 100, "", (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray8, 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[class java.lang.Object, 0.0, 100, , 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[class java.lang.Object, 0.0, 100, , 1]");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', (-1.0f), 100, 100, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, -1.0, 100, 100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, -1.0, 100, 100, false]");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 100]");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, false, 0.0d, (-1.0d), (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, false, 0.0, -1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, false, 0.0, -1.0, 1]");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, (short) 10, (short) 10, 0.0f, "", 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 10, 10, 0.0, , 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 10, 10, 0.0, , 1]");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 1]");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 10L, 1.0f, '#', (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 10, 1.0, #, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 10, 1.0, #, 10]");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, (-1.0d), "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray5, (int) (short) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1.0, hi!]");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, (byte) 10, 10.0f, (byte) 100, obj6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10]");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, obj4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray4, (int) (short) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 0]");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray2, (int) (byte) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, (byte) -1, 10.0d, (byte) 1, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0, 1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0, 1, 0.0]");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", (short) -1, 10, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, -1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, -1, 10, 1]");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, (byte) 1, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray5, 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 1, 1]");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, '4', '4', 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 4, 4, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 4, 4, a]");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, 0L, 'a', (short) -1, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 0, a, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 0, a, -1, 10]");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, (byte) 1, 10.0d, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 1, 10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 1, 10.0, 100]");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 100.0d, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) (short) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[true, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[true, 1]");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, true, 10.0f, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, true, 10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, true, 10.0, 100]");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), (short) 0, (short) -1, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 0, -1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 0, -1, 4]");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 100L, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, (int) (short) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[true]");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, (-1.0d), (short) 0, '#', 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1.0, 0, #, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1.0, 0, #, 0.0]");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, 1L, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray5, (int) (byte) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 1, 100]");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', wildcardClass4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, class java.lang.Object]");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 10]");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), (short) 1, (short) 10, (byte) 1, (short) 0, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 1, 10, 1, 0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, 1, 10, 1, 0, 0]");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, 10L, (short) 10, 0, 0L, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 10, 10, 0, 0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 10, 10, 0, 0, 0]");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d), (byte) 1, '#', (byte) -1, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, 1, #, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, 1, #, -1, 1.0]");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", "", true, obj5, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, -1]");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, '#', (byte) 0, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, #, 0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, #, 0, 10.0]");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, (short) 1, 0.0f, 1.0d, true, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 1, 0.0, 1.0, true, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 1, 0.0, 1.0, true, 1]");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[false]");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 0]");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, 'a', 100.0d, (short) 0, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, a, 100.0, 0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, a, 100.0, 0, -1.0]");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 100, ' ', (-1.0d), obj5, '#', 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray9, (int) (short) 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, (byte) 1, '4', "", '#', (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 1, 4, , #, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 1, 4, , #, 10]");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, (short) 100, '#', (-1.0f), 10.0f, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 100, #, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 100, #, -1.0, 10.0, 10]");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (short) 100, (short) 100, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100, 100, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100, 100, 100.0]");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", 0.0d, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[, 0.0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[, 0.0, false]");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , ]");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', (-1L), 10, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, -1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, -1, 10, 1]");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', 1L, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray5, 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, 1, 10.0]");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, (byte) 100, (short) 1, 10.0f, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 100, 1, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 100, 1, 10.0, 0.0]");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, obj3, (byte) 100, 1, (-1.0f), 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray2, (int) ' ', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, obj3, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[true]");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, '4', (byte) 100, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 4, 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 4, 100, 0]");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100, 0, wildcardClass5, 10.0d, false, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray9, (int) (short) 100, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100, 0, class java.lang.Object, 10.0, false, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100, 0, class java.lang.Object, 10.0, false, 0]");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, 10L, 'a', (-1), 100L, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 10, a, -1, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 10, a, -1, 100, 100]");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, 1.0d, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[false, 1.0, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[false, 1.0, a]");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d), (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0, -1]");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, 100, false, '4', 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100, false, 4, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100, false, 4, 10]");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, (byte) 100, 100.0d, (short) 0, 10, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 100, 100.0, 0, 10, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 100, 100.0, 0, 10, #]");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, false]");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0d), 0L, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, 0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, 0, 4]");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, 10.0d, 'a', ' ', 10, obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, 1, 0.0d, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[true, 1, 0.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[true, 1, 0.0, -1]");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (short) 10, '#', 100, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10, #, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10, #, 100, 100]");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 0L, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray5, 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 0, 10.0]");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 0]");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, true, (-1), 1L, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray7, (int) (short) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, true, -1, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, true, -1, 1, -1.0]");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, (-1.0f), 1.0d, true, 0, obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 1]");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, wildcardClass4, (short) 1, true, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, class java.lang.Object, 1, true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, class java.lang.Object, 1, true, 0.0]");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', 10, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[a, 10, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[a, 10, false]");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 10]");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), 10L, 0.0f, "", (-1.0f), (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 10, 0.0, , -1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 10, 0.0, , -1.0, 10]");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), obj3, 0, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 10.0]");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray2, (int) (byte) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, 10.0f, 1.0d, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[true, 10.0, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[true, 10.0, 1.0, 100]");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 1.0d, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 1.0, -1]");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 0]");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, (byte) -1, (short) 10, (byte) 0, false, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1, 10, 0, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1, 10, 0, false, -1]");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", true, 0.0f, (-1), 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray7, (int) (byte) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, true, 0.0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, true, 0.0, -1, 1.0]");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, 1, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 1, -1]");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, 10, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 10, 100.0]");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, '4', 10.0d, 1.0f, (-1.0f), 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 4, 10.0, 1.0, -1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 4, 10.0, 1.0, -1.0, 0]");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, 0.0f, 1L, "hi!", true, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray8, 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 0.0, 1, hi!, true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 0.0, 1, hi!, true, 10]");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', 10.0f, 0.0f, 10L, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, 10.0, 0.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, 10.0, 0.0, 10,  ]");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 100]");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray4, 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 100]");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray3 = new java.lang.Object[] { obj2 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, 1, 100.0d, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 1, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 1, 100.0, 100]");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (byte) 100, 100L, 0, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 100, 100, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 100, 100, 0, 100]");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 'a', 100.0f, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, a, 100.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, a, 100.0,  ]");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0, 100.0]");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[a]");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, false, "hi!", (-1), 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0, false, hi!, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0, false, hi!, -1, 1]");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), (short) -1, (byte) 10, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, -1, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, -1, 10, 4]");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, (short) 1, (byte) 0, 10L, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 1, 0, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 1, 0, 10, 1]");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, '#', 10, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, #, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, #, 10, 100]");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, -1.0]");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, (short) 100, obj4, obj5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, false, '#', 10, 1.0f, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray8, (int) (byte) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, false, #, 10, 1.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, false, #, 10, 1.0, 4]");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (short) 10, 0.0f, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray6, (int) (short) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10, 0.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10, 0.0, hi!]");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", (byte) 10, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[hi!, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[hi!, 10, -1]");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 0, 10, (-1), 10L, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 0, 10, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 0, 10, -1, 10, 100]");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray4, (int) 'a', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[, #]");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0d, (-1L), (-1.0d), 10.0f, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0, -1, -1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0, -1, -1.0, 10.0, 0]");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', obj3, 'a', (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, -1.0]");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, false, 0L, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, false, 0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, false, 0, true]");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), 1L, (-1.0d), 10.0d, 10.0d, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 1, -1.0, 10.0, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, 1, -1.0, 10.0, 10.0, 100.0]");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 0.0]");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, 0L, (short) 1, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, 0, 1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, 0, 1, 1.0]");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, 100.0f, 10.0f, '4', (byte) 100, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 100.0, 10.0, 4, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 100.0, 10.0, 4, 100, 100]");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, (-1), (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, -1.0]");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 100.0]");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray2, (int) (byte) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 1L, 1, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, (-1.0f), (byte) 0, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, -1.0, 0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, -1.0, 0, 0]");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', (byte) 0, "", 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, 0, , 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4, 0, , 1.0]");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, 0.0d, '#', 0.0d, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 0.0, #, 0.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 0.0, #, 0.0, 0.0]");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, "hi!", (byte) 1, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, hi!, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, hi!, 1, 100]");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0f), wildcardClass4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray5, (int) (byte) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, class java.lang.Object]");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (int) (short) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, (short) 1, (-1), obj5, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', (short) 1, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#, 1, ]");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, -1.0]");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, 1.0f, 0.0d, 100.0d, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 1.0, 0.0, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 1.0, 0.0, 100.0, 100]");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[true, 1.0]");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', (short) 100, 10.0d, obj5, "", 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 0, obj3, 100.0d, (byte) 10, 1L, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray9, (int) (short) 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, true, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, true, 10]");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', (short) -1, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, -1, 10.0]");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 1.0]");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#, 0.0]");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 1]");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, hi!]");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, (short) -1, obj4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', 'a', 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, a, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, a, 10.0]");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 0]");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[#]");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, 100L, ' ', (byte) 10, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 100,  , 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 100,  , 10, -1]");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, 'a', obj4, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, 100.0d, 'a', 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 100.0, a, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 100.0, a, 1.0]");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, (short) 100, 'a', (byte) 0, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[true, 100, a, 0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[true, 100, a, 0, 1.0]");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, (byte) 100, "hi!", (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 100, hi!, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 100, hi!, 100]");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", 10.0f, (-1.0f), '4', (short) 100, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 10.0, -1.0, 4, 100, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 10.0, -1.0, 4, 100, a]");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, 1, 1, (byte) 10, (-1.0f), obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray9, (int) (byte) 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, 1L, 100.0f, 1L, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 1, 100.0, 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 1, 100.0, 1, 10.0]");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 1.0d, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 1.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 1.0, hi!]");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, 100L, (byte) 10, 100.0f, 1, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 100, 10, 100.0, 1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 100, 10, 100.0, 1, 0.0]");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', ' ', 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[#,  , 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[#,  , 100]");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, 10.0d, 1, (short) -1, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 10.0, 1, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 10.0, 1, -1, 10]");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, (byte) 10, obj4, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', (byte) 10, 100.0d, 1, false, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 10, 100.0, 1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 10, 100.0, 1, false, 10]");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', ' ', 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray5, (int) 'a', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[a,  , 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[a,  , 10]");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", 1L, "", 0.0f, (byte) -1, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[, 1, , 0.0, -1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[, 1, , 0.0, -1, -1]");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, (short) 10, "", obj5, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray8, (int) ' ', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, ' ', 0, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0,  , 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0,  , 0, 100.0]");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), (byte) 0, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 0, hi!]");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (byte) 1, 1.0f, 100.0d, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray7, 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, 1, 1.0, 100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, 1, 1.0, 100.0, 10]");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 1.0]");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray2, (int) (short) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0, ]");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, (-1.0f), false, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, -1.0, false, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, -1.0, false, 100]");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, 10L, 100, 1.0f, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10, 100, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10, 100, 1.0, 100]");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1L), (short) -1, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray5, (int) (short) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, -1, 10]");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', (byte) 1, "", (-1L), (short) 0, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray8, (int) (byte) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 1, , -1, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 1, , -1, 0, 100.0]");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, (short) -1, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1, 10]");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L, 1.0d, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 1.0, 1]");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, 100.0d, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 100.0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 100.0, #]");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), (byte) 0, (-1.0f), 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray6, (int) (short) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 0, -1.0, 100]");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, (byte) 1, (-1L), 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 1, -1, 10.0]");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, (short) -1, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, -1, 10]");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 100]");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, 0.0d, 100.0f, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 0.0, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 0.0, 100.0, 100]");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, true, (short) 0, (short) 0, 'a', 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, true, 0, 0, a, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, true, 0, 0, a, 10.0]");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, false, (short) 10, 10L, (short) 10, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, false, 10, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, false, 10, 10, 10, -1]");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), 100L, (short) 100, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 100, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 100, 100, -1]");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, (byte) 0, (byte) -1, (short) 10, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 0, -1, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 0, -1, 10, 4]");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, 'a', (short) -1, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, a, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, a, -1, 1]");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 1L, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 1, 100.0]");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, ]");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 1]");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 0]");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray2, (int) (byte) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, 'a', '#', 1.0f, 10.0f, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, a, #, 1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, a, #, 1.0, 10.0, 0]");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', 10.0f, 'a', 1.0d, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 10.0, a, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 10.0, a, 1.0, 100]");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, 10.0d, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 10.0, 100.0]");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, 100, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray5, 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 100, -1.0]");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray4, (int) 'a', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, false]");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, 10.0d, 10, '#', (short) 1, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 10.0, 10, #, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 10.0, 10, #, 1, 1]");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, #]");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, (byte) 10, 100.0d, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10, 100.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10, 100.0, 100.0]");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, -1.0]");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.lang.Object obj0 = null;
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
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, obj3, '#', 100L, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, "hi!", 10L, 100.0f, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, hi!, 10, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, hi!, 10, 100.0, 100]");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray4, (int) (short) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , 1]");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, (short) -1, 1.0f, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, -1, 1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, -1, 1.0, 0]");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, 10L, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 10, 10]");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), ' ', (byte) 10, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0,  , 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0,  , 10, 100]");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[ ]");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, 100, (byte) 0, 1, wildcardClass7, 0 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 100, 0, 1, class java.lang.Object, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 100, 0, 1, class java.lang.Object, 0]");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, 1.0d, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 1.0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 1.0, #]");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 0.0]");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, 10, false, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, 10, false, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, 10, false, true]");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 1]");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, obj3, (short) 10, (-1), "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, (short) 100, 10.0f, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, 100, 10.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, 100, 10.0, 10.0]");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 100]");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 1L, ' ', 1.0f, false, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray8, (int) (byte) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 1,  , 1.0, false, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 1,  , 1.0, false, 1]");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 0]");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, 10.0d, 0L, (short) 10, '4', 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 10.0, 0, 10, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 10.0, 0, 10, 4, 100]");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 10]");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, "hi!", (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, -1]");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, true]");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, 1L, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 1, 1.0]");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, (byte) 1, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 1, 10]");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, 1, "hi!", '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 1, hi!, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 1, hi!, 4]");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, 10.0f, (-1), '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10.0, -1, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10.0, -1, #]");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, (-1.0f), false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[false, -1.0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[false, -1.0, false]");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, (short) 100, "", 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, 100, , 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, 100, , 1]");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, 100.0f, (byte) -1, 10L, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 100.0, -1, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 100.0, -1, 10, -1.0]");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0f), "", (short) -1, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray7, (int) (byte) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, , -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, , -1, 0]");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 0, (-1.0d), 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 0, -1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 0, -1.0, 0]");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, "", 10, "hi!", "hi!", 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, , 10, hi!, hi!, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, , 10, hi!, hi!, 100]");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), (byte) 10, 'a', (-1), (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 10, a, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 10, a, -1, 1]");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), (short) -1, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, -1, 1.0]");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', (byte) 1, (byte) -1, 100, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray7, (int) (short) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, 1, -1, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, 1, -1, 100, 10]");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, 'a', obj4, true, (short) 10, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', 'a', (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray5, (int) (byte) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, a, -1]");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (short) 100, 10.0d, 100.0f, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, 100, 10.0, 100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, 100, 10.0, 100.0, 10]");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, 1L, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 1, -1.0]");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 0L, "", 0L, '4', '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 0, , 0, 4, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 0, , 0, 4, #]");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', (byte) 0, false, (short) 0, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 0, false, 0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 0, false, 0, 10.0]");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray4, (int) (short) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 4]");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 10L, (short) 100, 1.0f, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 10, 100, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 10, 100, 1.0, 100]");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, 0.0f, obj4, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, (short) -1, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, true, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, true, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, true, 4]");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, ' ', 100.0f, (short) 100, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1,  , 100.0, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1,  , 100.0, 100, 10]");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { obj2, 10.0d, 10.0d, 0.0f, "hi!", '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray9, 0, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, ]");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, obj3, false, 10L, 10L, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), (byte) 10, ' ', '4', 1, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 10,  , 4, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, 10,  , 4, 1, 1]");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', (byte) -1, false, (-1.0d), (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, -1, false, -1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, -1, false, -1.0, 1]");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), 100L, 10L, (short) 1, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray7, (int) (byte) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, 100, 10, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, 100, 10, 1, 1]");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, (-1.0f), "", '4', (short) 100, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, -1.0, , 4, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, -1.0, , 4, 100, 1]");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (byte) 100, '#', 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100, #, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100, #, 10.0]");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, "", ' ', true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, ,  , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, ,  , true]");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, 10.0d, (-1.0f), true, 10.0d, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray8, 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 10.0, -1.0, true, 10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 10.0, -1.0, true, 10.0, 100]");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, 1.0f, 100.0d, 10.0d, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 1.0, 100.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 1.0, 100.0, 10.0, 0]");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (-1.0d), 10.0d, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1.0, 10.0, 10]");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, -1.0]");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, -1]");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, (byte) 0, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 0, 100.0]");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, 0.0d, (short) 10, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 0.0, 10, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 0.0, 10, hi!]");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, (-1L), ' ', 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1,  , 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1,  , 10]");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0d, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray4, 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, -1.0]");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, 100.0d, 10.0f, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 100.0, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 100.0, 10.0, 1]");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, '4', (byte) 1, obj5, obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray8, (int) 'a', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", true, 100.0d, (short) 1, (byte) 100, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[, true, 100.0, 1, 100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[, true, 100.0, 1, 100, -1.0]");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[a]");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 1.0d, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 1.0, 1]");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, ' ', "hi!", 100.0f, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1,  , hi!, 100.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1,  , hi!, 100.0, 10.0]");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, (byte) 100, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', '#', '#', 0L, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, #, #, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4, #, #, 0, -1]");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, wildcardClass4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray5, (int) (short) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, class java.lang.Object]");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 4]");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[a]");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, ]");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, 100.0f, obj4, (byte) 10, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, -1]");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, '4', 100L, 100.0d, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 4, 100, 100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 4, 100, 100.0, 1]");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 1.0]");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, (byte) 0, 0.0f, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 0, 0.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 0, 0.0,  ]");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), (-1), 0.0d, ' ', (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray7, 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 0.0,  , -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 0.0,  , -1.0]");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), (byte) 10, 100L, 100L, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 10, 100, 100, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 10, 100, 100, true]");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, (byte) 0, "hi!", 1, (byte) 1, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 0, hi!, 1, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 0, hi!, 1, 1, -1]");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, 10.0]");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#, 100]");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, 0L, (-1), 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 0, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 0, -1, 1]");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0d, 100.0d, "", (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 100.0, , -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 100.0, , -1]");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, 'a', "", 1, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, a, , 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, a, , 1, 1]");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, '#', (short) 10, 100L, true, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, #, 10, 100, true, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, #, 10, 100, true, 1]");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, (short) 0, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray5, (int) '#', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[false, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[false, 0, 100]");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, 0]");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray4, (int) (short) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, 0.0]");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, 100.0f, '4', 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 100.0, 4, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 100.0, 4, 1]");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[a]");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (byte) 100, (byte) -1, (short) 100, obj6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', 100L, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[ , 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[ , 100, 0]");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[ ]");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1L), 'a', 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray5, 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, a, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, a, 1]");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, (byte) 1, obj4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, '4', '4', true, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 4, 4, true, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 4, 4, true, 100]");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', (byte) 1, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, 1, -1.0]");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, 100.0f, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray5, (int) '#', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 100.0, 0]");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[a]");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 100L, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 100, 0]");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 0, 1, 100.0d, (short) -1, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 0, 1, 100.0, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 0, 1, 100.0, -1, 10]");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1L, '4', (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 4, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 4, 0]");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, 0, (short) 1, 'a', 1.0f, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray8, 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 0, 1, a, 1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 0, 1, a, 1.0, 0]");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, (-1), false, 'a', 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, -1, false, a, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, -1, false, a, 100]");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[a]");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, (-1), (short) 10, 100.0f, 10.0f, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1, 10, 100.0, 10.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1, 10, 100.0, 10.0, -1]");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, false, 10.0f, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, false, 10.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, false, 10.0, true]");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, (byte) 100, (byte) 1, (-1L), (-1.0f), (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 100, 1, -1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 100, 1, -1, -1.0, -1]");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 100L, (short) -1, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 100, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 100, -1, 0]");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 100.0]");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, '4', ' ', (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 4,  , 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 4,  , 100]");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (short) 0, (short) 1, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 0, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 0, 1, -1]");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, 0.0]");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', (-1), '#', (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, -1, #, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, -1, #, 10]");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, (byte) -1, obj4, wildcardClass6, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', (-1.0d), (short) 0, 10.0f, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[ , -1.0, 0, 10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[ , -1.0, 0, 10.0, 100]");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', 10, 1.0f, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#, 10, 1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#, 10, 1.0, 1]");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", "", (byte) 0, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!, , 0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!, , 0, 0.0]");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray4, (int) (short) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, a]");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), 0, 1.0f, 1, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 0, 1.0, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 0, 1.0, 1, -1.0]");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, (byte) 0, false, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 0, false, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 0, false, #]");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, "hi!", (short) 0, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, hi!, 0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, hi!, 0, 0.0]");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, -1]");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[false]");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, -1.0]");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), (byte) 10, (-1.0f), "", 100L, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 10, -1.0, , 100, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, 10, -1.0, , 100, 0.0]");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, obj3, (byte) -1, (byte) -1, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 100L, (-1.0d), 1, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 100, -1.0, 1, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 100, -1.0, 1, hi!]");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", (byte) 1, (byte) -1, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[hi!, 1, -1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[hi!, 1, -1, 100.0]");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d), (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0, -1]");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray2, (int) '4', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, ' ', 0L, (byte) 100, 0.0f, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0,  , 0, 100, 0.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0,  , 0, 100, 0.0, 10]");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , 100]");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), (byte) -1, (short) 100, (short) 0, 1, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) ' ', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, -1, 100, 0, 1,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, -1, 100, 0, 1,  ]");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', (byte) 100, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray5, (int) (short) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[ , 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[ , 100, 10]");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[false]");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, obj3, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0d, '4', "hi!", (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 4, hi!, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 4, hi!, 100]");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 1, 0.0d, 'a', 0.0d, 0L, wildcardClass8 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray9, (int) (byte) -1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, 0.0, a, 0.0, 0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, 0.0, a, 0.0, 0, class java.lang.Object]");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 1]");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { "hi!", (byte) 100, (short) 0, '4', obj6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 1.0f, (short) 100, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 1.0, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 1.0, 100, 1]");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, obj3, (byte) 0, 0.0f, (short) 1, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, (byte) 10, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray5, (int) (short) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 10, 100]");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 100]");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, "hi!", 10, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[a]");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0.0d, true, 10L, 10, wildcardClass7, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray9, 100, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0, true, 10, 10, class java.lang.Object, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0, true, 10, 10, class java.lang.Object, 1.0]");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[a]");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (short) 0, 1.0d, "hi!", (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, 0, 1.0, hi!, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, 0, 1.0, hi!, 10]");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, 1L, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 1, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 1, hi!]");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, "hi!", (-1), 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, hi!, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, hi!, -1, 10]");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, 0, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 0, 100]");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 0.0f, (short) 10, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 0.0, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 0.0, 10, a]");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), 0.0d, '#', (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 0.0, #, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 0.0, #, 100]");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 100]");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, (short) 100, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 100, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 100, hi!]");
    }
}

