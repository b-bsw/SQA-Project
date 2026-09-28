package org.mockito.internal.invocation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

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
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 100L, (byte) 1, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, wildcardClass5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, (byte) 100, "", (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 100, , 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 100, , 10]");
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, 0L, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 0, -1]");
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (byte) 100, 10.0f, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 100, 10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 100, 10.0, 100]");
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, 0, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 0, false]");
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, '#', 100.0d, 0.0f, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray7, (int) ' ', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0, #, 100.0, 0.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0, #, 100.0, 0.0, true]");
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, 100.0d, (short) -1, 0L, 100L, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 100.0, -1, 0, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 100.0, -1, 0, 100, 10]");
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', (short) 100, obj4, 0.0d, (byte) -1, obj8 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray9, (int) '4', realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 100L, 1, '#', (short) 100, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, a]");
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (byte) 10, (short) 100, 10, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10, 100, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10, 100, 10, -1.0]");
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, "hi!", (byte) 1, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, hi!, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, hi!, 1, 10]");
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (byte) 100, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 100, 100]");
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray2, (int) ' ', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#, 10]");
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, 100.0d, 100.0f, 10.0d, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 100.0, 100.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 100.0, 100.0, 10.0, 0]");
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0d, obj3, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', 1.0f, (byte) 10, 'a', 100.0d, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 1.0, 10, a, 100.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 1.0, 10, a, 100.0, 10.0]");
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L), (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 0]");
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, 10.0f, (short) 100, 'a', wildcardClass7, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray9, 0, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 10.0, 100, a, class java.lang.Object, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 10.0, 100, a, class java.lang.Object, 0]");
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 'a', 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a, 0]");
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, 0L, (byte) 10, 'a', 100L, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray8, (int) (byte) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 0, 10, a, 100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 0, 10, a, 100, -1.0]");
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0d, (byte) -1, (byte) 1, 10.0d, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, -1, 1, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, -1, 1, 10.0, 100.0]");
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 10.0f, 10, "hi!", 1L, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, (short) 100, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 100, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 100, 10.0]");
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, (byte) 1, (-1L), (-1L), '#', 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (byte) -1, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, -1, 1]");
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1), false, false, 0L, 1L, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, false, false, 0, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, false, false, 0, 1, -1]");
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, wildcardClass4, 0, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, class java.lang.Object, 0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, class java.lang.Object, 0, #]");
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray4, (int) 'a', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 100]");
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, (short) 0, 1, (short) -1, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray8, (int) ' ', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[, 0]");
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, (byte) -1, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray5, (int) (byte) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[false, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[false, -1, 100]");
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', 0, '#', (byte) 10, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 0, #, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 0, #, 10, 100]");
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, (short) 10 };
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
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, true, wildcardClass5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, true, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, true, class java.lang.Object]");
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { wildcardClass3, 10L, 10.0d, 0.0d, (short) 1, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray9, (int) '#', realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[class java.lang.Object, 10, 10.0, 0.0, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[class java.lang.Object, 10, 10.0, 0.0, 1, 10]");
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, #]");
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, 100, 10.0d, (byte) 100, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 100, 10.0, 100, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 100, 10.0, 100, a]");
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, (short) 10, (short) 100, (byte) 100, 100.0f, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 10, 100, 100, 100.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 10, 100, 100, 100.0, -1]");
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 100.0d, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 100.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 100.0, -1]");
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, false, ' ', (byte) 1, (byte) -1, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, false,  , 1, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, false,  , 1, -1, 10]");
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0f, 0, "hi!", 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 0, hi!, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 0, hi!, 1]");
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), 1.0f, 100.0d, (-1.0f), '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 1.0, 100.0, -1.0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 1.0, 100.0, -1.0, #]");
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, 1L, (byte) 1, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, 1, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, 1, 1, 10]");
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, 10.0f, (short) 0, (-1.0f), (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 10.0, 0, -1.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 10.0, 0, -1.0, -1.0]");
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), (byte) -1, (-1.0f), (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, -1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, -1, -1.0, -1]");
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 100.0]");
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, -1]");
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, 100, (byte) 10, 10.0d, 1L, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 100, 10, 10.0, 1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 100, 10, 10.0, 1, 4]");
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", (-1L), 10.0f, 1, 'a', "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, -1, 10.0, 1, a, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, -1, 10.0, 1, a, ]");
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, 0.0f, (short) 10, true, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 0.0, 10, true, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 0.0, 10, true, 1]");
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (byte) -1, ' ', (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, -1,  , -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, -1,  , -1.0]");
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, 1, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray5, (int) 'a', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 1, 4]");
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, 1, 0.0f, 0.0d, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray7, (int) (byte) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 1, 0.0, 0.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 1, 0.0, 0.0, 100]");
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray2, (int) '4', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, (short) -1, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray5, (int) (short) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, -1, 1]");
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 10, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray5, (int) (short) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 10, 100]");
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, (-1), (-1.0f), (short) 0, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, -1, -1.0, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, -1, -1.0, 0, 1]");
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), "", 0.0d, (short) -1, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray7, 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, , 0.0, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, , 0.0, -1, 0]");
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (byte) 10, 100.0f, (short) 100, true, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 10, 100.0, 100, true, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 10, 100.0, 100, true, 100]");
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 1]");
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, true, (byte) 10, (short) 100, true, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, true, 10, 100, true, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, true, 10, 100, true, #]");
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, (byte) 10, 1.0f, 100, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray7, (int) (byte) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 10, 1.0, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 10, 1.0, 100, 100]");
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, (byte) 0, 100.0d, (-1L), 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 0, 100.0, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 0, 100.0, -1, 10.0]");
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", (short) 100, 100, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 100, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 100, 100, 10]");
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[false]");
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, (short) -1, 100, 10.0f, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray7, 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, -1, 100, 10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, -1, 100, 10.0, 100]");
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, -1]");
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[false, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[false, false]");
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, 0.0d, (byte) 0, (short) -1, 100, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 0.0, 0, -1, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 0.0, 0, -1, 100, 1]");
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, (short) 0, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, '#', (-1.0f), (short) 10, obj6, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, '#', 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, #, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, #, 1]");
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , 100]");
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, 10.0d, 'a', (short) 1, (byte) 1, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray8, (int) ' ', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 10.0, a, 1, 1, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 10.0, a, 1, 1, hi!]");
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', (byte) 0, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray5, (int) (short) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[#, 0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[#, 0, -1.0]");
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0d, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray4, (int) (short) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 100.0]");
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1]");
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, (-1L), (byte) -1, obj5, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, (-1), (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1, 0]");
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100.0d, (byte) 0, true, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100.0, 0, true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100.0, 0, true, 10]");
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, 10, (short) -1, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray6, (int) (short) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10, -1, 10]");
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, -1.0]");
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, 0L, true, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 0, true, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 0, true, 100]");
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 0, wildcardClass5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, 0.0]");
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray2, (int) ' ', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, true]");
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, 'a', (-1.0d), (short) 1, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, a, -1.0, 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, a, -1.0, 1, 10.0]");
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 10.0f, 1.0d, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 10.0, 1.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 10.0, 1.0, hi!]");
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, 1]");
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, a]");
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, 100L, 0, '4', (-1.0d), (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 100, 0, 4, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 100, 0, 4, -1.0, 100]");
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { ' ', 0, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray5, (int) '#', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[ , 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[ , 0, 100]");
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[false]");
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, 0.0f, 10, (short) -1, 1.0d, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 0.0, 10, -1, 1.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 0.0, 10, -1, 1.0, -1.0]");
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, obj3, (byte) 10, 100.0f, 0.0d, obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, 1L, (short) 100, 'a', 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 1, 100, a, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 1, 100, a, 100.0]");
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, 1.0f, false, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 1.0, false, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 1.0, false, 100]");
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, 100L, '#', (-1.0d), (-1.0f), (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 100, #, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 100, #, -1.0, -1.0, 100]");
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1L), 10.0f, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10.0, 1]");
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 1]");
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, 1.0f, '4', (-1L), 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 1.0, 4, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 1.0, 4, -1, 1]");
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', (-1.0f), (-1), (byte) 100, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, -1.0, -1, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, -1.0, -1, 100, 1.0]");
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), obj3, 100.0f, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, (byte) 0, (byte) 1, '4', (short) 1, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 0, 1, 4, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 0, 1, 4, 1, 10]");
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", (short) 10, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[, 10, 10]");
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#, 4]");
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, 100, 0.0d, 100, 1.0d, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100, 0.0, 100, 1.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100, 0.0, 100, 1.0, -1.0]");
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, 100, 10.0f, (byte) 10, (-1), 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 100, 10.0, 10, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 100, 10.0, 10, -1, 1.0]");
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, 0.0d, "", 1L, (byte) 1, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 0.0, , 1, 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 0.0, , 1, 1, 10.0]");
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, (short) -1, 1.0f, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1, 1.0, 100]");
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0f, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, 0]");
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', (-1.0d), (byte) 100, 10, 1.0f, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , -1.0, 100, 10, 1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , -1.0, 100, 10, 1.0, -1]");
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 1]");
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, 1.0f, obj4 };
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
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1L), 1.0f, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 1.0, 0]");
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, (int) (byte) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 100, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray5, 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100, true]");
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, (byte) 0, wildcardClass5, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 0, class java.lang.Object, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 0, class java.lang.Object, 1.0]");
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, false, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray5, (int) '#', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, false, -1]");
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, 1L, 1L, 10, (short) -1, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 1, 1, 10, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 1, 1, 10, -1, 0]");
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, obj3, 0.0f, 10.0f, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray7, (int) (byte) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray3 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, '#', true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray5, (int) 'a', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, #, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, #, true]");
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#, 100]");
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, 10, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 10, 100.0]");
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, -1.0]");
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, (-1.0f), (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, -1.0, -1]");
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, 10L, 10, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 10, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 10, 10, 100]");
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), (short) 100, "hi!", 10, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, 100, hi!, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, 100, hi!, 10, 0]");
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', obj3, (-1.0d), 1L, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (short) 1, (short) -1, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 1, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 1, -1, 100]");
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100,  ]");
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray2, (int) (short) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 100.0f, 10.0d, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray4, (int) (short) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 10]");
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 0]");
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, (byte) 1, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray5, 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 1, 1.0]");
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, (-1.0d), (-1), 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray7, (int) (byte) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1.0, -1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1.0, -1, 10.0]");
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, 0.0f, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray5, 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 0.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 0.0, -1.0]");
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, (-1.0f), (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1.0, -1.0]");
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (-1.0f), (byte) 10, 'a', 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, -1.0, 10, a, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, -1.0, 10, a, 10]");
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, 100.0f, (-1.0f), 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 100.0, -1.0, 0.0]");
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, (-1.0d), 0L, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, -1.0, 0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, -1.0, 0, true]");
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 0L, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 0, 0.0]");
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', 0.0f, 1L, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, 0.0, 1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, 0.0, 1, 0.0]");
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', '#', false, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#, #, false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#, #, false, hi!]");
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, 1L, (-1), 0.0d, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray7, 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 1, -1, 0.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 1, -1, 0.0, 10]");
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, '#', (-1.0f), 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, #, -1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, #, -1.0, 10]");
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, 100.0d, 1.0d, '#', (short) 100, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0, 1.0, #, 100, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0, 1.0, #, 100, ]");
    }
}

