package org.apache.commons.collections.buffer;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer0.buffer = objArray15;
        java.lang.Class<?> wildcardClass17 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        unboundedFifoBuffer0.tail = ' ';
        boolean boolean6 = unboundedFifoBuffer0.add((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass7 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer0.buffer = objArray14;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray17 = unboundedFifoBuffer16.buffer;
        java.lang.Object[] objArray18 = null;
        unboundedFifoBuffer16.buffer = objArray18;
        unboundedFifoBuffer16.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int23 = unboundedFifoBuffer22.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer24 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray25 = unboundedFifoBuffer24.buffer;
        unboundedFifoBuffer22.buffer = objArray25;
        unboundedFifoBuffer16.buffer = objArray25;
        java.lang.Object[] objArray28 = unboundedFifoBuffer16.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray30 = unboundedFifoBuffer29.buffer;
        unboundedFifoBuffer16.buffer = objArray30;
        unboundedFifoBuffer0.buffer = objArray30;
        java.lang.Class<?> wildcardClass33 = objArray30.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.head;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        int int4 = unboundedFifoBuffer0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        unboundedFifoBuffer0.tail = (byte) 0;
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        java.lang.Class<?> wildcardClass13 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        java.lang.Object obj14 = unboundedFifoBuffer0.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The size must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Class<?> wildcardClass12 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = unboundedFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean25 = unboundedFifoBuffer12.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        unboundedFifoBuffer12.buffer = objArray27;
        unboundedFifoBuffer0.buffer = objArray27;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        int int4 = unboundedFifoBuffer0.head;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        java.util.Iterator iterator15 = unboundedFifoBuffer0.iterator();
        java.lang.Object[] objArray16 = unboundedFifoBuffer0.buffer;
        java.lang.Class<?> wildcardClass17 = objArray16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.head;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        int int4 = unboundedFifoBuffer0.head;
        java.util.Iterator iterator5 = unboundedFifoBuffer0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.tail;
        int int4 = unboundedFifoBuffer1.head;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.head;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        int int4 = unboundedFifoBuffer0.head;
        java.util.Iterator iterator5 = unboundedFifoBuffer0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        java.lang.Object[] objArray21 = unboundedFifoBuffer0.buffer;
        java.lang.Object obj22 = unboundedFifoBuffer0.get();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray24 = unboundedFifoBuffer23.buffer;
        java.lang.Class<?> wildcardClass25 = unboundedFifoBuffer23.getClass();
        boolean boolean26 = unboundedFifoBuffer0.add((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], class org.apache.commons.collections.buffer.UnboundedFifoBuffer, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], class org.apache.commons.collections.buffer.UnboundedFifoBuffer, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[[], class org.apache.commons.collections.buffer.UnboundedFifoBuffer, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[[], class org.apache.commons.collections.buffer.UnboundedFifoBuffer, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        boolean boolean21 = unboundedFifoBuffer0.isEmpty();
        int int22 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean2 = unboundedFifoBuffer0.add((java.lang.Object) true);
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        java.lang.Object obj4 = unboundedFifoBuffer0.remove();
        java.lang.Object[] objArray5 = unboundedFifoBuffer0.buffer;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        java.lang.Object[] objArray21 = unboundedFifoBuffer0.buffer;
        java.lang.Object obj22 = unboundedFifoBuffer0.get();
        unboundedFifoBuffer0.tail = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.tail;
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        boolean boolean5 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        int int2 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator3 = unboundedFifoBuffer1.iterator();
        java.lang.Class<?> wildcardClass4 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        int int5 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        unboundedFifoBuffer1.tail = ' ';
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        int int14 = unboundedFifoBuffer0.size();
        java.lang.Class<?> wildcardClass15 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = unboundedFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        java.lang.Object[] objArray2 = unboundedFifoBuffer1.buffer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = unboundedFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        int int13 = unboundedFifoBuffer0.tail;
        java.lang.Object[] objArray14 = unboundedFifoBuffer0.buffer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.tail;
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        int int5 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator4 = unboundedFifoBuffer1.iterator();
        int int5 = unboundedFifoBuffer1.head;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        java.lang.Object obj14 = unboundedFifoBuffer0.remove();
        java.lang.Class<?> wildcardClass15 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        int int6 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        java.lang.Class<?> wildcardClass15 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        java.lang.Object[] objArray28 = null;
        unboundedFifoBuffer26.buffer = objArray28;
        unboundedFifoBuffer26.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int33 = unboundedFifoBuffer32.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer32.buffer = objArray35;
        unboundedFifoBuffer26.buffer = objArray35;
        boolean boolean39 = unboundedFifoBuffer26.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray41 = unboundedFifoBuffer40.buffer;
        unboundedFifoBuffer26.buffer = objArray41;
        unboundedFifoBuffer12.buffer = objArray41;
        boolean boolean44 = unboundedFifoBuffer12.isEmpty();
        java.lang.Class<?> wildcardClass45 = unboundedFifoBuffer12.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = unboundedFifoBuffer12.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        boolean boolean16 = unboundedFifoBuffer0.add((java.lang.Object) (short) 100);
        int int17 = unboundedFifoBuffer0.tail;
        int int18 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        boolean boolean21 = unboundedFifoBuffer0.isEmpty();
        unboundedFifoBuffer0.head = 1;
        unboundedFifoBuffer0.tail = (byte) 10;
        java.lang.Class<?> wildcardClass26 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        java.lang.Object[] objArray5 = unboundedFifoBuffer1.buffer;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        unboundedFifoBuffer0.head = 10;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int29 = unboundedFifoBuffer28.head;
        int int30 = unboundedFifoBuffer28.size();
        java.util.Iterator iterator31 = unboundedFifoBuffer28.iterator();
        boolean boolean32 = unboundedFifoBuffer0.add((java.lang.Object) iterator31);
        java.lang.Class<?> wildcardClass33 = iterator31.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.head;
        int int26 = unboundedFifoBuffer12.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray6 = null;
        unboundedFifoBuffer4.buffer = objArray6;
        unboundedFifoBuffer4.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int11 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer10.buffer = objArray13;
        unboundedFifoBuffer4.buffer = objArray13;
        java.lang.Object[] objArray16 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray17 = unboundedFifoBuffer4.buffer;
        unboundedFifoBuffer0.buffer = objArray17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray6 = null;
        unboundedFifoBuffer4.buffer = objArray6;
        unboundedFifoBuffer4.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int11 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer10.buffer = objArray13;
        unboundedFifoBuffer4.buffer = objArray13;
        java.lang.Object[] objArray16 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray17 = unboundedFifoBuffer4.buffer;
        unboundedFifoBuffer0.buffer = objArray17;
        java.util.Iterator iterator19 = unboundedFifoBuffer0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray4 = unboundedFifoBuffer3.buffer;
        java.lang.Object[] objArray5 = null;
        unboundedFifoBuffer3.buffer = objArray5;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer7 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray8 = unboundedFifoBuffer7.buffer;
        java.lang.Object[] objArray9 = null;
        unboundedFifoBuffer7.buffer = objArray9;
        unboundedFifoBuffer7.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int14 = unboundedFifoBuffer13.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        unboundedFifoBuffer13.buffer = objArray16;
        unboundedFifoBuffer7.buffer = objArray16;
        java.lang.Object[] objArray19 = unboundedFifoBuffer7.buffer;
        java.lang.Object[] objArray20 = unboundedFifoBuffer7.buffer;
        unboundedFifoBuffer3.buffer = objArray20;
        boolean boolean22 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer3);
        int int23 = unboundedFifoBuffer3.tail;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        unboundedFifoBuffer1.head = (byte) 1;
        unboundedFifoBuffer1.head = 32;
        int int6 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.head;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        int int4 = unboundedFifoBuffer0.head;
        java.util.Iterator iterator5 = unboundedFifoBuffer0.iterator();
        unboundedFifoBuffer0.tail = 1;
        java.util.Iterator iterator8 = unboundedFifoBuffer0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        boolean boolean21 = unboundedFifoBuffer0.isEmpty();
        unboundedFifoBuffer0.head = 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        int int4 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray6 = unboundedFifoBuffer5.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer7 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray8 = unboundedFifoBuffer7.buffer;
        java.lang.Object[] objArray9 = null;
        unboundedFifoBuffer7.buffer = objArray9;
        unboundedFifoBuffer7.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int14 = unboundedFifoBuffer13.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        unboundedFifoBuffer13.buffer = objArray16;
        unboundedFifoBuffer7.buffer = objArray16;
        unboundedFifoBuffer5.buffer = objArray16;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        java.lang.Object[] objArray22 = null;
        unboundedFifoBuffer20.buffer = objArray22;
        boolean boolean24 = unboundedFifoBuffer5.add((java.lang.Object) unboundedFifoBuffer20);
        int int25 = unboundedFifoBuffer5.tail;
        java.lang.Object[] objArray26 = unboundedFifoBuffer5.buffer;
        unboundedFifoBuffer0.buffer = objArray26;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray29 = unboundedFifoBuffer28.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer30 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray31 = unboundedFifoBuffer30.buffer;
        java.lang.Object[] objArray32 = null;
        unboundedFifoBuffer30.buffer = objArray32;
        unboundedFifoBuffer30.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer36 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int37 = unboundedFifoBuffer36.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer38 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray39 = unboundedFifoBuffer38.buffer;
        unboundedFifoBuffer36.buffer = objArray39;
        unboundedFifoBuffer30.buffer = objArray39;
        unboundedFifoBuffer28.buffer = objArray39;
        unboundedFifoBuffer28.head = (short) 10;
        java.lang.Object[] objArray45 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer0.buffer = objArray45;
        java.util.Iterator iterator47 = unboundedFifoBuffer0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(iterator47);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        boolean boolean21 = unboundedFifoBuffer0.isEmpty();
        unboundedFifoBuffer0.head = 1;
        int int24 = unboundedFifoBuffer0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer0.head;
        java.lang.Object obj26 = unboundedFifoBuffer0.remove();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray28 = unboundedFifoBuffer27.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray30 = unboundedFifoBuffer29.buffer;
        java.lang.Object[] objArray31 = null;
        unboundedFifoBuffer29.buffer = objArray31;
        unboundedFifoBuffer29.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer35 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int36 = unboundedFifoBuffer35.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer37 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray38 = unboundedFifoBuffer37.buffer;
        unboundedFifoBuffer35.buffer = objArray38;
        unboundedFifoBuffer29.buffer = objArray38;
        unboundedFifoBuffer27.buffer = objArray38;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer42 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray43 = unboundedFifoBuffer42.buffer;
        java.lang.Object[] objArray44 = null;
        unboundedFifoBuffer42.buffer = objArray44;
        boolean boolean46 = unboundedFifoBuffer27.add((java.lang.Object) unboundedFifoBuffer42);
        int int47 = unboundedFifoBuffer27.tail;
        java.lang.Object[] objArray48 = unboundedFifoBuffer27.buffer;
        unboundedFifoBuffer0.buffer = objArray48;
        unboundedFifoBuffer0.tail = (short) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean2 = unboundedFifoBuffer0.add((java.lang.Object) true);
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        int int4 = unboundedFifoBuffer0.tail;
        int int5 = unboundedFifoBuffer0.head;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        java.lang.Object[] objArray28 = null;
        unboundedFifoBuffer26.buffer = objArray28;
        unboundedFifoBuffer26.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int33 = unboundedFifoBuffer32.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer32.buffer = objArray35;
        unboundedFifoBuffer26.buffer = objArray35;
        boolean boolean39 = unboundedFifoBuffer26.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray41 = unboundedFifoBuffer40.buffer;
        unboundedFifoBuffer26.buffer = objArray41;
        unboundedFifoBuffer12.buffer = objArray41;
        boolean boolean44 = unboundedFifoBuffer12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = unboundedFifoBuffer12.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer0.buffer = objArray14;
        java.lang.Object[] objArray16 = unboundedFifoBuffer0.buffer;
        boolean boolean18 = unboundedFifoBuffer0.add((java.lang.Object) (byte) 100);
        int int19 = unboundedFifoBuffer0.head;
        java.lang.Object[] objArray20 = unboundedFifoBuffer0.buffer;
        java.lang.Object obj21 = unboundedFifoBuffer0.get();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 100 + "'", obj21, (byte) 100);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        java.lang.Class<?> wildcardClass4 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        unboundedFifoBuffer0.tail = 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        java.lang.Object[] objArray16 = null;
        unboundedFifoBuffer14.buffer = objArray16;
        unboundedFifoBuffer14.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int21 = unboundedFifoBuffer20.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray23 = unboundedFifoBuffer22.buffer;
        unboundedFifoBuffer20.buffer = objArray23;
        unboundedFifoBuffer14.buffer = objArray23;
        java.lang.Object[] objArray26 = unboundedFifoBuffer14.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray28 = unboundedFifoBuffer27.buffer;
        unboundedFifoBuffer14.buffer = objArray28;
        unboundedFifoBuffer0.buffer = objArray28;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(10);
        boolean boolean33 = unboundedFifoBuffer0.add((java.lang.Object) 10);
        java.lang.Object obj34 = unboundedFifoBuffer0.get();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10 + "'", obj34, 10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        int int15 = unboundedFifoBuffer0.head;
        unboundedFifoBuffer0.tail = (short) 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray19 = unboundedFifoBuffer18.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        java.lang.Object[] objArray22 = null;
        unboundedFifoBuffer20.buffer = objArray22;
        unboundedFifoBuffer20.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int27 = unboundedFifoBuffer26.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray29 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer26.buffer = objArray29;
        unboundedFifoBuffer20.buffer = objArray29;
        unboundedFifoBuffer18.buffer = objArray29;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer33 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray34 = unboundedFifoBuffer33.buffer;
        java.lang.Object[] objArray35 = null;
        unboundedFifoBuffer33.buffer = objArray35;
        boolean boolean37 = unboundedFifoBuffer18.add((java.lang.Object) unboundedFifoBuffer33);
        int int38 = unboundedFifoBuffer18.tail;
        java.lang.Object[] objArray39 = unboundedFifoBuffer18.buffer;
        unboundedFifoBuffer0.buffer = objArray39;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        int int12 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        java.lang.Object[] objArray21 = unboundedFifoBuffer0.buffer;
        java.lang.Object obj22 = unboundedFifoBuffer0.get();
        unboundedFifoBuffer0.head = 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        int int4 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray6 = unboundedFifoBuffer5.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer7 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray8 = unboundedFifoBuffer7.buffer;
        java.lang.Object[] objArray9 = null;
        unboundedFifoBuffer7.buffer = objArray9;
        unboundedFifoBuffer7.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int14 = unboundedFifoBuffer13.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        unboundedFifoBuffer13.buffer = objArray16;
        unboundedFifoBuffer7.buffer = objArray16;
        unboundedFifoBuffer5.buffer = objArray16;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        java.lang.Object[] objArray22 = null;
        unboundedFifoBuffer20.buffer = objArray22;
        boolean boolean24 = unboundedFifoBuffer5.add((java.lang.Object) unboundedFifoBuffer20);
        int int25 = unboundedFifoBuffer5.tail;
        java.lang.Object[] objArray26 = unboundedFifoBuffer5.buffer;
        unboundedFifoBuffer0.buffer = objArray26;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray29 = unboundedFifoBuffer28.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer30 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray31 = unboundedFifoBuffer30.buffer;
        java.lang.Object[] objArray32 = null;
        unboundedFifoBuffer30.buffer = objArray32;
        unboundedFifoBuffer30.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer36 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int37 = unboundedFifoBuffer36.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer38 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray39 = unboundedFifoBuffer38.buffer;
        unboundedFifoBuffer36.buffer = objArray39;
        unboundedFifoBuffer30.buffer = objArray39;
        unboundedFifoBuffer28.buffer = objArray39;
        unboundedFifoBuffer28.head = (short) 10;
        java.lang.Object[] objArray45 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer0.buffer = objArray45;
        int int47 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(1);
        int int2 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.tail = ' ';
        java.lang.Object obj5 = unboundedFifoBuffer1.get();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer7 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int8 = unboundedFifoBuffer7.tail;
        unboundedFifoBuffer7.tail = ' ';
        java.lang.Object obj11 = unboundedFifoBuffer7.get();
        java.util.Iterator iterator12 = unboundedFifoBuffer7.iterator();
        boolean boolean13 = unboundedFifoBuffer1.add((java.lang.Object) iterator12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer0.buffer = objArray14;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray17 = unboundedFifoBuffer16.buffer;
        java.lang.Object[] objArray18 = null;
        unboundedFifoBuffer16.buffer = objArray18;
        unboundedFifoBuffer16.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int23 = unboundedFifoBuffer22.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer24 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray25 = unboundedFifoBuffer24.buffer;
        unboundedFifoBuffer22.buffer = objArray25;
        unboundedFifoBuffer16.buffer = objArray25;
        java.lang.Object[] objArray28 = unboundedFifoBuffer16.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray30 = unboundedFifoBuffer29.buffer;
        unboundedFifoBuffer16.buffer = objArray30;
        unboundedFifoBuffer0.buffer = objArray30;
        java.lang.Object[] objArray33 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer35 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        java.lang.Object[] objArray36 = unboundedFifoBuffer35.buffer;
        boolean boolean37 = unboundedFifoBuffer0.add((java.lang.Object) objArray36);
        unboundedFifoBuffer0.tail = ' ';
        unboundedFifoBuffer0.tail = 32;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer21 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray22 = unboundedFifoBuffer21.buffer;
        java.lang.Object[] objArray23 = null;
        unboundedFifoBuffer21.buffer = objArray23;
        unboundedFifoBuffer21.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int28 = unboundedFifoBuffer27.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray30 = unboundedFifoBuffer29.buffer;
        unboundedFifoBuffer27.buffer = objArray30;
        unboundedFifoBuffer21.buffer = objArray30;
        boolean boolean34 = unboundedFifoBuffer21.add((java.lang.Object) 0);
        int int35 = unboundedFifoBuffer21.size();
        boolean boolean36 = unboundedFifoBuffer0.add((java.lang.Object) int35);
        java.lang.Object obj37 = unboundedFifoBuffer0.remove();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null, 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null, 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "[]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean2 = unboundedFifoBuffer0.add((java.lang.Object) true);
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray7 = unboundedFifoBuffer6.buffer;
        java.lang.Object[] objArray8 = null;
        unboundedFifoBuffer6.buffer = objArray8;
        unboundedFifoBuffer6.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int13 = unboundedFifoBuffer12.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer12.buffer = objArray15;
        unboundedFifoBuffer6.buffer = objArray15;
        unboundedFifoBuffer4.buffer = objArray15;
        int int19 = unboundedFifoBuffer4.head;
        boolean boolean20 = unboundedFifoBuffer0.add((java.lang.Object) int19);
        unboundedFifoBuffer0.head = 32;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        boolean boolean21 = unboundedFifoBuffer0.isEmpty();
        unboundedFifoBuffer0.head = 1;
        unboundedFifoBuffer0.tail = (byte) 10;
        int int26 = unboundedFifoBuffer0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.tail = ' ';
        java.lang.Object obj5 = unboundedFifoBuffer1.remove();
        java.lang.Object obj6 = unboundedFifoBuffer1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        int int4 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray6 = unboundedFifoBuffer5.buffer;
        java.lang.Object[] objArray7 = null;
        unboundedFifoBuffer5.buffer = objArray7;
        unboundedFifoBuffer5.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer11 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int12 = unboundedFifoBuffer11.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer11.buffer = objArray14;
        unboundedFifoBuffer5.buffer = objArray14;
        boolean boolean18 = unboundedFifoBuffer5.add((java.lang.Object) 0);
        java.lang.Object obj19 = unboundedFifoBuffer5.remove();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        int int22 = unboundedFifoBuffer20.head;
        boolean boolean23 = unboundedFifoBuffer20.isEmpty();
        int int24 = unboundedFifoBuffer20.head;
        java.util.Iterator iterator25 = unboundedFifoBuffer20.iterator();
        boolean boolean26 = unboundedFifoBuffer5.add((java.lang.Object) iterator25);
        boolean boolean27 = unboundedFifoBuffer0.add((java.lang.Object) iterator25);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        int int15 = unboundedFifoBuffer13.size();
        boolean boolean16 = unboundedFifoBuffer0.add((java.lang.Object) int15);
        java.lang.Object[] objArray17 = unboundedFifoBuffer0.buffer;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        unboundedFifoBuffer0.head = (short) 10;
        java.util.Iterator iterator17 = unboundedFifoBuffer0.iterator();
        java.lang.Object obj18 = unboundedFifoBuffer0.get();
        int int19 = unboundedFifoBuffer0.head;
        java.lang.Object obj20 = unboundedFifoBuffer0.remove();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        int int2 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator3 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray6 = null;
        unboundedFifoBuffer4.buffer = objArray6;
        unboundedFifoBuffer4.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int11 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer10.buffer = objArray13;
        unboundedFifoBuffer4.buffer = objArray13;
        java.lang.Object[] objArray16 = unboundedFifoBuffer4.buffer;
        int int17 = unboundedFifoBuffer4.tail;
        java.lang.Object[] objArray18 = unboundedFifoBuffer4.buffer;
        unboundedFifoBuffer1.buffer = objArray18;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        unboundedFifoBuffer0.head = (short) 10;
        java.util.Iterator iterator17 = unboundedFifoBuffer0.iterator();
        int int18 = unboundedFifoBuffer0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23 + "'", int18 == 23);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        boolean boolean3 = unboundedFifoBuffer0.add((java.lang.Object) 'a');
        boolean boolean4 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray4 = unboundedFifoBuffer3.buffer;
        java.lang.Object[] objArray5 = null;
        unboundedFifoBuffer3.buffer = objArray5;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer7 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray8 = unboundedFifoBuffer7.buffer;
        java.lang.Object[] objArray9 = null;
        unboundedFifoBuffer7.buffer = objArray9;
        unboundedFifoBuffer7.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int14 = unboundedFifoBuffer13.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        unboundedFifoBuffer13.buffer = objArray16;
        unboundedFifoBuffer7.buffer = objArray16;
        java.lang.Object[] objArray19 = unboundedFifoBuffer7.buffer;
        java.lang.Object[] objArray20 = unboundedFifoBuffer7.buffer;
        unboundedFifoBuffer3.buffer = objArray20;
        boolean boolean22 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer3);
        boolean boolean23 = unboundedFifoBuffer3.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer0.buffer = objArray15;
        boolean boolean18 = unboundedFifoBuffer0.add((java.lang.Object) (short) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer19 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray20 = unboundedFifoBuffer19.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer21 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray22 = unboundedFifoBuffer21.buffer;
        java.lang.Object[] objArray23 = null;
        unboundedFifoBuffer21.buffer = objArray23;
        unboundedFifoBuffer21.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int28 = unboundedFifoBuffer27.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray30 = unboundedFifoBuffer29.buffer;
        unboundedFifoBuffer27.buffer = objArray30;
        unboundedFifoBuffer21.buffer = objArray30;
        unboundedFifoBuffer19.buffer = objArray30;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        java.lang.Object[] objArray36 = null;
        unboundedFifoBuffer34.buffer = objArray36;
        boolean boolean38 = unboundedFifoBuffer19.add((java.lang.Object) unboundedFifoBuffer34);
        int int39 = unboundedFifoBuffer19.tail;
        java.lang.Object[] objArray40 = unboundedFifoBuffer19.buffer;
        unboundedFifoBuffer0.buffer = objArray40;
        boolean boolean42 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        unboundedFifoBuffer0.head = (short) 10;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray18 = unboundedFifoBuffer17.buffer;
        java.lang.Object[] objArray19 = null;
        unboundedFifoBuffer17.buffer = objArray19;
        unboundedFifoBuffer17.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int24 = unboundedFifoBuffer23.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray26 = unboundedFifoBuffer25.buffer;
        unboundedFifoBuffer23.buffer = objArray26;
        unboundedFifoBuffer17.buffer = objArray26;
        java.lang.Object[] objArray29 = unboundedFifoBuffer17.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer30 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray31 = unboundedFifoBuffer30.buffer;
        unboundedFifoBuffer17.buffer = objArray31;
        java.lang.Object[] objArray33 = unboundedFifoBuffer17.buffer;
        boolean boolean35 = unboundedFifoBuffer17.add((java.lang.Object) (byte) 100);
        int int36 = unboundedFifoBuffer17.head;
        java.lang.Object[] objArray37 = unboundedFifoBuffer17.buffer;
        boolean boolean38 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer17);
        int int39 = unboundedFifoBuffer17.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[100], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[100], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = unboundedFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        boolean boolean16 = unboundedFifoBuffer0.add((java.lang.Object) (short) 100);
        java.lang.Object obj17 = unboundedFifoBuffer0.remove();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 100 + "'", obj17, (short) 100);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean1 = unboundedFifoBuffer0.isEmpty();
        unboundedFifoBuffer0.tail = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        unboundedFifoBuffer0.head = (short) 10;
        java.util.Iterator iterator17 = unboundedFifoBuffer0.iterator();
        java.lang.Object obj18 = unboundedFifoBuffer0.get();
        int int19 = unboundedFifoBuffer0.head;
        int int20 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        boolean boolean20 = unboundedFifoBuffer15.isEmpty();
        java.util.Iterator iterator21 = unboundedFifoBuffer15.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = unboundedFifoBuffer15.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer0.buffer = objArray15;
        unboundedFifoBuffer0.tail = (byte) 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray23 = unboundedFifoBuffer22.buffer;
        unboundedFifoBuffer20.buffer = objArray23;
        java.lang.Object[] objArray26 = new java.lang.Object[] { unboundedFifoBuffer20, 1.0f };
        unboundedFifoBuffer0.buffer = objArray26;
        java.lang.Object[] objArray28 = unboundedFifoBuffer0.buffer;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[[], 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[[], 1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[[], 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[[], 1.0]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        java.lang.Object obj14 = unboundedFifoBuffer0.remove();
        boolean boolean15 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean2 = unboundedFifoBuffer0.add((java.lang.Object) true);
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray7 = unboundedFifoBuffer6.buffer;
        java.lang.Object[] objArray8 = null;
        unboundedFifoBuffer6.buffer = objArray8;
        unboundedFifoBuffer6.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int13 = unboundedFifoBuffer12.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer12.buffer = objArray15;
        unboundedFifoBuffer6.buffer = objArray15;
        unboundedFifoBuffer4.buffer = objArray15;
        int int19 = unboundedFifoBuffer4.head;
        boolean boolean20 = unboundedFifoBuffer0.add((java.lang.Object) int19);
        unboundedFifoBuffer0.head = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        unboundedFifoBuffer0.buffer = objArray3;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        java.util.Iterator iterator7 = unboundedFifoBuffer6.iterator();
        boolean boolean8 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer6);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer9 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray10 = unboundedFifoBuffer9.buffer;
        int int11 = unboundedFifoBuffer9.tail;
        boolean boolean12 = unboundedFifoBuffer9.isEmpty();
        unboundedFifoBuffer9.tail = (byte) 10;
        java.lang.Class<?> wildcardClass15 = unboundedFifoBuffer9.getClass();
        boolean boolean16 = unboundedFifoBuffer0.add((java.lang.Object) wildcardClass15);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        java.lang.Object[] objArray19 = unboundedFifoBuffer18.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer0.buffer = objArray21;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[[], class org.apache.commons.collections.buffer.UnboundedFifoBuffer, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[[], class org.apache.commons.collections.buffer.UnboundedFifoBuffer, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        java.lang.Object[] objArray25 = unboundedFifoBuffer12.buffer;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        int int4 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray6 = unboundedFifoBuffer5.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer7 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray8 = unboundedFifoBuffer7.buffer;
        java.lang.Object[] objArray9 = null;
        unboundedFifoBuffer7.buffer = objArray9;
        unboundedFifoBuffer7.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int14 = unboundedFifoBuffer13.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        unboundedFifoBuffer13.buffer = objArray16;
        unboundedFifoBuffer7.buffer = objArray16;
        unboundedFifoBuffer5.buffer = objArray16;
        int int20 = unboundedFifoBuffer5.head;
        unboundedFifoBuffer5.tail = (short) 1;
        java.lang.Object obj23 = unboundedFifoBuffer5.remove();
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer5);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[[null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[[null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        java.lang.Class<?> wildcardClass20 = unboundedFifoBuffer15.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        unboundedFifoBuffer0.tail = ' ';
        int int5 = unboundedFifoBuffer0.head;
        boolean boolean6 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        unboundedFifoBuffer1.head = (byte) 1;
        boolean boolean4 = unboundedFifoBuffer1.isEmpty();
        unboundedFifoBuffer1.tail = 'a';
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray6 = null;
        unboundedFifoBuffer4.buffer = objArray6;
        unboundedFifoBuffer4.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int11 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer10.buffer = objArray13;
        unboundedFifoBuffer4.buffer = objArray13;
        java.lang.Object[] objArray16 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray17 = unboundedFifoBuffer4.buffer;
        unboundedFifoBuffer0.buffer = objArray17;
        int int19 = unboundedFifoBuffer0.head;
        unboundedFifoBuffer0.head = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray23 = unboundedFifoBuffer22.buffer;
        java.lang.Object[] objArray24 = null;
        unboundedFifoBuffer22.buffer = objArray24;
        unboundedFifoBuffer22.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int29 = unboundedFifoBuffer28.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer30 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray31 = unboundedFifoBuffer30.buffer;
        unboundedFifoBuffer28.buffer = objArray31;
        unboundedFifoBuffer22.buffer = objArray31;
        java.lang.Object[] objArray34 = unboundedFifoBuffer22.buffer;
        int int35 = unboundedFifoBuffer22.head;
        java.lang.Object[] objArray36 = unboundedFifoBuffer22.buffer;
        unboundedFifoBuffer0.buffer = objArray36;
        java.util.Iterator iterator38 = unboundedFifoBuffer0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(iterator38);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        java.lang.Object[] objArray2 = unboundedFifoBuffer1.buffer;
        int int3 = unboundedFifoBuffer1.tail;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.tail;
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        unboundedFifoBuffer1.tail = ' ';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Class<?> wildcardClass12 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        java.lang.Object obj25 = unboundedFifoBuffer0.get();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray6 = null;
        unboundedFifoBuffer4.buffer = objArray6;
        unboundedFifoBuffer4.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int11 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer10.buffer = objArray13;
        unboundedFifoBuffer4.buffer = objArray13;
        java.lang.Object[] objArray16 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray17 = unboundedFifoBuffer4.buffer;
        boolean boolean18 = unboundedFifoBuffer0.add((java.lang.Object) objArray17);
        java.lang.Class<?> wildcardClass19 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 10);
        java.lang.Object[] objArray2 = unboundedFifoBuffer1.buffer;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null });
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        int int4 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray6 = unboundedFifoBuffer5.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer7 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray8 = unboundedFifoBuffer7.buffer;
        java.lang.Object[] objArray9 = null;
        unboundedFifoBuffer7.buffer = objArray9;
        unboundedFifoBuffer7.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int14 = unboundedFifoBuffer13.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        unboundedFifoBuffer13.buffer = objArray16;
        unboundedFifoBuffer7.buffer = objArray16;
        unboundedFifoBuffer5.buffer = objArray16;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        java.lang.Object[] objArray22 = null;
        unboundedFifoBuffer20.buffer = objArray22;
        boolean boolean24 = unboundedFifoBuffer5.add((java.lang.Object) unboundedFifoBuffer20);
        int int25 = unboundedFifoBuffer5.tail;
        java.lang.Object[] objArray26 = unboundedFifoBuffer5.buffer;
        unboundedFifoBuffer0.buffer = objArray26;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray29 = unboundedFifoBuffer28.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer30 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray31 = unboundedFifoBuffer30.buffer;
        java.lang.Object[] objArray32 = null;
        unboundedFifoBuffer30.buffer = objArray32;
        unboundedFifoBuffer30.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer36 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int37 = unboundedFifoBuffer36.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer38 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray39 = unboundedFifoBuffer38.buffer;
        unboundedFifoBuffer36.buffer = objArray39;
        unboundedFifoBuffer30.buffer = objArray39;
        unboundedFifoBuffer28.buffer = objArray39;
        unboundedFifoBuffer28.head = (short) 10;
        java.lang.Object[] objArray45 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer0.buffer = objArray45;
        int int47 = unboundedFifoBuffer0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        int int2 = unboundedFifoBuffer1.size();
        int int3 = unboundedFifoBuffer1.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray7 = unboundedFifoBuffer6.buffer;
        java.lang.Object[] objArray8 = null;
        unboundedFifoBuffer6.buffer = objArray8;
        unboundedFifoBuffer6.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int13 = unboundedFifoBuffer12.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer12.buffer = objArray15;
        unboundedFifoBuffer6.buffer = objArray15;
        unboundedFifoBuffer4.buffer = objArray15;
        unboundedFifoBuffer4.head = (short) 10;
        java.util.Iterator iterator21 = unboundedFifoBuffer4.iterator();
        boolean boolean22 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer4);
        java.lang.Object obj23 = unboundedFifoBuffer1.remove();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        java.lang.Object[] objArray2 = unboundedFifoBuffer0.buffer;
        java.lang.Class<?> wildcardClass3 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        java.lang.Object[] objArray28 = null;
        unboundedFifoBuffer26.buffer = objArray28;
        unboundedFifoBuffer26.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int33 = unboundedFifoBuffer32.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer32.buffer = objArray35;
        unboundedFifoBuffer26.buffer = objArray35;
        java.lang.Object[] objArray38 = unboundedFifoBuffer26.buffer;
        int int39 = unboundedFifoBuffer26.tail;
        java.lang.Object[] objArray40 = unboundedFifoBuffer26.buffer;
        unboundedFifoBuffer12.buffer = objArray40;
        unboundedFifoBuffer12.head = 0;
        int int44 = unboundedFifoBuffer12.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer45 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer47 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        boolean boolean48 = unboundedFifoBuffer45.add((java.lang.Object) 'a');
        java.lang.Object[] objArray49 = unboundedFifoBuffer45.buffer;
        boolean boolean50 = unboundedFifoBuffer12.add((java.lang.Object) objArray49);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[[a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[[a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[[a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        unboundedFifoBuffer0.head = (short) 10;
        java.util.Iterator iterator17 = unboundedFifoBuffer0.iterator();
        int int18 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        boolean boolean16 = unboundedFifoBuffer0.add((java.lang.Object) (short) 100);
        int int17 = unboundedFifoBuffer0.head;
        java.lang.Object obj18 = unboundedFifoBuffer0.remove();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 100 + "'", obj18, (short) 100);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 10);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray6 = null;
        unboundedFifoBuffer4.buffer = objArray6;
        unboundedFifoBuffer4.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int11 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer10.buffer = objArray13;
        unboundedFifoBuffer4.buffer = objArray13;
        unboundedFifoBuffer2.buffer = objArray13;
        unboundedFifoBuffer1.buffer = objArray13;
        int int18 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = (byte) 10;
        java.util.Iterator iterator21 = unboundedFifoBuffer1.iterator();
        java.lang.Object obj22 = unboundedFifoBuffer1.get();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        unboundedFifoBuffer0.buffer = objArray16;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray19 = unboundedFifoBuffer18.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        java.lang.Object[] objArray22 = null;
        unboundedFifoBuffer20.buffer = objArray22;
        unboundedFifoBuffer20.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int27 = unboundedFifoBuffer26.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray29 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer26.buffer = objArray29;
        unboundedFifoBuffer20.buffer = objArray29;
        unboundedFifoBuffer18.buffer = objArray29;
        int int33 = unboundedFifoBuffer18.size();
        boolean boolean34 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer18);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer36 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int37 = unboundedFifoBuffer36.tail;
        java.lang.Object[] objArray38 = unboundedFifoBuffer36.buffer;
        boolean boolean39 = unboundedFifoBuffer0.add((java.lang.Object) objArray38);
        boolean boolean40 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[[], [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) (byte) 1);
        java.util.Iterator iterator7 = unboundedFifoBuffer1.iterator();
        unboundedFifoBuffer1.tail = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        boolean boolean3 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        boolean boolean6 = unboundedFifoBuffer1.add((java.lang.Object) (byte) 1);
        int int7 = unboundedFifoBuffer1.tail;
        java.lang.Class<?> wildcardClass8 = unboundedFifoBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer0.buffer = objArray14;
        int int16 = unboundedFifoBuffer0.head;
        java.lang.Object[] objArray17 = unboundedFifoBuffer0.buffer;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        int int21 = unboundedFifoBuffer0.tail;
        java.lang.Class<?> wildcardClass22 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        java.util.Iterator iterator2 = unboundedFifoBuffer1.iterator();
        java.lang.Object[] objArray3 = unboundedFifoBuffer1.buffer;
        java.util.Iterator iterator4 = unboundedFifoBuffer1.iterator();
        java.util.Iterator iterator5 = unboundedFifoBuffer1.iterator();
        java.lang.Object[] objArray6 = unboundedFifoBuffer1.buffer;
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        java.lang.Object[] objArray4 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int7 = unboundedFifoBuffer6.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        java.lang.Object[] objArray10 = null;
        unboundedFifoBuffer8.buffer = objArray10;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        java.lang.Object[] objArray24 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray25 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer8.buffer = objArray25;
        boolean boolean27 = unboundedFifoBuffer6.add((java.lang.Object) unboundedFifoBuffer8);
        java.lang.Object[] objArray28 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer0.buffer = objArray28;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        unboundedFifoBuffer0.tail = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        unboundedFifoBuffer0.buffer = objArray3;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        java.util.Iterator iterator7 = unboundedFifoBuffer6.iterator();
        boolean boolean8 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = unboundedFifoBuffer6.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 10);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray6 = null;
        unboundedFifoBuffer4.buffer = objArray6;
        unboundedFifoBuffer4.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int11 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer10.buffer = objArray13;
        unboundedFifoBuffer4.buffer = objArray13;
        unboundedFifoBuffer2.buffer = objArray13;
        unboundedFifoBuffer1.buffer = objArray13;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray19 = unboundedFifoBuffer18.buffer;
        int int20 = unboundedFifoBuffer18.tail;
        boolean boolean21 = unboundedFifoBuffer18.isEmpty();
        int int22 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray24 = unboundedFifoBuffer23.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray26 = unboundedFifoBuffer25.buffer;
        java.lang.Object[] objArray27 = null;
        unboundedFifoBuffer25.buffer = objArray27;
        unboundedFifoBuffer25.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer31 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int32 = unboundedFifoBuffer31.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer33 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray34 = unboundedFifoBuffer33.buffer;
        unboundedFifoBuffer31.buffer = objArray34;
        unboundedFifoBuffer25.buffer = objArray34;
        unboundedFifoBuffer23.buffer = objArray34;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer38 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray39 = unboundedFifoBuffer38.buffer;
        java.lang.Object[] objArray40 = null;
        unboundedFifoBuffer38.buffer = objArray40;
        boolean boolean42 = unboundedFifoBuffer23.add((java.lang.Object) unboundedFifoBuffer38);
        int int43 = unboundedFifoBuffer23.tail;
        java.lang.Object[] objArray44 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer18.buffer = objArray44;
        boolean boolean46 = unboundedFifoBuffer1.add((java.lang.Object) objArray44);
        java.lang.Class<?> wildcardClass47 = objArray44.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = unboundedFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        unboundedFifoBuffer0.tail = ' ';
        int int5 = unboundedFifoBuffer0.size();
        int int6 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer7 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int8 = unboundedFifoBuffer7.head;
        java.util.Iterator iterator9 = unboundedFifoBuffer7.iterator();
        boolean boolean10 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer7);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer0.head;
        java.lang.Object obj26 = unboundedFifoBuffer0.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.tail;
        int int4 = unboundedFifoBuffer1.head;
        java.lang.Object[] objArray5 = unboundedFifoBuffer1.buffer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.head;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        boolean boolean21 = unboundedFifoBuffer0.isEmpty();
        unboundedFifoBuffer0.head = 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer24 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray25 = unboundedFifoBuffer24.buffer;
        java.lang.Object[] objArray26 = null;
        unboundedFifoBuffer24.buffer = objArray26;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray29 = unboundedFifoBuffer28.buffer;
        java.lang.Object[] objArray30 = null;
        unboundedFifoBuffer28.buffer = objArray30;
        unboundedFifoBuffer28.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int35 = unboundedFifoBuffer34.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer36 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray37 = unboundedFifoBuffer36.buffer;
        unboundedFifoBuffer34.buffer = objArray37;
        unboundedFifoBuffer28.buffer = objArray37;
        java.lang.Object[] objArray40 = unboundedFifoBuffer28.buffer;
        java.lang.Object[] objArray41 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer24.buffer = objArray41;
        unboundedFifoBuffer0.buffer = objArray41;
        int int44 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        int int13 = unboundedFifoBuffer0.tail;
        boolean boolean14 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int5 = unboundedFifoBuffer4.tail;
        int int6 = unboundedFifoBuffer4.size();
        boolean boolean7 = unboundedFifoBuffer0.add((java.lang.Object) int6);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean10 = unboundedFifoBuffer8.add((java.lang.Object) true);
        java.util.Iterator iterator11 = unboundedFifoBuffer8.iterator();
        java.lang.Object obj12 = unboundedFifoBuffer8.remove();
        boolean boolean13 = unboundedFifoBuffer8.isEmpty();
        boolean boolean14 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer8);
        int int15 = unboundedFifoBuffer0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0, [], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0, [], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean2 = unboundedFifoBuffer0.add((java.lang.Object) true);
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        java.lang.Object obj4 = unboundedFifoBuffer0.remove();
        boolean boolean5 = unboundedFifoBuffer0.isEmpty();
        unboundedFifoBuffer0.head = 23;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        java.lang.Object[] objArray2 = unboundedFifoBuffer1.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray4 = unboundedFifoBuffer3.buffer;
        unboundedFifoBuffer1.buffer = objArray4;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray7 = unboundedFifoBuffer6.buffer;
        java.lang.Object[] objArray8 = null;
        unboundedFifoBuffer6.buffer = objArray8;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        java.lang.Object[] objArray12 = null;
        unboundedFifoBuffer10.buffer = objArray12;
        unboundedFifoBuffer10.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int17 = unboundedFifoBuffer16.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray19 = unboundedFifoBuffer18.buffer;
        unboundedFifoBuffer16.buffer = objArray19;
        unboundedFifoBuffer10.buffer = objArray19;
        java.lang.Object[] objArray22 = unboundedFifoBuffer10.buffer;
        java.lang.Object[] objArray23 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer6.buffer = objArray23;
        int int25 = unboundedFifoBuffer6.tail;
        boolean boolean26 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer6);
        int int27 = unboundedFifoBuffer6.size();
        java.util.Iterator iterator28 = unboundedFifoBuffer6.iterator();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.head;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        int int4 = unboundedFifoBuffer0.head;
        boolean boolean5 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer0.buffer = objArray14;
        java.lang.Object[] objArray16 = unboundedFifoBuffer0.buffer;
        boolean boolean18 = unboundedFifoBuffer0.add((java.lang.Object) (byte) 100);
        int int19 = unboundedFifoBuffer0.head;
        int int20 = unboundedFifoBuffer0.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 10);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray24 = unboundedFifoBuffer23.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray26 = unboundedFifoBuffer25.buffer;
        java.lang.Object[] objArray27 = null;
        unboundedFifoBuffer25.buffer = objArray27;
        unboundedFifoBuffer25.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer31 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int32 = unboundedFifoBuffer31.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer33 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray34 = unboundedFifoBuffer33.buffer;
        unboundedFifoBuffer31.buffer = objArray34;
        unboundedFifoBuffer25.buffer = objArray34;
        unboundedFifoBuffer23.buffer = objArray34;
        unboundedFifoBuffer22.buffer = objArray34;
        unboundedFifoBuffer0.buffer = objArray34;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.tail = ' ';
        java.lang.Object obj5 = unboundedFifoBuffer1.remove();
        boolean boolean6 = unboundedFifoBuffer1.isEmpty();
        boolean boolean7 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        java.lang.Object[] objArray28 = null;
        unboundedFifoBuffer26.buffer = objArray28;
        unboundedFifoBuffer26.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int33 = unboundedFifoBuffer32.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer32.buffer = objArray35;
        unboundedFifoBuffer26.buffer = objArray35;
        boolean boolean39 = unboundedFifoBuffer26.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray41 = unboundedFifoBuffer40.buffer;
        unboundedFifoBuffer26.buffer = objArray41;
        unboundedFifoBuffer12.buffer = objArray41;
        java.lang.Object[] objArray44 = unboundedFifoBuffer12.buffer;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray6 = null;
        unboundedFifoBuffer4.buffer = objArray6;
        unboundedFifoBuffer4.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int11 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer10.buffer = objArray13;
        unboundedFifoBuffer4.buffer = objArray13;
        java.lang.Object[] objArray16 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray17 = unboundedFifoBuffer4.buffer;
        unboundedFifoBuffer0.buffer = objArray17;
        int int19 = unboundedFifoBuffer0.tail;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.head;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        unboundedFifoBuffer0.tail = 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        java.lang.Object[] objArray16 = null;
        unboundedFifoBuffer14.buffer = objArray16;
        unboundedFifoBuffer14.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int21 = unboundedFifoBuffer20.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray23 = unboundedFifoBuffer22.buffer;
        unboundedFifoBuffer20.buffer = objArray23;
        unboundedFifoBuffer14.buffer = objArray23;
        java.lang.Object[] objArray26 = unboundedFifoBuffer14.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray28 = unboundedFifoBuffer27.buffer;
        unboundedFifoBuffer14.buffer = objArray28;
        unboundedFifoBuffer0.buffer = objArray28;
        java.lang.Object[] objArray31 = unboundedFifoBuffer0.buffer;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.tail;
        int int4 = unboundedFifoBuffer1.head;
        java.util.Iterator iterator5 = unboundedFifoBuffer1.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer7 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        int int8 = unboundedFifoBuffer7.size();
        int int9 = unboundedFifoBuffer7.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        unboundedFifoBuffer10.buffer = objArray21;
        unboundedFifoBuffer10.head = (short) 10;
        java.util.Iterator iterator27 = unboundedFifoBuffer10.iterator();
        boolean boolean28 = unboundedFifoBuffer7.add((java.lang.Object) unboundedFifoBuffer10);
        boolean boolean29 = unboundedFifoBuffer1.add((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        java.lang.Object[] objArray28 = null;
        unboundedFifoBuffer26.buffer = objArray28;
        unboundedFifoBuffer26.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int33 = unboundedFifoBuffer32.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer32.buffer = objArray35;
        unboundedFifoBuffer26.buffer = objArray35;
        boolean boolean39 = unboundedFifoBuffer26.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray41 = unboundedFifoBuffer40.buffer;
        unboundedFifoBuffer26.buffer = objArray41;
        unboundedFifoBuffer12.buffer = objArray41;
        java.util.Iterator iterator44 = unboundedFifoBuffer12.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer46 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int47 = unboundedFifoBuffer46.head;
        int int48 = unboundedFifoBuffer46.size();
        int int49 = unboundedFifoBuffer46.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer50 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray51 = unboundedFifoBuffer50.buffer;
        int int52 = unboundedFifoBuffer50.tail;
        boolean boolean53 = unboundedFifoBuffer50.isEmpty();
        int int54 = unboundedFifoBuffer50.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer55 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray56 = unboundedFifoBuffer55.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer57 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray58 = unboundedFifoBuffer57.buffer;
        java.lang.Object[] objArray59 = null;
        unboundedFifoBuffer57.buffer = objArray59;
        unboundedFifoBuffer57.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer63 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int64 = unboundedFifoBuffer63.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer65 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray66 = unboundedFifoBuffer65.buffer;
        unboundedFifoBuffer63.buffer = objArray66;
        unboundedFifoBuffer57.buffer = objArray66;
        unboundedFifoBuffer55.buffer = objArray66;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer70 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray71 = unboundedFifoBuffer70.buffer;
        java.lang.Object[] objArray72 = null;
        unboundedFifoBuffer70.buffer = objArray72;
        boolean boolean74 = unboundedFifoBuffer55.add((java.lang.Object) unboundedFifoBuffer70);
        int int75 = unboundedFifoBuffer55.tail;
        java.lang.Object[] objArray76 = unboundedFifoBuffer55.buffer;
        unboundedFifoBuffer50.buffer = objArray76;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer78 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray79 = unboundedFifoBuffer78.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer80 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray81 = unboundedFifoBuffer80.buffer;
        java.lang.Object[] objArray82 = null;
        unboundedFifoBuffer80.buffer = objArray82;
        unboundedFifoBuffer80.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer86 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int87 = unboundedFifoBuffer86.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer88 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray89 = unboundedFifoBuffer88.buffer;
        unboundedFifoBuffer86.buffer = objArray89;
        unboundedFifoBuffer80.buffer = objArray89;
        unboundedFifoBuffer78.buffer = objArray89;
        unboundedFifoBuffer78.head = (short) 10;
        java.lang.Object[] objArray95 = unboundedFifoBuffer78.buffer;
        unboundedFifoBuffer50.buffer = objArray95;
        unboundedFifoBuffer46.buffer = objArray95;
        unboundedFifoBuffer12.buffer = objArray95;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertNotNull(objArray95);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        unboundedFifoBuffer0.buffer = objArray3;
        int int5 = unboundedFifoBuffer0.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray7 = unboundedFifoBuffer6.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        java.lang.Object[] objArray10 = null;
        unboundedFifoBuffer8.buffer = objArray10;
        unboundedFifoBuffer8.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int15 = unboundedFifoBuffer14.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray17 = unboundedFifoBuffer16.buffer;
        unboundedFifoBuffer14.buffer = objArray17;
        unboundedFifoBuffer8.buffer = objArray17;
        unboundedFifoBuffer6.buffer = objArray17;
        unboundedFifoBuffer0.buffer = objArray17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer0.buffer = objArray14;
        java.lang.Object[] objArray16 = unboundedFifoBuffer0.buffer;
        boolean boolean18 = unboundedFifoBuffer0.add((java.lang.Object) (byte) 100);
        int int19 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int21 = unboundedFifoBuffer20.head;
        java.lang.Object[] objArray22 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer0.buffer = objArray22;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        java.lang.Object[] objArray4 = unboundedFifoBuffer0.buffer;
        int int5 = unboundedFifoBuffer0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer0.buffer = objArray15;
        int int17 = unboundedFifoBuffer0.tail;
        java.lang.Object obj18 = unboundedFifoBuffer0.remove();
        int int19 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        java.lang.Object[] objArray4 = unboundedFifoBuffer0.buffer;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNull(objArray4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        unboundedFifoBuffer1.tail = (short) 0;
        int int7 = unboundedFifoBuffer1.tail;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        java.lang.Object[] objArray2 = unboundedFifoBuffer1.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray4 = unboundedFifoBuffer3.buffer;
        unboundedFifoBuffer1.buffer = objArray4;
        unboundedFifoBuffer1.head = (short) 1;
        int int8 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int5 = unboundedFifoBuffer4.tail;
        int int6 = unboundedFifoBuffer4.size();
        boolean boolean7 = unboundedFifoBuffer0.add((java.lang.Object) int6);
        java.lang.Object[] objArray8 = unboundedFifoBuffer0.buffer;
        int int9 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        java.lang.Object[] objArray28 = null;
        unboundedFifoBuffer26.buffer = objArray28;
        unboundedFifoBuffer26.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int33 = unboundedFifoBuffer32.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer32.buffer = objArray35;
        unboundedFifoBuffer26.buffer = objArray35;
        boolean boolean39 = unboundedFifoBuffer26.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray41 = unboundedFifoBuffer40.buffer;
        unboundedFifoBuffer26.buffer = objArray41;
        unboundedFifoBuffer12.buffer = objArray41;
        int int44 = unboundedFifoBuffer12.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer0.buffer = objArray14;
        java.lang.Object[] objArray16 = unboundedFifoBuffer0.buffer;
        boolean boolean18 = unboundedFifoBuffer0.add((java.lang.Object) (byte) 100);
        int int19 = unboundedFifoBuffer0.head;
        int int20 = unboundedFifoBuffer0.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer21 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray22 = unboundedFifoBuffer21.buffer;
        java.lang.Object[] objArray23 = null;
        unboundedFifoBuffer21.buffer = objArray23;
        unboundedFifoBuffer21.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int28 = unboundedFifoBuffer27.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray30 = unboundedFifoBuffer29.buffer;
        unboundedFifoBuffer27.buffer = objArray30;
        unboundedFifoBuffer21.buffer = objArray30;
        java.lang.Object[] objArray33 = unboundedFifoBuffer21.buffer;
        int int34 = unboundedFifoBuffer21.tail;
        java.lang.Object[] objArray35 = unboundedFifoBuffer21.buffer;
        unboundedFifoBuffer0.buffer = objArray35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        boolean boolean16 = unboundedFifoBuffer0.add((java.lang.Object) (short) 100);
        int int17 = unboundedFifoBuffer0.tail;
        java.lang.Object obj18 = unboundedFifoBuffer0.get();
        java.util.Iterator iterator19 = unboundedFifoBuffer0.iterator();
        java.lang.Object obj20 = unboundedFifoBuffer0.get();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 100 + "'", obj18, (short) 100);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        int int5 = unboundedFifoBuffer1.size();
        unboundedFifoBuffer1.head = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray26 = unboundedFifoBuffer25.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray28 = unboundedFifoBuffer27.buffer;
        java.lang.Object[] objArray29 = null;
        unboundedFifoBuffer27.buffer = objArray29;
        unboundedFifoBuffer27.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer33 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int34 = unboundedFifoBuffer33.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer35 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray36 = unboundedFifoBuffer35.buffer;
        unboundedFifoBuffer33.buffer = objArray36;
        unboundedFifoBuffer27.buffer = objArray36;
        unboundedFifoBuffer25.buffer = objArray36;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray41 = unboundedFifoBuffer40.buffer;
        java.lang.Object[] objArray42 = null;
        unboundedFifoBuffer40.buffer = objArray42;
        boolean boolean44 = unboundedFifoBuffer25.add((java.lang.Object) unboundedFifoBuffer40);
        int int45 = unboundedFifoBuffer25.tail;
        boolean boolean46 = unboundedFifoBuffer25.isEmpty();
        unboundedFifoBuffer25.head = 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer49 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray50 = unboundedFifoBuffer49.buffer;
        java.lang.Object[] objArray51 = null;
        unboundedFifoBuffer49.buffer = objArray51;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer53 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray54 = unboundedFifoBuffer53.buffer;
        java.lang.Object[] objArray55 = null;
        unboundedFifoBuffer53.buffer = objArray55;
        unboundedFifoBuffer53.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer59 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int60 = unboundedFifoBuffer59.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer61 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray62 = unboundedFifoBuffer61.buffer;
        unboundedFifoBuffer59.buffer = objArray62;
        unboundedFifoBuffer53.buffer = objArray62;
        java.lang.Object[] objArray65 = unboundedFifoBuffer53.buffer;
        java.lang.Object[] objArray66 = unboundedFifoBuffer53.buffer;
        unboundedFifoBuffer49.buffer = objArray66;
        unboundedFifoBuffer25.buffer = objArray66;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer70 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int71 = unboundedFifoBuffer70.tail;
        int int72 = unboundedFifoBuffer70.tail;
        java.lang.Object[] objArray73 = unboundedFifoBuffer70.buffer;
        unboundedFifoBuffer25.buffer = objArray73;
        unboundedFifoBuffer0.buffer = objArray73;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(10);
        java.util.Iterator iterator2 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(100);
        unboundedFifoBuffer1.tail = 'a';
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        java.lang.Object[] objArray2 = unboundedFifoBuffer1.buffer;
        boolean boolean3 = unboundedFifoBuffer1.isEmpty();
        boolean boolean4 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer0.head;
        java.lang.Object obj26 = unboundedFifoBuffer0.remove();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray28 = unboundedFifoBuffer27.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray30 = unboundedFifoBuffer29.buffer;
        java.lang.Object[] objArray31 = null;
        unboundedFifoBuffer29.buffer = objArray31;
        unboundedFifoBuffer29.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer35 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int36 = unboundedFifoBuffer35.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer37 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray38 = unboundedFifoBuffer37.buffer;
        unboundedFifoBuffer35.buffer = objArray38;
        unboundedFifoBuffer29.buffer = objArray38;
        unboundedFifoBuffer27.buffer = objArray38;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer42 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray43 = unboundedFifoBuffer42.buffer;
        java.lang.Object[] objArray44 = null;
        unboundedFifoBuffer42.buffer = objArray44;
        boolean boolean46 = unboundedFifoBuffer27.add((java.lang.Object) unboundedFifoBuffer42);
        int int47 = unboundedFifoBuffer27.tail;
        java.lang.Object[] objArray48 = unboundedFifoBuffer27.buffer;
        unboundedFifoBuffer0.buffer = objArray48;
        unboundedFifoBuffer0.tail = 32;
        unboundedFifoBuffer0.tail = (byte) 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        int int13 = unboundedFifoBuffer0.head;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        int int5 = unboundedFifoBuffer1.size();
        unboundedFifoBuffer1.head = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        java.lang.Object[] objArray10 = null;
        unboundedFifoBuffer8.buffer = objArray10;
        unboundedFifoBuffer8.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int15 = unboundedFifoBuffer14.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray17 = unboundedFifoBuffer16.buffer;
        unboundedFifoBuffer14.buffer = objArray17;
        unboundedFifoBuffer8.buffer = objArray17;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        java.lang.Object[] objArray22 = null;
        unboundedFifoBuffer20.buffer = objArray22;
        unboundedFifoBuffer20.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int27 = unboundedFifoBuffer26.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray29 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer26.buffer = objArray29;
        unboundedFifoBuffer20.buffer = objArray29;
        boolean boolean32 = unboundedFifoBuffer8.add((java.lang.Object) unboundedFifoBuffer20);
        int int33 = unboundedFifoBuffer20.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        java.lang.Object[] objArray36 = null;
        unboundedFifoBuffer34.buffer = objArray36;
        unboundedFifoBuffer34.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int41 = unboundedFifoBuffer40.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer42 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray43 = unboundedFifoBuffer42.buffer;
        unboundedFifoBuffer40.buffer = objArray43;
        unboundedFifoBuffer34.buffer = objArray43;
        java.lang.Object[] objArray46 = unboundedFifoBuffer34.buffer;
        int int47 = unboundedFifoBuffer34.tail;
        java.lang.Object[] objArray48 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer20.buffer = objArray48;
        boolean boolean50 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer20);
        int int51 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        int int15 = unboundedFifoBuffer0.head;
        unboundedFifoBuffer0.tail = (short) 1;
        int int18 = unboundedFifoBuffer0.size();
        java.lang.Class<?> wildcardClass19 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator4 = unboundedFifoBuffer1.iterator();
        int int5 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.tail = ' ';
        java.lang.Object obj5 = unboundedFifoBuffer1.remove();
        boolean boolean6 = unboundedFifoBuffer1.isEmpty();
        java.lang.Object obj7 = unboundedFifoBuffer1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        int int14 = unboundedFifoBuffer0.size();
        int int15 = unboundedFifoBuffer0.tail;
        unboundedFifoBuffer0.head = 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        boolean boolean16 = unboundedFifoBuffer0.add((java.lang.Object) (short) 100);
        int int17 = unboundedFifoBuffer0.head;
        int int18 = unboundedFifoBuffer0.size();
        int int19 = unboundedFifoBuffer0.head;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean2 = unboundedFifoBuffer0.add((java.lang.Object) true);
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        java.lang.Object obj4 = unboundedFifoBuffer0.remove();
        boolean boolean5 = unboundedFifoBuffer0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 10);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray6 = null;
        unboundedFifoBuffer4.buffer = objArray6;
        unboundedFifoBuffer4.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int11 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer10.buffer = objArray13;
        unboundedFifoBuffer4.buffer = objArray13;
        unboundedFifoBuffer2.buffer = objArray13;
        unboundedFifoBuffer1.buffer = objArray13;
        int int18 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.head = (byte) 10;
        java.util.Iterator iterator21 = unboundedFifoBuffer1.iterator();
        int int22 = unboundedFifoBuffer1.tail;
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer0.buffer = objArray15;
        int int17 = unboundedFifoBuffer0.head;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer21 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray22 = unboundedFifoBuffer21.buffer;
        java.lang.Object[] objArray23 = null;
        unboundedFifoBuffer21.buffer = objArray23;
        unboundedFifoBuffer21.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int28 = unboundedFifoBuffer27.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray30 = unboundedFifoBuffer29.buffer;
        unboundedFifoBuffer27.buffer = objArray30;
        unboundedFifoBuffer21.buffer = objArray30;
        boolean boolean34 = unboundedFifoBuffer21.add((java.lang.Object) 0);
        int int35 = unboundedFifoBuffer21.size();
        boolean boolean36 = unboundedFifoBuffer0.add((java.lang.Object) int35);
        java.lang.Object[] objArray37 = unboundedFifoBuffer0.buffer;
        java.lang.Object obj38 = unboundedFifoBuffer0.get();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[[], 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[[], 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "[]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        java.lang.Object[] objArray28 = null;
        unboundedFifoBuffer26.buffer = objArray28;
        unboundedFifoBuffer26.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int33 = unboundedFifoBuffer32.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer32.buffer = objArray35;
        unboundedFifoBuffer26.buffer = objArray35;
        boolean boolean39 = unboundedFifoBuffer26.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray41 = unboundedFifoBuffer40.buffer;
        unboundedFifoBuffer26.buffer = objArray41;
        unboundedFifoBuffer12.buffer = objArray41;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer45 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        java.lang.Object[] objArray46 = unboundedFifoBuffer45.buffer;
        boolean boolean47 = unboundedFifoBuffer12.add((java.lang.Object) objArray46);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[[null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertArrayEquals(objArray46, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        java.lang.Object[] objArray28 = null;
        unboundedFifoBuffer26.buffer = objArray28;
        unboundedFifoBuffer26.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int33 = unboundedFifoBuffer32.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer32.buffer = objArray35;
        unboundedFifoBuffer26.buffer = objArray35;
        boolean boolean39 = unboundedFifoBuffer26.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray41 = unboundedFifoBuffer40.buffer;
        unboundedFifoBuffer26.buffer = objArray41;
        unboundedFifoBuffer12.buffer = objArray41;
        boolean boolean44 = unboundedFifoBuffer12.isEmpty();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer46 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) '#');
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer47 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray48 = unboundedFifoBuffer47.buffer;
        java.lang.Object[] objArray49 = null;
        unboundedFifoBuffer47.buffer = objArray49;
        unboundedFifoBuffer47.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer53 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int54 = unboundedFifoBuffer53.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer55 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray56 = unboundedFifoBuffer55.buffer;
        unboundedFifoBuffer53.buffer = objArray56;
        unboundedFifoBuffer47.buffer = objArray56;
        boolean boolean60 = unboundedFifoBuffer47.add((java.lang.Object) 0);
        int int61 = unboundedFifoBuffer47.size();
        java.lang.Object[] objArray62 = unboundedFifoBuffer47.buffer;
        int int63 = unboundedFifoBuffer47.size();
        boolean boolean64 = unboundedFifoBuffer46.add((java.lang.Object) unboundedFifoBuffer47);
        boolean boolean65 = unboundedFifoBuffer12.add((java.lang.Object) unboundedFifoBuffer47);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[[0]], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[[0]], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[[0], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[[0], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        unboundedFifoBuffer0.buffer = objArray3;
        int int5 = unboundedFifoBuffer0.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray7 = unboundedFifoBuffer6.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        java.lang.Object[] objArray10 = null;
        unboundedFifoBuffer8.buffer = objArray10;
        unboundedFifoBuffer8.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int15 = unboundedFifoBuffer14.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray17 = unboundedFifoBuffer16.buffer;
        unboundedFifoBuffer14.buffer = objArray17;
        unboundedFifoBuffer8.buffer = objArray17;
        unboundedFifoBuffer6.buffer = objArray17;
        unboundedFifoBuffer0.buffer = objArray17;
        boolean boolean22 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(100);
        unboundedFifoBuffer1.head = 0;
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        int int2 = unboundedFifoBuffer1.size();
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        unboundedFifoBuffer0.head = (short) 10;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray18 = unboundedFifoBuffer17.buffer;
        java.lang.Object[] objArray19 = null;
        unboundedFifoBuffer17.buffer = objArray19;
        unboundedFifoBuffer17.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int24 = unboundedFifoBuffer23.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray26 = unboundedFifoBuffer25.buffer;
        unboundedFifoBuffer23.buffer = objArray26;
        unboundedFifoBuffer17.buffer = objArray26;
        java.lang.Object[] objArray29 = unboundedFifoBuffer17.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer30 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray31 = unboundedFifoBuffer30.buffer;
        unboundedFifoBuffer17.buffer = objArray31;
        java.lang.Object[] objArray33 = unboundedFifoBuffer17.buffer;
        boolean boolean35 = unboundedFifoBuffer17.add((java.lang.Object) (byte) 100);
        int int36 = unboundedFifoBuffer17.head;
        java.lang.Object[] objArray37 = unboundedFifoBuffer17.buffer;
        boolean boolean38 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer17);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer39 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray40 = unboundedFifoBuffer39.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer41 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray42 = unboundedFifoBuffer41.buffer;
        java.lang.Object[] objArray43 = null;
        unboundedFifoBuffer41.buffer = objArray43;
        unboundedFifoBuffer41.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer47 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int48 = unboundedFifoBuffer47.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer49 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray50 = unboundedFifoBuffer49.buffer;
        unboundedFifoBuffer47.buffer = objArray50;
        unboundedFifoBuffer41.buffer = objArray50;
        unboundedFifoBuffer39.buffer = objArray50;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer54 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray55 = unboundedFifoBuffer54.buffer;
        java.lang.Object[] objArray56 = null;
        unboundedFifoBuffer54.buffer = objArray56;
        boolean boolean58 = unboundedFifoBuffer39.add((java.lang.Object) unboundedFifoBuffer54);
        int int59 = unboundedFifoBuffer39.tail;
        boolean boolean60 = unboundedFifoBuffer39.isEmpty();
        unboundedFifoBuffer39.head = 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer63 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray64 = unboundedFifoBuffer63.buffer;
        java.lang.Object[] objArray65 = null;
        unboundedFifoBuffer63.buffer = objArray65;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer67 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray68 = unboundedFifoBuffer67.buffer;
        java.lang.Object[] objArray69 = null;
        unboundedFifoBuffer67.buffer = objArray69;
        unboundedFifoBuffer67.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer73 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int74 = unboundedFifoBuffer73.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer75 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray76 = unboundedFifoBuffer75.buffer;
        unboundedFifoBuffer73.buffer = objArray76;
        unboundedFifoBuffer67.buffer = objArray76;
        java.lang.Object[] objArray79 = unboundedFifoBuffer67.buffer;
        java.lang.Object[] objArray80 = unboundedFifoBuffer67.buffer;
        unboundedFifoBuffer63.buffer = objArray80;
        unboundedFifoBuffer39.buffer = objArray80;
        unboundedFifoBuffer0.buffer = objArray80;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer85 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        int int86 = unboundedFifoBuffer85.size();
        boolean boolean87 = unboundedFifoBuffer0.add((java.lang.Object) int86);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[100], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[100], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        java.util.Iterator iterator2 = unboundedFifoBuffer1.iterator();
        java.lang.Object[] objArray3 = unboundedFifoBuffer1.buffer;
        java.util.Iterator iterator4 = unboundedFifoBuffer1.iterator();
        java.util.Iterator iterator5 = unboundedFifoBuffer1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = unboundedFifoBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int5 = unboundedFifoBuffer4.tail;
        int int6 = unboundedFifoBuffer4.size();
        boolean boolean7 = unboundedFifoBuffer0.add((java.lang.Object) int6);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean10 = unboundedFifoBuffer8.add((java.lang.Object) true);
        java.util.Iterator iterator11 = unboundedFifoBuffer8.iterator();
        java.lang.Object obj12 = unboundedFifoBuffer8.remove();
        boolean boolean13 = unboundedFifoBuffer8.isEmpty();
        boolean boolean14 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer8);
        boolean boolean15 = unboundedFifoBuffer0.isEmpty();
        boolean boolean16 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0, [], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0, [], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(1);
        unboundedFifoBuffer1.tail = (short) 1;
        java.lang.Object[] objArray4 = unboundedFifoBuffer1.buffer;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] { null, null });
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        int int15 = unboundedFifoBuffer13.size();
        boolean boolean16 = unboundedFifoBuffer0.add((java.lang.Object) int15);
        java.lang.Object obj17 = unboundedFifoBuffer0.get();
        java.util.Iterator iterator18 = unboundedFifoBuffer0.iterator();
        java.lang.Object obj19 = unboundedFifoBuffer0.get();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray6 = null;
        unboundedFifoBuffer4.buffer = objArray6;
        unboundedFifoBuffer4.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int11 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer10.buffer = objArray13;
        unboundedFifoBuffer4.buffer = objArray13;
        java.lang.Object[] objArray16 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray17 = unboundedFifoBuffer4.buffer;
        unboundedFifoBuffer0.buffer = objArray17;
        int int19 = unboundedFifoBuffer0.head;
        unboundedFifoBuffer0.head = (short) 0;
        boolean boolean22 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        boolean boolean14 = unboundedFifoBuffer0.isEmpty();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        unboundedFifoBuffer15.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer21 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int22 = unboundedFifoBuffer21.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray24 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer21.buffer = objArray24;
        unboundedFifoBuffer15.buffer = objArray24;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray28 = unboundedFifoBuffer27.buffer;
        java.lang.Object[] objArray29 = null;
        unboundedFifoBuffer27.buffer = objArray29;
        unboundedFifoBuffer27.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer33 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int34 = unboundedFifoBuffer33.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer35 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray36 = unboundedFifoBuffer35.buffer;
        unboundedFifoBuffer33.buffer = objArray36;
        unboundedFifoBuffer27.buffer = objArray36;
        boolean boolean39 = unboundedFifoBuffer15.add((java.lang.Object) unboundedFifoBuffer27);
        unboundedFifoBuffer15.head = 10;
        unboundedFifoBuffer15.head = 0;
        java.lang.Object[] objArray44 = unboundedFifoBuffer15.buffer;
        boolean boolean45 = unboundedFifoBuffer0.add((java.lang.Object) objArray44);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, [[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        unboundedFifoBuffer0.buffer = objArray3;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        java.util.Iterator iterator7 = unboundedFifoBuffer6.iterator();
        boolean boolean8 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer6);
        unboundedFifoBuffer6.tail = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        unboundedFifoBuffer1.head = (byte) 1;
        unboundedFifoBuffer1.head = 32;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray7 = unboundedFifoBuffer6.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        java.lang.Object[] objArray10 = null;
        unboundedFifoBuffer8.buffer = objArray10;
        unboundedFifoBuffer8.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int15 = unboundedFifoBuffer14.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray17 = unboundedFifoBuffer16.buffer;
        unboundedFifoBuffer14.buffer = objArray17;
        unboundedFifoBuffer8.buffer = objArray17;
        unboundedFifoBuffer6.buffer = objArray17;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer21 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray22 = unboundedFifoBuffer21.buffer;
        java.lang.Object[] objArray23 = null;
        unboundedFifoBuffer21.buffer = objArray23;
        boolean boolean25 = unboundedFifoBuffer6.add((java.lang.Object) unboundedFifoBuffer21);
        boolean boolean26 = unboundedFifoBuffer21.isEmpty();
        java.util.Iterator iterator27 = unboundedFifoBuffer21.iterator();
        boolean boolean28 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer21);
        unboundedFifoBuffer1.head = 'a';
        java.lang.Object obj31 = unboundedFifoBuffer1.remove();
        java.lang.Object obj32 = unboundedFifoBuffer1.remove();
        java.lang.Object[] objArray33 = unboundedFifoBuffer1.buffer;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.tail;
        int int4 = unboundedFifoBuffer1.head;
        int int5 = unboundedFifoBuffer1.tail;
        unboundedFifoBuffer1.tail = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        unboundedFifoBuffer0.buffer = objArray3;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        java.util.Iterator iterator7 = unboundedFifoBuffer6.iterator();
        boolean boolean8 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer6);
        unboundedFifoBuffer0.tail = (byte) 0;
        int int11 = unboundedFifoBuffer0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer0.buffer = objArray14;
        int int16 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean19 = unboundedFifoBuffer17.add((java.lang.Object) true);
        java.util.Iterator iterator20 = unboundedFifoBuffer17.iterator();
        int int21 = unboundedFifoBuffer17.tail;
        java.util.Iterator iterator22 = unboundedFifoBuffer17.iterator();
        boolean boolean23 = unboundedFifoBuffer0.add((java.lang.Object) iterator22);
        java.lang.Object obj24 = unboundedFifoBuffer0.remove();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer0.buffer = objArray15;
        boolean boolean18 = unboundedFifoBuffer0.add((java.lang.Object) (-1.0d));
        unboundedFifoBuffer0.tail = 0;
        int int21 = unboundedFifoBuffer0.head;
        unboundedFifoBuffer0.tail = 23;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, -1.0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, -1.0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        int int15 = unboundedFifoBuffer0.head;
        unboundedFifoBuffer0.tail = (short) 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray19 = unboundedFifoBuffer18.buffer;
        java.lang.Object[] objArray20 = null;
        unboundedFifoBuffer18.buffer = objArray20;
        unboundedFifoBuffer18.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer24 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int25 = unboundedFifoBuffer24.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        unboundedFifoBuffer24.buffer = objArray27;
        unboundedFifoBuffer18.buffer = objArray27;
        java.lang.Object[] objArray30 = unboundedFifoBuffer18.buffer;
        java.lang.Object[] objArray31 = unboundedFifoBuffer18.buffer;
        unboundedFifoBuffer0.buffer = objArray31;
        int int33 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        unboundedFifoBuffer0.buffer = objArray3;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        java.util.Iterator iterator7 = unboundedFifoBuffer6.iterator();
        boolean boolean8 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer6);
        boolean boolean9 = unboundedFifoBuffer6.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = unboundedFifoBuffer0.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        boolean boolean25 = unboundedFifoBuffer12.isEmpty();
        java.util.Iterator iterator26 = unboundedFifoBuffer12.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer0.head;
        unboundedFifoBuffer0.head = (short) 10;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int29 = unboundedFifoBuffer28.head;
        java.lang.Object[] objArray30 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer0.buffer = objArray30;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        java.lang.Object[] objArray28 = null;
        unboundedFifoBuffer26.buffer = objArray28;
        unboundedFifoBuffer26.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int33 = unboundedFifoBuffer32.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer32.buffer = objArray35;
        unboundedFifoBuffer26.buffer = objArray35;
        java.lang.Object[] objArray38 = unboundedFifoBuffer26.buffer;
        int int39 = unboundedFifoBuffer26.tail;
        java.lang.Object[] objArray40 = unboundedFifoBuffer26.buffer;
        unboundedFifoBuffer12.buffer = objArray40;
        unboundedFifoBuffer12.head = 0;
        unboundedFifoBuffer12.tail = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer0.buffer = objArray14;
        java.lang.Object[] objArray16 = unboundedFifoBuffer0.buffer;
        boolean boolean18 = unboundedFifoBuffer0.add((java.lang.Object) (byte) 100);
        int int19 = unboundedFifoBuffer0.tail;
        boolean boolean20 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean2 = unboundedFifoBuffer0.add((java.lang.Object) true);
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        java.lang.Object obj4 = unboundedFifoBuffer0.remove();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray6 = unboundedFifoBuffer5.buffer;
        int int7 = unboundedFifoBuffer5.tail;
        boolean boolean8 = unboundedFifoBuffer5.isEmpty();
        int int9 = unboundedFifoBuffer5.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        unboundedFifoBuffer10.buffer = objArray21;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray26 = unboundedFifoBuffer25.buffer;
        java.lang.Object[] objArray27 = null;
        unboundedFifoBuffer25.buffer = objArray27;
        boolean boolean29 = unboundedFifoBuffer10.add((java.lang.Object) unboundedFifoBuffer25);
        int int30 = unboundedFifoBuffer10.tail;
        java.lang.Object[] objArray31 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer5.buffer = objArray31;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer33 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray34 = unboundedFifoBuffer33.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer35 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray36 = unboundedFifoBuffer35.buffer;
        java.lang.Object[] objArray37 = null;
        unboundedFifoBuffer35.buffer = objArray37;
        unboundedFifoBuffer35.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer41 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int42 = unboundedFifoBuffer41.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer43 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray44 = unboundedFifoBuffer43.buffer;
        unboundedFifoBuffer41.buffer = objArray44;
        unboundedFifoBuffer35.buffer = objArray44;
        unboundedFifoBuffer33.buffer = objArray44;
        unboundedFifoBuffer33.head = (short) 10;
        java.lang.Object[] objArray50 = unboundedFifoBuffer33.buffer;
        unboundedFifoBuffer5.buffer = objArray50;
        boolean boolean52 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer5);
        boolean boolean53 = unboundedFifoBuffer5.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        int int13 = unboundedFifoBuffer0.head;
        int int14 = unboundedFifoBuffer0.size();
        java.lang.Object[] objArray15 = unboundedFifoBuffer0.buffer;
        int int16 = unboundedFifoBuffer0.head;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = unboundedFifoBuffer0.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int5 = unboundedFifoBuffer4.tail;
        int int6 = unboundedFifoBuffer4.size();
        boolean boolean7 = unboundedFifoBuffer0.add((java.lang.Object) int6);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean10 = unboundedFifoBuffer8.add((java.lang.Object) true);
        java.util.Iterator iterator11 = unboundedFifoBuffer8.iterator();
        java.lang.Object obj12 = unboundedFifoBuffer8.remove();
        boolean boolean13 = unboundedFifoBuffer8.isEmpty();
        boolean boolean14 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer8);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        int int17 = unboundedFifoBuffer16.size();
        java.util.Iterator iterator18 = unboundedFifoBuffer16.iterator();
        java.util.Iterator iterator19 = unboundedFifoBuffer16.iterator();
        boolean boolean20 = unboundedFifoBuffer8.add((java.lang.Object) iterator19);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        java.util.Iterator iterator2 = unboundedFifoBuffer1.iterator();
        java.lang.Object[] objArray3 = unboundedFifoBuffer1.buffer;
        java.util.Iterator iterator4 = unboundedFifoBuffer1.iterator();
        java.util.Iterator iterator5 = unboundedFifoBuffer1.iterator();
        unboundedFifoBuffer1.head = (byte) 0;
        boolean boolean8 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        boolean boolean16 = unboundedFifoBuffer0.add((java.lang.Object) (short) 100);
        int int17 = unboundedFifoBuffer0.tail;
        java.lang.Object obj18 = unboundedFifoBuffer0.remove();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 100 + "'", obj18, (short) 100);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        java.lang.Object[] objArray2 = unboundedFifoBuffer1.buffer;
        boolean boolean3 = unboundedFifoBuffer1.isEmpty();
        int int4 = unboundedFifoBuffer1.tail;
        boolean boolean5 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        int int5 = unboundedFifoBuffer1.size();
        unboundedFifoBuffer1.head = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        java.lang.Object[] objArray10 = null;
        unboundedFifoBuffer8.buffer = objArray10;
        unboundedFifoBuffer8.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int15 = unboundedFifoBuffer14.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray17 = unboundedFifoBuffer16.buffer;
        unboundedFifoBuffer14.buffer = objArray17;
        unboundedFifoBuffer8.buffer = objArray17;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        java.lang.Object[] objArray22 = null;
        unboundedFifoBuffer20.buffer = objArray22;
        unboundedFifoBuffer20.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int27 = unboundedFifoBuffer26.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray29 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer26.buffer = objArray29;
        unboundedFifoBuffer20.buffer = objArray29;
        boolean boolean32 = unboundedFifoBuffer8.add((java.lang.Object) unboundedFifoBuffer20);
        int int33 = unboundedFifoBuffer20.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        java.lang.Object[] objArray36 = null;
        unboundedFifoBuffer34.buffer = objArray36;
        unboundedFifoBuffer34.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int41 = unboundedFifoBuffer40.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer42 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray43 = unboundedFifoBuffer42.buffer;
        unboundedFifoBuffer40.buffer = objArray43;
        unboundedFifoBuffer34.buffer = objArray43;
        java.lang.Object[] objArray46 = unboundedFifoBuffer34.buffer;
        int int47 = unboundedFifoBuffer34.tail;
        java.lang.Object[] objArray48 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer20.buffer = objArray48;
        boolean boolean50 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer20);
        int int51 = unboundedFifoBuffer20.tail;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        unboundedFifoBuffer1.tail = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer0.buffer = objArray15;
        unboundedFifoBuffer0.tail = (byte) 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer22 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray23 = unboundedFifoBuffer22.buffer;
        unboundedFifoBuffer20.buffer = objArray23;
        java.lang.Object[] objArray26 = new java.lang.Object[] { unboundedFifoBuffer20, 1.0f };
        unboundedFifoBuffer0.buffer = objArray26;
        java.lang.Object obj28 = unboundedFifoBuffer0.remove();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[null, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[null, 1.0]");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "[]");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        boolean boolean21 = unboundedFifoBuffer0.isEmpty();
        unboundedFifoBuffer0.head = (short) 10;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int26 = unboundedFifoBuffer25.head;
        int int27 = unboundedFifoBuffer25.size();
        int int28 = unboundedFifoBuffer25.head;
        java.lang.Object[] objArray29 = unboundedFifoBuffer25.buffer;
        boolean boolean30 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer25);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], [], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], [], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int5 = unboundedFifoBuffer4.tail;
        int int6 = unboundedFifoBuffer4.size();
        boolean boolean7 = unboundedFifoBuffer0.add((java.lang.Object) int6);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean10 = unboundedFifoBuffer8.add((java.lang.Object) true);
        java.util.Iterator iterator11 = unboundedFifoBuffer8.iterator();
        java.lang.Object obj12 = unboundedFifoBuffer8.remove();
        boolean boolean13 = unboundedFifoBuffer8.isEmpty();
        boolean boolean14 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer8);
        int int15 = unboundedFifoBuffer0.head;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0, [], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0, [], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray6 = unboundedFifoBuffer5.buffer;
        int int7 = unboundedFifoBuffer5.tail;
        boolean boolean8 = unboundedFifoBuffer5.isEmpty();
        int int9 = unboundedFifoBuffer5.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        unboundedFifoBuffer10.buffer = objArray21;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray26 = unboundedFifoBuffer25.buffer;
        java.lang.Object[] objArray27 = null;
        unboundedFifoBuffer25.buffer = objArray27;
        boolean boolean29 = unboundedFifoBuffer10.add((java.lang.Object) unboundedFifoBuffer25);
        int int30 = unboundedFifoBuffer10.tail;
        java.lang.Object[] objArray31 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer5.buffer = objArray31;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer33 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray34 = unboundedFifoBuffer33.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer35 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray36 = unboundedFifoBuffer35.buffer;
        java.lang.Object[] objArray37 = null;
        unboundedFifoBuffer35.buffer = objArray37;
        unboundedFifoBuffer35.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer41 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int42 = unboundedFifoBuffer41.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer43 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray44 = unboundedFifoBuffer43.buffer;
        unboundedFifoBuffer41.buffer = objArray44;
        unboundedFifoBuffer35.buffer = objArray44;
        unboundedFifoBuffer33.buffer = objArray44;
        unboundedFifoBuffer33.head = (short) 10;
        java.lang.Object[] objArray50 = unboundedFifoBuffer33.buffer;
        unboundedFifoBuffer5.buffer = objArray50;
        unboundedFifoBuffer1.buffer = objArray50;
        java.lang.Object[] objArray53 = unboundedFifoBuffer1.buffer;
        java.util.Iterator iterator54 = unboundedFifoBuffer1.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(iterator54);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer0.buffer = objArray14;
        java.lang.Object[] objArray16 = unboundedFifoBuffer0.buffer;
        boolean boolean18 = unboundedFifoBuffer0.add((java.lang.Object) (byte) 100);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer19 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray20 = unboundedFifoBuffer19.buffer;
        java.lang.Object[] objArray21 = null;
        unboundedFifoBuffer19.buffer = objArray21;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray24 = unboundedFifoBuffer23.buffer;
        java.lang.Object[] objArray25 = null;
        unboundedFifoBuffer23.buffer = objArray25;
        unboundedFifoBuffer23.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer29 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int30 = unboundedFifoBuffer29.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer31 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray32 = unboundedFifoBuffer31.buffer;
        unboundedFifoBuffer29.buffer = objArray32;
        unboundedFifoBuffer23.buffer = objArray32;
        java.lang.Object[] objArray35 = unboundedFifoBuffer23.buffer;
        java.lang.Object[] objArray36 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer19.buffer = objArray36;
        int int38 = unboundedFifoBuffer19.head;
        unboundedFifoBuffer19.head = (short) 0;
        java.util.Iterator iterator41 = unboundedFifoBuffer19.iterator();
        boolean boolean42 = unboundedFifoBuffer0.add((java.lang.Object) iterator41);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean2 = unboundedFifoBuffer0.add((java.lang.Object) true);
        unboundedFifoBuffer0.head = 1;
        int int5 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        boolean boolean25 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        java.util.Iterator iterator4 = unboundedFifoBuffer0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        unboundedFifoBuffer1.tail = 1;
        java.lang.Object obj6 = unboundedFifoBuffer1.get();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.tail;
        int int4 = unboundedFifoBuffer1.head;
        int int5 = unboundedFifoBuffer1.tail;
        java.lang.Object[] objArray6 = unboundedFifoBuffer1.buffer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        int int15 = unboundedFifoBuffer0.head;
        unboundedFifoBuffer0.tail = (short) 1;
        int int18 = unboundedFifoBuffer0.size();
        boolean boolean19 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 10);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        java.lang.Object[] objArray6 = null;
        unboundedFifoBuffer4.buffer = objArray6;
        unboundedFifoBuffer4.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int11 = unboundedFifoBuffer10.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        unboundedFifoBuffer10.buffer = objArray13;
        unboundedFifoBuffer4.buffer = objArray13;
        unboundedFifoBuffer2.buffer = objArray13;
        unboundedFifoBuffer1.buffer = objArray13;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray19 = unboundedFifoBuffer18.buffer;
        int int20 = unboundedFifoBuffer18.tail;
        boolean boolean21 = unboundedFifoBuffer18.isEmpty();
        int int22 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer23 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray24 = unboundedFifoBuffer23.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray26 = unboundedFifoBuffer25.buffer;
        java.lang.Object[] objArray27 = null;
        unboundedFifoBuffer25.buffer = objArray27;
        unboundedFifoBuffer25.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer31 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int32 = unboundedFifoBuffer31.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer33 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray34 = unboundedFifoBuffer33.buffer;
        unboundedFifoBuffer31.buffer = objArray34;
        unboundedFifoBuffer25.buffer = objArray34;
        unboundedFifoBuffer23.buffer = objArray34;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer38 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray39 = unboundedFifoBuffer38.buffer;
        java.lang.Object[] objArray40 = null;
        unboundedFifoBuffer38.buffer = objArray40;
        boolean boolean42 = unboundedFifoBuffer23.add((java.lang.Object) unboundedFifoBuffer38);
        int int43 = unboundedFifoBuffer23.tail;
        java.lang.Object[] objArray44 = unboundedFifoBuffer23.buffer;
        unboundedFifoBuffer18.buffer = objArray44;
        boolean boolean46 = unboundedFifoBuffer1.add((java.lang.Object) objArray44);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer47 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray48 = unboundedFifoBuffer47.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer49 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray50 = unboundedFifoBuffer49.buffer;
        java.lang.Object[] objArray51 = null;
        unboundedFifoBuffer49.buffer = objArray51;
        unboundedFifoBuffer49.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer55 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int56 = unboundedFifoBuffer55.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer57 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray58 = unboundedFifoBuffer57.buffer;
        unboundedFifoBuffer55.buffer = objArray58;
        unboundedFifoBuffer49.buffer = objArray58;
        unboundedFifoBuffer47.buffer = objArray58;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer62 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray63 = unboundedFifoBuffer62.buffer;
        unboundedFifoBuffer47.buffer = objArray63;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer65 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray66 = unboundedFifoBuffer65.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer67 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray68 = unboundedFifoBuffer67.buffer;
        java.lang.Object[] objArray69 = null;
        unboundedFifoBuffer67.buffer = objArray69;
        unboundedFifoBuffer67.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer73 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int74 = unboundedFifoBuffer73.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer75 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray76 = unboundedFifoBuffer75.buffer;
        unboundedFifoBuffer73.buffer = objArray76;
        unboundedFifoBuffer67.buffer = objArray76;
        unboundedFifoBuffer65.buffer = objArray76;
        int int80 = unboundedFifoBuffer65.size();
        boolean boolean81 = unboundedFifoBuffer47.add((java.lang.Object) unboundedFifoBuffer65);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer83 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int84 = unboundedFifoBuffer83.tail;
        java.lang.Object[] objArray85 = unboundedFifoBuffer83.buffer;
        boolean boolean86 = unboundedFifoBuffer47.add((java.lang.Object) objArray85);
        unboundedFifoBuffer1.buffer = objArray85;
        int int88 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[[], [null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        int int5 = unboundedFifoBuffer1.size();
        unboundedFifoBuffer1.head = (short) 0;
        unboundedFifoBuffer1.head = 2;
        unboundedFifoBuffer1.tail = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        unboundedFifoBuffer1.tail = 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray7 = unboundedFifoBuffer6.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        java.lang.Object[] objArray10 = null;
        unboundedFifoBuffer8.buffer = objArray10;
        unboundedFifoBuffer8.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int15 = unboundedFifoBuffer14.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray17 = unboundedFifoBuffer16.buffer;
        unboundedFifoBuffer14.buffer = objArray17;
        unboundedFifoBuffer8.buffer = objArray17;
        unboundedFifoBuffer6.buffer = objArray17;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer21 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray22 = unboundedFifoBuffer21.buffer;
        java.lang.Object[] objArray23 = null;
        unboundedFifoBuffer21.buffer = objArray23;
        boolean boolean25 = unboundedFifoBuffer6.add((java.lang.Object) unboundedFifoBuffer21);
        int int26 = unboundedFifoBuffer6.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray28 = unboundedFifoBuffer27.buffer;
        java.lang.Object[] objArray29 = null;
        unboundedFifoBuffer27.buffer = objArray29;
        unboundedFifoBuffer27.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer33 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int34 = unboundedFifoBuffer33.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer35 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray36 = unboundedFifoBuffer35.buffer;
        unboundedFifoBuffer33.buffer = objArray36;
        unboundedFifoBuffer27.buffer = objArray36;
        boolean boolean40 = unboundedFifoBuffer27.add((java.lang.Object) 0);
        int int41 = unboundedFifoBuffer27.size();
        boolean boolean42 = unboundedFifoBuffer6.add((java.lang.Object) int41);
        java.lang.Object[] objArray43 = unboundedFifoBuffer6.buffer;
        unboundedFifoBuffer1.buffer = objArray43;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[[], 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[[], 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[[], 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[[], 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean2 = unboundedFifoBuffer0.add((java.lang.Object) true);
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        unboundedFifoBuffer0.head = (byte) 10;
        int int6 = unboundedFifoBuffer0.size();
        java.lang.Object obj7 = unboundedFifoBuffer0.remove();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        int int5 = unboundedFifoBuffer1.size();
        unboundedFifoBuffer1.head = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        java.lang.Object[] objArray10 = null;
        unboundedFifoBuffer8.buffer = objArray10;
        unboundedFifoBuffer8.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int15 = unboundedFifoBuffer14.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer16 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray17 = unboundedFifoBuffer16.buffer;
        unboundedFifoBuffer14.buffer = objArray17;
        unboundedFifoBuffer8.buffer = objArray17;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        java.lang.Object[] objArray22 = null;
        unboundedFifoBuffer20.buffer = objArray22;
        unboundedFifoBuffer20.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int27 = unboundedFifoBuffer26.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray29 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer26.buffer = objArray29;
        unboundedFifoBuffer20.buffer = objArray29;
        boolean boolean32 = unboundedFifoBuffer8.add((java.lang.Object) unboundedFifoBuffer20);
        int int33 = unboundedFifoBuffer20.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        java.lang.Object[] objArray36 = null;
        unboundedFifoBuffer34.buffer = objArray36;
        unboundedFifoBuffer34.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int41 = unboundedFifoBuffer40.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer42 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray43 = unboundedFifoBuffer42.buffer;
        unboundedFifoBuffer40.buffer = objArray43;
        unboundedFifoBuffer34.buffer = objArray43;
        java.lang.Object[] objArray46 = unboundedFifoBuffer34.buffer;
        int int47 = unboundedFifoBuffer34.tail;
        java.lang.Object[] objArray48 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer20.buffer = objArray48;
        boolean boolean50 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer20);
        int int51 = unboundedFifoBuffer20.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.size();
        int int3 = unboundedFifoBuffer0.tail;
        boolean boolean4 = unboundedFifoBuffer0.isEmpty();
        java.lang.Object[] objArray5 = unboundedFifoBuffer0.buffer;
        java.util.Iterator iterator6 = unboundedFifoBuffer0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        boolean boolean3 = unboundedFifoBuffer0.isEmpty();
        int int4 = unboundedFifoBuffer0.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray6 = unboundedFifoBuffer5.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer7 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray8 = unboundedFifoBuffer7.buffer;
        java.lang.Object[] objArray9 = null;
        unboundedFifoBuffer7.buffer = objArray9;
        unboundedFifoBuffer7.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int14 = unboundedFifoBuffer13.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        unboundedFifoBuffer13.buffer = objArray16;
        unboundedFifoBuffer7.buffer = objArray16;
        unboundedFifoBuffer5.buffer = objArray16;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        java.lang.Object[] objArray22 = null;
        unboundedFifoBuffer20.buffer = objArray22;
        boolean boolean24 = unboundedFifoBuffer5.add((java.lang.Object) unboundedFifoBuffer20);
        int int25 = unboundedFifoBuffer5.tail;
        java.lang.Object[] objArray26 = unboundedFifoBuffer5.buffer;
        unboundedFifoBuffer0.buffer = objArray26;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray29 = unboundedFifoBuffer28.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer30 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray31 = unboundedFifoBuffer30.buffer;
        java.lang.Object[] objArray32 = null;
        unboundedFifoBuffer30.buffer = objArray32;
        unboundedFifoBuffer30.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer36 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int37 = unboundedFifoBuffer36.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer38 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray39 = unboundedFifoBuffer38.buffer;
        unboundedFifoBuffer36.buffer = objArray39;
        unboundedFifoBuffer30.buffer = objArray39;
        unboundedFifoBuffer28.buffer = objArray39;
        unboundedFifoBuffer28.head = (short) 10;
        java.lang.Object[] objArray45 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer0.buffer = objArray45;
        java.lang.Class<?> wildcardClass47 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        int int15 = unboundedFifoBuffer0.head;
        int int16 = unboundedFifoBuffer0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        java.lang.Object[] objArray28 = null;
        unboundedFifoBuffer26.buffer = objArray28;
        unboundedFifoBuffer26.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int33 = unboundedFifoBuffer32.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer32.buffer = objArray35;
        unboundedFifoBuffer26.buffer = objArray35;
        unboundedFifoBuffer12.buffer = objArray35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        int int15 = unboundedFifoBuffer0.head;
        unboundedFifoBuffer0.tail = (short) 1;
        int int18 = unboundedFifoBuffer0.size();
        java.lang.Object obj19 = unboundedFifoBuffer0.get();
        int int20 = unboundedFifoBuffer0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        int int15 = unboundedFifoBuffer13.size();
        boolean boolean16 = unboundedFifoBuffer0.add((java.lang.Object) int15);
        java.util.Iterator iterator17 = unboundedFifoBuffer0.iterator();
        unboundedFifoBuffer0.tail = 10;
        unboundedFifoBuffer0.head = (byte) 10;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        java.util.Iterator iterator4 = unboundedFifoBuffer1.iterator();
        int int5 = unboundedFifoBuffer1.head;
        int int6 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int1 = unboundedFifoBuffer0.head;
        java.util.Iterator iterator2 = unboundedFifoBuffer0.iterator();
        unboundedFifoBuffer0.tail = 0;
        java.lang.Class<?> wildcardClass5 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        int int5 = unboundedFifoBuffer1.size();
        unboundedFifoBuffer1.head = (short) 0;
        boolean boolean8 = unboundedFifoBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        unboundedFifoBuffer1.head = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        java.lang.Object[] objArray12 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer0.buffer = objArray14;
        unboundedFifoBuffer0.head = ' ';
        java.lang.Class<?> wildcardClass18 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        boolean boolean16 = unboundedFifoBuffer0.add((java.lang.Object) (short) 100);
        int int17 = unboundedFifoBuffer0.head;
        int int18 = unboundedFifoBuffer0.size();
        boolean boolean19 = unboundedFifoBuffer0.isEmpty();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.size();
        int int3 = unboundedFifoBuffer0.tail;
        unboundedFifoBuffer0.tail = 23;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray7 = unboundedFifoBuffer6.buffer;
        java.lang.Object[] objArray8 = null;
        unboundedFifoBuffer6.buffer = objArray8;
        unboundedFifoBuffer6.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int13 = unboundedFifoBuffer12.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer12.buffer = objArray15;
        unboundedFifoBuffer6.buffer = objArray15;
        boolean boolean19 = unboundedFifoBuffer6.add((java.lang.Object) 0);
        int int20 = unboundedFifoBuffer6.size();
        java.lang.Object[] objArray21 = unboundedFifoBuffer6.buffer;
        unboundedFifoBuffer0.buffer = objArray21;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) 'a');
        unboundedFifoBuffer1.head = (byte) 1;
        java.lang.Object obj4 = unboundedFifoBuffer1.remove();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer(32);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer12.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer26 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray27 = unboundedFifoBuffer26.buffer;
        java.lang.Object[] objArray28 = null;
        unboundedFifoBuffer26.buffer = objArray28;
        unboundedFifoBuffer26.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int33 = unboundedFifoBuffer32.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        unboundedFifoBuffer32.buffer = objArray35;
        unboundedFifoBuffer26.buffer = objArray35;
        java.lang.Object[] objArray38 = unboundedFifoBuffer26.buffer;
        int int39 = unboundedFifoBuffer26.tail;
        java.lang.Object[] objArray40 = unboundedFifoBuffer26.buffer;
        unboundedFifoBuffer12.buffer = objArray40;
        unboundedFifoBuffer12.head = 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer44 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray45 = unboundedFifoBuffer44.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer46 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray47 = unboundedFifoBuffer46.buffer;
        java.lang.Object[] objArray48 = null;
        unboundedFifoBuffer46.buffer = objArray48;
        unboundedFifoBuffer46.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer52 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int53 = unboundedFifoBuffer52.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer54 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray55 = unboundedFifoBuffer54.buffer;
        unboundedFifoBuffer52.buffer = objArray55;
        unboundedFifoBuffer46.buffer = objArray55;
        unboundedFifoBuffer44.buffer = objArray55;
        int int59 = unboundedFifoBuffer44.head;
        unboundedFifoBuffer44.tail = (short) 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer62 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray63 = unboundedFifoBuffer62.buffer;
        java.lang.Object[] objArray64 = null;
        unboundedFifoBuffer62.buffer = objArray64;
        unboundedFifoBuffer62.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer68 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int69 = unboundedFifoBuffer68.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer70 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray71 = unboundedFifoBuffer70.buffer;
        unboundedFifoBuffer68.buffer = objArray71;
        unboundedFifoBuffer62.buffer = objArray71;
        java.lang.Object[] objArray74 = unboundedFifoBuffer62.buffer;
        java.lang.Object[] objArray75 = unboundedFifoBuffer62.buffer;
        unboundedFifoBuffer44.buffer = objArray75;
        unboundedFifoBuffer12.buffer = objArray75;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.size();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray4 = unboundedFifoBuffer3.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray6 = unboundedFifoBuffer5.buffer;
        java.lang.Object[] objArray7 = null;
        unboundedFifoBuffer5.buffer = objArray7;
        unboundedFifoBuffer5.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer11 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int12 = unboundedFifoBuffer11.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer11.buffer = objArray14;
        unboundedFifoBuffer5.buffer = objArray14;
        unboundedFifoBuffer3.buffer = objArray14;
        java.util.Iterator iterator18 = unboundedFifoBuffer3.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer19 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray20 = unboundedFifoBuffer19.buffer;
        java.lang.Object[] objArray21 = null;
        unboundedFifoBuffer19.buffer = objArray21;
        unboundedFifoBuffer19.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer25 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int26 = unboundedFifoBuffer25.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer27 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray28 = unboundedFifoBuffer27.buffer;
        unboundedFifoBuffer25.buffer = objArray28;
        unboundedFifoBuffer19.buffer = objArray28;
        java.lang.Object[] objArray31 = unboundedFifoBuffer19.buffer;
        unboundedFifoBuffer3.buffer = objArray31;
        unboundedFifoBuffer0.buffer = objArray31;
        java.util.Iterator iterator34 = unboundedFifoBuffer0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(iterator34);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray4 = unboundedFifoBuffer3.buffer;
        java.lang.Object[] objArray5 = null;
        unboundedFifoBuffer3.buffer = objArray5;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer7 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray8 = unboundedFifoBuffer7.buffer;
        java.lang.Object[] objArray9 = null;
        unboundedFifoBuffer7.buffer = objArray9;
        unboundedFifoBuffer7.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int14 = unboundedFifoBuffer13.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        unboundedFifoBuffer13.buffer = objArray16;
        unboundedFifoBuffer7.buffer = objArray16;
        java.lang.Object[] objArray19 = unboundedFifoBuffer7.buffer;
        java.lang.Object[] objArray20 = unboundedFifoBuffer7.buffer;
        unboundedFifoBuffer3.buffer = objArray20;
        boolean boolean22 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer3);
        int int23 = unboundedFifoBuffer1.tail;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        unboundedFifoBuffer0.head = (short) 10;
        java.util.Iterator iterator17 = unboundedFifoBuffer0.iterator();
        java.lang.Object obj18 = unboundedFifoBuffer0.get();
        int int19 = unboundedFifoBuffer0.head;
        java.lang.Object obj20 = unboundedFifoBuffer0.get();
        int int21 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        java.lang.Object[] objArray2 = unboundedFifoBuffer1.buffer;
        int int3 = unboundedFifoBuffer1.tail;
        java.util.Iterator iterator4 = unboundedFifoBuffer1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = unboundedFifoBuffer1.get();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.collections.BufferUnderflowException; message: The buffer is already empty");
        } catch (org.apache.commons.collections.BufferUnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.size();
        int int4 = unboundedFifoBuffer1.head;
        boolean boolean5 = unboundedFifoBuffer1.isEmpty();
        int int6 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 10);
        int int2 = unboundedFifoBuffer1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.size();
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        int int4 = unboundedFifoBuffer0.tail;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        java.lang.Object[] objArray20 = unboundedFifoBuffer15.buffer;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objArray20);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        unboundedFifoBuffer0.head = 10;
        unboundedFifoBuffer0.head = 0;
        java.lang.Object[] objArray29 = unboundedFifoBuffer0.buffer;
        int int30 = unboundedFifoBuffer0.head;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer12 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray13 = unboundedFifoBuffer12.buffer;
        java.lang.Object[] objArray14 = null;
        unboundedFifoBuffer12.buffer = objArray14;
        unboundedFifoBuffer12.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int19 = unboundedFifoBuffer18.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer20 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray21 = unboundedFifoBuffer20.buffer;
        unboundedFifoBuffer18.buffer = objArray21;
        unboundedFifoBuffer12.buffer = objArray21;
        boolean boolean24 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer12);
        int int25 = unboundedFifoBuffer0.head;
        unboundedFifoBuffer0.head = (short) 10;
        unboundedFifoBuffer0.tail = 9;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.head;
        boolean boolean3 = unboundedFifoBuffer1.isEmpty();
        int int4 = unboundedFifoBuffer1.tail;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer14 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray15 = unboundedFifoBuffer14.buffer;
        unboundedFifoBuffer0.buffer = objArray15;
        unboundedFifoBuffer0.tail = (byte) 1;
        java.util.Iterator iterator19 = unboundedFifoBuffer0.iterator();
        java.lang.Object obj20 = unboundedFifoBuffer0.remove();
        java.lang.Class<?> wildcardClass21 = unboundedFifoBuffer0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        unboundedFifoBuffer0.head = (short) 10;
        java.util.Iterator iterator17 = unboundedFifoBuffer0.iterator();
        java.lang.Object obj18 = unboundedFifoBuffer0.get();
        unboundedFifoBuffer0.head = 2;
        int int21 = unboundedFifoBuffer0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (byte) 1);
        java.lang.Object[] objArray2 = unboundedFifoBuffer1.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray4 = unboundedFifoBuffer3.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray6 = unboundedFifoBuffer5.buffer;
        java.lang.Object[] objArray7 = null;
        unboundedFifoBuffer5.buffer = objArray7;
        unboundedFifoBuffer5.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer11 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int12 = unboundedFifoBuffer11.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer13 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray14 = unboundedFifoBuffer13.buffer;
        unboundedFifoBuffer11.buffer = objArray14;
        unboundedFifoBuffer5.buffer = objArray14;
        unboundedFifoBuffer3.buffer = objArray14;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray19 = unboundedFifoBuffer18.buffer;
        java.lang.Object[] objArray20 = null;
        unboundedFifoBuffer18.buffer = objArray20;
        boolean boolean22 = unboundedFifoBuffer3.add((java.lang.Object) unboundedFifoBuffer18);
        int int23 = unboundedFifoBuffer3.tail;
        java.lang.Object[] objArray24 = unboundedFifoBuffer3.buffer;
        java.lang.Object obj25 = unboundedFifoBuffer3.get();
        boolean boolean26 = unboundedFifoBuffer1.add((java.lang.Object) unboundedFifoBuffer3);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[[[]], null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[[[]], null]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        boolean boolean2 = unboundedFifoBuffer0.add((java.lang.Object) true);
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        java.lang.Object obj4 = unboundedFifoBuffer0.remove();
        unboundedFifoBuffer0.tail = (short) 10;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int9 = unboundedFifoBuffer8.head;
        int int10 = unboundedFifoBuffer8.size();
        int int11 = unboundedFifoBuffer8.head;
        int int12 = unboundedFifoBuffer8.size();
        unboundedFifoBuffer8.head = (short) 0;
        unboundedFifoBuffer8.head = 2;
        java.lang.Object[] objArray17 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer0.buffer = objArray17;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + true + "'", obj4, true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        int int2 = unboundedFifoBuffer0.tail;
        java.util.Iterator iterator3 = unboundedFifoBuffer0.iterator();
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray5 = unboundedFifoBuffer4.buffer;
        int int6 = unboundedFifoBuffer4.tail;
        boolean boolean7 = unboundedFifoBuffer4.isEmpty();
        int int8 = unboundedFifoBuffer4.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer9 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray10 = unboundedFifoBuffer9.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer11 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray12 = unboundedFifoBuffer11.buffer;
        java.lang.Object[] objArray13 = null;
        unboundedFifoBuffer11.buffer = objArray13;
        unboundedFifoBuffer11.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer17 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int18 = unboundedFifoBuffer17.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer19 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray20 = unboundedFifoBuffer19.buffer;
        unboundedFifoBuffer17.buffer = objArray20;
        unboundedFifoBuffer11.buffer = objArray20;
        unboundedFifoBuffer9.buffer = objArray20;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer24 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray25 = unboundedFifoBuffer24.buffer;
        java.lang.Object[] objArray26 = null;
        unboundedFifoBuffer24.buffer = objArray26;
        boolean boolean28 = unboundedFifoBuffer9.add((java.lang.Object) unboundedFifoBuffer24);
        int int29 = unboundedFifoBuffer9.tail;
        java.lang.Object[] objArray30 = unboundedFifoBuffer9.buffer;
        unboundedFifoBuffer4.buffer = objArray30;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer32 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray33 = unboundedFifoBuffer32.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray35 = unboundedFifoBuffer34.buffer;
        java.lang.Object[] objArray36 = null;
        unboundedFifoBuffer34.buffer = objArray36;
        unboundedFifoBuffer34.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer40 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int41 = unboundedFifoBuffer40.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer42 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray43 = unboundedFifoBuffer42.buffer;
        unboundedFifoBuffer40.buffer = objArray43;
        unboundedFifoBuffer34.buffer = objArray43;
        unboundedFifoBuffer32.buffer = objArray43;
        unboundedFifoBuffer32.head = (short) 10;
        java.lang.Object[] objArray49 = unboundedFifoBuffer32.buffer;
        unboundedFifoBuffer4.buffer = objArray49;
        java.lang.Object[] objArray51 = unboundedFifoBuffer4.buffer;
        unboundedFifoBuffer0.buffer = objArray51;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int2 = unboundedFifoBuffer1.tail;
        int int3 = unboundedFifoBuffer1.tail;
        java.util.Iterator iterator4 = unboundedFifoBuffer1.iterator();
        int int5 = unboundedFifoBuffer1.head;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        java.lang.Object[] objArray2 = null;
        unboundedFifoBuffer0.buffer = objArray2;
        unboundedFifoBuffer0.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int7 = unboundedFifoBuffer6.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray9 = unboundedFifoBuffer8.buffer;
        unboundedFifoBuffer6.buffer = objArray9;
        unboundedFifoBuffer0.buffer = objArray9;
        boolean boolean13 = unboundedFifoBuffer0.add((java.lang.Object) 0);
        int int14 = unboundedFifoBuffer0.size();
        java.lang.Object[] objArray15 = unboundedFifoBuffer0.buffer;
        int int16 = unboundedFifoBuffer0.size();
        java.lang.Object obj17 = unboundedFifoBuffer0.get();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        boolean boolean21 = unboundedFifoBuffer0.isEmpty();
        unboundedFifoBuffer0.head = 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer24 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray25 = unboundedFifoBuffer24.buffer;
        java.lang.Object[] objArray26 = null;
        unboundedFifoBuffer24.buffer = objArray26;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray29 = unboundedFifoBuffer28.buffer;
        java.lang.Object[] objArray30 = null;
        unboundedFifoBuffer28.buffer = objArray30;
        unboundedFifoBuffer28.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int35 = unboundedFifoBuffer34.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer36 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray37 = unboundedFifoBuffer36.buffer;
        unboundedFifoBuffer34.buffer = objArray37;
        unboundedFifoBuffer28.buffer = objArray37;
        java.lang.Object[] objArray40 = unboundedFifoBuffer28.buffer;
        java.lang.Object[] objArray41 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer24.buffer = objArray41;
        unboundedFifoBuffer0.buffer = objArray41;
        int int44 = unboundedFifoBuffer0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer15 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray16 = unboundedFifoBuffer15.buffer;
        java.lang.Object[] objArray17 = null;
        unboundedFifoBuffer15.buffer = objArray17;
        boolean boolean19 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer15);
        int int20 = unboundedFifoBuffer0.tail;
        boolean boolean21 = unboundedFifoBuffer0.isEmpty();
        unboundedFifoBuffer0.head = 1;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer24 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray25 = unboundedFifoBuffer24.buffer;
        java.lang.Object[] objArray26 = null;
        unboundedFifoBuffer24.buffer = objArray26;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer28 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray29 = unboundedFifoBuffer28.buffer;
        java.lang.Object[] objArray30 = null;
        unboundedFifoBuffer28.buffer = objArray30;
        unboundedFifoBuffer28.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer34 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int35 = unboundedFifoBuffer34.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer36 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray37 = unboundedFifoBuffer36.buffer;
        unboundedFifoBuffer34.buffer = objArray37;
        unboundedFifoBuffer28.buffer = objArray37;
        java.lang.Object[] objArray40 = unboundedFifoBuffer28.buffer;
        java.lang.Object[] objArray41 = unboundedFifoBuffer28.buffer;
        unboundedFifoBuffer24.buffer = objArray41;
        unboundedFifoBuffer0.buffer = objArray41;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer45 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int46 = unboundedFifoBuffer45.tail;
        int int47 = unboundedFifoBuffer45.tail;
        java.lang.Object[] objArray48 = unboundedFifoBuffer45.buffer;
        unboundedFifoBuffer0.buffer = objArray48;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer51 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((int) (short) 100);
        int int52 = unboundedFifoBuffer51.tail;
        int int53 = unboundedFifoBuffer51.size();
        int int54 = unboundedFifoBuffer51.head;
        boolean boolean55 = unboundedFifoBuffer0.add((java.lang.Object) unboundedFifoBuffer51);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[null, [], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[null, [], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray1 = unboundedFifoBuffer0.buffer;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray3 = unboundedFifoBuffer2.buffer;
        java.lang.Object[] objArray4 = null;
        unboundedFifoBuffer2.buffer = objArray4;
        unboundedFifoBuffer2.tail = (short) 0;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        int int9 = unboundedFifoBuffer8.head;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer10 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray11 = unboundedFifoBuffer10.buffer;
        unboundedFifoBuffer8.buffer = objArray11;
        unboundedFifoBuffer2.buffer = objArray11;
        unboundedFifoBuffer0.buffer = objArray11;
        boolean boolean16 = unboundedFifoBuffer0.add((java.lang.Object) (short) 100);
        int int17 = unboundedFifoBuffer0.tail;
        org.apache.commons.collections.buffer.UnboundedFifoBuffer unboundedFifoBuffer18 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
        java.lang.Object[] objArray19 = unboundedFifoBuffer18.buffer;
        int int20 = unboundedFifoBuffer18.tail;
        boolean boolean21 = unboundedFifoBuffer18.isEmpty();
        int int22 = unboundedFifoBuffer18.head;
        boolean boolean23 = unboundedFifoBuffer0.add((java.lang.Object) int22);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }
}

