package org.jfree.data;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        int int2 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', 0.0d);
        java.lang.Comparable comparable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = defaultKeyedValues0.getIndex(comparable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.util.List list20 = defaultKeyedValues0.getKeys();
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable21, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.clear();
        int int17 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0.0f);
        java.util.List list17 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int16 = defaultKeyedValues2D4.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D4.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 0);
        int int21 = defaultKeyedValues2D4.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list23 = defaultKeyedValues2D22.getRowKeys();
        int int24 = defaultKeyedValues2D22.getRowCount();
        int int25 = defaultKeyedValues2D22.getRowCount();
        boolean boolean27 = defaultKeyedValues2D22.equals((java.lang.Object) 10.0f);
        int int29 = defaultKeyedValues2D22.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D30 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list31 = defaultKeyedValues2D30.getRowKeys();
        int int32 = defaultKeyedValues2D30.getRowCount();
        int int33 = defaultKeyedValues2D30.getRowCount();
        boolean boolean35 = defaultKeyedValues2D30.equals((java.lang.Object) 10.0f);
        int int37 = defaultKeyedValues2D30.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D30.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D30.clear();
        boolean boolean42 = defaultKeyedValues2D22.equals((java.lang.Object) defaultKeyedValues2D30);
        java.util.List list43 = defaultKeyedValues2D30.getRowKeys();
        boolean boolean44 = defaultKeyedValues2D4.equals((java.lang.Object) defaultKeyedValues2D30);
        java.util.List list45 = defaultKeyedValues2D4.getColumnKeys();
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) (short) 10);
        int int49 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 100.0f);
        boolean boolean50 = defaultKeyedValues2D0.equals((java.lang.Object) int49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number53 = defaultKeyedValues2D0.getValue((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        int int18 = defaultKeyedValues2D4.getColumnCount();
        java.util.List list19 = defaultKeyedValues2D4.getRowKeys();
        int int20 = defaultKeyedValues2D4.getRowCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (-1.0d));
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, (double) (short) 0);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) -1);
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        boolean boolean8 = defaultKeyedValues2D0.equals((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) '#', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        int int8 = defaultKeyedValues2D6.getRowCount();
        int int9 = defaultKeyedValues2D6.getRowCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) int9);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 3);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        java.util.List list22 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        int int18 = defaultKeyedValues2D4.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list20 = defaultKeyedValues2D19.getRowKeys();
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D19.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        boolean boolean29 = defaultKeyedValues2D19.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D19.clear();
        java.util.List list31 = defaultKeyedValues2D19.getColumnKeys();
        boolean boolean32 = defaultKeyedValues2D4.equals((java.lang.Object) defaultKeyedValues2D19);
        int int34 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) "");
        java.lang.Object obj35 = defaultKeyedValues2D19.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        java.lang.Object obj40 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D();
        int int7 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D5.getColumnKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, (double) 3);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1));
        org.jfree.chart.util.SortOrder sortOrder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        int int14 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0d);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        int int19 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D20 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list21 = defaultKeyedValues2D20.getRowKeys();
        int int22 = defaultKeyedValues2D20.getRowCount();
        int int23 = defaultKeyedValues2D20.getRowCount();
        boolean boolean25 = defaultKeyedValues2D20.equals((java.lang.Object) 10.0f);
        java.util.List list26 = defaultKeyedValues2D20.getColumnKeys();
        defaultKeyedValues2D20.removeColumn((java.lang.Comparable) 2);
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) 1L, (java.lang.Comparable) "hi!");
        defaultKeyedValues2D20.addValue((java.lang.Number) 4, (java.lang.Comparable) (short) 0, (java.lang.Comparable) '4');
        boolean boolean36 = defaultKeyedValues2D0.equals((java.lang.Object) 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean17 = defaultKeyedValues9.equals((java.lang.Object) 0L);
        int int19 = defaultKeyedValues9.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues9.removeValue((java.lang.Comparable) 0.0d);
        int int23 = defaultKeyedValues9.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues9.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues9.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) 100);
        defaultKeyedValues9.clear();
        boolean boolean30 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues9);
        int int31 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = defaultKeyedValues2D0.getRowKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        defaultKeyedValues2D12.removeValue((java.lang.Comparable) 4, (java.lang.Comparable) 'a');
        defaultKeyedValues2D12.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D12.removeRow((java.lang.Comparable) 10.0f);
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D9 = new org.jfree.data.DefaultKeyedValues2D();
        int int11 = defaultKeyedValues2D9.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D9.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D9.clear();
        defaultKeyedValues2D9.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int21 = defaultKeyedValues2D9.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D9.clear();
        defaultKeyedValues2D9.clear();
        defaultKeyedValues2D9.addValue((java.lang.Number) 52.0d, (java.lang.Comparable) 2, (java.lang.Comparable) 100.0f);
        boolean boolean28 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = defaultKeyedValues2D9.getValue((java.lang.Comparable) '#', (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: true");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 3, (java.lang.Comparable) 1L);
        defaultKeyedValues2D0.removeColumn(0);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0);
        defaultKeyedValues2D0.setValue((java.lang.Number) 2, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (byte) -1);
        int int18 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        int int34 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj35 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable37 = defaultKeyedValues0.getKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) 3);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        int int17 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.clear();
        int int20 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        int int25 = defaultKeyedValues23.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues23.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj29 = defaultKeyedValues23.clone();
        java.lang.Object obj30 = null;
        boolean boolean31 = defaultKeyedValues23.equals(obj30);
        boolean boolean32 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues23);
        int int33 = defaultKeyedValues23.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = defaultKeyedValues23.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (byte) 100, (double) '#');
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (short) 100, (java.lang.Number) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.removeValue(1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues0.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (double) 100.0f);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues2D0.getValue(4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D0.getValue((java.lang.Comparable) "", (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: false");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        java.lang.Number number11 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) 10);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) 3, (java.lang.Number) (byte) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean21 = defaultKeyedValues13.equals((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultKeyedValues13.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean31 = defaultKeyedValues23.equals((java.lang.Object) 0L);
        int int33 = defaultKeyedValues23.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues23.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean36 = defaultKeyedValues13.equals((java.lang.Object) 0.0d);
        defaultKeyedValues13.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues13.removeValue((java.lang.Comparable) (short) 1);
        defaultKeyedValues13.addValue((java.lang.Comparable) 1, 10.0d);
        java.lang.Object obj45 = defaultKeyedValues13.clone();
        defaultKeyedValues13.removeValue(0);
        boolean boolean48 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues13);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 3);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) (short) 1, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 4, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.clear();
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean23 = defaultKeyedValues15.equals((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultKeyedValues15.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean33 = defaultKeyedValues25.equals((java.lang.Object) 0L);
        int int35 = defaultKeyedValues25.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues25.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean38 = defaultKeyedValues15.equals((java.lang.Object) 0.0d);
        defaultKeyedValues15.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues15.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) (byte) 0);
        defaultKeyedValues15.addValue((java.lang.Comparable) 100.0d, (double) (byte) 100);
        boolean boolean48 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues15);
        java.lang.Object obj49 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        java.util.List list15 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (double) (byte) -1);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 6, (java.lang.Number) 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (java.lang.Number) 0);
        defaultKeyedValues0.clear();
        int int39 = defaultKeyedValues0.getItemCount();
        int int41 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        java.lang.Object obj24 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 35.0d, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 35.0d + "'", number23, 35.0d);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        int int6 = defaultKeyedValues2D1.getRowCount();
        java.util.List list7 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        java.util.List list18 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultKeyedValues0.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        java.lang.Number number13 = null;
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) '#', number13);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues0.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 3, (java.lang.Comparable) 1L);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 2);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) 10L, (java.lang.Comparable) (short) 10);
        java.util.List list17 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) false);
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 'a');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues2D0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 10L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list23 = defaultKeyedValues2D22.getRowKeys();
        int int24 = defaultKeyedValues2D22.getRowCount();
        int int25 = defaultKeyedValues2D22.getRowCount();
        int int27 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) '4');
        int int28 = defaultKeyedValues2D22.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues33 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues33.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean37 = defaultKeyedValues29.equals((java.lang.Object) 0L);
        int int39 = defaultKeyedValues29.getIndex((java.lang.Comparable) 1L);
        int int41 = defaultKeyedValues29.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj42 = defaultKeyedValues29.clone();
        boolean boolean43 = defaultKeyedValues2D22.equals(obj42);
        java.util.List list44 = defaultKeyedValues2D22.getRowKeys();
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        defaultKeyedValues2D22.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues52 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues52.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues52.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues52.setValue((java.lang.Comparable) true, (double) '4');
        int int62 = defaultKeyedValues52.getItemCount();
        boolean boolean63 = defaultKeyedValues2D22.equals((java.lang.Object) int62);
        boolean boolean64 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D22);
        java.lang.Object obj65 = defaultKeyedValues2D22.clone();
        int int67 = defaultKeyedValues2D22.getColumnIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D22.removeColumn((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        int int24 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
            defaultKeyedValues0.sortByValues(sortOrder18);
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
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        defaultKeyedValues0.removeValue((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj19 = defaultKeyedValues15.clone();
        int int21 = defaultKeyedValues15.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues15.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.SortOrder sortOrder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        int int26 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 4, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised rowKey: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        int int15 = defaultKeyedValues0.getItemCount();
        java.lang.Number number17 = defaultKeyedValues0.getValue(0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        int int20 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) 10);
        int int21 = defaultKeyedValues2D18.getRowCount();
        defaultKeyedValues2D18.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) ' ');
        defaultKeyedValues2D18.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 10);
        java.util.List list28 = defaultKeyedValues2D18.getRowKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list30 = defaultKeyedValues2D29.getRowKeys();
        defaultKeyedValues2D29.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D29.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int38 = defaultKeyedValues2D29.getColumnCount();
        defaultKeyedValues2D29.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 3, (java.lang.Comparable) (byte) 1);
        boolean boolean43 = defaultKeyedValues2D18.equals((java.lang.Object) (byte) 10);
        int int44 = defaultKeyedValues2D18.getColumnCount();
        boolean boolean45 = defaultKeyedValues0.equals((java.lang.Object) int44);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 0L + "'", number17, 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) '#', (double) 'a');
        defaultKeyedValues0.clear();
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 2);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1L, (java.lang.Comparable) "hi!");
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        int int17 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D();
        int int23 = defaultKeyedValues2D21.getRowIndex((java.lang.Comparable) 10);
        int int24 = defaultKeyedValues2D21.getRowCount();
        java.lang.Object obj25 = defaultKeyedValues2D21.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues30.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean34 = defaultKeyedValues26.equals((java.lang.Object) 0L);
        int int36 = defaultKeyedValues26.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues26.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean39 = defaultKeyedValues2D21.equals((java.lang.Object) defaultKeyedValues26);
        boolean boolean40 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable42 = defaultKeyedValues0.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 3);
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        int int18 = defaultKeyedValues2D16.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D16.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean31 = defaultKeyedValues23.equals((java.lang.Object) 0L);
        int int33 = defaultKeyedValues23.getIndex((java.lang.Comparable) 1L);
        int int35 = defaultKeyedValues23.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj36 = defaultKeyedValues23.clone();
        boolean boolean37 = defaultKeyedValues2D16.equals((java.lang.Object) defaultKeyedValues23);
        java.util.List list38 = defaultKeyedValues2D16.getColumnKeys();
        defaultKeyedValues2D16.clear();
        java.util.List list40 = defaultKeyedValues2D16.getColumnKeys();
        defaultKeyedValues2D16.removeColumn((java.lang.Comparable) (-1.0f));
        boolean boolean43 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D16);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D16.removeRow((java.lang.Comparable) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        java.util.List list14 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues2D0.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (-1.0d));
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        defaultKeyedValues2D0.removeRow((int) (byte) 0);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj15 = defaultKeyedValues2D0.clone();
        java.lang.Class<?> wildcardClass16 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) "");
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D0.getValue(6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
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
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list4 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D8.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        boolean boolean16 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        int int18 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.lang.Class<?> wildcardClass19 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, 100.0d);
        int int22 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 1);
        java.util.List list25 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10);
        int int28 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        int int18 = defaultKeyedValues2D16.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D16.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean31 = defaultKeyedValues23.equals((java.lang.Object) 0L);
        int int33 = defaultKeyedValues23.getIndex((java.lang.Comparable) 1L);
        int int35 = defaultKeyedValues23.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj36 = defaultKeyedValues23.clone();
        boolean boolean37 = defaultKeyedValues2D16.equals((java.lang.Object) defaultKeyedValues23);
        java.util.List list38 = defaultKeyedValues2D16.getColumnKeys();
        defaultKeyedValues2D16.clear();
        java.util.List list40 = defaultKeyedValues2D16.getColumnKeys();
        defaultKeyedValues2D16.removeColumn((java.lang.Comparable) (-1.0f));
        boolean boolean43 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D16);
        java.util.List list44 = defaultKeyedValues2D16.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) (short) 0, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D1.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, 10.0d);
        int int20 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10);
        org.jfree.chart.util.SortOrder sortOrder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        java.lang.Object obj7 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D0.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        int int17 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.clear();
        java.lang.Object obj19 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        int int31 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0L);
        int int33 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1L);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getRowKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "");
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues0.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        java.util.List list21 = defaultKeyedValues2D20.getRowKeys();
        int int22 = defaultKeyedValues2D20.getRowCount();
        int int23 = defaultKeyedValues2D20.getRowCount();
        int int25 = defaultKeyedValues2D20.getRowIndex((java.lang.Comparable) '4');
        int int26 = defaultKeyedValues2D20.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues31.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean35 = defaultKeyedValues27.equals((java.lang.Object) 0L);
        int int37 = defaultKeyedValues27.getIndex((java.lang.Comparable) 1L);
        int int39 = defaultKeyedValues27.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj40 = defaultKeyedValues27.clone();
        boolean boolean41 = defaultKeyedValues2D20.equals(obj40);
        java.util.List list42 = defaultKeyedValues2D20.getRowKeys();
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        defaultKeyedValues2D20.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        int int51 = defaultKeyedValues2D20.getColumnIndex((java.lang.Comparable) true);
        defaultKeyedValues2D20.setValue((java.lang.Number) (byte) 100, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        boolean boolean56 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D20);
        java.lang.Comparable comparable58 = defaultKeyedValues2D20.getRowKey((int) (short) 0);
        java.lang.Number number59 = null;
        defaultKeyedValues2D20.addValue(number59, (java.lang.Comparable) 0L, (java.lang.Comparable) 'a');
        defaultKeyedValues2D20.removeColumn(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D20.removeRow((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + comparable58 + "' != '" + (short) -1 + "'", comparable58, (short) -1);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.util.List list4 = defaultKeyedValues2D0.getRowKeys();
        int int6 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) "", (java.lang.Comparable) 1);
        defaultKeyedValues2D1.removeRow((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D1.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (double) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 3);
        org.jfree.chart.util.SortOrder sortOrder28 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        int int7 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D0.getRowKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) "hi!");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean19 = defaultKeyedValues11.equals((java.lang.Object) 0L);
        defaultKeyedValues11.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues11.addValue((java.lang.Comparable) (short) 10, 1.0d);
        boolean boolean26 = defaultKeyedValues2D0.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass27 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (short) 100, (java.lang.Number) 4);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        int int20 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D18.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D18.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean33 = defaultKeyedValues25.equals((java.lang.Object) 0L);
        int int35 = defaultKeyedValues25.getIndex((java.lang.Comparable) 1L);
        int int37 = defaultKeyedValues25.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj38 = defaultKeyedValues25.clone();
        boolean boolean39 = defaultKeyedValues2D18.equals((java.lang.Object) defaultKeyedValues25);
        boolean boolean40 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 0 + "'", comparable22, (short) 0);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) (-1L));
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 3);
        java.lang.Class<?> wildcardClass6 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: false");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        java.util.List list15 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (double) (byte) -1);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues0.getValue((java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.clear();
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean23 = defaultKeyedValues15.equals((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultKeyedValues15.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean33 = defaultKeyedValues25.equals((java.lang.Object) 0L);
        int int35 = defaultKeyedValues25.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues25.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean38 = defaultKeyedValues15.equals((java.lang.Object) 0.0d);
        defaultKeyedValues15.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues15.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) (byte) 0);
        defaultKeyedValues15.addValue((java.lang.Comparable) 100.0d, (double) (byte) 100);
        boolean boolean48 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number51 = defaultKeyedValues2D0.getValue((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        int int15 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list20 = defaultKeyedValues2D19.getRowKeys();
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D19.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int29 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list30 = defaultKeyedValues2D19.getColumnKeys();
        defaultKeyedValues2D19.removeColumn((java.lang.Comparable) (-1L));
        boolean boolean33 = defaultKeyedValues2D13.equals((java.lang.Object) (-1L));
        boolean boolean34 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D13);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        defaultKeyedValues2D12.removeValue((java.lang.Comparable) 4, (java.lang.Comparable) 'a');
        java.util.List list27 = defaultKeyedValues2D12.getRowKeys();
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
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) -1);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues3 = new org.jfree.data.DefaultKeyedValues();
        int int5 = defaultKeyedValues3.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues3.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj9 = defaultKeyedValues3.clone();
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues3);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean19 = defaultKeyedValues11.equals((java.lang.Object) 0L);
        int int21 = defaultKeyedValues11.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues11.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues11.clear();
        defaultKeyedValues11.setValue((java.lang.Comparable) (byte) -1, 35.0d);
        boolean boolean29 = defaultKeyedValues2D0.equals((java.lang.Object) 35.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (-1));
        java.lang.Comparable comparable36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = defaultKeyedValues2D0.getColumnIndex(comparable36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1), (java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        int int15 = defaultKeyedValues2D0.getColumnCount();
        int int16 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list17 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0.0f);
        java.util.List list30 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
        int int24 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultKeyedValues0.getKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 10);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list16 = defaultKeyedValues2D15.getRowKeys();
        int int17 = defaultKeyedValues2D15.getRowCount();
        int int18 = defaultKeyedValues2D15.getRowCount();
        int int20 = defaultKeyedValues2D15.getRowIndex((java.lang.Comparable) '4');
        int int21 = defaultKeyedValues2D15.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean30 = defaultKeyedValues22.equals((java.lang.Object) 0L);
        int int32 = defaultKeyedValues22.getIndex((java.lang.Comparable) 1L);
        int int34 = defaultKeyedValues22.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj35 = defaultKeyedValues22.clone();
        boolean boolean36 = defaultKeyedValues2D15.equals(obj35);
        java.util.List list37 = defaultKeyedValues2D15.getRowKeys();
        defaultKeyedValues2D15.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        int int42 = defaultKeyedValues2D15.getRowIndex((java.lang.Comparable) 10);
        boolean boolean43 = defaultKeyedValues2D0.equals((java.lang.Object) 10);
        int int45 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number48 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 97.0d, (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (java.lang.Number) 100L);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) -1, (java.lang.Comparable) (short) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        int int12 = defaultKeyedValues2D0.getRowCount();
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 35.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        int int22 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable27 = defaultKeyedValues2D0.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 3, (java.lang.Comparable) (byte) 1);
        java.util.List list14 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 0);
        int int17 = defaultKeyedValues2D0.getRowCount();
        int int19 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        java.lang.Object obj24 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean33 = defaultKeyedValues25.equals((java.lang.Object) 0L);
        int int35 = defaultKeyedValues25.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues25.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues25.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues25.addValue((java.lang.Comparable) 0, (double) (short) 1);
        java.lang.Object obj46 = defaultKeyedValues25.clone();
        java.lang.Number number48 = defaultKeyedValues25.getValue(0);
        java.lang.Number number50 = defaultKeyedValues25.getValue((java.lang.Comparable) 0);
        boolean boolean51 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues25);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (short) 0);
        int int56 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 35.0d + "'", number23, 35.0d);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals("'" + number48 + "' != '" + 35.0d + "'", number48, 35.0d);
        org.junit.Assert.assertEquals("'" + number50 + "' != '" + 1.0d + "'", number50, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultKeyedValues2D1.getValue(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 35.0d, (java.lang.Comparable) 97.0d, (java.lang.Comparable) 10L);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        int int31 = defaultKeyedValues0.getItemCount();
        int int32 = defaultKeyedValues0.getItemCount();
        java.lang.Number number34 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + 0L + "'", number34, 0L);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        defaultKeyedValues10.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) 2);
        java.lang.Number number47 = defaultKeyedValues10.getValue((int) (byte) 1);
        java.lang.Object obj48 = defaultKeyedValues10.clone();
        defaultKeyedValues10.addValue((java.lang.Comparable) (byte) 0, (double) (short) -1);
        java.lang.Object obj52 = defaultKeyedValues10.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + number47 + "' != '" + (short) 1 + "'", number47, (short) 1);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        defaultKeyedValues2D18.addValue((java.lang.Number) 3, (java.lang.Comparable) 35.0d, (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D18.addValue((java.lang.Number) 3, (java.lang.Comparable) 0L, (java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable30 = defaultKeyedValues2D18.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0.0f);
        int int30 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) 1L, (java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100.0f);
        int int12 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 97.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list18 = defaultKeyedValues2D17.getRowKeys();
        int int19 = defaultKeyedValues2D17.getRowCount();
        int int20 = defaultKeyedValues2D17.getRowCount();
        boolean boolean22 = defaultKeyedValues2D17.equals((java.lang.Object) 10.0f);
        int int24 = defaultKeyedValues2D17.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list26 = defaultKeyedValues2D25.getRowKeys();
        int int27 = defaultKeyedValues2D25.getRowCount();
        int int28 = defaultKeyedValues2D25.getRowCount();
        boolean boolean30 = defaultKeyedValues2D25.equals((java.lang.Object) 10.0f);
        int int32 = defaultKeyedValues2D25.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D25.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D25.clear();
        boolean boolean37 = defaultKeyedValues2D17.equals((java.lang.Object) defaultKeyedValues2D25);
        defaultKeyedValues2D17.removeColumn((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D17.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) "hi!");
        defaultKeyedValues2D17.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (-1.0f));
        boolean boolean48 = defaultKeyedValues2D0.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) "");
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues12.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues12.insertValue((int) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Number) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D20 = new org.jfree.data.DefaultKeyedValues2D();
        int int22 = defaultKeyedValues2D20.getRowIndex((java.lang.Comparable) 10);
        int int23 = defaultKeyedValues2D20.getRowCount();
        java.lang.Object obj24 = defaultKeyedValues2D20.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean33 = defaultKeyedValues25.equals((java.lang.Object) 0L);
        int int35 = defaultKeyedValues25.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues25.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean38 = defaultKeyedValues2D20.equals((java.lang.Object) defaultKeyedValues25);
        defaultKeyedValues2D20.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) 2, (java.lang.Comparable) 4);
        boolean boolean43 = defaultKeyedValues12.equals((java.lang.Object) defaultKeyedValues2D20);
        java.util.List list44 = defaultKeyedValues12.getKeys();
        boolean boolean45 = defaultKeyedValues2D0.equals((java.lang.Object) list44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 10);
        int int13 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        int int18 = defaultKeyedValues2D4.getColumnCount();
        int int20 = defaultKeyedValues2D4.getColumnIndex((java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultKeyedValues2D4.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        java.lang.Number number8 = defaultKeyedValues0.getValue(0);
        java.lang.Comparable comparable10 = defaultKeyedValues0.getKey((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + (-1L) + "'", number8, (-1L));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 0L + "'", comparable10, 0L);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj19 = defaultKeyedValues15.clone();
        int int21 = defaultKeyedValues15.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues15.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = null;
        boolean boolean27 = defaultKeyedValues0.equals(obj26);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues28 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues28.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues32 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues32.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean36 = defaultKeyedValues28.equals((java.lang.Object) 0L);
        int int38 = defaultKeyedValues28.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues28.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues28.clear();
        int int43 = defaultKeyedValues28.getItemCount();
        boolean boolean44 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues28);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues28.insertValue((int) ' ', (java.lang.Comparable) (short) 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 10L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 97.0d, (double) (short) 10);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        int int26 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.setValue((java.lang.Number) 4, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 1);
        defaultKeyedValues2D0.removeColumn(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int3 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (byte) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        java.lang.Object obj14 = defaultKeyedValues2D8.clone();
        boolean boolean15 = defaultKeyedValues2D1.equals(obj14);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class java.lang.Byte (java.lang.Boolean and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean17 = defaultKeyedValues9.equals((java.lang.Object) 0L);
        int int19 = defaultKeyedValues9.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues9.removeValue((java.lang.Comparable) 0.0d);
        int int23 = defaultKeyedValues9.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues9.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues9.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) 100);
        defaultKeyedValues9.clear();
        boolean boolean30 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues9);
        int int31 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = defaultKeyedValues2D0.getValue((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 0);
        java.util.List list17 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 10.0d);
        java.lang.Comparable comparable19 = defaultKeyedValues0.getKey((int) (byte) 1);
        java.lang.Comparable comparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(2, comparable21, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (byte) -1 + "'", comparable19, (byte) -1);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D27 = new org.jfree.data.DefaultKeyedValues2D();
        int int29 = defaultKeyedValues2D27.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D27.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D27.clear();
        defaultKeyedValues2D27.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D27.clear();
        defaultKeyedValues2D27.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D27.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D27.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100);
        java.util.List list49 = defaultKeyedValues2D27.getColumnKeys();
        boolean boolean50 = defaultKeyedValues2D0.equals((java.lang.Object) list49);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) 100, (java.lang.Comparable) '4');
        java.lang.Comparable comparable20 = defaultKeyedValues2D0.getColumnKey(0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1.0f + "'", comparable20, 1.0f);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
            java.lang.Number number13 = defaultKeyedValues2D0.getValue((int) (byte) 0, (int) (short) 100);
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
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Number) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        int int10 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) 10);
        int int11 = defaultKeyedValues2D8.getRowCount();
        java.lang.Object obj12 = defaultKeyedValues2D8.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean21 = defaultKeyedValues13.equals((java.lang.Object) 0L);
        int int23 = defaultKeyedValues13.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues13.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean26 = defaultKeyedValues2D8.equals((java.lang.Object) defaultKeyedValues13);
        defaultKeyedValues2D8.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) 2, (java.lang.Comparable) 4);
        boolean boolean31 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues32 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues32.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues32.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues32.removeValue((java.lang.Comparable) (byte) 0);
        int int41 = defaultKeyedValues32.getItemCount();
        defaultKeyedValues32.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj45 = defaultKeyedValues32.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D46 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list47 = defaultKeyedValues2D46.getRowKeys();
        int int48 = defaultKeyedValues2D46.getRowCount();
        int int49 = defaultKeyedValues2D46.getRowCount();
        boolean boolean51 = defaultKeyedValues2D46.equals((java.lang.Object) 10.0f);
        java.lang.Object obj52 = defaultKeyedValues2D46.clone();
        defaultKeyedValues2D46.clear();
        boolean boolean54 = defaultKeyedValues32.equals((java.lang.Object) defaultKeyedValues2D46);
        boolean boolean55 = defaultKeyedValues2D8.equals((java.lang.Object) defaultKeyedValues2D46);
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) 10);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (double) '4');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues3 = new org.jfree.data.DefaultKeyedValues();
        int int5 = defaultKeyedValues3.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues3.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj9 = defaultKeyedValues3.clone();
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues3);
        defaultKeyedValues3.addValue((java.lang.Comparable) 35.0d, (java.lang.Number) 10L);
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues3.addValue(comparable14, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D0.getValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        int int34 = defaultKeyedValues2D16.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D();
        int int37 = defaultKeyedValues2D35.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D35.addValue((java.lang.Number) 3, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 0.0d);
        java.util.List list42 = defaultKeyedValues2D35.getRowKeys();
        boolean boolean43 = defaultKeyedValues2D16.equals((java.lang.Object) defaultKeyedValues2D35);
        defaultKeyedValues2D35.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list4 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1));
        int int8 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
            java.lang.Number number24 = defaultKeyedValues2D10.getValue(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
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
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        java.lang.Object obj12 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (java.lang.Number) 100L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (java.lang.Number) 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) ' ', (double) 100L);
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
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (double) 100.0f);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 10.0f, (java.lang.Number) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) 10L);
        org.jfree.chart.util.SortOrder sortOrder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "");
        defaultKeyedValues0.clear();
        java.util.List list13 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 97.0d, (double) 4);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1), (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 100.0d);
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
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) 35.0d);
        int int26 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100);
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues2D0.getValue((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int3 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (byte) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        java.lang.Object obj14 = defaultKeyedValues2D8.clone();
        boolean boolean15 = defaultKeyedValues2D1.equals(obj14);
        defaultKeyedValues2D1.clear();
        java.util.List list17 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        int int13 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 3, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 52.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0.0f);
        java.util.List list30 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list31 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.removeColumn(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100);
        java.util.List list22 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 1, (java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: #");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 'a', (java.lang.Number) (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) false, (java.lang.Comparable) 'a');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj22 = defaultKeyedValues18.clone();
        int int24 = defaultKeyedValues18.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues18.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        defaultKeyedValues18.removeValue((java.lang.Comparable) (short) -1);
        boolean boolean30 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues18);
        java.lang.Number number32 = defaultKeyedValues18.getValue((int) (byte) 1);
        defaultKeyedValues18.addValue((java.lang.Comparable) '4', 35.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 0 + "'", number32, 0);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        java.lang.Object obj24 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean33 = defaultKeyedValues25.equals((java.lang.Object) 0L);
        int int35 = defaultKeyedValues25.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues25.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues25.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues25.addValue((java.lang.Comparable) 0, (double) (short) 1);
        java.lang.Object obj46 = defaultKeyedValues25.clone();
        java.lang.Number number48 = defaultKeyedValues25.getValue(0);
        java.lang.Number number50 = defaultKeyedValues25.getValue((java.lang.Comparable) 0);
        boolean boolean51 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues25);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues25.insertValue((int) (short) 100, (java.lang.Comparable) (short) -1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 35.0d + "'", number23, 35.0d);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals("'" + number48 + "' != '" + 35.0d + "'", number48, 35.0d);
        org.junit.Assert.assertEquals("'" + number50 + "' != '" + 1.0d + "'", number50, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        int int25 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues0.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "");
        int int13 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) "");
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.lang.Object obj12 = defaultKeyedValues2D0.clone();
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 3, (java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D9 = new org.jfree.data.DefaultKeyedValues2D();
        int int11 = defaultKeyedValues2D9.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D9.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D9.clear();
        defaultKeyedValues2D9.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int21 = defaultKeyedValues2D9.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D9.clear();
        defaultKeyedValues2D9.clear();
        defaultKeyedValues2D9.addValue((java.lang.Number) 52.0d, (java.lang.Comparable) 2, (java.lang.Comparable) 100.0f);
        boolean boolean28 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D9);
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) 52.0d, (java.lang.Comparable) 3);
        defaultKeyedValues2D0.removeColumn((int) (short) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        java.lang.Object obj7 = null;
        boolean boolean8 = defaultKeyedValues0.equals(obj7);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (java.lang.Number) (byte) 1);
        org.jfree.chart.util.SortOrder sortOrder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        java.util.List list10 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 97.0d);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        int int24 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (byte) 10, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 35.0d + "'", number23, 35.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        int int8 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        defaultKeyedValues2D18.clear();
        int int22 = defaultKeyedValues2D18.getColumnCount();
        java.util.List list23 = defaultKeyedValues2D18.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 10L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list23 = defaultKeyedValues2D22.getRowKeys();
        int int24 = defaultKeyedValues2D22.getRowCount();
        int int25 = defaultKeyedValues2D22.getRowCount();
        int int27 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) '4');
        int int28 = defaultKeyedValues2D22.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues33 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues33.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean37 = defaultKeyedValues29.equals((java.lang.Object) 0L);
        int int39 = defaultKeyedValues29.getIndex((java.lang.Comparable) 1L);
        int int41 = defaultKeyedValues29.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj42 = defaultKeyedValues29.clone();
        boolean boolean43 = defaultKeyedValues2D22.equals(obj42);
        java.util.List list44 = defaultKeyedValues2D22.getRowKeys();
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        defaultKeyedValues2D22.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues52 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues52.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues52.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues52.setValue((java.lang.Comparable) true, (double) '4');
        int int62 = defaultKeyedValues52.getItemCount();
        boolean boolean63 = defaultKeyedValues2D22.equals((java.lang.Object) int62);
        boolean boolean64 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D22);
        defaultKeyedValues2D22.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 0, (java.lang.Comparable) 0.0f);
        java.util.List list69 = defaultKeyedValues2D22.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable71 = defaultKeyedValues2D22.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(list69);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, 10.0d);
        java.lang.Object obj32 = defaultKeyedValues0.clone();
        int int34 = defaultKeyedValues0.getIndex((java.lang.Comparable) 3);
        int int36 = defaultKeyedValues0.getIndex((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = defaultKeyedValues0.getValue((java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 10L);
        java.lang.Comparable comparable23 = defaultKeyedValues0.getKey(0);
        java.util.List list24 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultKeyedValues0.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 100 + "'", comparable23, 100);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) (short) 0, (java.lang.Comparable) "hi!");
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultKeyedValues2D0.getValue((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
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
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (double) (-1L));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        int int21 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D19.clear();
        defaultKeyedValues2D19.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D19.removeColumn((java.lang.Comparable) 10L);
        boolean boolean32 = defaultKeyedValues15.equals((java.lang.Object) defaultKeyedValues2D19);
        int int34 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) "hi!");
        java.util.List list35 = defaultKeyedValues2D19.getRowKeys();
        java.lang.Object obj36 = defaultKeyedValues2D19.clone();
        boolean boolean37 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D19);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        java.lang.Number number13 = null;
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) '#', number13);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        java.lang.Class<?> wildcardClass18 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 0);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list19 = defaultKeyedValues2D18.getRowKeys();
        int int20 = defaultKeyedValues2D18.getRowCount();
        int int21 = defaultKeyedValues2D18.getRowCount();
        boolean boolean23 = defaultKeyedValues2D18.equals((java.lang.Object) 10.0f);
        int int25 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list27 = defaultKeyedValues2D26.getRowKeys();
        int int28 = defaultKeyedValues2D26.getRowCount();
        int int29 = defaultKeyedValues2D26.getRowCount();
        boolean boolean31 = defaultKeyedValues2D26.equals((java.lang.Object) 10.0f);
        int int33 = defaultKeyedValues2D26.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D26.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D26.clear();
        boolean boolean38 = defaultKeyedValues2D18.equals((java.lang.Object) defaultKeyedValues2D26);
        java.util.List list39 = defaultKeyedValues2D26.getRowKeys();
        boolean boolean40 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable42 = defaultKeyedValues2D0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int3 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (byte) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        java.lang.Object obj14 = defaultKeyedValues2D8.clone();
        boolean boolean15 = defaultKeyedValues2D1.equals(obj14);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 97.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        int int11 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) "hi!", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, 100.0d);
        int int22 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 1);
        java.lang.Number number26 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + number26 + "' != '" + 0L + "'", number26, 0L);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 0);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list19 = defaultKeyedValues2D18.getRowKeys();
        int int20 = defaultKeyedValues2D18.getRowCount();
        int int21 = defaultKeyedValues2D18.getRowCount();
        boolean boolean23 = defaultKeyedValues2D18.equals((java.lang.Object) 10.0f);
        int int25 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list27 = defaultKeyedValues2D26.getRowKeys();
        int int28 = defaultKeyedValues2D26.getRowCount();
        int int29 = defaultKeyedValues2D26.getRowCount();
        boolean boolean31 = defaultKeyedValues2D26.equals((java.lang.Object) 10.0f);
        int int33 = defaultKeyedValues2D26.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D26.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D26.clear();
        boolean boolean38 = defaultKeyedValues2D18.equals((java.lang.Object) defaultKeyedValues2D26);
        java.util.List list39 = defaultKeyedValues2D26.getRowKeys();
        boolean boolean40 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D26);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D42 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int44 = defaultKeyedValues2D42.getRowIndex((java.lang.Comparable) '#');
        int int46 = defaultKeyedValues2D42.getColumnIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D42.clear();
        defaultKeyedValues2D42.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) ' ', (java.lang.Comparable) 3);
        int int53 = defaultKeyedValues2D42.getColumnIndex((java.lang.Comparable) 0.0f);
        java.util.List list54 = defaultKeyedValues2D42.getColumnKeys();
        boolean boolean55 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D42);
        int int57 = defaultKeyedValues2D42.getColumnIndex((java.lang.Comparable) '4');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues58 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues58.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues62 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues62.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean66 = defaultKeyedValues58.equals((java.lang.Object) 0L);
        int int68 = defaultKeyedValues58.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues58.removeValue((java.lang.Comparable) 0.0d);
        int int72 = defaultKeyedValues58.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues58.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues58.addValue((java.lang.Comparable) 0, (double) 4);
        boolean boolean78 = defaultKeyedValues2D42.equals((java.lang.Object) 0);
        defaultKeyedValues2D42.removeColumn((java.lang.Comparable) (byte) 1);
        int int82 = defaultKeyedValues2D42.getColumnIndex((java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D42.removeRow(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) ' ');
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (double) 2);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass11 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (java.lang.Number) (byte) 10);
        java.lang.Object obj17 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (java.lang.Number) 10L);
        defaultKeyedValues0.insertValue(4, (java.lang.Comparable) 3, (java.lang.Number) 4);
        org.jfree.chart.util.SortOrder sortOrder25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues3 = new org.jfree.data.DefaultKeyedValues();
        int int5 = defaultKeyedValues3.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues3.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj9 = defaultKeyedValues3.clone();
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues3);
        defaultKeyedValues3.addValue((java.lang.Comparable) 35.0d, (java.lang.Number) 10L);
        defaultKeyedValues3.insertValue((int) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Number) 100.0d);
        defaultKeyedValues3.insertValue(0, (java.lang.Comparable) 35.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        int int21 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D19.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues30.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean34 = defaultKeyedValues26.equals((java.lang.Object) 0L);
        int int36 = defaultKeyedValues26.getIndex((java.lang.Comparable) 1L);
        int int38 = defaultKeyedValues26.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj39 = defaultKeyedValues26.clone();
        boolean boolean40 = defaultKeyedValues2D19.equals((java.lang.Object) defaultKeyedValues26);
        boolean boolean41 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues26);
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 6, (java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D0.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass9 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.clear();
        java.lang.Object obj12 = defaultKeyedValues2D0.clone();
        int int13 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D0.getRowKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        int int34 = defaultKeyedValues2D16.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D();
        int int37 = defaultKeyedValues2D35.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D35.addValue((java.lang.Number) 3, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 0.0d);
        java.util.List list42 = defaultKeyedValues2D35.getRowKeys();
        boolean boolean43 = defaultKeyedValues2D16.equals((java.lang.Object) defaultKeyedValues2D35);
        defaultKeyedValues2D16.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) ' ', (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100);
        java.util.List list22 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.clear();
        int int24 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 35.0d, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable30 = defaultKeyedValues2D0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D0.getValue((int) '4', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '4');
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, 100.0d);
        int int21 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) (-1.0f));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D();
        int int27 = defaultKeyedValues2D25.getRowIndex((java.lang.Comparable) 10);
        int int28 = defaultKeyedValues2D25.getRowCount();
        defaultKeyedValues2D25.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int33 = defaultKeyedValues2D25.getRowCount();
        java.util.List list34 = defaultKeyedValues2D25.getColumnKeys();
        defaultKeyedValues2D25.removeColumn((int) (byte) 0);
        java.util.List list37 = defaultKeyedValues2D25.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D38 = new org.jfree.data.DefaultKeyedValues2D();
        int int40 = defaultKeyedValues2D38.getRowIndex((java.lang.Comparable) 10);
        int int41 = defaultKeyedValues2D38.getRowCount();
        defaultKeyedValues2D38.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int46 = defaultKeyedValues2D38.getRowCount();
        java.util.List list47 = defaultKeyedValues2D38.getColumnKeys();
        boolean boolean48 = defaultKeyedValues2D25.equals((java.lang.Object) list47);
        java.lang.Object obj49 = defaultKeyedValues2D25.clone();
        java.lang.Object obj50 = defaultKeyedValues2D25.clone();
        boolean boolean51 = defaultKeyedValues0.equals(obj50);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100.0f);
        int int12 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        int int15 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D13.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues24 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues24.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean28 = defaultKeyedValues20.equals((java.lang.Object) 0L);
        int int30 = defaultKeyedValues20.getIndex((java.lang.Comparable) 1L);
        int int32 = defaultKeyedValues20.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj33 = defaultKeyedValues20.clone();
        boolean boolean34 = defaultKeyedValues2D13.equals((java.lang.Object) defaultKeyedValues20);
        java.util.List list35 = defaultKeyedValues2D13.getColumnKeys();
        defaultKeyedValues2D13.clear();
        java.util.List list37 = defaultKeyedValues2D13.getColumnKeys();
        boolean boolean38 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D13);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
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
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        int int24 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0f);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) 3, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable8 = defaultKeyedValues2D0.getRowKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 97.0d, (double) 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (short) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 35.0d, (java.lang.Number) (-1L));
        java.lang.Number number34 = defaultKeyedValues0.getValue(3);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + number34 + "' != '" + (-1L) + "'", number34, (-1L));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 10.0f, (double) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (double) (byte) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) (-1));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0d, (double) 3);
        java.lang.Comparable comparable37 = defaultKeyedValues0.getKey(3);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D38 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list39 = defaultKeyedValues2D38.getRowKeys();
        defaultKeyedValues2D38.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D38.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int47 = defaultKeyedValues2D38.getColumnCount();
        int int49 = defaultKeyedValues2D38.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D38.clear();
        boolean boolean51 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D38);
        defaultKeyedValues0.setValue((java.lang.Comparable) 52.0d, (java.lang.Number) (short) -1);
        int int56 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues57 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues57.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues61 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues61.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean65 = defaultKeyedValues57.equals((java.lang.Object) 0L);
        java.lang.Object obj66 = defaultKeyedValues57.clone();
        boolean boolean68 = defaultKeyedValues57.equals((java.lang.Object) (byte) 10);
        int int69 = defaultKeyedValues57.getItemCount();
        defaultKeyedValues57.removeValue((java.lang.Comparable) (byte) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues72 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues72.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj76 = defaultKeyedValues72.clone();
        int int78 = defaultKeyedValues72.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues72.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        boolean boolean82 = defaultKeyedValues57.equals((java.lang.Object) (-1.0f));
        int int83 = defaultKeyedValues57.getItemCount();
        defaultKeyedValues57.clear();
        boolean boolean85 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number87 = defaultKeyedValues57.getValue((java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 100.0d + "'", comparable37, 100.0d);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getRowKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        int int14 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0d);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        int int19 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10L);
        java.util.List list20 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultKeyedValues2D0.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        int int10 = defaultKeyedValues0.getItemCount();
        java.util.List list11 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(10, (java.lang.Comparable) 10.0d, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        int int14 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0d);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        int int19 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10L);
        java.util.List list20 = defaultKeyedValues2D0.getColumnKeys();
        int int21 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable23 = defaultKeyedValues2D0.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        int int15 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list20 = defaultKeyedValues2D19.getRowKeys();
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D19.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int29 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list30 = defaultKeyedValues2D19.getColumnKeys();
        defaultKeyedValues2D19.removeColumn((java.lang.Comparable) (-1L));
        boolean boolean33 = defaultKeyedValues2D13.equals((java.lang.Object) (-1L));
        boolean boolean34 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D13);
        java.lang.Comparable comparable36 = defaultKeyedValues2D0.getRowKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + (byte) 100 + "'", comparable36, (byte) 100);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        int int34 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) 3);
        java.lang.Number number9 = defaultKeyedValues0.getValue((int) (short) 0);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 3 + "'", number9, 3);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 100.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues18.clear();
        defaultKeyedValues18.clear();
        defaultKeyedValues18.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues18.setValue((java.lang.Comparable) 10.0d, (double) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues30.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues34 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues34.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean38 = defaultKeyedValues30.equals((java.lang.Object) 0L);
        defaultKeyedValues30.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues30.clear();
        java.util.List list43 = defaultKeyedValues30.getKeys();
        boolean boolean44 = defaultKeyedValues18.equals((java.lang.Object) list43);
        boolean boolean45 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues18);
        int int46 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        java.lang.Object obj30 = defaultKeyedValues7.clone();
        java.lang.Number number32 = defaultKeyedValues7.getValue((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 0L + "'", number32, 0L);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) 10L);
        int int17 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100.0d, (java.lang.Number) (-1.0d));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 97.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultKeyedValues0.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        int int3 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        java.util.List list4 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        defaultKeyedValues7.setValue((java.lang.Comparable) (-1L), (java.lang.Number) (byte) -1);
        defaultKeyedValues7.insertValue((int) (byte) 1, (java.lang.Comparable) 2, (java.lang.Number) 0L);
        defaultKeyedValues7.setValue((java.lang.Comparable) 'a', (double) 100);
        int int40 = defaultKeyedValues7.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder41 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues7.sortByKeys(sortOrder41);
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
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 6 + "'", int40 == 6);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        defaultKeyedValues2D0.removeRow((int) (byte) 0);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean23 = defaultKeyedValues15.equals((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultKeyedValues15.clone();
        defaultKeyedValues15.setValue((java.lang.Comparable) true, (double) '4');
        java.lang.Object obj28 = defaultKeyedValues15.clone();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        boolean boolean30 = defaultKeyedValues2D0.equals(obj28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = defaultKeyedValues2D0.getValue(10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues0.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, (java.lang.Number) 10L);
        org.jfree.chart.util.SortOrder sortOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues12.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        int int18 = defaultKeyedValues2D16.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D16.clear();
        defaultKeyedValues2D16.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D16.removeColumn((java.lang.Comparable) 10L);
        boolean boolean29 = defaultKeyedValues12.equals((java.lang.Object) defaultKeyedValues2D16);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1));
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D16);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100, (java.lang.Number) (short) 0);
        int int38 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues2D0.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D();
        int int24 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) 10);
        int int25 = defaultKeyedValues2D22.getRowCount();
        defaultKeyedValues2D22.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int30 = defaultKeyedValues2D22.getRowCount();
        boolean boolean31 = defaultKeyedValues2D8.equals((java.lang.Object) int30);
        java.util.List list32 = defaultKeyedValues2D8.getColumnKeys();
        java.util.List list33 = defaultKeyedValues2D8.getRowKeys();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) 10);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) 3, (java.lang.Number) (byte) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean21 = defaultKeyedValues13.equals((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultKeyedValues13.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean31 = defaultKeyedValues23.equals((java.lang.Object) 0L);
        int int33 = defaultKeyedValues23.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues23.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean36 = defaultKeyedValues13.equals((java.lang.Object) 0.0d);
        defaultKeyedValues13.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues13.removeValue((java.lang.Comparable) (short) 1);
        defaultKeyedValues13.addValue((java.lang.Comparable) 1, 10.0d);
        java.lang.Object obj45 = defaultKeyedValues13.clone();
        defaultKeyedValues13.removeValue(0);
        boolean boolean48 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues13);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues13.insertValue(3, (java.lang.Comparable) (short) 1, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        int int35 = defaultKeyedValues2D16.getColumnIndex((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable37 = defaultKeyedValues2D16.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = defaultKeyedValues2D0.getRowKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        int int3 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        java.util.List list4 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        int int17 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 52.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues2D0.getValue(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues2D0.getValue(4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (byte) 0, (java.lang.Number) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) (-1.0f), (double) (-1L));
        java.util.List list19 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        int int18 = defaultKeyedValues2D16.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D16.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean31 = defaultKeyedValues23.equals((java.lang.Object) 0L);
        int int33 = defaultKeyedValues23.getIndex((java.lang.Comparable) 1L);
        int int35 = defaultKeyedValues23.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj36 = defaultKeyedValues23.clone();
        boolean boolean37 = defaultKeyedValues2D16.equals((java.lang.Object) defaultKeyedValues23);
        java.util.List list38 = defaultKeyedValues2D16.getColumnKeys();
        defaultKeyedValues2D16.clear();
        java.util.List list40 = defaultKeyedValues2D16.getColumnKeys();
        defaultKeyedValues2D16.removeColumn((java.lang.Comparable) (-1.0f));
        boolean boolean43 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable45 = defaultKeyedValues2D0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.clear();
        java.lang.Object obj12 = defaultKeyedValues2D0.clone();
        int int13 = defaultKeyedValues2D0.getColumnCount();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D0.getValue((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
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
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        int int29 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1L);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        int int18 = defaultKeyedValues0.getItemCount();
        java.util.List list19 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 100, (java.lang.Comparable) 100, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list9 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean17 = defaultKeyedValues9.equals((java.lang.Object) 0L);
        int int19 = defaultKeyedValues9.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues9.removeValue((java.lang.Comparable) 0.0d);
        int int23 = defaultKeyedValues9.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues9.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues9.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) 100);
        defaultKeyedValues9.clear();
        boolean boolean30 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues9);
        defaultKeyedValues9.addValue((java.lang.Comparable) true, (double) 10L);
        defaultKeyedValues9.setValue((java.lang.Comparable) 2, 0.0d);
        org.jfree.chart.util.SortOrder sortOrder37 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues9.sortByValues(sortOrder37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        int int24 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        java.util.List list12 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 4);
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable15, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list8 = defaultKeyedValues2D0.getColumnKeys();
        int int9 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 35.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1));
        int int17 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) false);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0d));
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) false, (java.lang.Comparable) 3);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 3);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        int int8 = defaultKeyedValues2D6.getRowCount();
        int int9 = defaultKeyedValues2D6.getRowCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) int9);
        int int11 = defaultKeyedValues2D1.getRowCount();
        java.util.List list12 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100L, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Byte (java.lang.Float and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) (-1.0f), (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 10, (java.lang.Comparable) 100, (java.lang.Number) 97.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D0.removeRow((int) (byte) 0);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues2D0.getValue((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) "", (java.lang.Comparable) 1.0f);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Comparable comparable13 = defaultKeyedValues2D0.getRowKey((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "" + "'", comparable13, "");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) (-1));
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (double) 0L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        int int20 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D18.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D18.clear();
        defaultKeyedValues2D18.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj31 = defaultKeyedValues2D18.clone();
        defaultKeyedValues2D18.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
        java.lang.Object obj36 = defaultKeyedValues2D18.clone();
        java.util.List list37 = defaultKeyedValues2D18.getRowKeys();
        boolean boolean38 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D18);
        int int40 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D18.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 10.0f, (java.lang.Comparable) '4');
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.clear();
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean23 = defaultKeyedValues15.equals((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultKeyedValues15.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean33 = defaultKeyedValues25.equals((java.lang.Object) 0L);
        int int35 = defaultKeyedValues25.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues25.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean38 = defaultKeyedValues15.equals((java.lang.Object) 0.0d);
        defaultKeyedValues15.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues15.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) (byte) 0);
        defaultKeyedValues15.addValue((java.lang.Comparable) 100.0d, (double) (byte) 100);
        boolean boolean48 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues15);
        java.lang.Object obj49 = defaultKeyedValues2D0.clone();
        java.lang.Object obj50 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D51 = new org.jfree.data.DefaultKeyedValues2D();
        int int53 = defaultKeyedValues2D51.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D51.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D51.clear();
        defaultKeyedValues2D51.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int63 = defaultKeyedValues2D51.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D51.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list67 = defaultKeyedValues2D51.getRowKeys();
        java.lang.Number number68 = null;
        defaultKeyedValues2D51.addValue(number68, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D51.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 3);
        defaultKeyedValues2D51.removeRow((int) (short) 1);
        defaultKeyedValues2D51.addValue((java.lang.Number) 52.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 100);
        boolean boolean82 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, (java.lang.Number) 1.0d);
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) 3);
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
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) ' ');
        java.util.List list7 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean24 = defaultKeyedValues16.equals((java.lang.Object) 0L);
        int int26 = defaultKeyedValues16.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues16.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues16.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj34 = defaultKeyedValues16.clone();
        defaultKeyedValues16.addValue((java.lang.Comparable) '4', (double) 10L);
        boolean boolean38 = defaultKeyedValues0.equals((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        int int23 = defaultKeyedValues2D20.getRowCount();
        defaultKeyedValues2D20.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int28 = defaultKeyedValues2D20.getRowCount();
        java.util.List list29 = defaultKeyedValues2D20.getColumnKeys();
        defaultKeyedValues2D20.removeColumn((int) (byte) 0);
        defaultKeyedValues2D20.removeRow((int) (byte) 0);
        int int34 = defaultKeyedValues2D20.getColumnCount();
        java.lang.Object obj35 = defaultKeyedValues2D20.clone();
        boolean boolean36 = defaultKeyedValues10.equals((java.lang.Object) defaultKeyedValues2D20);
        defaultKeyedValues10.setValue((java.lang.Comparable) 100, 52.0d);
        java.lang.Object obj40 = defaultKeyedValues10.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        java.lang.Number number20 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, number20);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0L, (java.lang.Comparable) (short) 0);
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        java.util.List list21 = defaultKeyedValues2D20.getRowKeys();
        int int22 = defaultKeyedValues2D20.getRowCount();
        int int23 = defaultKeyedValues2D20.getRowCount();
        int int25 = defaultKeyedValues2D20.getRowIndex((java.lang.Comparable) '4');
        int int26 = defaultKeyedValues2D20.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues31.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean35 = defaultKeyedValues27.equals((java.lang.Object) 0L);
        int int37 = defaultKeyedValues27.getIndex((java.lang.Comparable) 1L);
        int int39 = defaultKeyedValues27.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj40 = defaultKeyedValues27.clone();
        boolean boolean41 = defaultKeyedValues2D20.equals(obj40);
        java.util.List list42 = defaultKeyedValues2D20.getRowKeys();
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        defaultKeyedValues2D20.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        int int51 = defaultKeyedValues2D20.getColumnIndex((java.lang.Comparable) true);
        defaultKeyedValues2D20.setValue((java.lang.Number) (byte) 100, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        boolean boolean56 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable58 = defaultKeyedValues2D20.getColumnKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) 0);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 52.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D0.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 0L, (java.lang.Comparable) 100L, (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 52.0d);
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
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        int int13 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        int int15 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list20 = defaultKeyedValues2D19.getRowKeys();
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D19.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int29 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list30 = defaultKeyedValues2D19.getColumnKeys();
        defaultKeyedValues2D19.removeColumn((java.lang.Comparable) (-1L));
        boolean boolean33 = defaultKeyedValues2D13.equals((java.lang.Object) (-1L));
        boolean boolean34 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D13);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 35.0d);
        int int37 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues24 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues24.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean28 = defaultKeyedValues20.equals((java.lang.Object) 0L);
        defaultKeyedValues20.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        boolean boolean32 = defaultKeyedValues2D4.equals((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues3 = new org.jfree.data.DefaultKeyedValues();
        int int5 = defaultKeyedValues3.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues3.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj9 = defaultKeyedValues3.clone();
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues3);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean19 = defaultKeyedValues11.equals((java.lang.Object) 0L);
        int int21 = defaultKeyedValues11.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues11.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues11.clear();
        defaultKeyedValues11.setValue((java.lang.Comparable) (byte) -1, 35.0d);
        boolean boolean29 = defaultKeyedValues2D0.equals((java.lang.Object) 35.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) true);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.clear();
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', comparable12, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        int int22 = defaultKeyedValues2D0.getRowCount();
        int int24 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 100L);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.util.List list6 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) -1, (java.lang.Comparable) (-1.0d), (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        int int34 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) (-1L));
        int int17 = defaultKeyedValues0.getIndex((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues0.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (-1));
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        int int22 = defaultKeyedValues2D8.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = defaultKeyedValues2D8.getRowKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
            defaultKeyedValues0.removeValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (java.lang.Number) (byte) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues17.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues17.removeValue((java.lang.Comparable) (byte) 0);
        int int26 = defaultKeyedValues17.getItemCount();
        defaultKeyedValues17.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        defaultKeyedValues17.setValue((java.lang.Comparable) (-1.0f), (double) (short) 10);
        boolean boolean33 = defaultKeyedValues0.equals((java.lang.Object) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable38 = defaultKeyedValues0.getKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) -1);
        org.jfree.chart.util.SortOrder sortOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D9 = new org.jfree.data.DefaultKeyedValues2D();
        int int11 = defaultKeyedValues2D9.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D9.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D9.clear();
        defaultKeyedValues2D9.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int21 = defaultKeyedValues2D9.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D9.clear();
        defaultKeyedValues2D9.clear();
        defaultKeyedValues2D9.addValue((java.lang.Number) 52.0d, (java.lang.Comparable) 2, (java.lang.Comparable) 100.0f);
        boolean boolean28 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D9);
        java.util.List list29 = defaultKeyedValues2D9.getRowKeys();
        java.lang.Class<?> wildcardClass30 = defaultKeyedValues2D9.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1);
        int int20 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D0.getValue((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (java.lang.Number) 52.0d);
        java.lang.Object obj19 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues0.getValue((java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        int int24 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultKeyedValues0.getValue((java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 35.0d + "'", number23, 35.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) (byte) -1, 35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean23 = defaultKeyedValues15.equals((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultKeyedValues15.clone();
        java.lang.Object obj25 = defaultKeyedValues15.clone();
        defaultKeyedValues15.setValue((java.lang.Comparable) 1.0f, (double) (short) 10);
        boolean boolean29 = defaultKeyedValues0.equals((java.lang.Object) (short) 10);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        int int6 = defaultKeyedValues2D1.getRowCount();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D1.getValue((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 3);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        int int18 = defaultKeyedValues2D4.getColumnCount();
        int int19 = defaultKeyedValues2D4.getColumnCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) ' ');
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (double) 2);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 1.0f);
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
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        java.lang.Object obj7 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1);
        int int20 = defaultKeyedValues2D0.getColumnCount();
        int int22 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        java.lang.Number number31 = defaultKeyedValues7.getValue((int) (short) 1);
        defaultKeyedValues7.addValue((java.lang.Comparable) true, (double) 0);
        defaultKeyedValues7.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 1.0d + "'", number31, 1.0d);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (double) 100.0f);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 10.0f, (java.lang.Number) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(6, (java.lang.Comparable) (byte) 100, (double) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0);
        java.util.List list17 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        java.lang.Number number11 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), number11);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        int int19 = defaultKeyedValues2D17.getRowIndex((java.lang.Comparable) 10);
        int int20 = defaultKeyedValues2D17.getRowCount();
        java.lang.Object obj21 = defaultKeyedValues2D17.clone();
        java.lang.Object obj22 = defaultKeyedValues2D17.clone();
        boolean boolean23 = defaultKeyedValues2D0.equals(obj22);
        java.lang.Object obj24 = defaultKeyedValues2D0.clone();
        java.util.List list25 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1.0f);
        java.lang.Class<?> wildcardClass17 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.clear();
        java.lang.Class<?> wildcardClass11 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        int int22 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) ' ');
        java.util.List list23 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        int int17 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 52.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        int int36 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.clear();
        java.util.List list38 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) 3);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (java.lang.Number) (short) -1);
        java.util.List list19 = defaultKeyedValues0.getKeys();
        int int21 = defaultKeyedValues0.getIndex((java.lang.Comparable) 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) (short) 1, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.util.List list6 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) (-1.0f));
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues0.getValue((java.lang.Comparable) 52.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 52.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 2);
        java.lang.Class<?> wildcardClass9 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (java.lang.Number) (byte) 1);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) 0, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable31 = defaultKeyedValues0.getKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getColumnKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        java.util.List list21 = defaultKeyedValues2D0.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean30 = defaultKeyedValues22.equals((java.lang.Object) 0L);
        int int32 = defaultKeyedValues22.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues22.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues22.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj40 = defaultKeyedValues22.clone();
        defaultKeyedValues22.addValue((java.lang.Comparable) '4', (double) 10L);
        java.lang.Comparable comparable45 = defaultKeyedValues22.getKey(0);
        boolean boolean46 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues22);
        defaultKeyedValues22.removeValue((java.lang.Comparable) 1.0f);
        org.jfree.chart.util.SortOrder sortOrder49 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues22.sortByKeys(sortOrder49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + 100 + "'", comparable45, 100);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.removeColumn(0);
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) (byte) 10, comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) (short) 10);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 10L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list23 = defaultKeyedValues2D22.getRowKeys();
        int int24 = defaultKeyedValues2D22.getRowCount();
        int int25 = defaultKeyedValues2D22.getRowCount();
        int int27 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) '4');
        int int28 = defaultKeyedValues2D22.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues33 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues33.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean37 = defaultKeyedValues29.equals((java.lang.Object) 0L);
        int int39 = defaultKeyedValues29.getIndex((java.lang.Comparable) 1L);
        int int41 = defaultKeyedValues29.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj42 = defaultKeyedValues29.clone();
        boolean boolean43 = defaultKeyedValues2D22.equals(obj42);
        java.util.List list44 = defaultKeyedValues2D22.getRowKeys();
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        defaultKeyedValues2D22.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues52 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues52.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues52.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues52.setValue((java.lang.Comparable) true, (double) '4');
        int int62 = defaultKeyedValues52.getItemCount();
        boolean boolean63 = defaultKeyedValues2D22.equals((java.lang.Object) int62);
        boolean boolean64 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D22);
        java.lang.Object obj65 = defaultKeyedValues2D22.clone();
        int int67 = defaultKeyedValues2D22.getColumnIndex((java.lang.Comparable) (short) 10);
        int int68 = defaultKeyedValues2D22.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 35.0d);
        defaultKeyedValues0.removeValue((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        int int24 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = defaultKeyedValues2D0.getColumnKey((-1));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        int int11 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.addValue((java.lang.Number) (short) 1, comparable13, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        java.lang.Object obj21 = defaultKeyedValues2D18.clone();
        defaultKeyedValues2D18.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
        java.lang.Object obj18 = defaultKeyedValues2D0.clone();
        int int20 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1.0f), (java.lang.Comparable) (short) -1, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1), (java.lang.Comparable) true, (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj19 = defaultKeyedValues15.clone();
        int int21 = defaultKeyedValues15.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues15.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        int int26 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj27 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (-1.0d));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) (short) 1);
        int int7 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        int int23 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.clear();
        java.lang.Comparable comparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeValue(comparable5, (java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
            java.lang.Comparable comparable25 = defaultKeyedValues2D12.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) 4);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Number number11 = null;
        defaultKeyedValues2D0.setValue(number11, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 3);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 3);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) (short) 1, (java.lang.Comparable) ' ');
        java.lang.Comparable comparable22 = defaultKeyedValues2D0.getRowKey((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 0 + "'", comparable22, 0);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 100);
        int int12 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Byte (java.lang.Character and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (java.lang.Number) 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (double) '#');
        java.util.List list19 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultKeyedValues0.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues12.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues12.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues12.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues12.clear();
        java.util.List list24 = defaultKeyedValues12.getKeys();
        defaultKeyedValues12.removeValue((java.lang.Comparable) 4);
        boolean boolean27 = defaultKeyedValues0.equals((java.lang.Object) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultKeyedValues0.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) ' ', (java.lang.Number) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean29 = defaultKeyedValues21.equals((java.lang.Object) 0L);
        int int31 = defaultKeyedValues21.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues21.removeValue((java.lang.Comparable) 0.0d);
        int int35 = defaultKeyedValues21.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues21.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues21.addValue((java.lang.Comparable) (short) -1, 0.0d);
        java.lang.Object obj41 = defaultKeyedValues21.clone();
        boolean boolean42 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues21);
        defaultKeyedValues0.addValue((java.lang.Comparable) true, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.clear();
        java.util.List list18 = defaultKeyedValues2D0.getRowKeys();
        int int19 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list20 = defaultKeyedValues2D0.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues21.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues21.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues21.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 1L);
        int int35 = defaultKeyedValues21.getIndex((java.lang.Comparable) 2);
        java.lang.Number number37 = defaultKeyedValues21.getValue((int) (short) 1);
        boolean boolean38 = defaultKeyedValues2D0.equals((java.lang.Object) number37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + number37 + "' != '" + (short) 1 + "'", number37, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (java.lang.Number) 100L);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) 0L, (double) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(0);
        int int13 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean22 = defaultKeyedValues14.equals((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultKeyedValues14.clone();
        defaultKeyedValues14.setValue((java.lang.Comparable) true, (double) '4');
        defaultKeyedValues14.addValue((java.lang.Comparable) (byte) 1, 0.0d);
        java.lang.Object obj30 = defaultKeyedValues14.clone();
        boolean boolean31 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues14);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        int int16 = defaultKeyedValues0.getItemCount();
        int int18 = defaultKeyedValues0.getIndex((java.lang.Comparable) 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        int int3 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        java.util.List list4 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.clear();
        int int17 = defaultKeyedValues2D0.getRowCount();
        int int19 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 2, (java.lang.Comparable) 1L);
        int int25 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) "", (java.lang.Comparable) 100.0f);
        java.util.List list24 = defaultKeyedValues2D8.getColumnKeys();
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
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        int int8 = defaultKeyedValues2D6.getRowCount();
        int int9 = defaultKeyedValues2D6.getRowCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) int9);
        int int11 = defaultKeyedValues2D1.getRowCount();
        java.util.List list12 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100L, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Byte (java.lang.Integer and java.lang.Byte are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
            java.lang.Number number14 = defaultKeyedValues2D1.getValue(6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
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
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "");
        defaultKeyedValues0.clear();
        java.util.List list13 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 1.0f);
        java.lang.Comparable comparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = defaultKeyedValues0.getIndex(comparable17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues2D0.getValue(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 'a', (java.lang.Number) 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
        int int19 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        java.util.List list20 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D0.getValue((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        java.lang.Number number11 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), number11);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list15 = defaultKeyedValues2D14.getRowKeys();
        int int16 = defaultKeyedValues2D14.getRowCount();
        int int17 = defaultKeyedValues2D14.getRowCount();
        boolean boolean19 = defaultKeyedValues2D14.equals((java.lang.Object) 10.0f);
        java.lang.Object obj20 = defaultKeyedValues2D14.clone();
        boolean boolean21 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D14);
        java.lang.Comparable comparable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D14.addValue((java.lang.Number) 100.0f, comparable23, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        java.lang.Object obj7 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues12.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean16 = defaultKeyedValues8.equals((java.lang.Object) 0L);
        int int18 = defaultKeyedValues8.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues8.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues8.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj27 = defaultKeyedValues2D26.clone();
        boolean boolean28 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues2D26);
        java.lang.Comparable comparable30 = defaultKeyedValues8.getKey(1);
        defaultKeyedValues8.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) (byte) 10);
        boolean boolean34 = defaultKeyedValues2D0.equals((java.lang.Object) (short) 100);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) false, (java.lang.Comparable) 3);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) 0 + "'", comparable30, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D();
        int int7 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D5.getColumnKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) -1);
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (double) 6);
        int int19 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (java.lang.Number) 100L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues3 = new org.jfree.data.DefaultKeyedValues();
        int int5 = defaultKeyedValues3.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues3.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj9 = defaultKeyedValues3.clone();
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues3);
        defaultKeyedValues3.addValue((java.lang.Comparable) 35.0d, (java.lang.Number) 10L);
        int int15 = defaultKeyedValues3.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues3.addValue((java.lang.Comparable) ' ', (java.lang.Number) 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues3.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int3 = defaultKeyedValues2D1.getRowCount();
        int int4 = defaultKeyedValues2D1.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        int int6 = defaultKeyedValues5.getItemCount();
        int int7 = defaultKeyedValues5.getItemCount();
        java.lang.Object obj8 = defaultKeyedValues5.clone();
        boolean boolean9 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues5);
        java.util.List list10 = defaultKeyedValues2D1.getRowKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        defaultKeyedValues2D0.clear();
        java.lang.Object obj17 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
        int int19 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        int int20 = defaultKeyedValues2D0.getColumnCount();
        int int21 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues2D0.getValue((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 10L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list23 = defaultKeyedValues2D22.getRowKeys();
        int int24 = defaultKeyedValues2D22.getRowCount();
        int int25 = defaultKeyedValues2D22.getRowCount();
        int int27 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) '4');
        int int28 = defaultKeyedValues2D22.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues33 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues33.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean37 = defaultKeyedValues29.equals((java.lang.Object) 0L);
        int int39 = defaultKeyedValues29.getIndex((java.lang.Comparable) 1L);
        int int41 = defaultKeyedValues29.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj42 = defaultKeyedValues29.clone();
        boolean boolean43 = defaultKeyedValues2D22.equals(obj42);
        java.util.List list44 = defaultKeyedValues2D22.getRowKeys();
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        defaultKeyedValues2D22.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues52 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues52.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues52.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues52.setValue((java.lang.Comparable) true, (double) '4');
        int int62 = defaultKeyedValues52.getItemCount();
        boolean boolean63 = defaultKeyedValues2D22.equals((java.lang.Object) int62);
        boolean boolean64 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D22);
        java.lang.Object obj65 = defaultKeyedValues2D22.clone();
        int int67 = defaultKeyedValues2D22.getColumnIndex((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D22.removeRow((java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        int int23 = defaultKeyedValues2D20.getRowCount();
        defaultKeyedValues2D20.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int28 = defaultKeyedValues2D20.getRowCount();
        java.util.List list29 = defaultKeyedValues2D20.getColumnKeys();
        defaultKeyedValues2D20.removeColumn((int) (byte) 0);
        defaultKeyedValues2D20.removeRow((int) (byte) 0);
        int int34 = defaultKeyedValues2D20.getColumnCount();
        java.lang.Object obj35 = defaultKeyedValues2D20.clone();
        boolean boolean36 = defaultKeyedValues10.equals((java.lang.Object) defaultKeyedValues2D20);
        int int37 = defaultKeyedValues2D20.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        defaultKeyedValues10.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) 2);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.insertValue((int) (byte) 10, (java.lang.Comparable) 3, (double) 'a');
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
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        java.util.List list21 = defaultKeyedValues2D20.getRowKeys();
        int int22 = defaultKeyedValues2D20.getRowCount();
        int int23 = defaultKeyedValues2D20.getRowCount();
        int int25 = defaultKeyedValues2D20.getRowIndex((java.lang.Comparable) '4');
        int int26 = defaultKeyedValues2D20.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues31.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean35 = defaultKeyedValues27.equals((java.lang.Object) 0L);
        int int37 = defaultKeyedValues27.getIndex((java.lang.Comparable) 1L);
        int int39 = defaultKeyedValues27.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj40 = defaultKeyedValues27.clone();
        boolean boolean41 = defaultKeyedValues2D20.equals(obj40);
        java.util.List list42 = defaultKeyedValues2D20.getRowKeys();
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        defaultKeyedValues2D20.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        int int51 = defaultKeyedValues2D20.getColumnIndex((java.lang.Comparable) true);
        defaultKeyedValues2D20.setValue((java.lang.Number) (byte) 100, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        boolean boolean56 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D20);
        java.lang.Comparable comparable58 = defaultKeyedValues2D20.getRowKey((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number61 = defaultKeyedValues2D20.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + comparable58 + "' != '" + (short) -1 + "'", comparable58, (short) -1);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        java.lang.Comparable comparable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = defaultKeyedValues2D0.getRowIndex(comparable26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues0.getValue((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (java.lang.Number) 100L);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues0.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) (-1));
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) 10L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list23 = defaultKeyedValues2D22.getRowKeys();
        int int24 = defaultKeyedValues2D22.getRowCount();
        int int25 = defaultKeyedValues2D22.getRowCount();
        int int27 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) '4');
        int int28 = defaultKeyedValues2D22.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues33 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues33.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean37 = defaultKeyedValues29.equals((java.lang.Object) 0L);
        int int39 = defaultKeyedValues29.getIndex((java.lang.Comparable) 1L);
        int int41 = defaultKeyedValues29.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj42 = defaultKeyedValues29.clone();
        boolean boolean43 = defaultKeyedValues2D22.equals(obj42);
        java.util.List list44 = defaultKeyedValues2D22.getRowKeys();
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        defaultKeyedValues2D22.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues52 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues52.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues52.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues52.setValue((java.lang.Comparable) true, (double) '4');
        int int62 = defaultKeyedValues52.getItemCount();
        boolean boolean63 = defaultKeyedValues2D22.equals((java.lang.Object) int62);
        boolean boolean64 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D22);
        defaultKeyedValues2D22.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 0, (java.lang.Comparable) 0.0f);
        java.util.List list69 = defaultKeyedValues2D22.getColumnKeys();
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) "", (java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(list69);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) 4);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        int int8 = defaultKeyedValues2D6.getRowCount();
        int int9 = defaultKeyedValues2D6.getRowCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) int9);
        int int11 = defaultKeyedValues2D1.getRowCount();
        java.util.List list12 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 100L, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultKeyedValues2D1.getColumnKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        java.util.List list14 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list15 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D();
        int int7 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D5.getColumnKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        java.lang.Object obj7 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues12.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean16 = defaultKeyedValues8.equals((java.lang.Object) 0L);
        int int18 = defaultKeyedValues8.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues8.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues8.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj27 = defaultKeyedValues2D26.clone();
        boolean boolean28 = defaultKeyedValues8.equals((java.lang.Object) defaultKeyedValues2D26);
        java.lang.Comparable comparable30 = defaultKeyedValues8.getKey(1);
        defaultKeyedValues8.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) (byte) 10);
        boolean boolean34 = defaultKeyedValues2D0.equals((java.lang.Object) (short) 100);
        java.lang.Object obj35 = defaultKeyedValues2D0.clone();
        int int37 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 10);
        java.lang.Object obj38 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) 0 + "'", comparable30, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 35.0d, (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, (double) 1L);
        int int21 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1), (java.lang.Number) 10.0d);
        java.lang.Object obj25 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultKeyedValues0.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 6, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        java.util.List list30 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 97.0d, (java.lang.Number) 0L);
        org.jfree.chart.util.SortOrder sortOrder35 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        java.lang.Number number13 = null;
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) '#', number13);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues0.getKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) "");
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        int int6 = defaultKeyedValues2D1.getRowCount();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) "", (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (java.lang.Number) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1), (java.lang.Comparable) 4, (java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 0L, (java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 3");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D8.setValue((java.lang.Number) 6, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) "hi!");
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
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0, (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultKeyedValues2D0.getValue((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
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
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        int int19 = defaultKeyedValues2D17.getRowIndex((java.lang.Comparable) 10);
        int int20 = defaultKeyedValues2D17.getRowCount();
        java.lang.Object obj21 = defaultKeyedValues2D17.clone();
        java.lang.Object obj22 = defaultKeyedValues2D17.clone();
        boolean boolean23 = defaultKeyedValues2D0.equals(obj22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 0.0f, (java.lang.Comparable) 52.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 52.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        int int35 = defaultKeyedValues2D16.getRowIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D16.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D1.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues3 = new org.jfree.data.DefaultKeyedValues();
        int int5 = defaultKeyedValues3.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues3.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj9 = defaultKeyedValues3.clone();
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues3);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        int int13 = defaultKeyedValues11.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues11.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.util.List list17 = defaultKeyedValues11.getKeys();
        defaultKeyedValues11.setValue((java.lang.Comparable) true, (double) 100);
        defaultKeyedValues11.addValue((java.lang.Comparable) false, (java.lang.Number) (-1.0f));
        defaultKeyedValues11.removeValue((java.lang.Comparable) (byte) 1);
        int int26 = defaultKeyedValues11.getItemCount();
        boolean boolean27 = defaultKeyedValues3.equals((java.lang.Object) defaultKeyedValues11);
        defaultKeyedValues11.removeValue((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        int int15 = defaultKeyedValues0.getItemCount();
        int int17 = defaultKeyedValues0.getIndex((java.lang.Comparable) "");
        java.util.List list18 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj19 = defaultKeyedValues15.clone();
        int int21 = defaultKeyedValues15.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues15.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        boolean boolean25 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        int int26 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = defaultKeyedValues0.getKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.removeValue(1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean26 = defaultKeyedValues18.equals((java.lang.Object) 0L);
        int int28 = defaultKeyedValues18.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues18.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues18.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        boolean boolean36 = defaultKeyedValues0.equals((java.lang.Object) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) "hi!", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.lang.Object obj3 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = defaultKeyedValues0.getValue((java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
            java.lang.Number number18 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 6, (java.lang.Comparable) 97.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 97.0");
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
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list16 = defaultKeyedValues2D15.getRowKeys();
        int int17 = defaultKeyedValues2D15.getRowCount();
        int int18 = defaultKeyedValues2D15.getRowCount();
        int int20 = defaultKeyedValues2D15.getRowIndex((java.lang.Comparable) '4');
        int int21 = defaultKeyedValues2D15.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean30 = defaultKeyedValues22.equals((java.lang.Object) 0L);
        int int32 = defaultKeyedValues22.getIndex((java.lang.Comparable) 1L);
        int int34 = defaultKeyedValues22.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj35 = defaultKeyedValues22.clone();
        boolean boolean36 = defaultKeyedValues2D15.equals(obj35);
        java.util.List list37 = defaultKeyedValues2D15.getRowKeys();
        defaultKeyedValues2D15.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        int int42 = defaultKeyedValues2D15.getRowIndex((java.lang.Comparable) 10);
        boolean boolean43 = defaultKeyedValues2D0.equals((java.lang.Object) 10);
        int int45 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100);
        java.lang.Object obj46 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number49 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Comparable comparable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = defaultKeyedValues2D0.getColumnIndex(comparable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (double) 100.0f);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 10.0f, (java.lang.Number) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) 10L);
        java.lang.Comparable comparable23 = defaultKeyedValues0.getKey((int) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues24 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues24.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues28 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues28.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean32 = defaultKeyedValues24.equals((java.lang.Object) 0L);
        defaultKeyedValues24.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        java.lang.Class<?> wildcardClass36 = defaultKeyedValues24.getClass();
        boolean boolean37 = defaultKeyedValues0.equals((java.lang.Object) wildcardClass36);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 10.0f + "'", comparable23, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        int int23 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultKeyedValues2D0.getValue(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        int int13 = defaultKeyedValues0.getItemCount();
        java.util.List list14 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1L);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, 1.0d);
        java.util.List list18 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (byte) -1, (java.lang.Number) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 10.0d);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.clear();
        int int3 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        java.util.List list4 = defaultKeyedValues0.getKeys();
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (short) 100, (java.lang.Number) 4);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0d));
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (java.lang.Number) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        java.lang.Number number16 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, number16);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '#', (java.lang.Comparable) 100.0d, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) false, (java.lang.Comparable) 3);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 3);
        java.lang.Object obj14 = defaultKeyedValues2D1.clone();
        int int16 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable18 = defaultKeyedValues2D1.getColumnKey(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Boolean (java.lang.Character and java.lang.Boolean are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 3 + "'", comparable18, 3);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
            defaultKeyedValues2D0.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
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
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues0.getValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 100);
        int int18 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 1.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0d, (double) (short) -1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (java.lang.Number) 1.0f);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues12.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues12.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues12.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues12.clear();
        java.util.List list24 = defaultKeyedValues12.getKeys();
        defaultKeyedValues12.removeValue((java.lang.Comparable) 4);
        boolean boolean27 = defaultKeyedValues0.equals((java.lang.Object) 4);
        org.jfree.chart.util.SortOrder sortOrder28 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        java.util.List list30 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj31 = defaultKeyedValues2D0.clone();
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
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) 3);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1);
        java.lang.Object obj20 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues21.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues21.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues21.setValue((java.lang.Comparable) 2, (java.lang.Number) 100L);
        java.lang.Object obj35 = defaultKeyedValues21.clone();
        defaultKeyedValues21.addValue((java.lang.Comparable) 2, (java.lang.Number) 35.0d);
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues21);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (java.lang.Number) (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0, (java.lang.Comparable) false);
        int int27 = defaultKeyedValues2D0.getRowCount();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (-1.0d));
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (java.lang.Number) (byte) 1);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) 0, 100.0d);
        defaultKeyedValues0.removeValue(0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 6, (java.lang.Number) 1.0d);
        int int36 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.util.List list6 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) (-1.0f));
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (java.lang.Number) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int17 = defaultKeyedValues13.getItemCount();
        java.util.List list18 = defaultKeyedValues13.getKeys();
        boolean boolean19 = defaultKeyedValues0.equals((java.lang.Object) list18);
        java.lang.Object obj20 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 4, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0L);
        java.util.List list18 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        int int19 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(6, (java.lang.Comparable) 0L, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) ' ', (double) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) (-1.0f));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (java.lang.Number) 100L);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        defaultKeyedValues0.insertValue((int) (byte) 1, (java.lang.Comparable) 3, (double) (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        int int6 = defaultKeyedValues2D1.getRowCount();
        int int7 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D1.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        int int31 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 1);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) 10L, (java.lang.Number) (-1.0f));
        int int39 = defaultKeyedValues0.getIndex((java.lang.Comparable) 4);
        defaultKeyedValues0.clear();
        int int41 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
        int int17 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues0.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable19 = defaultKeyedValues2D0.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (java.lang.Number) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.clear();
        int int17 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj18 = defaultKeyedValues2D0.clone();
        int int20 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 4);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 100L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D27 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D27.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D27.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable36 = defaultKeyedValues2D27.getColumnKey((int) (byte) 0);
        boolean boolean37 = defaultKeyedValues0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.util.SortOrder sortOrder38 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + 10L + "'", comparable36, 10L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        java.lang.Number number11 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) (short) 0);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) ' ', (java.lang.Number) 100L);
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list3 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = defaultKeyedValues2D0.getValue((int) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        int int15 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int16 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list9 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 1);
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D();
        int int12 = defaultKeyedValues2D10.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D10.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D10.clear();
        defaultKeyedValues2D10.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D10.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj23 = defaultKeyedValues2D10.clone();
        int int24 = defaultKeyedValues2D10.getColumnCount();
        java.util.List list25 = defaultKeyedValues2D10.getColumnKeys();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) list25);
        java.lang.Object obj27 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultKeyedValues0.getValue((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        int int7 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list15 = defaultKeyedValues2D0.getColumnKeys();
        int int17 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "");
        java.lang.Object obj18 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) "hi!", (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) 100, (java.lang.Comparable) '4');
        java.util.List list19 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) "");
        java.util.List list23 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) "");
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100L);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list4 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D8.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        boolean boolean16 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        int int18 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultKeyedValues2D0.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) (-1.0f));
        int int31 = defaultKeyedValues2D0.getRowCount();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj17 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(3, (java.lang.Comparable) (byte) -1, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        java.lang.Object obj21 = defaultKeyedValues2D18.clone();
        int int23 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) ' ', (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) 'a', (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) (short) 100);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0d, (double) 3);
        java.lang.Comparable comparable37 = defaultKeyedValues0.getKey(3);
        int int39 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        int int41 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 100.0d + "'", comparable37, 100.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0d, (double) 3);
        java.lang.Comparable comparable37 = defaultKeyedValues0.getKey(3);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D38 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list39 = defaultKeyedValues2D38.getRowKeys();
        defaultKeyedValues2D38.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D38.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int47 = defaultKeyedValues2D38.getColumnCount();
        int int49 = defaultKeyedValues2D38.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D38.clear();
        boolean boolean51 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D38);
        defaultKeyedValues0.setValue((java.lang.Comparable) 52.0d, (java.lang.Number) (short) -1);
        int int56 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10L);
        java.lang.Number number58 = defaultKeyedValues0.getValue((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 100.0d + "'", comparable37, 100.0d);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertEquals("'" + number58 + "' != '" + 0L + "'", number58, 0L);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        defaultKeyedValues2D0.clear();
        int int17 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        java.lang.Class<?> wildcardClass19 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 3);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        java.lang.Object obj20 = defaultKeyedValues0.clone();
        java.util.List list21 = defaultKeyedValues0.getKeys();
        int int23 = defaultKeyedValues0.getIndex((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        java.util.List list19 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 10);
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (double) 100.0f);
        java.lang.Comparable comparable13 = defaultKeyedValues0.getKey((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 2 + "'", comparable13, 2);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Number) 10);
        java.lang.Object obj8 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues0.getValue((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 2);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1L, (java.lang.Comparable) "hi!");
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 100.0d);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        int int17 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues18.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues18.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues18.setValue((java.lang.Comparable) 2, (java.lang.Number) 100L);
        boolean boolean32 = defaultKeyedValues2D0.equals((java.lang.Object) 2);
        int int33 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        int int14 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0d);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues2D0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (short) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 35.0d, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (java.lang.Number) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues36 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues36.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues40 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues40.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean44 = defaultKeyedValues36.equals((java.lang.Object) 0L);
        java.lang.Object obj45 = defaultKeyedValues36.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues46 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues46.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues50 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues50.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean54 = defaultKeyedValues46.equals((java.lang.Object) 0L);
        int int56 = defaultKeyedValues46.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues46.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean59 = defaultKeyedValues36.equals((java.lang.Object) 0.0d);
        defaultKeyedValues36.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues36.removeValue((java.lang.Comparable) (short) 1);
        defaultKeyedValues36.addValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int68 = defaultKeyedValues36.getItemCount();
        boolean boolean69 = defaultKeyedValues0.equals((java.lang.Object) int68);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        java.lang.Number number16 = defaultKeyedValues0.getValue((int) (short) 1);
        java.lang.Comparable comparable18 = defaultKeyedValues0.getKey(0);
        int int19 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues0.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 100L + "'", number16, 100L);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        java.util.List list21 = defaultKeyedValues2D20.getRowKeys();
        int int22 = defaultKeyedValues2D20.getRowCount();
        int int23 = defaultKeyedValues2D20.getRowCount();
        int int25 = defaultKeyedValues2D20.getRowIndex((java.lang.Comparable) '4');
        int int26 = defaultKeyedValues2D20.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues31.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean35 = defaultKeyedValues27.equals((java.lang.Object) 0L);
        int int37 = defaultKeyedValues27.getIndex((java.lang.Comparable) 1L);
        int int39 = defaultKeyedValues27.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj40 = defaultKeyedValues27.clone();
        boolean boolean41 = defaultKeyedValues2D20.equals(obj40);
        java.util.List list42 = defaultKeyedValues2D20.getRowKeys();
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        defaultKeyedValues2D20.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        int int51 = defaultKeyedValues2D20.getColumnIndex((java.lang.Comparable) true);
        defaultKeyedValues2D20.setValue((java.lang.Number) (byte) 100, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 100);
        boolean boolean56 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D20);
        int int57 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        java.util.List list13 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 100, (java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        int int21 = defaultKeyedValues10.getIndex((java.lang.Comparable) (short) 10);
        java.lang.Object obj22 = defaultKeyedValues10.clone();
        defaultKeyedValues10.addValue((java.lang.Comparable) 3, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        int int13 = defaultKeyedValues0.getItemCount();
        java.util.List list14 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list18 = defaultKeyedValues2D17.getRowKeys();
        int int19 = defaultKeyedValues2D17.getRowCount();
        int int20 = defaultKeyedValues2D17.getRowCount();
        boolean boolean22 = defaultKeyedValues2D17.equals((java.lang.Object) 10.0f);
        java.util.List list23 = defaultKeyedValues2D17.getColumnKeys();
        java.util.List list24 = defaultKeyedValues2D17.getRowKeys();
        java.lang.Object obj25 = defaultKeyedValues2D17.clone();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D();
        int int7 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D5.getColumnKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D();
        int int17 = defaultKeyedValues2D15.getRowIndex((java.lang.Comparable) 10);
        int int18 = defaultKeyedValues2D15.getRowCount();
        defaultKeyedValues2D15.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 10L);
        java.lang.Object obj24 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (double) 100L);
        int int23 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        int int21 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int22 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue((int) (byte) 1, (java.lang.Comparable) 0.0d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1);
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        int int11 = defaultKeyedValues9.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues9.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues9.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list18 = defaultKeyedValues9.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues19.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable27 = defaultKeyedValues19.getKey((int) (short) 0);
        boolean boolean28 = defaultKeyedValues9.equals((java.lang.Object) defaultKeyedValues19);
        defaultKeyedValues9.setValue((java.lang.Comparable) '#', (java.lang.Number) 10.0d);
        boolean boolean32 = defaultKeyedValues2D0.equals((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (short) 0 + "'", comparable27, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 2, (java.lang.Comparable) 1L);
        int int16 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) "");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list22 = defaultKeyedValues2D21.getRowKeys();
        int int23 = defaultKeyedValues2D21.getRowCount();
        int int24 = defaultKeyedValues2D21.getRowCount();
        boolean boolean26 = defaultKeyedValues2D21.equals((java.lang.Object) 10.0f);
        int int28 = defaultKeyedValues2D21.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D21.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D21.clear();
        int int34 = defaultKeyedValues2D21.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D21.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) (short) 1);
        boolean boolean38 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = defaultKeyedValues2D21.getValue((java.lang.Comparable) 52.0d, (java.lang.Comparable) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean17 = defaultKeyedValues9.equals((java.lang.Object) 0L);
        int int19 = defaultKeyedValues9.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues9.removeValue((java.lang.Comparable) 0.0d);
        int int23 = defaultKeyedValues9.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues9.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues9.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) 100);
        defaultKeyedValues9.clear();
        boolean boolean30 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues9);
        defaultKeyedValues9.addValue((java.lang.Comparable) true, (double) 10L);
        defaultKeyedValues9.setValue((java.lang.Comparable) 2, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = defaultKeyedValues9.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
            java.lang.Number number19 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, 10.0d);
        org.jfree.chart.util.SortOrder sortOrder32 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder32);
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
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
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
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0d, (double) 3);
        java.lang.Comparable comparable37 = defaultKeyedValues0.getKey(3);
        int int39 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 1);
        defaultKeyedValues0.removeValue((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 100.0d + "'", comparable37, 100.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 'a', (double) 10L);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean17 = defaultKeyedValues9.equals((java.lang.Object) 0L);
        int int19 = defaultKeyedValues9.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues9.removeValue((java.lang.Comparable) 0.0d);
        int int23 = defaultKeyedValues9.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues9.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues9.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) 100);
        defaultKeyedValues9.clear();
        boolean boolean30 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues9);
        int int31 = defaultKeyedValues9.getItemCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        defaultKeyedValues2D18.clear();
        defaultKeyedValues2D18.addValue((java.lang.Number) 1, (java.lang.Comparable) 0.0f, (java.lang.Comparable) true);
        java.util.List list26 = defaultKeyedValues2D18.getRowKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        int int16 = defaultKeyedValues0.getItemCount();
        java.lang.Comparable comparable18 = defaultKeyedValues0.getKey((int) (byte) 1);
        java.lang.Comparable comparable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable19, (java.lang.Number) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) -1 + "'", comparable18, (byte) -1);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "");
        java.util.List list12 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) 0);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 52.0d);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        org.jfree.chart.util.SortOrder sortOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues3 = new org.jfree.data.DefaultKeyedValues();
        int int5 = defaultKeyedValues3.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues3.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj9 = defaultKeyedValues3.clone();
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues3);
        defaultKeyedValues3.addValue((java.lang.Comparable) 35.0d, (java.lang.Number) 10L);
        int int15 = defaultKeyedValues3.getIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D16 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list17 = defaultKeyedValues2D16.getRowKeys();
        int int18 = defaultKeyedValues2D16.getRowCount();
        int int19 = defaultKeyedValues2D16.getRowCount();
        defaultKeyedValues2D16.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int24 = defaultKeyedValues2D16.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean33 = defaultKeyedValues25.equals((java.lang.Object) 0L);
        int int35 = defaultKeyedValues25.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues25.removeValue((java.lang.Comparable) 0.0d);
        int int39 = defaultKeyedValues25.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues25.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues25.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) 100);
        defaultKeyedValues25.clear();
        boolean boolean46 = defaultKeyedValues2D16.equals((java.lang.Object) defaultKeyedValues25);
        defaultKeyedValues25.addValue((java.lang.Comparable) true, (double) 10L);
        boolean boolean50 = defaultKeyedValues3.equals((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        int int7 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10, (java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues2D0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) (short) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) 97.0d, (java.lang.Number) 3);
        int int24 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) (short) 0, (java.lang.Comparable) "hi!");
        java.lang.Comparable comparable27 = defaultKeyedValues2D0.getRowKey(0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100, (java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) '#', (java.lang.Comparable) 1.0d);
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
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (short) 0 + "'", comparable27, (short) 0);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.lang.Object obj3 = defaultKeyedValues0.clone();
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        java.lang.Object obj5 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        int int34 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        int int14 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0d);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        int int19 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10L);
        java.util.List list20 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) 52.0d, (java.lang.Comparable) 1);
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '#');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        int int2 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (double) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        int int12 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues0.getValue((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (byte) 100, (double) '#');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean25 = defaultKeyedValues17.equals((java.lang.Object) 0L);
        int int27 = defaultKeyedValues17.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues17.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues17.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues17.addValue((java.lang.Comparable) 0, (double) (short) 1);
        java.lang.Object obj38 = defaultKeyedValues17.clone();
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues17);
        java.lang.Number number41 = defaultKeyedValues17.getValue((java.lang.Comparable) 0);
        java.util.List list42 = defaultKeyedValues17.getKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + number41 + "' != '" + 1.0d + "'", number41, 1.0d);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) false, (java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100);
        java.lang.Object obj22 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) 100);
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 0, (java.lang.Comparable) 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultKeyedValues2D0.getValue((java.lang.Comparable) true, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D();
        int int7 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D5.getColumnKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) -1);
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues0.getValue((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100.0f);
        int int24 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(10, (java.lang.Comparable) (byte) -1, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        int int14 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.lang.Object obj15 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 10, (java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 2, (java.lang.Comparable) 1L);
        java.lang.Number number18 = defaultKeyedValues2D0.getValue(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultKeyedValues2D0.getRowKey(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 10 + "'", number18, 10);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        int int19 = defaultKeyedValues2D17.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D17.clear();
        defaultKeyedValues2D17.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int29 = defaultKeyedValues2D17.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D17.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 0);
        int int34 = defaultKeyedValues2D17.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list36 = defaultKeyedValues2D35.getRowKeys();
        int int37 = defaultKeyedValues2D35.getRowCount();
        int int38 = defaultKeyedValues2D35.getRowCount();
        boolean boolean40 = defaultKeyedValues2D35.equals((java.lang.Object) 10.0f);
        int int42 = defaultKeyedValues2D35.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D43 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list44 = defaultKeyedValues2D43.getRowKeys();
        int int45 = defaultKeyedValues2D43.getRowCount();
        int int46 = defaultKeyedValues2D43.getRowCount();
        boolean boolean48 = defaultKeyedValues2D43.equals((java.lang.Object) 10.0f);
        int int50 = defaultKeyedValues2D43.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D43.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D43.clear();
        boolean boolean55 = defaultKeyedValues2D35.equals((java.lang.Object) defaultKeyedValues2D43);
        java.util.List list56 = defaultKeyedValues2D43.getRowKeys();
        boolean boolean57 = defaultKeyedValues2D17.equals((java.lang.Object) defaultKeyedValues2D43);
        java.util.List list58 = defaultKeyedValues2D17.getColumnKeys();
        boolean boolean59 = defaultKeyedValues2D0.equals((java.lang.Object) list58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }
}

