package org.jfree.data;

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
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = keyedObjects2D0.getObject((java.lang.Comparable) 'a', (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (a) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = keyedObjects2D0.getObject((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = keyedObjects2D0.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Class<?> wildcardClass7 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = keyedObjects2D0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeRow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeRow((java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int7 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject(1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = keyedObjects2D0.getColumnKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Comparable comparable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(comparable1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = keyedObjects2D1.getObject((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = keyedObjects2D0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int7 = keyedObjects2D0.getRowCount();
        java.lang.Class<?> wildcardClass8 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = keyedObjects2D0.getObject((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeColumn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = keyedObjects2D0.getObject((java.lang.Comparable) (-1L), (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = keyedObjects2D0.getObject((java.lang.Comparable) 10L, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        boolean boolean6 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = keyedObjects2D0.getRowKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = keyedObjects2D0.getColumnKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = keyedObjects2D0.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeRow((int) (byte) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        int int14 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list15 = keyedObjects2D8.getRowKeys();
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.setObject((java.lang.Object) list15, comparable16, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = keyedObjects2D0.getObject((java.lang.Comparable) 'a', (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (a) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = keyedObjects2D0.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeRow(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.lang.Class<?> wildcardClass8 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Class<?> wildcardClass5 = keyedObjects2D1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int7 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((java.lang.Comparable) 1, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = keyedObjects2D0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = keyedObjects2D0.getObject((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(comparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = keyedObjects2D0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeRow((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = keyedObjects2D0.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key ( ) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = keyedObjects2D0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = keyedObjects2D0.getRowKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int7 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = keyedObjects2D0.getRowKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.lang.Object obj6 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = keyedObjects2D0.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = keyedObjects2D0.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((java.lang.Comparable) 0.0f, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        java.lang.Object obj29 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = keyedObjects2D0.getObject((int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int8 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (short) 10);
        int int9 = keyedObjects2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = keyedObjects2D1.getObject((java.lang.Comparable) 100L, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) 10.0d);
        int int5 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = keyedObjects2D0.getObject((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = keyedObjects2D0.getColumnKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj2 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list3 = keyedObjects2D0.getRowKeys();
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = keyedObjects2D0.getObject((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Comparable comparable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(comparable7);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (null) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = keyedObjects2D0.getObject((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = keyedObjects2D0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        int int7 = keyedObjects2D6.getRowCount();
        java.lang.Object obj8 = keyedObjects2D6.clone();
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.addObject(obj8, (java.lang.Comparable) 10, comparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int8 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = keyedObjects2D1.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = keyedObjects2D0.getObject((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        boolean boolean34 = keyedObjects2D31.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        java.lang.Class<?> wildcardClass38 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeRow((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeRow((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int7 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((java.lang.Comparable) '#', (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (#) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = keyedObjects2D0.getObject((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        java.lang.Object obj6 = keyedObjects2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeColumn((java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int13 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        java.lang.Class<?> wildcardClass42 = keyedObjects2D8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = keyedObjects2D0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) 10.0d);
        int int5 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D7.removeRow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        java.lang.Comparable comparable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = keyedObjects2D0.getObject(comparable6, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        java.lang.Object obj29 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = keyedObjects2D0.getObject((java.lang.Comparable) 100L, (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D0.setObject((java.lang.Object) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = keyedObjects2D0.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D0.removeRow((int) (short) 0);
        java.lang.Comparable comparable31 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeObject(comparable31, (java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((java.lang.Comparable) false, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (false) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        java.lang.Object obj8 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        java.lang.Object obj8 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = keyedObjects2D0.getObject((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        boolean boolean34 = keyedObjects2D31.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.util.List list19 = keyedObjects2D0.getColumnKeys();
        java.lang.Class<?> wildcardClass20 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Class<?> wildcardClass10 = keyedObjects2D1.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.util.List list10 = keyedObjects2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeColumn((java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int8 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (short) 10);
        int int9 = keyedObjects2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = keyedObjects2D1.getColumnKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = keyedObjects2D0.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list3 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.lang.Class<?> wildcardClass1 = keyedObjects2D0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) 2, (java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = keyedObjects2D0.getObject((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) (byte) 100);
        boolean boolean5 = keyedObjects2D0.equals((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) 0L, (java.lang.Comparable) 100.0d, (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = keyedObjects2D0.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        boolean boolean6 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = keyedObjects2D0.getObject((java.lang.Comparable) 2, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (2) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int8 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (short) 10);
        java.lang.Class<?> wildcardClass9 = keyedObjects2D1.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int6 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = keyedObjects2D0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        java.lang.Class<?> wildcardClass10 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int9 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1), (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = keyedObjects2D0.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int13 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = keyedObjects2D0.getObject(2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D0.removeRow((int) (short) 0);
        java.util.List list31 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = keyedObjects2D0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        int int21 = keyedObjects2D10.getRowCount();
        boolean boolean23 = keyedObjects2D10.equals((java.lang.Object) 0L);
        java.lang.Comparable comparable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D10.removeObject(comparable24, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list3 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = keyedObjects2D0.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        java.lang.Class<?> wildcardClass9 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeRow((java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = keyedObjects2D0.getObject((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.util.List list21 = keyedObjects2D20.getRowKeys();
        java.lang.Object obj22 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) false, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        java.lang.Comparable comparable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeColumn(comparable20);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (null) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        java.lang.Class<?> wildcardClass9 = list8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int9 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = keyedObjects2D0.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int8 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        int int7 = keyedObjects2D1.getRowIndex((java.lang.Comparable) 2);
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.setObject((java.lang.Object) 100.0d, (java.lang.Comparable) "", comparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        java.lang.Class<?> wildcardClass7 = keyedObjects2D0.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        java.lang.Object obj9 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = keyedObjects2D0.getObject((java.lang.Comparable) true, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (true) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (#) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.util.List list21 = keyedObjects2D20.getRowKeys();
        java.lang.Object obj22 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) false, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (100.0) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        java.util.List list10 = keyedObjects2D0.getColumnKeys();
        int int11 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = keyedObjects2D0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D10.removeObject((java.lang.Comparable) 'a', comparable22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.util.List list8 = keyedObjects2D7.getRowKeys();
        java.lang.Object obj9 = keyedObjects2D7.clone();
        boolean boolean10 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D7.removeColumn(comparable11);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (null) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        keyedObjects2D9.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj18 = null;
        boolean boolean19 = keyedObjects2D9.equals(obj18);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) boolean19);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = keyedObjects2D0.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        java.lang.Class<?> wildcardClass6 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = keyedObjects2D0.getObject((java.lang.Comparable) '4', (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (4) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        java.lang.Object obj7 = keyedObjects2D1.clone();
        java.util.List list8 = keyedObjects2D1.getRowKeys();
        int int10 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = keyedObjects2D1.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list3 = keyedObjects2D0.getRowKeys();
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = keyedObjects2D0.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.lang.Object obj6 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        java.lang.Comparable comparable43 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeObject((java.lang.Comparable) "hi!", comparable43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeRow((int) (byte) 0);
        java.lang.Object obj8 = keyedObjects2D0.clone();
        int int10 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = keyedObjects2D0.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = keyedObjects2D0.getObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        java.util.List list10 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        int int21 = keyedObjects2D10.getRowCount();
        boolean boolean23 = keyedObjects2D10.equals((java.lang.Object) 0L);
        keyedObjects2D10.removeObject((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D10.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Comparable comparable19 = null;
        int int20 = keyedObjects2D0.getColumnIndex(comparable19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = keyedObjects2D0.getObject((int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list25 = keyedObjects2D20.getRowKeys();
        int int26 = keyedObjects2D20.getRowCount();
        java.util.List list27 = keyedObjects2D20.getColumnKeys();
        keyedObjects2D20.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int33 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) '4');
        boolean boolean34 = keyedObjects2D8.equals((java.lang.Object) int33);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeColumn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeObject(comparable8, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        int int31 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = keyedObjects2D0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        int int21 = keyedObjects2D10.getRowCount();
        int int22 = keyedObjects2D10.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        int int25 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) 0.0d);
        int int27 = keyedObjects2D23.getRowIndex((java.lang.Comparable) 'a');
        int int29 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) 10.0d);
        int int30 = keyedObjects2D23.getColumnCount();
        int int31 = keyedObjects2D23.getRowCount();
        int int33 = keyedObjects2D23.getRowIndex((java.lang.Comparable) 100.0f);
        int int35 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) false);
        keyedObjects2D10.addObject((java.lang.Object) false, (java.lang.Comparable) 1, (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable40 = keyedObjects2D10.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D19.addObject((java.lang.Object) keyedObjects2D20, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj24 = keyedObjects2D20.clone();
        int int25 = keyedObjects2D20.getColumnCount();
        java.lang.Object obj26 = keyedObjects2D20.clone();
        java.util.List list27 = keyedObjects2D20.getRowKeys();
        boolean boolean28 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable30 = keyedObjects2D20.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D0.removeRow((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        java.util.List list10 = keyedObjects2D0.getColumnKeys();
        int int11 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = keyedObjects2D0.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = keyedObjects2D0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        java.util.List list6 = keyedObjects2D1.getColumnKeys();
        int int7 = keyedObjects2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = keyedObjects2D1.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeRow((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        boolean boolean14 = keyedObjects2D8.equals((java.lang.Object) (short) 10);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0, (java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        int int20 = keyedObjects2D18.getColumnIndex((java.lang.Comparable) 0.0d);
        int int22 = keyedObjects2D18.getRowIndex((java.lang.Comparable) 'a');
        int int24 = keyedObjects2D18.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.util.List list26 = keyedObjects2D25.getRowKeys();
        java.lang.Object obj27 = keyedObjects2D25.clone();
        boolean boolean28 = keyedObjects2D18.equals((java.lang.Object) keyedObjects2D25);
        keyedObjects2D8.addObject((java.lang.Object) boolean28, (java.lang.Comparable) 100L, (java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeRow((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        int int10 = keyedObjects2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeColumn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        java.util.List list10 = keyedObjects2D0.getColumnKeys();
        int int11 = keyedObjects2D0.getColumnCount();
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(comparable12);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (null) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable18 = keyedObjects2D0.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D0.addObject((java.lang.Object) int25, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = keyedObjects2D0.getObject((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0f + "'", comparable18, 10.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        boolean boolean10 = keyedObjects2D0.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass11 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        java.lang.Object obj8 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        int int30 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (false) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = keyedObjects2D0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        keyedObjects2D1.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 100);
        int int14 = keyedObjects2D1.getRowIndex((java.lang.Comparable) "");
        int int15 = keyedObjects2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = keyedObjects2D1.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) 100);
        java.util.List list12 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = keyedObjects2D0.getObject(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = keyedObjects2D0.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int5 = keyedObjects2D0.getColumnCount();
        int int7 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = keyedObjects2D0.getRowKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable6 = keyedObjects2D0.getRowKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = keyedObjects2D0.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 100L + "'", comparable6, 100L);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D19.addObject((java.lang.Object) keyedObjects2D20, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj24 = keyedObjects2D20.clone();
        int int25 = keyedObjects2D20.getColumnCount();
        java.lang.Object obj26 = keyedObjects2D20.clone();
        java.util.List list27 = keyedObjects2D20.getRowKeys();
        boolean boolean28 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = keyedObjects2D0.getObject((int) (byte) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj14 = keyedObjects2D9.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D15.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int21 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 0L);
        int int22 = keyedObjects2D15.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) int22, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int27 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.util.List list29 = keyedObjects2D28.getRowKeys();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj33 = null;
        boolean boolean34 = keyedObjects2D9.equals(obj33);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D35.getRowCount();
        int int38 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj39 = keyedObjects2D35.clone();
        int int40 = keyedObjects2D35.getColumnCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        boolean boolean44 = keyedObjects2D7.equals((java.lang.Object) keyedObjects2D9);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D7.removeColumn((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        int int10 = keyedObjects2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = keyedObjects2D1.getObject((java.lang.Comparable) 1, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = keyedObjects2D0.getObject((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int6 = keyedObjects2D0.getColumnCount();
        java.lang.Class<?> wildcardClass7 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int11 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = keyedObjects2D0.getObject((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        java.lang.Object obj7 = keyedObjects2D1.clone();
        java.util.List list8 = keyedObjects2D1.getRowKeys();
        java.util.List list9 = keyedObjects2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = keyedObjects2D1.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = keyedObjects2D0.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        int int21 = keyedObjects2D10.getRowCount();
        java.lang.Class<?> wildcardClass22 = keyedObjects2D10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int9 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = keyedObjects2D0.getObject(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        java.util.List list10 = keyedObjects2D0.getColumnKeys();
        int int11 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        int int30 = keyedObjects2D0.getRowCount();
        int int31 = keyedObjects2D0.getRowCount();
        java.lang.Object obj32 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = keyedObjects2D0.getObject((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj14 = keyedObjects2D9.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D15.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int21 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 0L);
        int int22 = keyedObjects2D15.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) int22, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int27 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.util.List list29 = keyedObjects2D28.getRowKeys();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj33 = null;
        boolean boolean34 = keyedObjects2D9.equals(obj33);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D35.getRowCount();
        int int38 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj39 = keyedObjects2D35.clone();
        int int40 = keyedObjects2D35.getColumnCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        boolean boolean44 = keyedObjects2D7.equals((java.lang.Object) keyedObjects2D9);
        java.lang.Comparable comparable46 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D7.removeObject((java.lang.Comparable) '4', comparable46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list25 = keyedObjects2D20.getRowKeys();
        int int26 = keyedObjects2D20.getRowCount();
        java.util.List list27 = keyedObjects2D20.getColumnKeys();
        keyedObjects2D20.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int33 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) '4');
        boolean boolean34 = keyedObjects2D8.equals((java.lang.Object) int33);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeColumn((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj2 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D0.setObject((java.lang.Object) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = keyedObjects2D0.getObject((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        int int5 = keyedObjects2D0.getRowCount();
        java.lang.Class<?> wildcardClass6 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.util.List list8 = keyedObjects2D7.getRowKeys();
        java.lang.Object obj9 = keyedObjects2D7.clone();
        boolean boolean10 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = keyedObjects2D7.getRowKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = keyedObjects2D0.getObject((java.lang.Comparable) 1, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) "");
        int int7 = keyedObjects2D0.getColumnCount();
        java.util.List list8 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        int int21 = keyedObjects2D10.getRowCount();
        java.lang.Object obj22 = keyedObjects2D10.clone();
        java.lang.Class<?> wildcardClass23 = keyedObjects2D10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = keyedObjects2D0.getColumnKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        boolean boolean14 = keyedObjects2D8.equals((java.lang.Object) (short) 10);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0, (java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        int int20 = keyedObjects2D18.getColumnIndex((java.lang.Comparable) 0.0d);
        int int22 = keyedObjects2D18.getRowIndex((java.lang.Comparable) 'a');
        int int24 = keyedObjects2D18.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.util.List list26 = keyedObjects2D25.getRowKeys();
        java.lang.Object obj27 = keyedObjects2D25.clone();
        boolean boolean28 = keyedObjects2D18.equals((java.lang.Object) keyedObjects2D25);
        keyedObjects2D8.addObject((java.lang.Object) boolean28, (java.lang.Comparable) 100L, (java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeRow((java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = keyedObjects2D0.getObject((java.lang.Comparable) (-1L), (java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = keyedObjects2D1.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int6 = keyedObjects2D0.getRowCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = keyedObjects2D0.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        int int14 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list15 = keyedObjects2D8.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        int int20 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = keyedObjects2D8.getRowKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D0.removeRow((int) (short) 0);
        keyedObjects2D0.removeRow((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list25 = keyedObjects2D20.getRowKeys();
        int int26 = keyedObjects2D20.getRowCount();
        java.util.List list27 = keyedObjects2D20.getColumnKeys();
        keyedObjects2D20.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int33 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) '4');
        boolean boolean34 = keyedObjects2D8.equals((java.lang.Object) int33);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeRow((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int26 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = keyedObjects2D0.getObject((java.lang.Comparable) false, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (false) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int6 = keyedObjects2D0.getRowCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject(2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D11.addObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj16 = keyedObjects2D12.clone();
        int int17 = keyedObjects2D12.getColumnCount();
        int int19 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (short) 10);
        int int20 = keyedObjects2D12.getColumnCount();
        java.lang.Class<?> wildcardClass21 = keyedObjects2D12.getClass();
        boolean boolean22 = keyedObjects2D0.equals((java.lang.Object) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = keyedObjects2D0.getColumnKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        int int6 = keyedObjects2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = keyedObjects2D1.getObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj17 = keyedObjects2D12.clone();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D21.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj28 = keyedObjects2D21.getObject(0, 0);
        boolean boolean29 = keyedObjects2D12.equals((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable31 = keyedObjects2D12.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = keyedObjects2D0.getObject((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj14 = keyedObjects2D9.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D15.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int21 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 0L);
        int int22 = keyedObjects2D15.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) int22, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int27 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.util.List list29 = keyedObjects2D28.getRowKeys();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj33 = null;
        boolean boolean34 = keyedObjects2D9.equals(obj33);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D35.getRowCount();
        int int38 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj39 = keyedObjects2D35.clone();
        int int40 = keyedObjects2D35.getColumnCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        boolean boolean44 = keyedObjects2D7.equals((java.lang.Object) keyedObjects2D9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable46 = keyedObjects2D9.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int8 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = keyedObjects2D0.getObject((int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        int int27 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = keyedObjects2D0.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int9 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = keyedObjects2D0.getColumnKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        boolean boolean14 = keyedObjects2D8.equals((java.lang.Object) (short) 10);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0, (java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        int int20 = keyedObjects2D18.getColumnIndex((java.lang.Comparable) 0.0d);
        int int22 = keyedObjects2D18.getRowIndex((java.lang.Comparable) 'a');
        int int24 = keyedObjects2D18.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.util.List list26 = keyedObjects2D25.getRowKeys();
        java.lang.Object obj27 = keyedObjects2D25.clone();
        boolean boolean28 = keyedObjects2D18.equals((java.lang.Object) keyedObjects2D25);
        keyedObjects2D8.addObject((java.lang.Object) boolean28, (java.lang.Comparable) 100L, (java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = keyedObjects2D8.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj14 = keyedObjects2D9.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D15.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int21 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 0L);
        int int22 = keyedObjects2D15.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) int22, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int27 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.util.List list29 = keyedObjects2D28.getRowKeys();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj33 = null;
        boolean boolean34 = keyedObjects2D9.equals(obj33);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D35.getRowCount();
        int int38 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj39 = keyedObjects2D35.clone();
        int int40 = keyedObjects2D35.getColumnCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        boolean boolean44 = keyedObjects2D7.equals((java.lang.Object) keyedObjects2D9);
        int int45 = keyedObjects2D9.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = keyedObjects2D9.getObject((java.lang.Comparable) "hi!", (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (hi!) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        boolean boolean14 = keyedObjects2D8.equals((java.lang.Object) (short) 10);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0, (java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeColumn((java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (true) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        int int30 = keyedObjects2D0.getRowCount();
        int int31 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D7.removeColumn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        keyedObjects2D1.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 100);
        int int14 = keyedObjects2D1.getRowIndex((java.lang.Comparable) "");
        java.lang.Object obj15 = keyedObjects2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeColumn((java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        java.lang.Object obj8 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D9.addObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj14 = keyedObjects2D10.clone();
        keyedObjects2D10.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        int int19 = keyedObjects2D10.getColumnCount();
        keyedObjects2D0.addObject((java.lang.Object) int19, (java.lang.Comparable) 1L, (java.lang.Comparable) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = keyedObjects2D0.getObject((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int8 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D9.setObject((java.lang.Object) 10.0f, (java.lang.Comparable) 'a', (java.lang.Comparable) 10L);
        java.lang.Class<?> wildcardClass18 = keyedObjects2D9.getClass();
        keyedObjects2D1.setObject((java.lang.Object) wildcardClass18, (java.lang.Comparable) (-1L), (java.lang.Comparable) 3);
        java.util.List list22 = keyedObjects2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeColumn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        int int8 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0.0d);
        int int10 = keyedObjects2D6.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj11 = keyedObjects2D6.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D12.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int18 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0L);
        int int19 = keyedObjects2D12.getRowCount();
        keyedObjects2D6.setObject((java.lang.Object) int19, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int24 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.util.List list26 = keyedObjects2D25.getRowKeys();
        keyedObjects2D6.setObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj30 = null;
        boolean boolean31 = keyedObjects2D6.equals(obj30);
        keyedObjects2D6.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D6.removeRow((int) (short) 0);
        java.util.List list37 = keyedObjects2D6.getColumnKeys();
        java.util.List list38 = keyedObjects2D6.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj2 = keyedObjects2D0.clone();
        java.util.List list3 = keyedObjects2D0.getRowKeys();
        int int4 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        keyedObjects2D9.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj18 = null;
        boolean boolean19 = keyedObjects2D9.equals(obj18);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) boolean19);
        int int21 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = keyedObjects2D0.getObject((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int8 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (short) 10);
        int int9 = keyedObjects2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = keyedObjects2D1.getColumnKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        java.util.List list9 = keyedObjects2D0.getColumnKeys();
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeObject((java.lang.Comparable) 100, comparable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.util.List list6 = keyedObjects2D5.getRowKeys();
        java.lang.Object obj7 = keyedObjects2D5.clone();
        keyedObjects2D0.addObject(obj7, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        int int11 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int9 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        keyedObjects2D0.setObject((java.lang.Object) 1L, (java.lang.Comparable) 1, (java.lang.Comparable) 1.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.addObject((java.lang.Object) keyedObjects2D15, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int19 = keyedObjects2D15.getRowCount();
        java.util.List list20 = keyedObjects2D15.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) list20, (java.lang.Comparable) 'a', (java.lang.Comparable) 3);
        java.lang.Class<?> wildcardClass24 = keyedObjects2D0.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable6 = keyedObjects2D0.getRowKey(0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 100L + "'", comparable6, 100L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list3 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        int int6 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D4.getRowIndex((java.lang.Comparable) 'a');
        int int10 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list11 = keyedObjects2D4.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list11, (java.lang.Comparable) 100L, (java.lang.Comparable) 0);
        java.util.List list15 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = keyedObjects2D0.getObject((java.lang.Comparable) "hi!", (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (hi!) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = keyedObjects2D19.getColumnKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) 10.0d);
        int int5 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        java.lang.Class<?> wildcardClass6 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        int int27 = keyedObjects2D26.getRowCount();
        int int29 = keyedObjects2D26.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj30 = keyedObjects2D26.clone();
        int int31 = keyedObjects2D26.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D26, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        keyedObjects2D26.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.lang.Class<?> wildcardClass38 = keyedObjects2D26.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        int int21 = keyedObjects2D10.getRowCount();
        boolean boolean23 = keyedObjects2D10.equals((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D10.removeColumn((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        int int27 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = keyedObjects2D0.getObject((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj13 = keyedObjects2D6.getObject(0, 0);
        keyedObjects2D0.setObject((java.lang.Object) 0, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = keyedObjects2D0.getObject((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list25 = keyedObjects2D20.getRowKeys();
        int int26 = keyedObjects2D20.getRowCount();
        java.util.List list27 = keyedObjects2D20.getColumnKeys();
        keyedObjects2D20.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int33 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) '4');
        boolean boolean34 = keyedObjects2D8.equals((java.lang.Object) int33);
        java.lang.Comparable comparable35 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeObject(comparable35, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int8 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = keyedObjects2D0.getRowCount();
        int int11 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = keyedObjects2D0.getObject((java.lang.Comparable) ' ', (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key ( ) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        int int30 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable18 = keyedObjects2D0.getColumnKey((int) (short) 0);
        int int19 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = keyedObjects2D0.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0f + "'", comparable18, 10.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        java.util.List list9 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = keyedObjects2D0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D5.addObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int11 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list12 = keyedObjects2D5.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) list12, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 0);
        java.lang.Object obj16 = keyedObjects2D0.clone();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = keyedObjects2D0.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int26 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D0.removeRow((int) (short) 0);
        java.lang.Object obj31 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        int int7 = keyedObjects2D1.getRowIndex((java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeRow((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        java.lang.Object obj10 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = keyedObjects2D0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 100L);
        java.util.List list11 = keyedObjects2D7.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        int int18 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 10.0d);
        int int19 = keyedObjects2D12.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.addObject((java.lang.Object) keyedObjects2D21, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj25 = keyedObjects2D21.clone();
        keyedObjects2D21.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj30 = null;
        boolean boolean31 = keyedObjects2D21.equals(obj30);
        boolean boolean32 = keyedObjects2D12.equals((java.lang.Object) boolean31);
        int int34 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D7.addObject((java.lang.Object) (byte) -1, (java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable39 = keyedObjects2D7.getColumnKey((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D7.removeColumn((java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + (byte) 100 + "'", comparable39, (byte) 100);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        boolean boolean14 = keyedObjects2D8.equals((java.lang.Object) (short) 10);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0, (java.lang.Comparable) true);
        int int19 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = keyedObjects2D0.getColumnKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int24 = keyedObjects2D0.getRowCount();
        java.util.List list25 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = keyedObjects2D0.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getColumnCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.util.List list21 = keyedObjects2D20.getRowKeys();
        java.lang.Object obj22 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) false, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = keyedObjects2D0.getObject((int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = keyedObjects2D0.getObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        java.util.List list10 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int24 = keyedObjects2D0.getRowCount();
        java.util.List list25 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = keyedObjects2D0.getObject((java.lang.Comparable) "hi!", (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (hi!) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) 10.0d);
        int int5 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        int int8 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0.0d);
        int int10 = keyedObjects2D6.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D6.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list14 = keyedObjects2D6.getColumnKeys();
        boolean boolean15 = keyedObjects2D0.equals((java.lang.Object) list14);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable18 = keyedObjects2D0.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D0.addObject((java.lang.Object) int25, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0f + "'", comparable18, 10.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        java.util.List list6 = keyedObjects2D1.getColumnKeys();
        java.util.List list7 = keyedObjects2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = keyedObjects2D1.getRowKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Comparable comparable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = keyedObjects2D0.getObject(comparable19, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeRow((int) (byte) 0);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = keyedObjects2D0.getRowKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        keyedObjects2D8.addObject((java.lang.Object) ' ', (java.lang.Comparable) "hi!", (java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeRow((java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = keyedObjects2D0.getObject((int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = keyedObjects2D19.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D25.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list30 = keyedObjects2D25.getRowKeys();
        int int31 = keyedObjects2D25.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D32.addObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj37 = keyedObjects2D33.clone();
        int int38 = keyedObjects2D33.getColumnCount();
        int int40 = keyedObjects2D33.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean41 = keyedObjects2D25.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable43 = keyedObjects2D25.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D44 = new org.jfree.data.KeyedObjects2D();
        int int46 = keyedObjects2D44.getColumnIndex((java.lang.Comparable) 0.0d);
        int int48 = keyedObjects2D44.getRowIndex((java.lang.Comparable) 'a');
        int int50 = keyedObjects2D44.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D25.addObject((java.lang.Object) int50, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        boolean boolean54 = keyedObjects2D19.equals((java.lang.Object) keyedObjects2D25);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D25.removeRow((java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10.0f + "'", comparable43, 10.0f);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D0.getRowCount();
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(comparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        java.lang.Object obj9 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        int int14 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list15 = keyedObjects2D8.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        int int20 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeColumn((java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (#) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = keyedObjects2D10.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int11 = keyedObjects2D0.getColumnCount();
        int int12 = keyedObjects2D0.getRowCount();
        java.util.List list13 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = keyedObjects2D0.getObject((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        int int14 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 10.0d);
        int int15 = keyedObjects2D8.getColumnCount();
        int int16 = keyedObjects2D8.getRowCount();
        int int18 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        int int24 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 0.0d);
        int int26 = keyedObjects2D22.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj27 = keyedObjects2D22.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D28.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int34 = keyedObjects2D28.getColumnIndex((java.lang.Comparable) 0L);
        int int35 = keyedObjects2D28.getRowCount();
        keyedObjects2D22.setObject((java.lang.Object) int35, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int40 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        java.util.List list42 = keyedObjects2D41.getRowKeys();
        keyedObjects2D22.setObject((java.lang.Object) keyedObjects2D41, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj46 = null;
        boolean boolean47 = keyedObjects2D22.equals(obj46);
        keyedObjects2D22.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D22.removeRow((int) (short) 0);
        java.util.List list53 = keyedObjects2D22.getColumnKeys();
        keyedObjects2D8.addObject((java.lang.Object) list53, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 2);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) ' ', (java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable61 = keyedObjects2D0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(list53);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = keyedObjects2D0.getColumnKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.util.List list8 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = keyedObjects2D0.getObject((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (a) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        int int43 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = keyedObjects2D0.getObject((int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj2 = keyedObjects2D0.clone();
        java.util.List list3 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D19.addObject((java.lang.Object) keyedObjects2D20, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj24 = keyedObjects2D20.clone();
        int int25 = keyedObjects2D20.getColumnCount();
        java.lang.Object obj26 = keyedObjects2D20.clone();
        java.util.List list27 = keyedObjects2D20.getRowKeys();
        boolean boolean28 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D20);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D20.removeColumn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Comparable comparable19 = null;
        int int20 = keyedObjects2D0.getColumnIndex(comparable19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = keyedObjects2D0.getObject(3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 100L);
        java.util.List list11 = keyedObjects2D7.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        int int18 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 10.0d);
        int int19 = keyedObjects2D12.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.addObject((java.lang.Object) keyedObjects2D21, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj25 = keyedObjects2D21.clone();
        keyedObjects2D21.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj30 = null;
        boolean boolean31 = keyedObjects2D21.equals(obj30);
        boolean boolean32 = keyedObjects2D12.equals((java.lang.Object) boolean31);
        int int34 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D7.addObject((java.lang.Object) (byte) -1, (java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 100);
        keyedObjects2D7.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D7.removeRow((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        int int5 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = keyedObjects2D0.getRowKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.util.List list6 = keyedObjects2D5.getRowKeys();
        java.lang.Object obj7 = keyedObjects2D5.clone();
        keyedObjects2D0.addObject(obj7, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        int int11 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        boolean boolean34 = keyedObjects2D31.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean39 = keyedObjects2D0.equals((java.lang.Object) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D40.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D40.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.util.List list48 = keyedObjects2D40.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D40, (java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = keyedObjects2D40.getObject((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) 0L, (java.lang.Comparable) 100.0d, (java.lang.Comparable) false);
        int int14 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.List list15 = keyedObjects2D0.getColumnKeys();
        java.lang.Class<?> wildcardClass16 = list15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = keyedObjects2D0.getObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        java.util.List list9 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 1L, (java.lang.Comparable) (-1.0f));
        keyedObjects2D0.removeRow((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = keyedObjects2D0.getObject((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.util.List list21 = keyedObjects2D20.getRowKeys();
        java.lang.Object obj22 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) false, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        int int28 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 0.0d);
        int int30 = keyedObjects2D26.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D26.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list34 = keyedObjects2D26.getColumnKeys();
        keyedObjects2D26.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) 0.0f);
        boolean boolean38 = keyedObjects2D0.equals((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        java.lang.Class<?> wildcardClass7 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        java.lang.Object obj2 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = keyedObjects2D0.getObject(10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int24 = keyedObjects2D0.getRowCount();
        java.util.List list25 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = keyedObjects2D0.getObject((java.lang.Comparable) 'a', (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (a) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = keyedObjects2D0.getObject((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list3 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        int int6 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D4.getRowIndex((java.lang.Comparable) 'a');
        int int10 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list11 = keyedObjects2D4.getRowKeys();
        java.util.List list12 = keyedObjects2D4.getColumnKeys();
        java.util.List list13 = keyedObjects2D4.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D4, (java.lang.Comparable) 'a', (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass4 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D0.getRowCount();
        java.lang.Comparable comparable9 = null;
        int int10 = keyedObjects2D0.getRowIndex(comparable9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.util.List list6 = keyedObjects2D5.getRowKeys();
        java.lang.Object obj7 = keyedObjects2D5.clone();
        keyedObjects2D0.addObject(obj7, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        java.lang.Object obj11 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int13 = keyedObjects2D12.getRowCount();
        java.lang.Object obj14 = keyedObjects2D12.clone();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.util.List list6 = keyedObjects2D5.getRowKeys();
        java.lang.Object obj7 = keyedObjects2D5.clone();
        keyedObjects2D0.addObject(obj7, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        int int11 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        int int5 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable32 = keyedObjects2D0.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        java.util.List list9 = keyedObjects2D0.getColumnKeys();
        java.lang.Comparable comparable11 = keyedObjects2D0.getColumnKey((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 100.0d + "'", comparable11, 100.0d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = keyedObjects2D0.getColumnKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        keyedObjects2D9.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj18 = null;
        boolean boolean19 = keyedObjects2D9.equals(obj18);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) boolean19);
        int int21 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        int int24 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 0.0d);
        int int26 = keyedObjects2D22.getRowIndex((java.lang.Comparable) 'a');
        int int28 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list29 = keyedObjects2D22.getRowKeys();
        java.util.List list30 = keyedObjects2D22.getColumnKeys();
        int int32 = keyedObjects2D22.getRowIndex((java.lang.Comparable) (byte) 100);
        int int33 = keyedObjects2D22.getColumnCount();
        int int34 = keyedObjects2D22.getRowCount();
        java.util.List list35 = keyedObjects2D22.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) list35, (java.lang.Comparable) (-1), (java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = keyedObjects2D0.getObject((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D9.getRowCount();
        int int12 = keyedObjects2D9.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D9.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int16 = keyedObjects2D9.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D17.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj24 = keyedObjects2D17.getObject(0, 0);
        int int25 = keyedObjects2D17.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D17, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        boolean boolean29 = keyedObjects2D0.equals((java.lang.Object) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int37 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 0.0d);
        int int39 = keyedObjects2D35.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D35.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        int int45 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 0.0d);
        int int47 = keyedObjects2D43.getRowIndex((java.lang.Comparable) 'a');
        int int49 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list50 = keyedObjects2D43.getRowKeys();
        keyedObjects2D35.setObject((java.lang.Object) keyedObjects2D43, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        int int55 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 100);
        boolean boolean56 = keyedObjects2D31.equals((java.lang.Object) keyedObjects2D43);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) true, (java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = keyedObjects2D31.getObject((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0f) + "'", obj24, (-1.0f));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj10 = null;
        boolean boolean11 = keyedObjects2D1.equals(obj10);
        int int13 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = keyedObjects2D1.getObject((int) (short) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Comparable comparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(comparable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int13 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getRowIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = keyedObjects2D0.getObject((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj17 = keyedObjects2D12.clone();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = keyedObjects2D12.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        java.lang.Object obj8 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D9.addObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj14 = keyedObjects2D10.clone();
        keyedObjects2D10.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        int int19 = keyedObjects2D10.getColumnCount();
        keyedObjects2D0.addObject((java.lang.Object) int19, (java.lang.Comparable) 1L, (java.lang.Comparable) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = keyedObjects2D0.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = keyedObjects2D0.getObject((int) (short) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D0.removeRow((int) (short) 0);
        keyedObjects2D0.removeRow((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable34 = keyedObjects2D0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) 1.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) '#');
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        int int16 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0.0d);
        int int18 = keyedObjects2D14.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj19 = keyedObjects2D14.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int26 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 0L);
        int int27 = keyedObjects2D20.getRowCount();
        keyedObjects2D14.setObject((java.lang.Object) int27, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int32 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        java.util.List list34 = keyedObjects2D33.getRowKeys();
        keyedObjects2D14.setObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D38.addObject((java.lang.Object) keyedObjects2D39, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int43 = keyedObjects2D39.getRowCount();
        boolean boolean44 = keyedObjects2D14.equals((java.lang.Object) int43);
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = new org.jfree.data.KeyedObjects2D();
        int int46 = keyedObjects2D45.getRowCount();
        boolean boolean48 = keyedObjects2D45.equals((java.lang.Object) 10.0d);
        keyedObjects2D14.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean53 = keyedObjects2D14.equals((java.lang.Object) 10L);
        int int55 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D14, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (1.0) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.util.List list6 = keyedObjects2D5.getRowKeys();
        java.lang.Object obj7 = keyedObjects2D5.clone();
        keyedObjects2D0.addObject(obj7, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        java.lang.Object obj11 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int13 = keyedObjects2D12.getRowCount();
        java.lang.Object obj14 = keyedObjects2D12.clone();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = keyedObjects2D0.getObject((java.lang.Comparable) (-1), (java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D19.addObject((java.lang.Object) keyedObjects2D20, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj24 = keyedObjects2D20.clone();
        int int25 = keyedObjects2D20.getColumnCount();
        java.lang.Object obj26 = keyedObjects2D20.clone();
        java.util.List list27 = keyedObjects2D20.getRowKeys();
        boolean boolean28 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D20);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D20.removeColumn((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = keyedObjects2D0.getObject((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int17 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 1);
        boolean boolean18 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 100L);
        int int11 = keyedObjects2D7.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        int int18 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 10.0d);
        int int19 = keyedObjects2D12.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.addObject((java.lang.Object) keyedObjects2D21, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj25 = keyedObjects2D21.clone();
        keyedObjects2D21.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj30 = null;
        boolean boolean31 = keyedObjects2D21.equals(obj30);
        boolean boolean32 = keyedObjects2D12.equals((java.lang.Object) boolean31);
        int int33 = keyedObjects2D12.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D34.getColumnIndex((java.lang.Comparable) 0.0d);
        int int38 = keyedObjects2D34.getRowIndex((java.lang.Comparable) 'a');
        int int40 = keyedObjects2D34.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list41 = keyedObjects2D34.getRowKeys();
        java.util.List list42 = keyedObjects2D34.getColumnKeys();
        int int44 = keyedObjects2D34.getRowIndex((java.lang.Comparable) (byte) 100);
        int int45 = keyedObjects2D34.getColumnCount();
        int int46 = keyedObjects2D34.getRowCount();
        java.util.List list47 = keyedObjects2D34.getColumnKeys();
        keyedObjects2D12.setObject((java.lang.Object) list47, (java.lang.Comparable) (-1), (java.lang.Comparable) 0L);
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 3);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D7.removeRow(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(list47);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        int int14 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list15 = keyedObjects2D8.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeRow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable18 = keyedObjects2D0.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D0.addObject((java.lang.Object) int25, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        int int29 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0f + "'", comparable18, 10.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) (byte) 100);
        boolean boolean5 = keyedObjects2D0.equals((java.lang.Object) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.addObject((java.lang.Object) keyedObjects2D7, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj11 = keyedObjects2D7.clone();
        int int12 = keyedObjects2D7.getColumnCount();
        int int14 = keyedObjects2D7.getRowIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        int int17 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 0.0d);
        int int19 = keyedObjects2D15.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D15.setObject((java.lang.Object) 10.0f, (java.lang.Comparable) 'a', (java.lang.Comparable) 10L);
        java.lang.Class<?> wildcardClass24 = keyedObjects2D15.getClass();
        keyedObjects2D7.setObject((java.lang.Object) wildcardClass24, (java.lang.Comparable) (-1L), (java.lang.Comparable) 3);
        java.util.List list28 = keyedObjects2D7.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list28, (java.lang.Comparable) '#', (java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 100L);
        java.util.List list11 = keyedObjects2D7.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        int int18 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 10.0d);
        int int19 = keyedObjects2D12.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.addObject((java.lang.Object) keyedObjects2D21, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj25 = keyedObjects2D21.clone();
        keyedObjects2D21.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj30 = null;
        boolean boolean31 = keyedObjects2D21.equals(obj30);
        boolean boolean32 = keyedObjects2D12.equals((java.lang.Object) boolean31);
        int int34 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D7.addObject((java.lang.Object) (byte) -1, (java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D7.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        java.util.List list6 = keyedObjects2D1.getColumnKeys();
        java.util.List list7 = keyedObjects2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D1.getObject((java.lang.Comparable) 100, (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        int int21 = keyedObjects2D10.getRowCount();
        int int22 = keyedObjects2D10.getRowCount();
        int int24 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D10.removeRow((java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        int int8 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0.0d);
        int int10 = keyedObjects2D6.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj11 = keyedObjects2D6.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D12.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int18 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0L);
        int int19 = keyedObjects2D12.getRowCount();
        keyedObjects2D6.setObject((java.lang.Object) int19, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int24 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.util.List list26 = keyedObjects2D25.getRowKeys();
        keyedObjects2D6.setObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj30 = null;
        boolean boolean31 = keyedObjects2D6.equals(obj30);
        keyedObjects2D6.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D6.removeRow((int) (short) 0);
        java.util.List list37 = keyedObjects2D6.getColumnKeys();
        java.util.List list38 = keyedObjects2D6.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        keyedObjects2D0.removeObject((java.lang.Comparable) 0, (java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int3 = keyedObjects2D0.getColumnCount();
        java.lang.Class<?> wildcardClass4 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        int int21 = keyedObjects2D10.getRowCount();
        boolean boolean23 = keyedObjects2D10.equals((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D10.removeRow((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        java.lang.Object obj6 = keyedObjects2D1.clone();
        keyedObjects2D1.removeObject((java.lang.Comparable) true, (java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = keyedObjects2D1.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D9.getRowCount();
        int int12 = keyedObjects2D9.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D9.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int16 = keyedObjects2D9.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D17.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj24 = keyedObjects2D17.getObject(0, 0);
        int int25 = keyedObjects2D17.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D17, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        boolean boolean29 = keyedObjects2D0.equals((java.lang.Object) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int37 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 0.0d);
        int int39 = keyedObjects2D35.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D35.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        int int45 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 0.0d);
        int int47 = keyedObjects2D43.getRowIndex((java.lang.Comparable) 'a');
        int int49 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list50 = keyedObjects2D43.getRowKeys();
        keyedObjects2D35.setObject((java.lang.Object) keyedObjects2D43, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        int int55 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 100);
        boolean boolean56 = keyedObjects2D31.equals((java.lang.Object) keyedObjects2D43);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) true, (java.lang.Comparable) (short) -1);
        java.lang.Class<?> wildcardClass60 = keyedObjects2D31.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0f) + "'", obj24, (-1.0f));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int8 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = keyedObjects2D0.getRowCount();
        int int11 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable43 = keyedObjects2D8.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int11 = keyedObjects2D0.getColumnCount();
        int int12 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = keyedObjects2D0.getRowKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D7, (java.lang.Comparable) 10, (java.lang.Comparable) 100);
        int int15 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = keyedObjects2D0.getColumnKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = keyedObjects2D8.getObject((int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1), (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        int int21 = keyedObjects2D10.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = keyedObjects2D10.getObject((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        java.lang.Object obj7 = keyedObjects2D1.clone();
        java.util.List list8 = keyedObjects2D1.getRowKeys();
        int int10 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (-1));
        java.lang.Comparable comparable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeObject(comparable11, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = keyedObjects2D1.getColumnKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = keyedObjects2D0.getObject((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.lang.Class<?> wildcardClass8 = keyedObjects2D0.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.util.List list17 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = keyedObjects2D0.getObject(10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj13 = keyedObjects2D6.getObject(0, 0);
        int int14 = keyedObjects2D6.getRowCount();
        int int15 = keyedObjects2D6.getRowCount();
        java.util.List list16 = keyedObjects2D6.getColumnKeys();
        int int17 = keyedObjects2D6.getRowCount();
        keyedObjects2D1.setObject((java.lang.Object) int17, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = keyedObjects2D1.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        keyedObjects2D1.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 100);
        int int14 = keyedObjects2D1.getRowIndex((java.lang.Comparable) "");
        java.lang.Object obj15 = keyedObjects2D1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = keyedObjects2D1.getObject((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int6 = keyedObjects2D0.getRowCount();
        java.lang.Object obj7 = keyedObjects2D0.clone();
        int int8 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj14 = keyedObjects2D9.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D15.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int21 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 0L);
        int int22 = keyedObjects2D15.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) int22, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int27 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.util.List list29 = keyedObjects2D28.getRowKeys();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj33 = null;
        boolean boolean34 = keyedObjects2D9.equals(obj33);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D35.getRowCount();
        int int38 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj39 = keyedObjects2D35.clone();
        int int40 = keyedObjects2D35.getColumnCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        keyedObjects2D0.addObject((java.lang.Object) (byte) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = keyedObjects2D0.getObject((java.lang.Comparable) 10L, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        int int30 = keyedObjects2D0.getRowCount();
        java.lang.Object obj31 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = keyedObjects2D0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        int int6 = keyedObjects2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeRow((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) 2, (java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D0.setObject((java.lang.Object) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (hi!) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        int int30 = keyedObjects2D0.getRowCount();
        java.lang.Object obj31 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (0) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeRow((int) (byte) 0);
        java.lang.Object obj8 = keyedObjects2D0.clone();
        int int10 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = keyedObjects2D0.getObject(1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj13 = keyedObjects2D6.getObject(0, 0);
        keyedObjects2D0.setObject((java.lang.Object) 0, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        int int10 = keyedObjects2D1.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D11.getRowCount();
        int int14 = keyedObjects2D11.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D1.setObject((java.lang.Object) keyedObjects2D11, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 1);
        keyedObjects2D11.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = keyedObjects2D11.getObject((java.lang.Comparable) (-1), (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj5 = keyedObjects2D0.clone();
        java.lang.Comparable comparable6 = null;
        int int7 = keyedObjects2D0.getRowIndex(comparable6);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        int int14 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 10.0d);
        java.lang.Class<?> wildcardClass15 = keyedObjects2D8.getClass();
        keyedObjects2D0.addObject((java.lang.Object) wildcardClass15, (java.lang.Comparable) 3, (java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        java.lang.Object obj9 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass10 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int17 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 1);
        boolean boolean18 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = keyedObjects2D8.getColumnKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        keyedObjects2D1.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeObject((java.lang.Comparable) 'a', comparable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        java.util.List list9 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        int int12 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = keyedObjects2D0.getObject((java.lang.Comparable) 100.0d, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        keyedObjects2D9.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj18 = null;
        boolean boolean19 = keyedObjects2D9.equals(obj18);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) boolean19);
        int int21 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        int int24 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 0.0d);
        int int26 = keyedObjects2D22.getRowIndex((java.lang.Comparable) 'a');
        int int28 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list29 = keyedObjects2D22.getRowKeys();
        java.util.List list30 = keyedObjects2D22.getColumnKeys();
        int int32 = keyedObjects2D22.getRowIndex((java.lang.Comparable) (byte) 100);
        int int33 = keyedObjects2D22.getColumnCount();
        int int34 = keyedObjects2D22.getRowCount();
        java.util.List list35 = keyedObjects2D22.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) list35, (java.lang.Comparable) (-1), (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        int int41 = keyedObjects2D39.getColumnIndex((java.lang.Comparable) 0.0d);
        int int43 = keyedObjects2D39.getRowIndex((java.lang.Comparable) 'a');
        int int45 = keyedObjects2D39.getColumnIndex((java.lang.Comparable) 10.0d);
        int int46 = keyedObjects2D39.getColumnCount();
        int int47 = keyedObjects2D39.getRowCount();
        int int49 = keyedObjects2D39.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D39.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D53 = new org.jfree.data.KeyedObjects2D();
        int int55 = keyedObjects2D53.getColumnIndex((java.lang.Comparable) 0.0d);
        int int57 = keyedObjects2D53.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj58 = keyedObjects2D53.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D59 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D59.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int65 = keyedObjects2D59.getColumnIndex((java.lang.Comparable) 0L);
        int int66 = keyedObjects2D59.getRowCount();
        keyedObjects2D53.setObject((java.lang.Object) int66, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int71 = keyedObjects2D53.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D72 = new org.jfree.data.KeyedObjects2D();
        java.util.List list73 = keyedObjects2D72.getRowKeys();
        keyedObjects2D53.setObject((java.lang.Object) keyedObjects2D72, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj77 = null;
        boolean boolean78 = keyedObjects2D53.equals(obj77);
        keyedObjects2D53.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D53.removeRow((int) (short) 0);
        java.util.List list84 = keyedObjects2D53.getColumnKeys();
        keyedObjects2D39.addObject((java.lang.Object) list84, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 2);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D39, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D39.removeRow((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(list84);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D5.addObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int11 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list12 = keyedObjects2D5.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) list12, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 0);
        java.util.List list16 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = keyedObjects2D0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int8 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (short) 10);
        int int9 = keyedObjects2D1.getColumnCount();
        int int10 = keyedObjects2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = keyedObjects2D1.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = keyedObjects2D0.getColumnKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getColumnCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) 10L, (java.lang.Comparable) 100.0d, (java.lang.Comparable) true);
        int int13 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D7, (java.lang.Comparable) 10, (java.lang.Comparable) 100);
        java.util.List list15 = keyedObjects2D7.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = keyedObjects2D7.getObject((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeRow((int) (byte) 0);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = keyedObjects2D0.getObject((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        java.util.List list9 = keyedObjects2D0.getColumnKeys();
        java.lang.Class<?> wildcardClass10 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeColumn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        java.util.List list30 = keyedObjects2D0.getColumnKeys();
        int int32 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = keyedObjects2D0.getObject((java.lang.Comparable) (short) 1, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable18 = keyedObjects2D0.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D0.addObject((java.lang.Object) int25, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        int int29 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) 3, (java.lang.Comparable) 0.0f);
        java.lang.Class<?> wildcardClass33 = keyedObjects2D0.getClass();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0f + "'", comparable18, 10.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) 0.0f);
        java.util.List list12 = keyedObjects2D0.getRowKeys();
        java.lang.Class<?> wildcardClass13 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int6 = keyedObjects2D0.getRowCount();
        java.lang.Object obj7 = keyedObjects2D0.clone();
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D10.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) (short) 0, (java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = keyedObjects2D0.getObject(2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D9.getRowCount();
        int int12 = keyedObjects2D9.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D9.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int16 = keyedObjects2D9.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D17.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj24 = keyedObjects2D17.getObject(0, 0);
        int int25 = keyedObjects2D17.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D17, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        boolean boolean29 = keyedObjects2D0.equals((java.lang.Object) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int37 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 0.0d);
        int int39 = keyedObjects2D35.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D35.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        int int45 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 0.0d);
        int int47 = keyedObjects2D43.getRowIndex((java.lang.Comparable) 'a');
        int int49 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list50 = keyedObjects2D43.getRowKeys();
        keyedObjects2D35.setObject((java.lang.Object) keyedObjects2D43, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        int int55 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 100);
        boolean boolean56 = keyedObjects2D31.equals((java.lang.Object) keyedObjects2D43);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) true, (java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D31.removeColumn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0f) + "'", obj24, (-1.0f));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = keyedObjects2D0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) 1.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) '#');
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        int int16 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0.0d);
        int int18 = keyedObjects2D14.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj19 = keyedObjects2D14.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int26 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 0L);
        int int27 = keyedObjects2D20.getRowCount();
        keyedObjects2D14.setObject((java.lang.Object) int27, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int32 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        java.util.List list34 = keyedObjects2D33.getRowKeys();
        keyedObjects2D14.setObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D38.addObject((java.lang.Object) keyedObjects2D39, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int43 = keyedObjects2D39.getRowCount();
        boolean boolean44 = keyedObjects2D14.equals((java.lang.Object) int43);
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = new org.jfree.data.KeyedObjects2D();
        int int46 = keyedObjects2D45.getRowCount();
        boolean boolean48 = keyedObjects2D45.equals((java.lang.Object) 10.0d);
        keyedObjects2D14.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean53 = keyedObjects2D14.equals((java.lang.Object) 10L);
        int int55 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D14, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 10);
        int int59 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        keyedObjects2D8.addObject((java.lang.Object) ' ', (java.lang.Comparable) "hi!", (java.lang.Comparable) 2);
        java.util.List list46 = keyedObjects2D8.getRowKeys();
        int int48 = keyedObjects2D8.getRowIndex((java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        int int10 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = keyedObjects2D0.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) 10.0d);
        int int5 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = keyedObjects2D0.getObject((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        java.lang.Object obj7 = keyedObjects2D1.clone();
        java.util.List list8 = keyedObjects2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int9 = keyedObjects2D0.getColumnCount();
        java.util.List list10 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int3 = keyedObjects2D0.getColumnCount();
        int int4 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int3 = keyedObjects2D0.getColumnCount();
        int int4 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = keyedObjects2D0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int3 = keyedObjects2D0.getColumnCount();
        int int4 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (0.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int6 = keyedObjects2D0.getRowCount();
        java.lang.Object obj7 = keyedObjects2D0.clone();
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D10.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) (short) 0, (java.lang.Comparable) "");
        java.lang.Class<?> wildcardClass18 = keyedObjects2D10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int7 = keyedObjects2D1.getColumnCount();
        java.util.List list8 = keyedObjects2D1.getRowKeys();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        boolean boolean14 = keyedObjects2D8.equals((java.lang.Object) (short) 10);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0, (java.lang.Comparable) true);
        int int18 = keyedObjects2D8.getRowCount();
        java.lang.Object obj19 = keyedObjects2D8.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D8.removeRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        int int7 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 0.0d);
        int int9 = keyedObjects2D5.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D5.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        int int15 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 0.0d);
        int int17 = keyedObjects2D13.getRowIndex((java.lang.Comparable) 'a');
        int int19 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list20 = keyedObjects2D13.getRowKeys();
        keyedObjects2D5.setObject((java.lang.Object) keyedObjects2D13, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        int int25 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 100);
        boolean boolean26 = keyedObjects2D1.equals((java.lang.Object) keyedObjects2D13);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeRow((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int9 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) '#');
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 2);
        int int14 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) 100);
        int int15 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.util.List list6 = keyedObjects2D5.getRowKeys();
        java.lang.Object obj7 = keyedObjects2D5.clone();
        keyedObjects2D0.addObject(obj7, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        java.lang.Object obj11 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = keyedObjects2D0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int9 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) '#');
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 2);
        int int14 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) 100);
        int int15 = keyedObjects2D0.getColumnCount();
        java.lang.Class<?> wildcardClass16 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        java.util.List list21 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) (byte) -1, (java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = keyedObjects2D0.getObject(100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int11 = keyedObjects2D0.getColumnCount();
        int int12 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        int int15 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 0.0d);
        int int17 = keyedObjects2D13.getRowIndex((java.lang.Comparable) 'a');
        int int19 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 10.0d);
        int int20 = keyedObjects2D13.getColumnCount();
        int int21 = keyedObjects2D13.getRowCount();
        java.lang.Object obj22 = keyedObjects2D13.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D23.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D23.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.util.List list31 = keyedObjects2D23.getColumnKeys();
        keyedObjects2D13.addObject((java.lang.Object) list31, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D35.getRowCount();
        int int38 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (byte) -1);
        int int40 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list41 = keyedObjects2D35.getColumnKeys();
        boolean boolean42 = keyedObjects2D13.equals((java.lang.Object) keyedObjects2D35);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D13, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable47 = keyedObjects2D13.getColumnKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) (byte) 100);
        boolean boolean5 = keyedObjects2D0.equals((java.lang.Object) (short) 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 0.0d, (java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (false) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        int int8 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0.0d);
        int int10 = keyedObjects2D6.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj11 = keyedObjects2D6.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D12.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int18 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0L);
        int int19 = keyedObjects2D12.getRowCount();
        keyedObjects2D6.setObject((java.lang.Object) int19, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int24 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.util.List list26 = keyedObjects2D25.getRowKeys();
        keyedObjects2D6.setObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj30 = null;
        boolean boolean31 = keyedObjects2D6.equals(obj30);
        keyedObjects2D6.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D6.removeRow((int) (short) 0);
        java.util.List list37 = keyedObjects2D6.getColumnKeys();
        java.util.List list38 = keyedObjects2D6.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        keyedObjects2D6.removeColumn((int) (short) 1);
        keyedObjects2D6.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) "hi!");
        java.lang.Class<?> wildcardClass47 = keyedObjects2D6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        int int8 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0.0d);
        int int10 = keyedObjects2D6.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D6.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        int int16 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0.0d);
        int int18 = keyedObjects2D14.getRowIndex((java.lang.Comparable) 'a');
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list21 = keyedObjects2D14.getRowKeys();
        keyedObjects2D6.setObject((java.lang.Object) keyedObjects2D14, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        keyedObjects2D0.addObject((java.lang.Object) (short) 1, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = keyedObjects2D0.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 100L);
        java.util.List list11 = keyedObjects2D7.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D7.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int8 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (short) 10);
        int int10 = keyedObjects2D1.getRowIndex((java.lang.Comparable) 1.0f);
        int int11 = keyedObjects2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D1.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) 10.0d);
        int int5 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        int int8 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0.0d);
        int int10 = keyedObjects2D6.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D6.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list14 = keyedObjects2D6.getColumnKeys();
        boolean boolean15 = keyedObjects2D0.equals((java.lang.Object) list14);
        boolean boolean17 = keyedObjects2D0.equals((java.lang.Object) 2);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj4 = keyedObjects2D0.clone();
        int int5 = keyedObjects2D0.getColumnCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1), (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) "");
        java.lang.Comparable comparable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(comparable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        int int5 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int3 = keyedObjects2D0.getColumnCount();
        int int4 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj5 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int4 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        int int7 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) 0.0d);
        int int9 = keyedObjects2D5.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D5.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list13 = keyedObjects2D5.getColumnKeys();
        java.util.List list14 = keyedObjects2D5.getRowKeys();
        int int15 = keyedObjects2D5.getRowCount();
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D5, comparable16, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int11 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj12 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D13.getRowCount();
        int int16 = keyedObjects2D13.getRowIndex((java.lang.Comparable) (byte) -1);
        int int18 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 1.0f);
        int int19 = keyedObjects2D13.getRowCount();
        java.lang.Object obj20 = keyedObjects2D13.clone();
        int int21 = keyedObjects2D13.getRowCount();
        int int22 = keyedObjects2D13.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D23.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D13.addObject((java.lang.Object) keyedObjects2D23, (java.lang.Comparable) (short) 0, (java.lang.Comparable) "");
        boolean boolean31 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D13);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D13.removeRow((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = keyedObjects2D0.getRowKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        int int11 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        java.lang.Comparable comparable10 = keyedObjects2D0.getColumnKey((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = keyedObjects2D0.getObject((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 100.0d + "'", comparable10, 100.0d);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int4 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = keyedObjects2D0.getObject((java.lang.Comparable) 1.0d, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        int int21 = keyedObjects2D10.getRowCount();
        java.lang.Object obj22 = keyedObjects2D10.clone();
        keyedObjects2D10.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D26.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list31 = keyedObjects2D26.getRowKeys();
        int int32 = keyedObjects2D26.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D33.addObject((java.lang.Object) keyedObjects2D34, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj38 = keyedObjects2D34.clone();
        int int39 = keyedObjects2D34.getColumnCount();
        int int41 = keyedObjects2D34.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean42 = keyedObjects2D26.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable44 = keyedObjects2D26.getColumnKey((int) (short) 0);
        int int45 = keyedObjects2D26.getRowCount();
        keyedObjects2D26.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) (byte) -1);
        keyedObjects2D10.setObject((java.lang.Object) (byte) -1, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D10.removeRow((java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + 10.0f + "'", comparable44, 10.0f);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeRow((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int9 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) '#');
        java.util.List list10 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = keyedObjects2D0.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        int int27 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D28.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list33 = keyedObjects2D28.getRowKeys();
        int int34 = keyedObjects2D28.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D35.addObject((java.lang.Object) keyedObjects2D36, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj40 = keyedObjects2D36.clone();
        int int41 = keyedObjects2D36.getColumnCount();
        int int43 = keyedObjects2D36.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean44 = keyedObjects2D28.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable46 = keyedObjects2D28.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        int int49 = keyedObjects2D47.getColumnIndex((java.lang.Comparable) 0.0d);
        int int51 = keyedObjects2D47.getRowIndex((java.lang.Comparable) 'a');
        int int53 = keyedObjects2D47.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D28.addObject((java.lang.Object) int53, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        boolean boolean57 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D28);
        keyedObjects2D0.removeObject((java.lang.Comparable) 10, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + 10.0f + "'", comparable46, 10.0f);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = keyedObjects2D0.getObject(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        java.lang.Object obj20 = keyedObjects2D8.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = keyedObjects2D8.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D7, (java.lang.Comparable) 10, (java.lang.Comparable) 100);
        int int16 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D9.addObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj14 = keyedObjects2D10.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        keyedObjects2D0.addObject(obj14, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable18 = keyedObjects2D0.getColumnKey((int) (short) 0);
        int int19 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = keyedObjects2D0.getColumnKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0f + "'", comparable18, 10.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int11 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj12 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D13.getRowCount();
        int int16 = keyedObjects2D13.getRowIndex((java.lang.Comparable) (byte) -1);
        int int18 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 1.0f);
        int int19 = keyedObjects2D13.getRowCount();
        java.lang.Object obj20 = keyedObjects2D13.clone();
        int int21 = keyedObjects2D13.getRowCount();
        int int22 = keyedObjects2D13.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D23.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D13.addObject((java.lang.Object) keyedObjects2D23, (java.lang.Comparable) (short) 0, (java.lang.Comparable) "");
        boolean boolean31 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = keyedObjects2D0.getObject((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        int int21 = keyedObjects2D10.getRowCount();
        boolean boolean23 = keyedObjects2D10.equals((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = keyedObjects2D10.getObject((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        java.util.List list9 = keyedObjects2D7.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list6 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj15 = keyedObjects2D10.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D16.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int22 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) 0L);
        int int23 = keyedObjects2D16.getRowCount();
        keyedObjects2D10.setObject((java.lang.Object) int23, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int28 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.util.List list30 = keyedObjects2D29.getRowKeys();
        keyedObjects2D10.setObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.util.List list34 = keyedObjects2D10.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D10.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        keyedObjects2D9.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj18 = null;
        boolean boolean19 = keyedObjects2D9.equals(obj18);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) boolean19);
        int int22 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list23 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj24 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int8 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        java.lang.Class<?> wildcardClass10 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        java.lang.Object obj8 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        java.lang.Object obj7 = keyedObjects2D1.clone();
        java.util.List list8 = keyedObjects2D1.getRowKeys();
        int int10 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (-1));
        java.lang.Class<?> wildcardClass11 = keyedObjects2D1.getClass();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) 10.0d);
        int int5 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        int int8 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0.0d);
        int int10 = keyedObjects2D6.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D6.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list14 = keyedObjects2D6.getColumnKeys();
        boolean boolean15 = keyedObjects2D0.equals((java.lang.Object) list14);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D16.addObject((java.lang.Object) keyedObjects2D17, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj21 = keyedObjects2D17.clone();
        keyedObjects2D17.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.util.List list26 = keyedObjects2D17.getColumnKeys();
        boolean boolean27 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D17);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D28.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable34 = keyedObjects2D28.getRowKey(0);
        java.lang.Object obj35 = keyedObjects2D28.clone();
        java.lang.Comparable comparable37 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D17.addObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) (-1.0f), comparable37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + 100L + "'", comparable34, 100L);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D5.addObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int11 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list12 = keyedObjects2D5.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) list12, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 0);
        java.util.List list16 = keyedObjects2D0.getColumnKeys();
        java.util.List list17 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = keyedObjects2D0.getRowKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        int int5 = keyedObjects2D0.getColumnCount();
        int int7 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) false);
        keyedObjects2D0.removeColumn(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) 10.0d);
        int int5 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        boolean boolean7 = keyedObjects2D0.equals((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = keyedObjects2D0.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 100L);
        java.util.List list11 = keyedObjects2D7.getRowKeys();
        int int12 = keyedObjects2D7.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D7.removeColumn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int8 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D9.setObject((java.lang.Object) 10.0f, (java.lang.Comparable) 'a', (java.lang.Comparable) 10L);
        java.lang.Class<?> wildcardClass18 = keyedObjects2D9.getClass();
        keyedObjects2D1.setObject((java.lang.Object) wildcardClass18, (java.lang.Comparable) (-1L), (java.lang.Comparable) 3);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D22.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable28 = keyedObjects2D22.getRowKey(0);
        keyedObjects2D1.addObject((java.lang.Object) keyedObjects2D22, (java.lang.Comparable) 0, (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = keyedObjects2D1.getObject((java.lang.Comparable) true, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (true) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 100L + "'", comparable28, 100L);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        java.util.List list10 = keyedObjects2D0.getColumnKeys();
        int int11 = keyedObjects2D0.getColumnCount();
        java.util.List list12 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = keyedObjects2D0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) 10.0d);
        int int5 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj14 = keyedObjects2D9.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D15.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int21 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 0L);
        int int22 = keyedObjects2D15.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) int22, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int27 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.util.List list29 = keyedObjects2D28.getRowKeys();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj33 = null;
        boolean boolean34 = keyedObjects2D9.equals(obj33);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D35.getRowCount();
        int int38 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj39 = keyedObjects2D35.clone();
        int int40 = keyedObjects2D35.getColumnCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        boolean boolean44 = keyedObjects2D7.equals((java.lang.Object) keyedObjects2D9);
        keyedObjects2D9.removeRow((int) (byte) 1);
        java.lang.Class<?> wildcardClass47 = keyedObjects2D9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = keyedObjects2D0.getObject((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        int int43 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D44 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D44.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj51 = keyedObjects2D44.getObject(0, 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D52 = new org.jfree.data.KeyedObjects2D();
        int int54 = keyedObjects2D52.getColumnIndex((java.lang.Comparable) 0.0d);
        int int56 = keyedObjects2D52.getRowIndex((java.lang.Comparable) 'a');
        boolean boolean58 = keyedObjects2D52.equals((java.lang.Object) (short) 10);
        keyedObjects2D44.setObject((java.lang.Object) keyedObjects2D52, (java.lang.Comparable) 0, (java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D62 = new org.jfree.data.KeyedObjects2D();
        int int64 = keyedObjects2D62.getColumnIndex((java.lang.Comparable) 0.0d);
        int int66 = keyedObjects2D62.getRowIndex((java.lang.Comparable) 'a');
        int int68 = keyedObjects2D62.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.KeyedObjects2D keyedObjects2D69 = new org.jfree.data.KeyedObjects2D();
        java.util.List list70 = keyedObjects2D69.getRowKeys();
        java.lang.Object obj71 = keyedObjects2D69.clone();
        boolean boolean72 = keyedObjects2D62.equals((java.lang.Object) keyedObjects2D69);
        keyedObjects2D52.addObject((java.lang.Object) boolean72, (java.lang.Comparable) 100L, (java.lang.Comparable) 2);
        java.util.List list76 = keyedObjects2D52.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) list76, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) 0L, (java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable84 = keyedObjects2D0.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1.0f) + "'", obj51, (-1.0f));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(list76);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        keyedObjects2D9.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj18 = null;
        boolean boolean19 = keyedObjects2D9.equals(obj18);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) boolean19);
        int int21 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        int int24 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 0.0d);
        int int26 = keyedObjects2D22.getRowIndex((java.lang.Comparable) 'a');
        int int28 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 10.0d);
        int int29 = keyedObjects2D22.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D30.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D22.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D22.setObject((java.lang.Object) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1));
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D22, (java.lang.Comparable) (-1L), (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int26 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D27.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable33 = keyedObjects2D27.getRowKey(0);
        java.lang.Object obj34 = keyedObjects2D27.clone();
        java.lang.Comparable comparable35 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D27, comparable35, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + 100L + "'", comparable33, 100L);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Comparable comparable19 = null;
        int int20 = keyedObjects2D0.getColumnIndex(comparable19);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) 0.0f);
        keyedObjects2D0.removeColumn((int) (short) 0);
        java.util.List list14 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = keyedObjects2D0.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        keyedObjects2D9.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj18 = null;
        boolean boolean19 = keyedObjects2D9.equals(obj18);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) boolean19);
        int int21 = keyedObjects2D0.getRowCount();
        java.util.List list22 = keyedObjects2D0.getRowKeys();
        java.lang.Class<?> wildcardClass23 = list22.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list6 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = keyedObjects2D0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = keyedObjects2D0.getObject((java.lang.Comparable) (byte) 100, (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (100) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        boolean boolean14 = keyedObjects2D8.equals((java.lang.Object) (short) 10);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0, (java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        int int20 = keyedObjects2D18.getColumnIndex((java.lang.Comparable) 0.0d);
        int int22 = keyedObjects2D18.getRowIndex((java.lang.Comparable) 'a');
        int int24 = keyedObjects2D18.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.util.List list26 = keyedObjects2D25.getRowKeys();
        java.lang.Object obj27 = keyedObjects2D25.clone();
        boolean boolean28 = keyedObjects2D18.equals((java.lang.Object) keyedObjects2D25);
        keyedObjects2D8.addObject((java.lang.Object) boolean28, (java.lang.Comparable) 100L, (java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = keyedObjects2D8.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int8 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = keyedObjects2D0.getColumnKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        java.util.List list6 = keyedObjects2D1.getColumnKeys();
        java.util.List list7 = keyedObjects2D1.getColumnKeys();
        java.util.List list8 = keyedObjects2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = keyedObjects2D1.getObject(3, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) 1.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) '#');
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        int int16 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0.0d);
        int int18 = keyedObjects2D14.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj19 = keyedObjects2D14.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int26 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 0L);
        int int27 = keyedObjects2D20.getRowCount();
        keyedObjects2D14.setObject((java.lang.Object) int27, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int32 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        java.util.List list34 = keyedObjects2D33.getRowKeys();
        keyedObjects2D14.setObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D38.addObject((java.lang.Object) keyedObjects2D39, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int43 = keyedObjects2D39.getRowCount();
        boolean boolean44 = keyedObjects2D14.equals((java.lang.Object) int43);
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = new org.jfree.data.KeyedObjects2D();
        int int46 = keyedObjects2D45.getRowCount();
        boolean boolean48 = keyedObjects2D45.equals((java.lang.Object) 10.0d);
        keyedObjects2D14.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean53 = keyedObjects2D14.equals((java.lang.Object) 10L);
        int int55 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D14, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) 10);
        int int59 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable61 = keyedObjects2D0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
    }
}

