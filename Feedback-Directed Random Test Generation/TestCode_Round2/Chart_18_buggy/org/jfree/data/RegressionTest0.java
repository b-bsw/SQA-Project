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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues2D0.getValue((java.lang.Comparable) '#', comparable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = defaultKeyedValues2D0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues2D0.getValue((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        org.jfree.chart.util.SortOrder sortOrder1 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        java.lang.Class<?> wildcardClass3 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues2D0.getValue(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        org.jfree.chart.util.SortOrder sortOrder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (short) 10, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultKeyedValues2D0.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues0.getValue((java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((-1), (java.lang.Comparable) (short) 1, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        org.jfree.chart.util.SortOrder sortOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = defaultKeyedValues2D0.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 10L, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues0.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Class<?> wildcardClass13 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 1, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = defaultKeyedValues2D0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = defaultKeyedValues2D0.getRowIndex(comparable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) false);
        java.lang.Class<?> wildcardClass9 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues2D0.getValue((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) 10.0d, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D0.getValue(0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        java.lang.Class<?> wildcardClass13 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        org.jfree.chart.util.SortOrder sortOrder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues0.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getColumnKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable2 = defaultKeyedValues0.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues2D0.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues0.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int4 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultKeyedValues2D0.getValue((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = defaultKeyedValues2D1.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
        java.lang.Class<?> wildcardClass16 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 'a', (java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = defaultKeyedValues2D0.getColumnKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues0.getValue((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultKeyedValues0.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D0.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultKeyedValues2D0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        java.util.List list5 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 1, (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: false");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        org.jfree.chart.util.SortOrder sortOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) 0.0f, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D0.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        int int10 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues0.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((-1), (java.lang.Comparable) 1L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        java.util.List list5 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) (short) 100);
        org.jfree.chart.util.SortOrder sortOrder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues7);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues11.getClass();
        boolean boolean16 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues11);
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues2D0.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues0.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = defaultKeyedValues2D0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D0.getValue((int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        org.jfree.chart.util.SortOrder sortOrder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultKeyedValues2D0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultKeyedValues0.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals(obj20);
        java.util.List list22 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(3, (java.lang.Comparable) (-1.0f), (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        int int2 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = defaultKeyedValues0.getKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) ' ');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 10);
        java.util.List list10 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        org.jfree.chart.util.SortOrder sortOrder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj19 = defaultKeyedValues2D18.clone();
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues0.getValue((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = defaultKeyedValues2D0.getColumnIndex(comparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100, (double) (short) 10);
        org.jfree.chart.util.SortOrder sortOrder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) 10.0f, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj19 = defaultKeyedValues2D18.clone();
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D18.getValue((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues11.getClass();
        boolean boolean16 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues11);
        int int17 = defaultKeyedValues11.getItemCount();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 0);
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (short) 1, comparable18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        int int15 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D8.clear();
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.util.List list21 = defaultKeyedValues2D8.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D8.removeRow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues11.getClass();
        boolean boolean16 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues11);
        java.util.List list17 = defaultKeyedValues11.getKeys();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 0, (java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 3");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D();
        int int7 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D5.getColumnKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        org.jfree.chart.util.SortOrder sortOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = defaultKeyedValues0.getIndex(comparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = defaultKeyedValues2D0.getColumnIndex(comparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getColumnKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        org.jfree.chart.util.SortOrder sortOrder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues11.getClass();
        boolean boolean16 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues11);
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues11.sortByKeys(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues2D0.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultKeyedValues2D0.getValue((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultKeyedValues2D0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues7);
        java.util.List list22 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int5 = defaultKeyedValues2D0.getColumnCount();
        int int6 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean18 = defaultKeyedValues10.equals((java.lang.Object) 0L);
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        java.lang.Class<?> wildcardClass27 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getRowKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues0.getValue((java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: true");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        org.jfree.chart.util.SortOrder sortOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(1, (java.lang.Comparable) (short) -1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D0.getValue((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean18 = defaultKeyedValues10.equals((java.lang.Object) 0L);
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultKeyedValues0.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D1.getValue((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        java.lang.Comparable comparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = defaultKeyedValues0.getIndex(comparable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues7);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        org.jfree.chart.util.SortOrder sortOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean18 = defaultKeyedValues10.equals((java.lang.Object) 0L);
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '#', (java.lang.Comparable) "", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals(obj20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultKeyedValues2D0.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) ' ');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 10);
        java.util.List list10 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        int int15 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D8.clear();
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.util.List list21 = defaultKeyedValues2D8.getRowKeys();
        java.lang.Class<?> wildcardClass22 = defaultKeyedValues2D8.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues2D0.getColumnKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (double) (short) 1);
        java.lang.Object obj21 = defaultKeyedValues0.clone();
        java.lang.Number number23 = defaultKeyedValues0.getValue(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultKeyedValues0.getKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 35.0d + "'", number23, 35.0d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D0.getValue(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        org.jfree.chart.util.SortOrder sortOrder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues0.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D0.getValue((int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        java.lang.Class<?> wildcardClass13 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        org.jfree.chart.util.SortOrder sortOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (double) (short) 1);
        java.lang.Object obj21 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) 0.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.setValue((java.lang.Number) 0, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 3);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        java.lang.Class<?> wildcardClass14 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int5 = defaultKeyedValues2D0.getColumnCount();
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, (java.lang.Number) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultKeyedValues2D0.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.chart.util.SortOrder sortOrder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultKeyedValues0.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues2D0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        org.jfree.chart.util.SortOrder sortOrder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues2D0.getRowKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        java.lang.Comparable comparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = defaultKeyedValues2D0.getRowIndex(comparable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean18 = defaultKeyedValues10.equals((java.lang.Object) 0L);
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 1);
        int int30 = defaultKeyedValues0.getIndex((java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) true, (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        int int15 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D8.clear();
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100.0f);
        java.lang.Object obj23 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultKeyedValues2D0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues2D1.getValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = defaultKeyedValues2D1.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues0.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int5 = defaultKeyedValues2D0.getColumnCount();
        int int6 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues7);
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues7.removeValue(comparable22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues0.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1);
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 1L, (java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj19 = defaultKeyedValues2D18.clone();
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        java.lang.Comparable comparable22 = defaultKeyedValues0.getKey(1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((-1), (java.lang.Comparable) 10L, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 0 + "'", comparable22, (short) 0);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals(obj20);
        java.util.List list22 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        int int27 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = defaultKeyedValues2D0.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        java.util.List list12 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) 10.0d, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(100, (java.lang.Comparable) (-1), (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (short) 0);
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable13, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D0.getValue((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        int int19 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 1);
        java.lang.Number number21 = defaultKeyedValues0.getValue((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) 35.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 0L + "'", number21, 0L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (double) (short) 1);
        java.lang.Object obj21 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) -1, (java.lang.Comparable) (byte) 0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(2, (java.lang.Comparable) true, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        org.jfree.chart.util.SortOrder sortOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(100, (java.lang.Comparable) (short) 0, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(comparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals(obj20);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 2, (java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues10.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable18 = defaultKeyedValues10.getKey((int) (short) 0);
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D20 = new org.jfree.data.DefaultKeyedValues2D();
        int int22 = defaultKeyedValues2D20.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D20.clear();
        defaultKeyedValues2D20.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D20.clear();
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D20.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100);
        boolean boolean42 = defaultKeyedValues10.equals((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.insertValue((int) (byte) 10, (java.lang.Comparable) "hi!", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean18 = defaultKeyedValues10.equals((java.lang.Object) 0L);
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultKeyedValues0.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = defaultKeyedValues2D0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) ' ', (java.lang.Comparable) (short) -1, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getColumnKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        int int15 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D8.clear();
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) 10, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Number number17 = null;
        defaultKeyedValues2D0.addValue(number17, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 1);
        int int22 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 1L, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.setValue((java.lang.Number) 100L, comparable16, (java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list4 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultKeyedValues2D0.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        java.lang.Number number17 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, number17);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        int int21 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D19.clear();
        defaultKeyedValues2D19.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int31 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list35 = defaultKeyedValues2D19.getRowKeys();
        boolean boolean36 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = defaultKeyedValues0.getValue((java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) "");
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        java.lang.Class<?> wildcardClass6 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getColumnKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((-1), (java.lang.Comparable) 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues0.getValue((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        org.jfree.chart.util.SortOrder sortOrder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean18 = defaultKeyedValues10.equals((java.lang.Object) 0L);
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int32 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) 'a', (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int5 = defaultKeyedValues2D0.getColumnCount();
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 'a');
        java.lang.Class<?> wildcardClass14 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean18 = defaultKeyedValues10.equals((java.lang.Object) 0L);
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable28 = defaultKeyedValues0.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean18 = defaultKeyedValues10.equals((java.lang.Object) 0L);
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        org.jfree.chart.util.SortOrder sortOrder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals(obj20);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 2, (java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (-1L), (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues0.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues0.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0d);
        int int24 = defaultKeyedValues2D0.getRowCount();
        java.lang.Comparable comparable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = defaultKeyedValues2D0.getRowIndex(comparable25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues0.getValue(comparable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getItemCount();
        int int15 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        int int19 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 1);
        java.lang.Number number21 = defaultKeyedValues0.getValue((int) (byte) 1);
        org.jfree.chart.util.SortOrder sortOrder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 0L + "'", number21, 0L);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) "");
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int4 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Number number5 = null;
        defaultKeyedValues2D0.addValue(number5, (java.lang.Comparable) '#', (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        java.lang.Number number11 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), number11);
        java.lang.Class<?> wildcardClass13 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        java.lang.Comparable comparable14 = defaultKeyedValues0.getKey((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 0 + "'", comparable14, (short) 0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues0.getValue((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 2");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        int int16 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0f, (double) '#');
        java.lang.Comparable comparable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable20, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 'a');
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues2D0.getRowKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues0.getValue((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultKeyedValues2D0.getValue((int) (byte) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        int int11 = defaultKeyedValues2D4.getRowCount();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) int11);
        org.jfree.chart.util.SortOrder sortOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues0.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues0.getKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0f, (java.lang.Number) 10L);
        org.jfree.chart.util.SortOrder sortOrder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        java.lang.Number number17 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, number17);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        int int21 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D19.clear();
        defaultKeyedValues2D19.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int31 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list35 = defaultKeyedValues2D19.getRowKeys();
        boolean boolean36 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D19);
        java.lang.Class<?> wildcardClass37 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D6.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int16 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list17 = defaultKeyedValues2D6.getColumnKeys();
        defaultKeyedValues2D6.removeColumn((java.lang.Comparable) (-1L));
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultKeyedValues2D0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list4 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues2D0.getValue((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D0.getValue((java.lang.Comparable) '4', (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj19 = defaultKeyedValues2D18.clone();
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        java.lang.Comparable comparable22 = defaultKeyedValues0.getKey(1);
        java.lang.Comparable comparable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable23, (double) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 0 + "'", comparable22, (short) 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) false, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D0.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = defaultKeyedValues2D1.getColumnKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues0.getValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (double) (short) 1);
        java.lang.Object obj21 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        int int15 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D0.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Number) 10);
        org.jfree.chart.util.SortOrder sortOrder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        int int15 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D8.clear();
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        int int22 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = defaultKeyedValues2D0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        java.util.List list5 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 10);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        int int17 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) (-1L), (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (byte) -1, (java.lang.Number) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues0.getValue((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        int int8 = defaultKeyedValues2D6.getRowCount();
        int int9 = defaultKeyedValues2D6.getRowCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) int9);
        int int11 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues2D1.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 10, (java.lang.Comparable) 0, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues0.getValue((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues11.getClass();
        boolean boolean16 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues11);
        defaultKeyedValues0.removeValue((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues10.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable18 = defaultKeyedValues10.getKey((int) (short) 0);
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D20 = new org.jfree.data.DefaultKeyedValues2D();
        int int22 = defaultKeyedValues2D20.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D20.clear();
        defaultKeyedValues2D20.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D20.clear();
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D20.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100);
        boolean boolean42 = defaultKeyedValues10.equals((java.lang.Object) true);
        defaultKeyedValues10.removeValue((java.lang.Comparable) ' ');
        defaultKeyedValues10.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.insertValue(2, (java.lang.Comparable) (short) 1, (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D0.getValue(10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultKeyedValues0.getKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        int int16 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues0.getValue((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        int int19 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultKeyedValues2D4.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int12 = defaultKeyedValues2D10.getRowIndex((java.lang.Comparable) '#');
        int int14 = defaultKeyedValues2D10.getColumnIndex((java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list16 = defaultKeyedValues2D15.getRowKeys();
        int int17 = defaultKeyedValues2D15.getRowCount();
        int int18 = defaultKeyedValues2D15.getRowCount();
        boolean boolean19 = defaultKeyedValues2D10.equals((java.lang.Object) int18);
        int int20 = defaultKeyedValues2D10.getRowCount();
        boolean boolean21 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D10.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) -1, (java.lang.Comparable) ' ', (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D1.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        org.jfree.chart.util.SortOrder sortOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues0.getValue((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean26 = defaultKeyedValues18.equals((java.lang.Object) 0L);
        int int28 = defaultKeyedValues18.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues18.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues18.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D36 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj37 = defaultKeyedValues2D36.clone();
        boolean boolean38 = defaultKeyedValues18.equals((java.lang.Object) defaultKeyedValues2D36);
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) boolean38);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable42 = defaultKeyedValues0.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Number number17 = null;
        defaultKeyedValues2D0.addValue(number17, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues2D0.getValue((int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues3 = new org.jfree.data.DefaultKeyedValues();
        int int5 = defaultKeyedValues3.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues3.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj9 = defaultKeyedValues3.clone();
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D0.getColumnKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean18 = defaultKeyedValues10.equals((java.lang.Object) 0L);
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (double) (byte) 100);
        org.jfree.chart.util.SortOrder sortOrder33 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues12.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean20 = defaultKeyedValues12.equals((java.lang.Object) 0L);
        int int22 = defaultKeyedValues12.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues12.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues12.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj30 = defaultKeyedValues12.clone();
        boolean boolean31 = defaultKeyedValues0.equals(obj30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = defaultKeyedValues0.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 35.0d, (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        int int8 = defaultKeyedValues2D6.getRowCount();
        int int9 = defaultKeyedValues2D6.getRowCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) int9);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Class<?> wildcardClass9 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) (short) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) 'a');
        org.jfree.chart.util.SortOrder sortOrder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) 100);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 4);
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable12, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(4, (java.lang.Comparable) 10L, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) 10.0f, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues0.getValue((java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D0.getValue((java.lang.Comparable) true, (java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        int int19 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 1);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (java.lang.Number) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        int int3 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        java.util.List list4 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(2, (java.lang.Comparable) 4, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        int int18 = defaultKeyedValues2D16.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D16.clear();
        defaultKeyedValues2D16.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int28 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list32 = defaultKeyedValues2D16.getRowKeys();
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D16);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues0.getKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.setValue((java.lang.Number) 0, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 3);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable12, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        int int2 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.removeValue(0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (double) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues0.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (byte) 100, (double) '#');
        java.lang.Class<?> wildcardClass17 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) ' ');
        org.jfree.chart.util.SortOrder sortOrder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Number number17 = null;
        defaultKeyedValues2D0.addValue(number17, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 3);
        java.lang.Object obj25 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        int int15 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D8.clear();
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.util.List list21 = defaultKeyedValues2D8.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues2D8.getValue((java.lang.Comparable) (-1.0f), (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100.0f);
        int int12 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) 1.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) ' ');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 10);
        java.util.List list10 = defaultKeyedValues2D0.getRowKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list12 = defaultKeyedValues2D11.getRowKeys();
        defaultKeyedValues2D11.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D11.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int20 = defaultKeyedValues2D11.getColumnCount();
        defaultKeyedValues2D11.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 3, (java.lang.Comparable) (byte) 1);
        boolean boolean25 = defaultKeyedValues2D0.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = defaultKeyedValues2D0.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj19 = defaultKeyedValues2D18.clone();
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        java.lang.Comparable comparable22 = defaultKeyedValues0.getKey(1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) -1, (java.lang.Comparable) 4, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 0 + "'", comparable22, (short) 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        int int15 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 10);
        int int16 = defaultKeyedValues2D13.getRowCount();
        defaultKeyedValues2D13.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int21 = defaultKeyedValues2D13.getRowCount();
        java.util.List list22 = defaultKeyedValues2D13.getColumnKeys();
        boolean boolean23 = defaultKeyedValues2D0.equals((java.lang.Object) list22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultKeyedValues0.getKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues2D0.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues7);
        java.util.List list22 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D0.getRowKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        int int15 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D8.clear();
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues0.getValue((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultKeyedValues0.getValue((java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '#', (java.lang.Comparable) ' ', (double) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D0.getRowKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultKeyedValues2D0.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int4 = defaultKeyedValues2D0.getColumnCount();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int3 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultKeyedValues2D1.getValue((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (byte) 10, comparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        org.jfree.chart.util.SortOrder sortOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (double) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues0.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.util.List list6 = defaultKeyedValues0.getKeys();
        java.lang.Class<?> wildcardClass7 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        int int3 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues0.getValue((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        java.util.List list5 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) '4', comparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues0.getKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues7);
        defaultKeyedValues7.addValue((java.lang.Comparable) 10.0f, (double) (byte) 1);
        java.lang.Object obj25 = defaultKeyedValues7.clone();
        java.lang.Object obj26 = defaultKeyedValues7.clone();
        defaultKeyedValues7.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) (byte) 10);
        java.lang.Comparable comparable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = defaultKeyedValues7.getValue(comparable30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues10.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable18 = defaultKeyedValues10.getKey((int) (short) 0);
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.removeValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) (-1));
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        java.lang.Number number11 = defaultKeyedValues0.getValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        int int3 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues0.getValue((java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues2D0.getColumnKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) (short) 1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        java.lang.Comparable comparable17 = defaultKeyedValues0.getKey((int) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultKeyedValues0.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 0 + "'", comparable17, (short) 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        defaultKeyedValues2D0.removeRow((int) (byte) 0);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 1.0d, (java.lang.Comparable) (-1));
        java.lang.Object obj19 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues10.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable18 = defaultKeyedValues10.getKey((int) (short) 0);
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues0.getValue((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues7);
        defaultKeyedValues7.addValue((java.lang.Comparable) 10.0f, (double) (byte) 1);
        java.lang.Object obj25 = defaultKeyedValues7.clone();
        org.jfree.chart.util.SortOrder sortOrder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues7.sortByValues(sortOrder26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = defaultKeyedValues2D0.getRowIndex(comparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) (-1));
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, comparable15, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultKeyedValues2D0.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list13 = defaultKeyedValues2D12.getRowKeys();
        int int14 = defaultKeyedValues2D12.getRowCount();
        int int15 = defaultKeyedValues2D12.getRowCount();
        boolean boolean17 = defaultKeyedValues2D12.equals((java.lang.Object) 10.0f);
        int int19 = defaultKeyedValues2D12.getColumnIndex((java.lang.Comparable) 0.0f);
        int int21 = defaultKeyedValues2D12.getColumnIndex((java.lang.Comparable) 0L);
        int int22 = defaultKeyedValues2D12.getColumnCount();
        boolean boolean23 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultKeyedValues2D0.getColumnKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues0.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean18 = defaultKeyedValues10.equals((java.lang.Object) 0L);
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, (java.lang.Number) (-1.0d));
        defaultKeyedValues0.removeValue((java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        defaultKeyedValues2D0.removeRow((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) 100);
        int int20 = defaultKeyedValues0.getItemCount();
        java.lang.Class<?> wildcardClass21 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 2);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1L, (java.lang.Comparable) "hi!");
        defaultKeyedValues2D0.addValue((java.lang.Number) 4, (java.lang.Comparable) (short) 0, (java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) "", (java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 2);
        java.lang.Object obj9 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getRowCount();
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0f, (java.lang.Number) 10L);
        java.lang.Comparable comparable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable19, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        java.util.List list17 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) -1, (java.lang.Comparable) "hi!", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) ' ', (java.lang.Number) 100);
        java.lang.Comparable comparable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = defaultKeyedValues0.getIndex(comparable19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) (-1));
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (double) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj22 = defaultKeyedValues18.clone();
        int int24 = defaultKeyedValues18.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues18.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        java.lang.Object obj28 = defaultKeyedValues18.clone();
        boolean boolean29 = defaultKeyedValues0.equals(obj28);
        java.lang.Comparable comparable31 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '#', comparable31, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues2D1.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D0.getValue(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 35.0d, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) (byte) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D6.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int16 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list17 = defaultKeyedValues2D6.getColumnKeys();
        defaultKeyedValues2D6.removeColumn((java.lang.Comparable) (-1L));
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D0.getValue(3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 3, (java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 3, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) 3, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getColumnKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) false, (java.lang.Comparable) 3);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues0.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals(obj20);
        java.util.List list22 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) 35.0d, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean18 = defaultKeyedValues10.equals((java.lang.Object) 0L);
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 1);
        int int30 = defaultKeyedValues0.getIndex((java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable32 = defaultKeyedValues0.getKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) 100);
        defaultKeyedValues0.clear();
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 0, comparable22, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (java.lang.Number) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues0.getKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        java.util.List list12 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues0.getValue((java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found:  ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) false, (java.lang.Comparable) 3);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Boolean (java.lang.Short and java.lang.Boolean are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        int int15 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D8.clear();
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) "hi!");
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues2D1.getValue(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        int int8 = defaultKeyedValues2D6.getRowCount();
        int int9 = defaultKeyedValues2D6.getRowCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) int9);
        int int11 = defaultKeyedValues2D1.getRowCount();
        int int12 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean15 = defaultKeyedValues7.equals((java.lang.Object) 0L);
        int int17 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1L);
        int int19 = defaultKeyedValues7.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj20 = defaultKeyedValues7.clone();
        boolean boolean21 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues7);
        java.util.List list22 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.clear();
        java.util.List list24 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues2D0.getValue(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Number number17 = null;
        defaultKeyedValues2D0.addValue(number17, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 3);
        java.lang.Object obj25 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = defaultKeyedValues2D0.getColumnKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        java.lang.Number number11 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), number11);
        defaultKeyedValues0.clear();
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        org.jfree.chart.util.SortOrder sortOrder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        int int3 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        java.util.List list4 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 35.0d);
        java.lang.Class<?> wildcardClass12 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list4 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D8.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        boolean boolean16 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D0.getValue((java.lang.Comparable) '#', (java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        java.lang.Number number16 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, number16);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) -1, (java.lang.Comparable) 35.0d, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        int int15 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D8.clear();
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 100);
        int int24 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.util.List list6 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) 100);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        java.lang.Number number14 = null;
        defaultKeyedValues2D0.addValue(number14, (java.lang.Comparable) 4, (java.lang.Comparable) 100.0f);
        java.util.List list18 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues7 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues7.addValue((java.lang.Comparable) 10.0d, (-1.0d));
        java.lang.Object obj11 = defaultKeyedValues7.clone();
        boolean boolean12 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues7);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Number number17 = null;
        defaultKeyedValues2D0.addValue(number17, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (-1), (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        org.jfree.chart.util.SortOrder sortOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) ' ', (java.lang.Number) 100);
        int int19 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        int int7 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D6.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int16 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list17 = defaultKeyedValues2D6.getColumnKeys();
        defaultKeyedValues2D6.removeColumn((java.lang.Comparable) (-1L));
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        int int8 = defaultKeyedValues2D6.getRowCount();
        int int9 = defaultKeyedValues2D6.getRowCount();
        int int11 = defaultKeyedValues2D6.getRowIndex((java.lang.Comparable) '4');
        int int12 = defaultKeyedValues2D6.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean21 = defaultKeyedValues13.equals((java.lang.Object) 0L);
        int int23 = defaultKeyedValues13.getIndex((java.lang.Comparable) 1L);
        int int25 = defaultKeyedValues13.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj26 = defaultKeyedValues13.clone();
        boolean boolean27 = defaultKeyedValues2D6.equals(obj26);
        java.util.List list28 = defaultKeyedValues2D6.getRowKeys();
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        defaultKeyedValues2D6.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        boolean boolean36 = defaultKeyedValues0.equals((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = defaultKeyedValues0.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        java.lang.Number number11 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), number11);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) (-1L));
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        int int15 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0d, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues0.getValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean18 = defaultKeyedValues10.equals((java.lang.Object) 0L);
        int int20 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultKeyedValues0.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues5.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean13 = defaultKeyedValues5.equals((java.lang.Object) 0L);
        int int15 = defaultKeyedValues5.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues5.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean18 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues5);
        defaultKeyedValues2D0.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) 2, (java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (double) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultKeyedValues0.getKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj19 = defaultKeyedValues2D18.clone();
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        defaultKeyedValues0.removeValue((java.lang.Comparable) false);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.clear();
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues0.getValue((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 2");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D();
        int int7 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D5.getColumnKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues0.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list15 = defaultKeyedValues2D14.getRowKeys();
        int int16 = defaultKeyedValues2D14.getRowCount();
        int int17 = defaultKeyedValues2D14.getRowCount();
        boolean boolean19 = defaultKeyedValues2D14.equals((java.lang.Object) 10.0f);
        java.lang.Object obj20 = defaultKeyedValues2D14.clone();
        defaultKeyedValues2D14.clear();
        boolean boolean22 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D14);
        java.lang.Object obj23 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        defaultKeyedValues2D6.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D6.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int16 = defaultKeyedValues2D6.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list17 = defaultKeyedValues2D6.getColumnKeys();
        defaultKeyedValues2D6.removeColumn((java.lang.Comparable) (-1L));
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) 4);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues0.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) -1, (java.lang.Comparable) 1L, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(3, (java.lang.Comparable) 1, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues0.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (double) (short) 10);
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable16, 35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean26 = defaultKeyedValues18.equals((java.lang.Object) 0L);
        int int28 = defaultKeyedValues18.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues18.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues18.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D36 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj37 = defaultKeyedValues2D36.clone();
        boolean boolean38 = defaultKeyedValues18.equals((java.lang.Object) defaultKeyedValues2D36);
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) boolean38);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D40 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list41 = defaultKeyedValues2D40.getRowKeys();
        int int42 = defaultKeyedValues2D40.getRowCount();
        int int43 = defaultKeyedValues2D40.getRowCount();
        int int45 = defaultKeyedValues2D40.getRowIndex((java.lang.Comparable) '4');
        int int46 = defaultKeyedValues2D40.getRowCount();
        java.util.List list47 = defaultKeyedValues2D40.getRowKeys();
        boolean boolean48 = defaultKeyedValues0.equals((java.lang.Object) list47);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number53 = defaultKeyedValues0.getValue((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues0.getValue(comparable18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getRowKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues10 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues10.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues10.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable18 = defaultKeyedValues10.getKey((int) (short) 0);
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues10);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (java.lang.Number) 10.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D23 = new org.jfree.data.DefaultKeyedValues2D();
        int int25 = defaultKeyedValues2D23.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D23.clear();
        defaultKeyedValues2D23.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D23.clear();
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D23.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        boolean boolean42 = defaultKeyedValues0.equals((java.lang.Object) 100L);
        org.jfree.chart.util.SortOrder sortOrder43 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        java.util.List list12 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (java.lang.Number) (short) 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean22 = defaultKeyedValues14.equals((java.lang.Object) 0L);
        int int24 = defaultKeyedValues14.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues14.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues14.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues14.removeValue(0);
        boolean boolean34 = defaultKeyedValues0.equals((java.lang.Object) 0);
        java.lang.Number number36 = defaultKeyedValues0.getValue((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + number36 + "' != '" + 52.0d + "'", number36, 52.0d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        java.util.List list8 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Class<?> wildcardClass4 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) 3);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = defaultKeyedValues2D1.getRowKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) -1);
        java.lang.Class<?> wildcardClass5 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) "hi!", (java.lang.Number) 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Number number17 = null;
        defaultKeyedValues2D0.addValue(number17, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 1);
        int int22 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        java.lang.Comparable comparable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultKeyedValues2D0.getValue(comparable23, (java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        int int10 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) 100);
        int int20 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) "hi!", (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D9 = new org.jfree.data.DefaultKeyedValues2D();
        int int11 = defaultKeyedValues2D9.getRowIndex((java.lang.Comparable) 10);
        int int12 = defaultKeyedValues2D9.getRowCount();
        defaultKeyedValues2D9.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) ' ');
        defaultKeyedValues2D9.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 10);
        java.util.List list19 = defaultKeyedValues2D9.getRowKeys();
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) list19);
        org.jfree.chart.util.SortOrder sortOrder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int5 = defaultKeyedValues2D0.getColumnCount();
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D0.getColumnKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        int int18 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.removeRow(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        int int16 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }
}

