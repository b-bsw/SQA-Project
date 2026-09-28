package org.mockito.internal.invocation;

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
        org.mockito.invocation.InvocationOnMock invocationOnMock0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.mockito.internal.invocation.Invocation.isToString(invocationOnMock0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, 10L, obj4, obj5, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray7, (int) ' ', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 10L, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray5, (int) (short) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 10, 0]");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', (byte) 10, obj4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, 1.0d, ' ', 0, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 1.0,  , 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 1.0,  , 0, -1]");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[, 10]");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 10]");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, obj3, 10.0f, false, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, #]");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, 10L, 0.0f, 0.0d, 100.0f, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 10, 0.0, 0.0, 100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 10, 0.0, 0.0, 100.0, 1]");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, ]");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0f, '4', 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 4, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 4, 0.0]");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, (byte) 100, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 100, 100]");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, 0, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 0, 100]");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, -1.0]");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, -1.0]");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', (-1.0f), 0.0f, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ , -1.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ , -1.0, 0.0, -1.0]");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, 10.0f, (short) 1, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, 10.0, 1, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, 10.0, 1, true]");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, (-1.0f), '4', 1.0f, obj6, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 10.0d, (-1.0d), 1.0d, (byte) 100, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 10.0, -1.0, 1.0, 100, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 10.0, -1.0, 1.0, 100, 100.0]");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', (short) 1, false, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ , 1, false, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ , 1, false, 0]");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0, 1.0]");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, (byte) 10, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 10, 0.0]");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, 10, 100L, 100.0d, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 10, 100, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 10, 100, 100.0, true]");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#,  ]");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0f), (byte) 10, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 10, a]");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, false, (-1L), (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, false, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, false, -1, 10]");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (short) -1, 0.0f, '4', (-1.0d), (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray9, (int) (byte) 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 0.0, 4, -1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 0.0, 4, -1.0, 0]");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", (byte) 1, "", (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1, , -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1, , -1]");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', (short) -1, (byte) 10, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ , -1, 10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ , -1, 10, 1.0]");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), 0L, (short) 1, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 0, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 0, 1, 0]");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { ' ', 1.0f, (short) -1, obj5, true, obj8 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation13 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray10, (int) 'a', realMethod12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, (byte) 100, "hi!", 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 100, hi!, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 100, hi!, 0.0]");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray4, (int) (short) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, false]");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 10.0f, 0.0f, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 10.0, 0.0, 100.0]");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, obj3, '4', 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, (byte) 0, 100L, (byte) 100, 10.0d, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray8, (int) (byte) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 0, 100, 100, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 0, 100, 100, 10.0, 10]");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), 100.0f, 1.0d, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 100.0, 1.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 100.0, 1.0, true]");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, 1.0f, '4', 100L, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 1.0, 4, 100, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 1.0, 4, 100, hi!]");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), 10.0f, 1, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 10.0, 1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 10.0, 1, 1.0]");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, true, 100.0f, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, true, 100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, true, 100.0, 10]");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (-1.0d), 1.0d, 0.0d, (byte) -1, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, -1.0, 1.0, 0.0, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, -1.0, 1.0, 0.0, -1, 10.0]");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', 10, 1.0f, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, 10, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, 10, 1.0, 100]");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', "hi!", 10.0d, (byte) 100, obj6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray7, (int) (short) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, 100L, (-1.0d), (short) -1, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 100, -1.0, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 100, -1.0, -1, 100]");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray2, (int) (short) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), ' ', (short) 0, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1,  , 0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1,  , 0, 1.0]");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, (short) 100, (byte) 100, obj5, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { wildcardClass3, 100L, (-1L), 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[class java.lang.Object, 100, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[class java.lang.Object, 100, -1, 1]");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 10]");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 0.0f, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray5, 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 0.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 0.0, 10]");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray4, (int) (short) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 0.0]");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, 'a', 'a', 100.0f, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0, a, a, 100.0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0, a, a, 100.0, #]");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 100.0d, "hi!", (-1.0d), (-1L), "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 100.0, hi!, -1.0, -1, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 100.0, hi!, -1.0, -1, hi!]");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 10, (-1L), "", 10.0f, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 10, -1, , 10.0, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 10, -1, , 10.0, a]");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, (short) 0, (-1L), (byte) 10, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 0, -1, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 0, -1, 10, -1]");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, -1]");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, 10.0f, (byte) 0, "hi!", (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray7, (int) (byte) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 10.0, 0, hi!, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 10.0, 0, hi!, -1.0]");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, "hi!", 100, 'a', (byte) -1, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, hi!, 100, a, -1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, hi!, 100, a, -1, -1]");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, (byte) 10, "", (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 10, , -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 10, , -1]");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, (byte) 1, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 1, 1.0]");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, 10.0f, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray5, (int) (short) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10.0, 1.0]");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (byte) 0, 1.0d, "", '4', (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 0, 1.0, , 4, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 0, 1.0, , 4, 0]");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, 10]");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[ ]");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 0.0d, 10.0f, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 0.0, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 0.0, 10.0, 1]");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , 0]");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, (byte) 0, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray5, 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 0, 1.0]");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, 1.0d, 100.0f, 1, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 1.0, 100.0, 1, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 1.0, 100.0, 1, #]");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, 0]");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, 1.0d, (short) 0, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 1.0, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 1.0, 0, 100]");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray2, (int) '4', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, (-1L), (-1.0f), 100.0f, 0L, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, -1, -1.0, 100.0, 0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, -1, -1.0, 100.0, 0, #]");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, 'a', (-1.0d), 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, a, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, a, -1.0, 100]");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, "", 10, 10.0d, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, , 10, 10.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, , 10, 10.0,  ]");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), (short) -1, true, 0, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, true, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, true, 0, 100]");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', (byte) 10, 1.0d, obj5, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , 100]");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, obj3, (short) 1, wildcardClass6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, (short) 1, '#', true, (short) -1, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 1, #, true, -1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 1, #, true, -1, false]");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, (-1L), 10, 100.0d, (-1L), 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray8, (int) (byte) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, -1, 10, 100.0, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, -1, 10, 100.0, -1, 10.0]");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, 1L, wildcardClass5, (byte) 1, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 1, class java.lang.Object, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 1, class java.lang.Object, 1, a]");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, (-1), 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, -1, 10.0]");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[a]");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray4, (int) (short) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, -1]");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, 0L, (byte) -1, 10, 1.0f, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 0, -1, 10, 1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 0, -1, 10, 1.0, -1]");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, (short) 10, '4', (byte) 100, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[class java.lang.Object, 10, 4, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[class java.lang.Object, 10, 4, 100, 1]");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#, 0]");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, 10, 10.0d, ' ', (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 10, 10.0,  , 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 10, 10.0,  , 1]");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, 0, wildcardClass5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 0, class java.lang.Object]");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, -1]");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, wildcardClass4, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, class java.lang.Object, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, class java.lang.Object, 0.0]");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0d, 0, 1, 10, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0, 0, 1, 10, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0, 0, 1, 10, ]");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, (short) -1, 0.0f, 100.0f, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[class java.lang.Object, -1, 0.0, 100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[class java.lang.Object, -1, 0.0, 100.0, 1]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0f), false, obj4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), 0L, (byte) 10, (-1.0f), 'a', 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 0, 10, -1.0, a, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, 0, 10, -1.0, a, 1]");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, 100, (short) 100, 0.0d, 'a', 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100, 100, 0.0, a, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100, 100, 0.0, a, a]");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 10, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 10, 0.0]");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray2, (int) (short) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, 1.0d, 0, 1, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 1.0, 0, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 1.0, 0, 1, -1.0]");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, '4', (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[true, 4, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[true, 4, 0]");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, 1]");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, (byte) 0, (-1.0d), '#', "hi!", (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 0, -1.0, #, hi!, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 0, -1.0, #, hi!, 0]");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, 1L, 'a', "", (byte) 100, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 1, a, , 100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 1, a, , 100, -1.0]");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, (short) 100, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 100, 1.0]");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[#]");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray2, (int) 'a', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, 100, 100L, (short) 10, (byte) 1, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 100, 100, 10, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 100, 100, 10, 1, 10]");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', obj3, "", 1.0d, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray7, 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0, 100]");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, (byte) -1, (short) 1, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 1, 10.0]");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, '4', (byte) 100, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 4, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 4, 100, 1]");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, (byte) 100, 0.0f, obj5, 100, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[hi!, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[hi!, 10]");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 0, (byte) 1, "", (short) 100, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray8, (int) 'a', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 0, 1, , 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 0, 1, , 100, 10]");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0f), 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0, 10.0]");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), (byte) 1, "", "hi!", 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 1, , hi!, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 1, , hi!, 1]");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, true, true, (byte) 0, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, true, true, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, true, true, 0, 100.0]");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), (-1.0f), false, 1.0d, false, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, -1.0, false, 1.0, false, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, -1.0, false, 1.0, false, 100.0]");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, "", 'a', "hi!", false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, , a, hi!, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, , a, hi!, false]");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, 1, 10L, (byte) 0, 1, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 1, 10, 0, 1, 0]");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 1]");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[a]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, '4', (byte) 1, false, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 4, 1, false, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 4, 1, false, 0]");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, (byte) 100, (short) 100, (byte) -1, 10, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[true, 100, 100, -1, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[true, 100, 100, -1, 10, 10]");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray2, (int) (byte) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, '4', (byte) 0, 0.0f, 100.0f, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 4, 0, 0.0, 100.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 4, 0, 0.0, 100.0, 1.0]");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', 1.0f, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[#, 1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[#, 1.0, 0]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, 100.0d, 1L, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 100.0, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 100.0, 1, 100]");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, (short) 100, false, (short) 1, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 100, false, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 100, false, 1, 1]");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0d), (-1L), (-1.0d), (short) 10, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, -1, -1.0, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, -1, -1.0, 10, 1]");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1.0f), obj4, (short) 10, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, 100]");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, wildcardClass4, 1, (short) -1, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 100.0f, 10.0f, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 100.0, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 100.0, 10.0, 1]");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, (short) 10, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10, -1.0]");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, 100, 0.0f, 1.0d, 1.0d, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 100, 0.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 100, 0.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), obj3, ' ', wildcardClass6, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray8, (int) ' ', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0d), 0L, false, wildcardClass6, 1.0d, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray9, (int) (short) 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, 0, false, class java.lang.Object, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, 0, false, class java.lang.Object, 1.0, 100]");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), 10L, ' ', (-1), (-1.0f), 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 10,  , -1, -1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 10,  , -1, -1.0, 1]");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, (byte) 10, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 10, -1]");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), (byte) 100, (byte) -1, 10.0f, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 100, -1, 10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 100, -1, 10.0, 100]");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 0L, ' ', 0, wildcardClass6, true, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray9, (-1), realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0,  , 0, class java.lang.Object, true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0,  , 0, class java.lang.Object, true, 1.0]");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 1.0]");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, 'a', '#', (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, a, #, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, a, #, -1.0]");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (-1L), 1L, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 1, 100]");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), 10, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1.0]");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L, true, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, true, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, true, 100.0]");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, 'a', (byte) 10, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, a, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, a, 10, 1]");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 100]");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, false, (byte) 10, 1.0d, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, false, 10, 1.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, false, 10, 1.0, 0.0]");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, 100.0d, "hi!", 100L, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray7, (int) (short) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 100.0, hi!, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 100.0, hi!, 100, -1]");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray2, (int) ' ', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, 'a', 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray5, (int) (short) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, a, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, a, 1.0]");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', 10L, 100L, (byte) 10, 'a', 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, 10, 100, 10, a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, 10, 100, 10, a, 0]");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 0]");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', (short) 100, (short) 10, (-1.0f), (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, 100, 10, -1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4, 100, 10, -1.0, 0]");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, '4', (short) 0, ' ', 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 4, 0,  , 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 4, 0,  , 1.0]");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, -1]");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1.0f), (-1.0f), (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1.0, -1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1.0, -1.0, 10]");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, (short) -1, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, -1, 10]");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 1, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 1, false]");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, (-1), 0, 10, false, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, -1, 0, 10, false, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, -1, 0, 10, false, -1.0]");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray4, 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0]");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 100.0]");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, 'a', 'a', (byte) 0, "", 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, a, a, 0, , 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, a, a, 0, , 100]");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, 10, (short) 10, (short) 0, wildcardClass7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 10, 10, 0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 10, 10, 0, class java.lang.Object]");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, 1.0d, 10, true, (-1L), 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 1.0, 10, true, -1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 1.0, 10, true, -1, 100.0]");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), 0L, 0L, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 0, 0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 0, 0, 4]");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, 10, (short) -1, 1.0f, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray7, (int) ' ', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 10, -1, 1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 10, -1, 1.0, 10]");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", ' ', (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray5, 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[hi!,  , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[hi!,  , 0]");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, "", 10.0d, 0.0f, 10.0d, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, , 10.0, 0.0, 10.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, , 10.0, 0.0, 10.0, -1]");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, 100.0f, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 100.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 100.0, 10.0]");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, (byte) 100, '4', (-1.0d), obj6, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, (short) 10, 100, 100.0d, (short) 10, obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, (byte) 0, 10.0d, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, 0, 10.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, 0, 10.0, hi!]");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), obj3, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, ]");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, 1L, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 1, -1.0]");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, obj3, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, 0, 1L, (short) 0, (short) 10, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 0, 1, 0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 0, 1, 0, 10, 0]");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray4, (int) (short) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#, 10]");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[false]");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 1 };
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), (-1.0f), 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, -1.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, -1.0, 10.0]");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, (short) 0, wildcardClass5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 0, class java.lang.Object]");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, (-1L), false, (short) 100, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, -1, false, 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, -1, false, 100, 0]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, (short) 0, 0, 10L, 10.0d, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 0, 0, 10, 10.0, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 0, 0, 10, 10.0, a]");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray2, (int) '4', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray4, (int) 'a', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, (-1), (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray5, (int) (short) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1, 0]");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", 0.0f, obj4, (short) 0, 10L, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0d), '#', "hi!", '#', (byte) 10, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, #, hi!, #, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, #, hi!, #, 10, -1]");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, 1.0d, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (short) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 1.0, 100]");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, 1.0d, 100L, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 1.0, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 1.0, 100, 10]");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 1]");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, -1]");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 0]");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, (short) 10, "", wildcardClass6, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray8, (int) ' ', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 10, , class java.lang.Object, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 10, , class java.lang.Object, ]");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, "hi!", 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, hi!, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, hi!, 100.0]");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, 'a', 100.0d, '#', 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, a, 100.0, #, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, a, 100.0, #, 100]");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray2, (int) (short) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', (short) -1, 1, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#, -1, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#, -1, 1, -1.0]");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray2, (int) (byte) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, 1L, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 1, 1]");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, 1L, 100L, 100L, 1L, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 1, 100, 100, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 1, 100, 100, 1, -1]");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray4, (-1), realMethod6);
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, 100, (short) 100, '#', 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100, 100, #, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100, 100, #, 0.0]");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 10]");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, (short) -1, 10L, (short) -1, (short) 10, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, -1, 10, -1, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, -1, 10, -1, 10, 100.0]");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, (short) 10, 'a', (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 10, a, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 10, a, -1.0]");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, 10.0f, (short) 1, 10.0f, obj6, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L, (short) 10, true, 0.0f, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray7, (int) ' ', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 10, true, 0.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 10, true, 0.0, -1]");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 10]");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, 10.0d, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 10.0, 0]");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, (byte) 1, 0L, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 1, 0, false]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 100]");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), '4', 10L, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray6, (int) (short) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 4, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 4, 10, -1]");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, 10.0d, 0, 10.0d, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 10.0, 0, 10.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 10.0, 0, 10.0, 1.0]");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), ' ', (short) -1, 100L, '#', 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1,  , -1, 100, #, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1,  , -1, 100, #, 100.0]");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, false, 10.0f, (short) 10, 1L, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray8, 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, false, 10.0, 10, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, false, 10.0, 10, 1, 0]");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 100.0d, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (byte) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 100.0, 1.0]");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , 0]");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray4, (int) (short) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[false, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[false, 1]");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, 100.0f, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100.0, -1.0]");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, '4', (byte) 100, obj5, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1.0f), (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray5, (int) (short) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1.0, 100]");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, true, false, 0.0d, ' ', 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, true, false, 0.0,  , 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, true, false, 0.0,  , 0.0]");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, ' ', (byte) -1, true, (short) 0, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1,  , -1, true, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1,  , -1, true, 0, -1]");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, (-1), true, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, -1, true, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, -1, true, #]");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, true]");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray4, (int) 'a', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[, 10]");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, 10.0d, true, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10.0, true, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10.0, true, 0.0]");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', obj3, ' ', 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, (-1), 'a', "", 1L, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, -1, a, , 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, -1, a, , 1, 100]");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 0.0f, (byte) 100, obj5, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, (-1.0f), (-1L), 100, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, -1.0, -1, 100, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, -1.0, -1, 100, 100.0]");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, "hi!", (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, hi!, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, hi!, 1]");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, (byte) -1, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, -1, 1]");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', (byte) 100, 100, ' ', (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[ , 100, 100,  , -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[ , 100, 100,  , -1]");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, (byte) -1, 10.0f, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, -1, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, -1, 10.0, 10]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, "", (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, , -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, , -1.0]");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, (byte) 1, 1.0d, (short) 100, 100.0f, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 1, 1.0, 100, 100.0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 1, 1.0, 100, 100.0, #]");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, (short) 10, (-1.0d), 0L, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 10, -1.0, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 10, -1.0, 0, 1]");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[true, 10]");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (short) 1, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 1, 1]");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, 1.0d, 100.0f, 1.0f, 0L, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 1.0, 100.0, 1.0, 0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 1.0, 100.0, 1.0, 0, 0]");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray4, (int) 'a', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, -1]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, ]");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 1.0f, 10.0f, 100.0f, 10.0f, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', 10L, (short) -1, obj5, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), false, (-1L), 1.0f, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, false, -1, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, false, -1, 1.0, 100]");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d, '#', '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, #, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, #, #]");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, (byte) -1, 0, 0L, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, -1, 0, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, -1, 0, 0, -1]");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, 0L, 1, (byte) 100, obj6, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray8, 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, 0.0d, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[class java.lang.Object, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[class java.lang.Object, 0.0, 0]");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, 100, (-1.0d), (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 100, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 100, -1.0, -1]");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 1.0]");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[true, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[true, 100]");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray2, (int) 'a', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray2, (int) 'a', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, 0L, 1.0d, ' ', (byte) 10, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 0, 1.0,  , 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 0, 1.0,  , 10, 1]");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, (byte) 100, false, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[true, 100, false, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[true, 100, false, 0]");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, 1.0d, 10L, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 1.0, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 1.0, 10, 10]");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, 10, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray5, (int) '#', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 100.0]");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, (byte) -1, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 4]");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "hi!", (byte) 0, (byte) -1, true, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray8, (int) ' ', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, hi!, 0, -1, true, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, hi!, 0, -1, true, 4]");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, 10.0f, 100, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 10.0, 100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 10.0, 100, -1.0]");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", 1, obj4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray5, 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#, -1.0]");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", ' ', "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[,  , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[,  , hi!]");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 1, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray5, 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 1, 0.0]");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100.0f, 0, true, (byte) -1, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0, 0, true, -1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0, 0, true, -1, -1.0]");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { wildcardClass3, obj4, 10, 100.0f, 10.0d, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray9, 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), 10, 100.0d, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 10, 100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 10, 100.0, 10]");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", 100.0d, (-1), 0L, (short) 0, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0, -1, 0, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0, -1, 0, 0, 100]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, 0L, (short) 10, (short) -1, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 0, 10, -1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 0, 10, -1, ]");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray4, 0, realMethod6);
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, 1.0d, 10.0d, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, 1.0, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, 1.0, 10.0, 1]");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, 0L, (byte) 100, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 0, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 0, 100, 10]");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, (byte) 100, 10.0d, 10.0f, '4', (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 100, 10.0, 10.0, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 100, 10.0, 10.0, 4, 100]");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 1, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 1, 10.0]");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, true, 'a', 100, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, 10, 1L, (short) 1, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 10, 1, 1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 10, 1, 1, 0.0]");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray2, (int) ' ', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, 10L, 0.0f, obj5, 1.0d, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, (short) -1, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[class java.lang.Object, -1, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[class java.lang.Object, -1, true]");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10]");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, (short) 1, true, 0.0f, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 1, true, 0.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 1, true, 0.0, 10]");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), false, 100.0f, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, false, 100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, false, 100.0, 10]");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, 0.0f, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 0.0, 100.0]");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, "", (-1), (short) -1, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, 0.0f, 1.0d, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 0.0, 1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 0.0, 1.0, 10]");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', "hi!", obj4, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, 10L, 0.0d, (short) 0, obj6, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (-1.0d), 100, true, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, -1.0, 100, true, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, -1.0, 100, true, 100]");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray2, (int) 'a', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', (byte) 10, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[ , 10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[ , 10, 1.0]");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 0]");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, wildcardClass4, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, class java.lang.Object, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, class java.lang.Object, 100]");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, (byte) 10, (byte) 10, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 10, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 10, 10, -1.0]");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[a]");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { true, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[true, 10]");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[#]");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, (short) 100, (short) 100, 10L, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 100, 100, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 100, 100, 10, 100]");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', 0L, "hi!", 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, 0, hi!, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, 0, hi!, 1]");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0d, '4', 1, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 4, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 4, 1, 10]");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', ' ', "hi!", "hi!", (byte) 10, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a,  , hi!, hi!, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a,  , hi!, hi!, 10, 0]");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, (-1L), 10L, '#', (-1), 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, -1, 10, #, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, -1, 10, #, -1, 1.0]");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, 1, (byte) -1, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 1, -1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 1, -1, -1]");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, false, 10.0d, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[true, false, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[true, false, 10.0, 10]");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), 'a', (byte) 0, 0.0d, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, a, 0, 0.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, a, 0, 0.0, 100]");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) -1, wildcardClass4, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, class java.lang.Object, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, class java.lang.Object, false]");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', 1L, (byte) 0, 0.0d, "", 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 1, 0, 0.0, , 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 1, 0, 0.0, , 10]");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, -1]");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , 100.0]");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), (short) 10, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 10, -1]");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 1]");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, (short) 100, 10L, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 100, 10, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 100, 10, true]");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, (short) 100, (-1.0d), 1.0f, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 100, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 100, -1.0, 1.0, -1.0]");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), 10L, 1L, (byte) 100, (byte) 10, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 10, 1, 100, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 10, 1, 100, 10, 10]");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, (-1L), 100, (short) 0, "hi!", (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1, 100, 0, hi!, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1, 100, 0, hi!, -1]");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', 100.0f, (short) 10, 100.0d, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, 100.0, 10, 100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, 100.0, 10, 100.0, 0]");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, (byte) 100, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 100, -1]");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', 100.0f, true, (short) 10, 10.0d, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (byte) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, 100.0, true, 10, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, 100.0, true, 10, 10.0, 1]");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', (short) 100, (-1.0d), 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#, 100, -1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#, 100, -1.0, 10]");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (byte) -1, 0L, (short) 100, obj6, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray9, 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, -1]");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 1]");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, 1.0f, 0, obj5, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, 'a', 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, a, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, a, 10]");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 10, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, obj3, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray6, (int) (short) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, (-1.0f), 10L, 100.0f, 1, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, 1, 0.0d, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 1, 0.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 1, 0.0, 10]");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", 1.0d, (-1L), (byte) 10, (short) 1, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[, 1.0, -1, 10, 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[, 1.0, -1, 10, 1, 10.0]");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 10.0d, 'a', "", obj6, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray8, 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, (-1), 100L, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, -1, 100, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, -1, 100, a]");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, 0L, 10L, (short) 100, 1.0d, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 0, 10, 100, 1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 0, 10, 100, 1.0, -1]");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 100, (byte) 1, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100, 1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100, 1, 1.0]");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), 0.0f, "hi!", 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 0.0, hi!, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 0.0, hi!, 0.0]");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, (short) 100, (short) -1, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 100, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 100, -1, 100]");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", "hi!", (short) 0, (-1.0f), true, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray8, (int) 'a', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, hi!, 0, -1.0, true, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, hi!, 0, -1.0, true, 1]");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 0.0f, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 0.0, 1]");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, 1, 0, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 1, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 1, 0, 1]");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray4, (int) (short) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, -1]");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, false, (short) -1, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, false, -1, 1]");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray4, (int) (short) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 1]");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, true, 10.0d, 0L, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, true, 10.0, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, true, 10.0, 0, 100]");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 100.0f, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 100.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 100.0, -1]");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, (byte) 0, (short) 10, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 0, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 0, 10, -1]");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, 'a', true, '#', '#', (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, a, true, #, #, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, a, true, #, #, 0]");
    }
}

