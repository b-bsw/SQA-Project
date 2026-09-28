package org.mockito.internal.invocation;

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
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, (-1L), 1, false, 100.0d, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[false, -1, 1, false, 100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[false, -1, 1, false, 100.0, 1]");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray2, (int) ' ', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, 1.0d, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', 1.0d, 1L, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray6, (int) (byte) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, 1.0, 1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, 1.0, 1, 4]");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, ' ', obj4, 'a', ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, ' ', false, 1L, (short) 1, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0,  , false, 1, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0,  , false, 1, 1, 0]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', 0, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[#, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[#, 0, 100.0]");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { false, 100L, 0, 'a', wildcardClass7, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray9, (int) (byte) 10, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[false, 100, 0, a, class java.lang.Object, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[false, 100, 0, a, class java.lang.Object, 0]");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 1, (-1L), 100.0f, (byte) 100, (byte) 0, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray8, (int) (short) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, -1, 100.0, 100, 0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, -1, 100.0, 100, 0, 0]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.Object obj0 = null;
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 10, (-1.0f), (byte) 10, obj5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, ' ', 100L, 1L, (-1.0d), obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray8, (int) (byte) 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, ]");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, 100.0d, 'a', 0, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray7, (int) (short) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 100.0, a, 0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 100.0, a, 0, -1.0]");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10, (short) 10, (byte) 100, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10, 100, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10, 100, 100.0]");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100, (short) 100, (byte) 0, 0.0d, false, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 100, 0, 0.0, false, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 100, 0, 0.0, false, 0]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass3, 'a', (-1L), (byte) 100, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray8, (int) 'a', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[class java.lang.Object, a, -1, 100, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[class java.lang.Object, a, -1, 100, -1.0]");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 0L, "", (byte) 0, (short) -1, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 0, , 0, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 0, , 0, -1, 0]");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, 100, 1, (short) -1, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray7, (int) (byte) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 100, 1, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 100, 1, -1, 0]");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray2, (int) (byte) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (short) 100, (short) 1, 100.0d, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 100, 1, 100.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 100, 1, 100.0, 10.0]");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 10L, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 10, -1]");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, "", 1, 10L, 10.0f, obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray9, (-1), realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { "", 100.0f, 1, (short) 0, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[, 100.0, 1, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[, 100.0, 1, 0, 1]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), 0L, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray5, (int) (short) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 0, 0]");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, 1L, obj4, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, 100L, "", (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 100, , -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 100, , -1]");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 100]");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", 100.0d, (short) 1, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!, 100.0, 1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!, 100.0, 1, 0.0]");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, (short) 100, 'a', 0.0d, (short) 1, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 100, a, 0.0, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 100, a, 0.0, 1, 10]");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 10.0f, "hi!", (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, 'a', "", obj5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", '4', (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[, 4, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[, 4, 0]");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', 100, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[a, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[a, 100, 10]");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 100.0d, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 100.0, 0]");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, (byte) -1, 0, 100.0d, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, -1, 0, 100.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, -1, 0, 100.0, 100]");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (short) 0, (short) 10, '#', 1.0d, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 0, 10, #, 1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 0, 10, #, 1.0, 0]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 10, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray4, (int) (short) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 1.0]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, 10L, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 10, 10]");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 1.0d, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, 1, (byte) 10, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 1, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 1, 10, -1]");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, wildcardClass4, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (byte) 100, 1.0f, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 100, 1.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 100, 1.0, ]");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0L, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 1]");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), (-1.0d), (byte) 10, (short) 1, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1.0, 10, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1.0, 10, 1, a]");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) -1, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 1]");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, 100 };
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
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 0.0]");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 100, (byte) 10, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 10, -1]");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 0]");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray3, (int) (byte) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, 1.0f, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[class java.lang.Object, 1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[class java.lang.Object, 1.0, 10]");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, 1.0d, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray5, (int) 'a', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 1.0, 1.0]");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', ' ', false, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ ,  , false, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ ,  , false, 100]");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, 1.0d, 100.0d, (short) 10, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 1.0, 100.0, 10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 1.0, 100.0, 10, 0]");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray2, (-1), realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 0L, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray5, (int) 'a', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 0, 10]");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, (byte) 100, (byte) 10, 100.0d, 100.0d, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 100, 10, 100.0, 100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 100, 10, 100.0, 100.0, 1]");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 100, (short) 0, (byte) -1, 0.0d, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 0, -1, 0.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 0, -1, 0.0, -1.0]");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), true, ' ', 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, true,  , 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, true,  , 1]");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, true, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray5, (int) (short) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, true, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, true, 10]");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "hi!", ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[hi!,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[hi!,  ]");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), 100L, (-1.0d), (-1.0f), "hi!", 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, 100, -1.0, -1.0, hi!, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, 100, -1.0, -1.0, hi!, 100]");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 10.0f, 100.0f, ' ', 1L, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 10.0, 100.0,  , 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 10.0, 100.0,  , 1, 1]");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '#', 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[#, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[#, 1.0]");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, 0L, (short) 100, obj5, (short) 10 };
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
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, -1]");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[ ]");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, 0.0f, (byte) -1, 'a', "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 0.0, -1, a, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 0.0, -1, a, hi!]");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0d, (-1.0d), 'a', (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, -1.0, a, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, -1.0, a, 100]");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, 'a', '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray5, (int) (short) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, a, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, a, 4]");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { false, 100.0f, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray5, 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[false, 100.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[false, 100.0, 0.0]");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[true]");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, (short) -1, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray5, (int) (short) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, false]");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, ' ', (-1.0f), obj5, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray7, 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, 'a', 10L, "", (-1.0f), (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (-1), realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0L, (short) 0, '#', (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 0, #, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 0, #, -1]");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, 10, (-1.0f), 100.0f, 0, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 10, -1.0, 100.0, 0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 10, -1.0, 100.0, 0, 10]");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 0, 10.0f, 1L, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10.0, 1, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10.0, 1, #]");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', (short) 0, (short) 10, (-1.0f), (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, 0, 10, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, 0, 10, -1.0, -1]");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (byte) 100, 100.0f, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 100, 100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 100, 100.0, 1]");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0d, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray4, (int) (byte) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, -1]");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray2, (int) 'a', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray3, (int) (byte) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[true]");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, (byte) 0, (byte) 0, (short) 10, obj6, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 1, (byte) 10, (byte) 100, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 10, 100, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 10, 100, 10]");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, (short) 1, "", 'a', false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray7, (int) (byte) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 1, , a, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 1, , a, false]");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, (short) 1, (short) 0, false, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0, 1, 0, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0, 1, 0, false, 10]");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10.0f, 1.0f, '#', 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10.0, 1.0, #, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10.0, 1.0, #, 0]");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, ' ', 1L, (-1L), 1L, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1,  , 1, -1, 1,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1,  , 1, -1, 1,  ]");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray2, (int) (short) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, (-1), (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) '#', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 10]");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, 100L, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 100, -1]");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[false, 1.0]");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0f, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 0]");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[false, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[false, #]");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), (short) 1, (short) 1, 10.0d, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 1, 1, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 1, 1, 10.0, 0.0]");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, (-1.0f), 1L, 100.0f, 'a', (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1.0, 1, 100.0, a, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1.0, 1, 100.0, a, 1]");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, 1, 10.0d, (-1.0f), obj6, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1L), '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 4]");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 1, wildcardClass4, 1.0f, 'a', 0L, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray9, (int) (short) 0, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1, class java.lang.Object, 1.0, a, 0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1, class java.lang.Object, 1.0, a, 0, 10]");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 10, obj3, (byte) 100, (-1L), (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray7, (int) (byte) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, (-1), (byte) 10, 10, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, -1, 10, 10, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, -1, 10, 10, false]");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1, 0.0f, true, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 0.0, true, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 0.0, true, false]");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, (-1), (-1.0d), 10.0f, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, false, 100, (short) 10, 1.0d, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, false, 100, 10, 1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, false, 100, 10, 1.0, 1.0]");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d), ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0,  ]");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1.0f), 0, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0, 0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0, 0, -1]");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, (-1.0f), 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, -1.0, 100]");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 1, 10, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 10, 10]");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 1]");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 10]");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 'a', 100.0d, 1, wildcardClass6, 0.0f, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray9, (int) (byte) 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[a, 100.0, 1, class java.lang.Object, 0.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[a, 100.0, 1, class java.lang.Object, 0.0, 10]");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100L, 100L, (short) 10, (-1.0f), (-1.0f), 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 100, 10, -1.0, -1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 100, 10, -1.0, -1.0, 10]");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, (byte) 0, obj4, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), 0.0f, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray5, 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 0.0, 1]");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, '4', (-1L), (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, 4, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, 4, -1, 1]");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, (-1L), 100.0f, (-1.0f), (byte) 10, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, -1, 100.0, -1.0, 10, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, -1, 100.0, -1.0, 10, true]");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', 0.0d, (-1.0f), "hi!", '4', 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 0.0, -1.0, hi!, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 0.0, -1.0, hi!, 4, 100]");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (-1), (byte) 0, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray5, (int) (byte) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 0, -1.0]");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 10.0]");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '4', '#', '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[4, #, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[4, #, #]");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[true]");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray2, (int) (byte) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, '4', true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 4, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 4, true]");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, (byte) -1, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray5, (int) '#', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, -1,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, -1,  ]");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", (short) -1, true, 1.0f, (-1.0f), 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray8, (int) (byte) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, -1, true, 1.0, -1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, -1, true, 1.0, -1.0, 0]");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray2, (int) (byte) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, 1.0f, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 1.0, 10]");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0L, (short) 10, '4', 'a', (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 10, 4, a, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 10, 4, a, 10]");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, 0, (byte) 100, (byte) 100, (byte) 0, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 0, 100, 100, 0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 0, 100, 100, 0, 10]");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1L, (short) 10, (byte) 100, true, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 10, 100, true, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 10, 100, true, true]");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 10, (byte) 10, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray5, (int) (short) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 10, 10]");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray2, (int) (byte) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), (-1.0f), true, "hi!", "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1.0, true, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1.0, true, hi!, hi!]");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', (-1.0d), 100.0d, (short) 0, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[ , -1.0, 100.0, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[ , -1.0, 100.0, 0, 100]");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray2, (int) 'a', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", false, 0.0f, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!, false, 0.0, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!, false, 0.0, a]");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, (short) 1, (-1L), true, '#', 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 1, -1, true, #, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 1, -1, true, #, 0]");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, (short) 100, (-1), 1.0d, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 100, -1, 1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 100, -1, 1.0, 100]");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', 100, false, 0, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, 100, false, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4, 100, false, 0, 100]");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "hi!", (short) 0, (-1.0f), (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!, 0, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!, 0, -1.0, -1]");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, (-1.0d), 100L, (short) 1, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray7, (int) (short) 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, -1.0, 100, 1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, -1.0, 100, 1, 10.0]");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 100, '4', (-1.0d), (short) 0, (short) 10, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100, 4, -1.0, 0, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100, 4, -1.0, 0, 10, 0.0]");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, 10.0d, (-1L), true, (short) 10, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray8, (int) (short) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 10.0, -1, true, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 10.0, -1, true, 10, 10]");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, (short) 100, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, 100, 1]");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0d), 10, (-1.0d), 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (byte) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 10, -1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 10, -1.0, 1]");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), (byte) 1, 10, (short) 100, '#', obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, false, 1L, (byte) -1, "", 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, false, 1, -1, , a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, false, 1, -1, , a]");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[false]");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, (short) 0, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray5, (int) (short) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, 100, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray5, (int) (short) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 100, 100]");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray2, (int) '4', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', (-1.0f), (short) 1, 'a', true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray7, (int) ' ', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[ , -1.0, 1, a, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[ , -1.0, 1, a, true]");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 100L, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 100, -1]");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, (short) 0, 1.0f, (short) 10, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 0, 1.0, 10, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 0, 1.0, 10, 10.0]");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, obj3, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 0.0f, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray4, (int) (short) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0, 1]");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1L, obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray4, (int) (short) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray3, (int) '#', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 100]");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray2, (int) 'a', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, (byte) 0, (byte) 10, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 0, 10, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 0, 10, -1.0]");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 100.0d, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 100.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 100.0, -1]");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, 100L, 'a', 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 100, a, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 100, a, 10]");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[, 0]");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', (short) 100, 100.0d, 100.0d, false, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 100, 100.0, 100.0, false, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 100, 100.0, 100.0, false, ]");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', true, (byte) 1, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, true, 1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, true, 1, 100]");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 10.0]");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, 100L, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 100, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 100, 100.0]");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { wildcardClass3, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[class java.lang.Object, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[class java.lang.Object, -1]");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { "", obj3, 1.0f, 100.0f, obj6, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, 0L, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 0, 1.0]");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, 1, 10.0d, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, wildcardClass4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, class java.lang.Object]");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, obj3, 0.0d, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0d, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0,  ]");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, wildcardClass4, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, class java.lang.Object, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, class java.lang.Object, 100.0]");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 1.0]");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100L, obj3, ' ', (byte) 10, 1L, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray9, (int) (byte) 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) (short) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 100.0]");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, 100.0d, 1L, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 100.0, 1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 100.0, 1, 0.0]");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { obj2, (-1.0f), 1L, 100L, 'a', (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, obj3, 100, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { true, 10, 'a', (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (int) (short) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[true, 10, a, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[true, 10, a, 1]");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', 1, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[#, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[#, 1, a]");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, 0.0f, (-1L), 100.0f, 1, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 0.0, -1, 100.0, 1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 0.0, -1, 100.0, 1, ]");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { true, 1.0f, 0.0d, ' ', 100, obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray9, (int) (byte) 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray4, (int) 'a', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, 0]");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), 100L, (short) -1, 0.0f, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 100, -1, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 100, -1, 0.0, 1]");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0f, (byte) 0, 0L, obj5, false, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray2, (int) '4', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray2, (int) (byte) 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { ' ', "", (short) 1, (byte) -1, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[ , , 1, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[ , , 1, -1, 100]");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', 10.0d, '4', 0.0d, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, 10.0, 4, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4, 10.0, 4, 0.0, 1]");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, ' ', 10, 0.0f, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray7, (int) (short) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1,  , 10, 0.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1,  , 10, 0.0, hi!]");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, (byte) 1, false, 100L, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 1, false, 100, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 1, false, 100, 0]");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, ' ', 10.0d, 10.0d, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray7, (int) ' ', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0,  , 10.0, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0,  , 10.0, 10.0, 100.0]");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[true]");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), (-1), (-1.0d), 10, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, -1.0, 10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, -1.0, 10, 1.0]");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10.0d, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10.0, 0]");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray2, (int) '4', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { true, false, 10.0d, 100L, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[true, false, 10.0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[true, false, 10.0, 100, -1]");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, 0L, 10.0f, 100, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray7, (int) (byte) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 0, 10.0, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 0, 10.0, 100, 1.0]");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1]");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 100, ' ', '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray5, 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100,  , 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100,  , 4]");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0f, (-1.0f), (byte) -1, (short) 10, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, -1.0, -1, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, -1.0, -1, 10,  ]");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, 100.0f, false, '#', (byte) 100, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray8, 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 100.0, false, #, 100, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 100.0, false, #, 100, #]");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), false, (short) 10, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, false, 10, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, false, 10, ]");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 100, (short) 10, 10L, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 10, 10, -1]");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray4, (int) (byte) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, false]");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray4, (int) '#', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, -1]");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0, 10L, (byte) 0, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10, 0, 1]");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray2, (int) (byte) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, '4', 0.0f, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, (int) (short) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, 4, 0.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, 4, 0.0, 1.0]");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, 0]");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", (byte) 100, true, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 100, true, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 100, true, true]");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 10, obj3, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray5, (int) (short) 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, 0, 10, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 0, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 0, 10, 100]");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 0.0]");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 100, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, a]");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, 100.0d, 1.0d, "hi!", (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 100.0, 1.0, hi!, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 100.0, 1.0, hi!, -1]");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { "hi!", (short) 100, 'a', 1L, 100.0f, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100, a, 1, 100.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100, a, 1, 100.0, 1]");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray3, (int) ' ', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray2, (int) 'a', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, false, 0, (byte) 1, 'a', 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1L), mockitoMethod1, objArray8, (int) 'a', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, false, 0, 1, a, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, false, 0, 1, a, 10]");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, false, 1, wildcardClass6, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, false, 1, class java.lang.Object, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, false, 1, class java.lang.Object, 10.0]");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0d, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, 10]");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, '#', (-1L), 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, #, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, #, -1, 1.0]");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, (short) 0, 100.0f, 1L, 0.0d, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 0, 100.0, 1, 0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 0, 100.0, 1, 0.0, 1]");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', (short) 0, 100, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#, 0, 100, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#, 0, 100, a]");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, 100, '#', '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, 100, #, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, 100, #, 4]");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, 100, (byte) 10, (short) 100, 0.0f, 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[false, 100, 10, 100, 0.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[false, 100, 10, 100, 0.0, 10.0]");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, (short) 0, 100, (short) 100, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 0, 100, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 0, 100, 100, 1]");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray4, (int) (byte) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 10]");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0f, obj3, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray2, (int) (short) 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', 0.0f, 10, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ , 0.0, 10, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ , 0.0, 10, 1.0]");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, ' ', (-1.0d), (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1,  , -1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1,  , -1.0, 1]");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, 10L, 10L, (-1.0d), 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray7, (int) ' ', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10, 10, -1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10, 10, -1.0, 0]");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray3, (int) (short) 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { wildcardClass3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) '4', realMethod6);
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
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0d, 100L, 1.0f, (short) 1, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray7, (int) '4', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 100, 1.0, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 100, 1.0, 1, -1.0]");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[ ]");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { '#', wildcardClass4, (short) -1, 0, 10, obj8 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray9, (int) (byte) 100, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[hi!]");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, 'a', (-1L), 0, 'a', (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray8, (int) ' ', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, a, -1, 0, a, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, a, -1, 0, a, -1]");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1.0f), 0.0d, 100, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (short) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1.0, 0.0, 100, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1.0, 0.0, 100, 0.0]");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1), '#', 'a', (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray6, 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, #, a, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, #, a, 10]");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray4, 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 10.0]");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, '4', (byte) 0, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 4, 0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 4, 0, 10]");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 1, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 1]");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { ' ', ' ', 100, 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[ ,  , 100, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[ ,  , 100, 10.0]");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0f, 10.0d, (byte) 1, true, 1L, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 10.0, 1, true, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 10.0, 1, true, 1, 100.0]");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, 10.0d, 0, true, (short) 1, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray8, (int) 'a', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 10.0, 0, true, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 10.0, 0, true, 1, 10]");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1, 100.0d, '#', 10, (short) 0, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray8, (-1), realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0, #, 10, 0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0, #, 10, 0, 0]");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, 0.0]");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, (byte) 0, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray5, 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 0, 1]");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) -1, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, -1, 0]");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { true, (-1.0f), 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[true, -1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[true, -1.0, 1.0]");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { false, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray4, (int) '4', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[false, 10]");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, '4' };
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
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), (-1), 0.0f, 100.0d, (short) 0, 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray8, (int) 'a', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1.0, -1, 0.0, 100.0, 0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1.0, -1, 0.0, 100.0, 0, 100.0]");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, (byte) -1, 10.0f, (short) 0, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10.0, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10.0, 0, 1]");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 1, 0.0f, (-1.0f), 10.0f, obj6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 1L, (byte) 1, 1L, (byte) 1, 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 1, 1, 1, 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 1, 1, 1, 1, 1]");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', (short) 10, (short) -1, (byte) 1, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, 10, -1, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4, 10, -1, 1, 100.0]");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray2, (int) ' ', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, (short) 10, 10.0d, (-1.0d), (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 10, 10.0, -1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 10, 10.0, -1.0, 10]");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, (short) 100, "hi!", true, (short) 100, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 100, hi!, true, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 100, hi!, true, 100, 100]");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', 0L, 10.0f, 100.0f, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray8, (int) (byte) 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, 0, 10.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, 0, 10.0, 100.0, true]");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, false, 0, (byte) -1, "", (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray8, (int) '4', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, false, 0, -1, , 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, false, 0, -1, , 100]");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { '#', 1L, (short) 10, (-1.0d), 10.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray7, 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, 1, 10, -1.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, 1, 10, -1.0, 10.0]");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, true, "hi!", '#', 0L, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, true, hi!, #, 0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, true, hi!, #, 0, 10]");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, "hi!", (short) 1, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray6, 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, hi!, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, hi!, 1, a]");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1, 'a', 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, a, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, a, a]");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100, (byte) 100, (short) 0, '#', 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 100, 0, #, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 100, 0, #, 100]");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (byte) 100, (byte) 1, '4', (short) 1, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, 100, 1, 4, 1, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, 100, 1, 4, 1, false]");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), wildcardClass4, (short) 10, 1.0f, (byte) -1, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray9, (int) (short) 0, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0, class java.lang.Object, 10, 1.0, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0, class java.lang.Object, 10, 1.0, -1, 100]");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100, true, (-1.0d), (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, true, -1.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, true, -1.0, -1.0]");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, "hi!", (-1.0f), false, 0.0d, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, hi!, -1.0, false, 0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, hi!, -1.0, false, 0.0, 100.0]");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1.0]");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.lang.Object obj0 = new java.lang.Object();
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
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1.0f, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray4, (int) (byte) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1.0, 10]");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { obj2, 1.0f, "hi!", 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, 1.0f, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, 1.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, 1.0, 1.0]");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { wildcardClass3, (short) 0, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[class java.lang.Object, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[class java.lang.Object, 0, 100]");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0d, mockitoMethod1, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0, 1.0]");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray4, (int) (short) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1.0f, 0.0d, "", 1.0d, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0, 0.0, , 1.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0, 0.0, , 1.0, -1.0]");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f), (byte) 1, 1.0d, "hi!", 100, obj7 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation12 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray9, (int) (byte) 1, realMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 10L, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray4, (int) (short) -1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 10]");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, true, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray6, (int) '#', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), (short) -1, (byte) 100, 10, obj6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray7, (int) 'a', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0, false, (-1L) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, false, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, false, -1]");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '#', (byte) 0, (-1.0d), "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray6, (int) (short) 100, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[#, 0, -1.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[#, 0, -1.0, hi!]");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, "", false, 0L, (short) -1, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[true, , false, 0, -1, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[true, , false, 0, -1, true]");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, 100.0d, (byte) 0, 100, (short) 1, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 100.0, 0, 100, 1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 100.0, 0, 100, 1, 0]");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, (int) (short) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, 100]");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, ' ', 10.0d, "", (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0,  , 10.0, , 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0,  , 10.0, , 100]");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 1, 1.0f, (short) 10, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray6, (int) 'a', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, 1.0, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, 1.0, 10, 100]");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, (-1.0f), 100, true, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, -1.0, 100, true, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, -1.0, 100, true, 0]");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (short) -1, obj4, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray7, (int) (byte) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', '4', 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 0, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[a, 4, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[a, 4, 1]");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0d, 0.0f, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray5, (int) (short) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100.0, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100.0, 0.0, 0]");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0.0d, 0.0f, 10L, (-1), '#', (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 0.0, 10, -1, #, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 0.0, 10, -1, #, -1.0]");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[false]");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod2, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, obj3 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray4, (int) (short) 10, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray2, (int) (byte) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, false, 10.0d, "hi!", (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray7, (int) '#', realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, false, 10.0, hi!, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, false, 10.0, hi!, 100]");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray3, 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0f, 10.0f, '4', (short) -1, (short) 1, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray8, (int) 'a', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 10.0, 4, -1, 1, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 10.0, 4, -1, 1, hi!]");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 100, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, false]");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 1, (byte) 0, 10.0d, 0.0d, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, 0, 10.0, 0.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, 0, 10.0, 0.0, 100]");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100L, false, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray5, (int) (short) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, false, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, false, 100]");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100L, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, -1]");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 1, (-1.0d), (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1, -1.0, -1]");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, true, (byte) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray5, (int) '4', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, true, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, true, -1]");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 'a', (byte) 1, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray5, (int) (short) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[a, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[a, 1, -1]");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (byte) 0, 100, ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray6, (int) (short) 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 0, 100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 0, 100,  ]");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, ' ', 100.0f, 1L, 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray7, (int) (short) 100, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1,  , 100.0, 1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1,  , 100.0, 1, 1.0]");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray3 = new java.lang.Object[] { obj2 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray3, 10, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, '4', 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray5, 0, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, 4, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, 4, 100.0]");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray2, 10, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (byte) 0, 100L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray5, (int) (byte) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 0, 100]");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, "hi!", 100.0f, '#', (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, hi!, 100.0, #, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, hi!, 100.0, #, 1]");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0.0f, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { true, 1, 100L, "", obj6 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (-1L), '4', wildcardClass5 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100L, mockitoMethod1, objArray6, (int) (byte) 10, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, 4, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, 4, class java.lang.Object]");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, 1.0d, false, 100.0f, (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray7, (int) (short) -1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0, 1.0, false, 100.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0, 1.0, false, 100.0, -1.0]");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0, mockitoMethod1, objArray3, (int) (byte) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4]");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, 10L, 100.0d, 0, 1L, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 10, 100.0, 0, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 10, 100.0, 0, 1, 10]");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0d, mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { ' ', 1, (short) 0, (byte) 10, '#', (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[ , 1, 0, 10, #, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[ , 1, 0, 10, #, -1]");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray2, 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100.0d, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 'a', mockitoMethod1, objArray4, (-1), realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100.0, 1.0]");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), 1, '4', false, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, 1, 4, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, 1, 4, false, 10]");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 100, mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray2, 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1.0d, (byte) 10, (byte) -1, 100.0f, true, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 1, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0, 10, -1, 100.0, true, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0, 10, -1, 100.0, true, 1.0]");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray2, (int) (short) -1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 1L, 100.0d, (short) 10, (-1.0f), (-1.0f), (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '#', mockitoMethod1, objArray8, (int) ' ', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, 100.0, 10, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, 100.0, 10, -1.0, -1.0, 100]");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0f, 10.0d, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray5, (int) (short) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0, 10.0, 10]");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "", 1, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray5, (int) '#', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[, 1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[, 1, -1.0]");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, 0.0f, 100.0f, 0.0f, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 0.0, 100.0, 0.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 0.0, 100.0, 0.0, hi!]");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', (short) 100, '4', (byte) 100, (byte) -1, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray8, 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, 100, 4, 100, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, 100, 4, 100, -1, 0]");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = null;
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 0, mockitoMethod1, objArray2, (int) '#', realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0d) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray2, (int) (short) 0, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray3, (int) (short) -1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, (-1.0f), 0L, (byte) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, -1.0, 0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, -1.0, 0, 100]");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray3, (int) (short) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray2, (int) (short) 100, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, (-1), false, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, -1, false, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, -1, false, 10]");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray3, (int) (short) 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0.0]");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2, (byte) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray4, 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, (short) 0, 0L, 0.0f, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray7, 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 0, 0, 0.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 0, 0, 0.0, 1.0]");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10.0d, (byte) 1, (-1L), (short) -1, 0.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray7, (int) (byte) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10.0, 1, -1, -1, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10.0, 1, -1, -1, 0.0]");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { '4', (short) 10, false, false };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (byte) 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[4, 10, false, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[4, 10, false, false]");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 1, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray4, (int) ' ', realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 10]");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, 100, (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray5, (int) 'a', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 100, 1]");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 'a', "", 10.0d, (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (-1), realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[a, , 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[a, , 10.0, 10]");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 1, (byte) -1, 10.0d, 0, (byte) -1, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray8, (int) 'a', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1, -1, 10.0, 0, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1, -1, 10.0, 0, -1, 0]");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, 0.0f, (short) -1, (byte) -1, 1L, true };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) '4', mockitoMethod1, objArray8, (int) (short) -1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 0.0, -1, -1, 1, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 0.0, -1, -1, 1, true]");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0d, mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100]");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray3, 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10]");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) false, mockitoMethod1, objArray3, (int) 'a', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1L), wildcardClass4, 1L, 10L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 1, mockitoMethod1, objArray7, (int) (byte) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, class java.lang.Object, 1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, class java.lang.Object, 1, 10]");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", (-1.0d), ' ' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray5, (int) (byte) 10, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[hi!, -1.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[hi!, -1.0,  ]");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10.0d, (-1.0d), "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray5, (int) (short) 1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10.0, -1.0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10.0, -1.0, hi!]");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { obj2 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) 10, mockitoMethod1, objArray4, (int) (short) 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '#', 1.0d, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray5, (int) (short) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[#, 1.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[#, 1.0, 1]");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '#', (byte) 10, 1, (-1.0d), 100.0d, 1.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[#, 10, 1, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[#, 10, 1, -1.0, 100.0, 1.0]");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), 'a', '4', 10L, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (byte) -1, mockitoMethod1, objArray7, 10, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, a, 4, 10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, a, 4, 10, 10]");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (byte) 1, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 1, 100.0]");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1.0f), 10L, obj4, 10L, (byte) 100, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray8, 0, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0]");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100, 0.0f, (short) -1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray5, (int) (byte) -1, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[100, 0.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[100, 0.0, -1]");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod2 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) wildcardClass1, mockitoMethod2, objArray3, (int) (short) 100, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { false, (-1.0d), 0.0f, (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (byte) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[false, -1.0, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[false, -1.0, 0.0, 0]");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        org.mockito.internal.invocation.realmethod.RealMethod realMethod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation5 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray2, 1, realMethod4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj2, (-1.0f) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) true, mockitoMethod1, objArray5, (int) (byte) 100, realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 'a', 100L, 100.0d, (byte) 10, (-1L), '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1), mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 100, 100.0, 10, -1, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 100, 100.0, 10, -1, #]");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, 100L, 1.0d, 100.0d, (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray7, (int) (short) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 100, 1.0, 100.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 100, 1.0, 100.0, -1]");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 1, (short) 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1, 10]");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, 100.0f, 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10L, mockitoMethod1, objArray5, (int) ' ', realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 100.0, 0]");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (-1L), 'a', 1, 1L, (short) -1, 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 100, mockitoMethod1, objArray8, (int) (short) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, a, 1, 1, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, a, 1, 1, -1, 0]");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, (short) 0, (short) 0, 1L, (byte) 100, 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray8, (int) '#', realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 0, 0, 1, 100, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 0, 0, 1, 100, 100]");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, (short) 1, 0.0f, "", (short) 1, 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray8, (int) (byte) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[false, 1, 0.0, , 1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[false, 1, 0.0, , 1, 1]");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray5 = new java.lang.Object[] { 100.0f, (byte) 100, obj4 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation8 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0d, mockitoMethod1, objArray5, (-1), realMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, (-1.0f), 0L, '#' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray6, (int) ' ', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[100, -1.0, 0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[100, -1.0, 0, #]");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 1, '#', (byte) 0, (byte) -1, "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100, mockitoMethod1, objArray7, 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1, #, 0, -1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1, #, 0, -1, ]");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1), "" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1L, mockitoMethod1, objArray4, (int) (byte) 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, ]");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, 0.0d, (short) 100, 10L, false, (short) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "", mockitoMethod1, objArray8, (int) (short) 1, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 0.0, 100, 10, false, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 0.0, 100, 10, false, 1]");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1), (short) -1, 10.0d, 10.0f, '4' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 1.0f, mockitoMethod1, objArray7, (int) (byte) 0, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 10.0, 10.0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 10.0, 10.0, 4]");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, (-1.0f), (byte) 10, 0L, 100.0f, 10 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0f), mockitoMethod1, objArray8, 100, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1.0, 10, 0, 100.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1.0, 10, 0, 100.0, 10]");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.lang.Object obj0 = null;
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0d, (-1), (short) 1, 1.0f, 100.0d, 100.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation11 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray8, (int) (byte) 10, realMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1, 1, 1.0, 100.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1, 1, 1.0, 100.0, 100.0]");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1L, (-1), (short) 10, (short) 100 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 0L, mockitoMethod1, objArray6, 0, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1, -1, 10, 100]");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 10.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray3, (int) (byte) 1, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10.0]");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 1.0d, 1.0f, (short) 10, 'a' };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray6, 1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0, 1.0, 10, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0, 1.0, 10, a]");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { 1L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) -1, mockitoMethod1, objArray3, (int) '4', realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 100, 0.0d, '4', '4', 0L };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) ' ', mockitoMethod1, objArray7, (int) (byte) 1, realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100, 0.0, 4, 4, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100, 0.0, 4, 4, 0]");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { ' ', (short) 0 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (-1.0d), mockitoMethod1, objArray4, 0, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[ , 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[ , 0]");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { "", 0.0f };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) (short) 10, mockitoMethod1, objArray4, (int) (short) 1, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[, 0.0]");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (-1.0f), (short) -1, 100.0f, (-1), "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation10 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10, mockitoMethod1, objArray7, (-1), realMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1.0, -1, 100.0, -1, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1.0, -1, 100.0, -1, hi!]");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 1 };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation6 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 10.0f, mockitoMethod1, objArray3, 0, realMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[1]");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { obj2, (short) 100, 100.0f, "hi!" };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation((java.lang.Object) 100.0f, mockitoMethod1, objArray6, (int) '4', realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.lang.Object obj0 = new java.lang.Object();
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, 100.0d, (-1L), 1.0d };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation9 = new org.mockito.internal.invocation.Invocation(obj0, mockitoMethod1, objArray6, (int) (short) -1, realMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 100.0, -1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 100.0, -1, 1.0]");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.mockito.internal.invocation.MockitoMethod mockitoMethod1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '4', (-1) };
        org.mockito.internal.invocation.realmethod.RealMethod realMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation7 = new org.mockito.internal.invocation.Invocation((java.lang.Object) "hi!", mockitoMethod1, objArray4, 100, realMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[4, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[4, -1]");
    }
}

