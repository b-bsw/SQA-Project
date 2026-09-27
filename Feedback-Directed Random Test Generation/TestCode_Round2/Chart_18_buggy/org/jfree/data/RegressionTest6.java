package org.jfree.data;

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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (short) 100, (java.lang.Number) 4);
        java.util.List list18 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues0.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100.0f);
        java.lang.Class<?> wildcardClass18 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        defaultKeyedValues2D20.setValue((java.lang.Number) 2, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) 1);
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
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        int int22 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 1);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
        java.lang.Object obj18 = defaultKeyedValues2D0.clone();
        java.util.List list19 = defaultKeyedValues2D0.getRowKeys();
        int int20 = defaultKeyedValues2D0.getRowCount();
        int int22 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 5, (java.lang.Comparable) (short) 10, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D31 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D31.clear();
        int int34 = defaultKeyedValues2D31.getColumnIndex((java.lang.Comparable) 100.0d);
        java.lang.Object obj35 = defaultKeyedValues2D31.clone();
        defaultKeyedValues2D31.clear();
        defaultKeyedValues2D31.clear();
        boolean boolean38 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D31);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        java.lang.Number number11 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) (short) 0);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) ' ', (java.lang.Number) 100L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 6, 10.0d);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) false, (java.lang.Comparable) 3);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 100);
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.addValue(number13, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Boolean (java.lang.Byte and java.lang.Boolean are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (double) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues0.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D();
        int int7 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D5.getColumnKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) '4');
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        int int38 = defaultKeyedValues0.getIndex((java.lang.Comparable) "hi!");
        int int40 = defaultKeyedValues0.getIndex((java.lang.Comparable) ' ');
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 100.0d, (java.lang.Number) 0.0d);
        org.jfree.chart.util.SortOrder sortOrder45 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 1L);
        java.util.List list13 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) ' ');
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (double) 2);
        java.lang.Comparable comparable11 = defaultKeyedValues0.getKey((int) (short) 1);
        java.util.List list12 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues0.getKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (byte) -1 + "'", comparable11, (byte) -1);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 'a');
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0L, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) 4, (java.lang.Comparable) true);
        int int21 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (double) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean19 = defaultKeyedValues11.equals((java.lang.Object) 0L);
        int int21 = defaultKeyedValues11.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues11.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues11.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj30 = defaultKeyedValues2D29.clone();
        boolean boolean31 = defaultKeyedValues11.equals((java.lang.Object) defaultKeyedValues2D29);
        java.lang.Comparable comparable33 = defaultKeyedValues11.getKey(1);
        int int35 = defaultKeyedValues11.getIndex((java.lang.Comparable) 2);
        boolean boolean36 = defaultKeyedValues0.equals((java.lang.Object) int35);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + (short) 0 + "'", comparable33, (short) 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', 1.0d);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.addValue((java.lang.Number) 97.0d, comparable13, (java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Number) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, (double) (-1));
        java.util.List list11 = defaultKeyedValues0.getKeys();
        java.util.List list12 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues8 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues8.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues12.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean16 = defaultKeyedValues8.equals((java.lang.Object) 0L);
        int int18 = defaultKeyedValues8.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues8.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues8.removeValue((java.lang.Comparable) 10L);
        java.lang.Object obj24 = defaultKeyedValues8.clone();
        boolean boolean25 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues8);
        defaultKeyedValues8.setValue((java.lang.Comparable) 100, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        int int57 = defaultKeyedValues2D46.getRowIndex((java.lang.Comparable) 100);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(6, (java.lang.Comparable) (-1.0f), (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        int int22 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D23 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list24 = defaultKeyedValues2D23.getRowKeys();
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D23.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int33 = defaultKeyedValues2D23.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list34 = defaultKeyedValues2D23.getColumnKeys();
        defaultKeyedValues2D23.removeColumn((java.lang.Comparable) (-1L));
        int int38 = defaultKeyedValues2D23.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D23.clear();
        int int40 = defaultKeyedValues2D23.getRowCount();
        int int42 = defaultKeyedValues2D23.getRowIndex((java.lang.Comparable) (-1L));
        int int44 = defaultKeyedValues2D23.getColumnIndex((java.lang.Comparable) 1.0f);
        boolean boolean45 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean26 = defaultKeyedValues18.equals((java.lang.Object) 0L);
        int int28 = defaultKeyedValues18.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues18.removeValue((java.lang.Comparable) 0.0d);
        int int32 = defaultKeyedValues18.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues18.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D34 = new org.jfree.data.DefaultKeyedValues2D();
        int int36 = defaultKeyedValues2D34.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D34.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D34.clear();
        defaultKeyedValues2D34.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int46 = defaultKeyedValues2D34.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D34.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list50 = defaultKeyedValues2D34.getRowKeys();
        boolean boolean51 = defaultKeyedValues18.equals((java.lang.Object) defaultKeyedValues2D34);
        boolean boolean52 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues18);
        java.lang.Object obj53 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0.0f);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (java.lang.Number) 35.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        java.util.List list52 = defaultKeyedValues25.getKeys();
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
        org.junit.Assert.assertNotNull(list52);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.clear();
        int int11 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj12 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int3 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (byte) 100);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) "");
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, 1.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues30.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues30.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues30.removeValue((java.lang.Comparable) (byte) 0);
        int int39 = defaultKeyedValues30.getItemCount();
        defaultKeyedValues30.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj43 = defaultKeyedValues30.clone();
        defaultKeyedValues30.setValue((java.lang.Comparable) (short) 0, (double) 100.0f);
        defaultKeyedValues30.setValue((java.lang.Comparable) false, (double) (-1.0f));
        boolean boolean50 = defaultKeyedValues0.equals((java.lang.Object) (-1.0f));
        java.lang.Number number52 = defaultKeyedValues0.getValue(0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + number52 + "' != '" + 0L + "'", number52, 0L);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) "");
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 4);
        int int17 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) ' ', (java.lang.Number) 0.0f);
        java.lang.Object obj22 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.setValue((java.lang.Number) 1, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) 10);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        int int23 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int27 = defaultKeyedValues2D25.getRowIndex((java.lang.Comparable) '#');
        int int29 = defaultKeyedValues2D25.getColumnIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D25.clear();
        defaultKeyedValues2D25.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) ' ', (java.lang.Comparable) 3);
        int int36 = defaultKeyedValues2D25.getColumnIndex((java.lang.Comparable) 0.0f);
        java.util.List list37 = defaultKeyedValues2D25.getColumnKeys();
        boolean boolean38 = defaultKeyedValues2D0.equals((java.lang.Object) list37);
        int int39 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
        java.lang.Object obj18 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
            java.lang.Comparable comparable37 = defaultKeyedValues2D16.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
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
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) (-1));
        defaultKeyedValues0.removeValue((java.lang.Comparable) "hi!");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int20 = defaultKeyedValues16.getItemCount();
        java.util.List list21 = defaultKeyedValues16.getKeys();
        defaultKeyedValues16.addValue((java.lang.Comparable) "", (java.lang.Number) 100L);
        int int25 = defaultKeyedValues16.getItemCount();
        boolean boolean26 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues16);
        org.jfree.chart.util.SortOrder sortOrder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0L, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) 4, (java.lang.Comparable) true);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) 97.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D10 = new org.jfree.data.DefaultKeyedValues2D();
        int int12 = defaultKeyedValues2D10.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D10.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D10.clear();
        defaultKeyedValues2D10.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D10.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj23 = defaultKeyedValues2D10.clone();
        defaultKeyedValues2D10.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
        java.lang.Object obj28 = defaultKeyedValues2D10.clone();
        defaultKeyedValues2D10.clear();
        defaultKeyedValues2D10.setValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (-1.0d));
        boolean boolean34 = defaultKeyedValues0.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        java.lang.Comparable comparable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(comparable24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        java.util.List list14 = defaultKeyedValues2D0.getRowKeys();
        int int15 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 35.0d, (java.lang.Comparable) '#', (java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable21 = defaultKeyedValues2D0.getRowKey((int) (byte) 0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + '#' + "'", comparable21, '#');
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list4 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (short) -1, (double) 1L);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        java.lang.Object obj49 = defaultKeyedValues0.clone();
        java.lang.Object obj50 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number52 = defaultKeyedValues0.getValue((java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: ");
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
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        java.lang.Object obj52 = defaultKeyedValues2D38.clone();
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
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (java.lang.Number) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (double) (byte) 0);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        int int24 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 10L, (java.lang.Comparable) (short) 1, (java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        java.lang.Class<?> wildcardClass31 = list30.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable29 = defaultKeyedValues2D0.getRowKey((int) (byte) 0);
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
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (-1.0d));
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultKeyedValues0.getKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        java.util.List list26 = defaultKeyedValues2D0.getRowKeys();
        int int27 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        defaultKeyedValues2D18.clear();
        java.lang.Number number23 = null;
        java.lang.Comparable comparable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D18.addValue(number23, (java.lang.Comparable) (-1), comparable25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 35.0d);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 100.0f);
        int int16 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 6);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) '4', (java.lang.Comparable) 10);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        java.lang.Comparable comparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(comparable17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
            defaultKeyedValues2D0.removeRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (double) ' ');
        java.util.List list14 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        java.util.List list22 = defaultKeyedValues2D0.getRowKeys();
        int int24 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100L);
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 100, (java.lang.Comparable) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.setValue((java.lang.Number) 52.0d, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1L);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        org.jfree.chart.util.SortOrder sortOrder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 1);
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
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        int int41 = defaultKeyedValues7.getItemCount();
        java.lang.Number number43 = defaultKeyedValues7.getValue(1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues7.removeValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 6 + "'", int41 == 6);
        org.junit.Assert.assertEquals("'" + number43 + "' != '" + 0L + "'", number43, 0L);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int4 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Number number5 = null;
        defaultKeyedValues2D0.addValue(number5, (java.lang.Comparable) '#', (java.lang.Comparable) (-1.0f));
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 35.0d, (java.lang.Comparable) (short) 100);
        java.util.List list15 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        int int26 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        defaultKeyedValues7.removeValue((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = defaultKeyedValues7.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 1.0d + "'", number31, 1.0d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100, (java.lang.Comparable) '#', (java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) "");
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) 100, (java.lang.Comparable) 'a');
        int int17 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 97.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) true, (java.lang.Number) (short) -1);
        java.lang.Class<?> wildcardClass13 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        java.util.List list2 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Class<?> wildcardClass3 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues3 = new org.jfree.data.DefaultKeyedValues();
        int int5 = defaultKeyedValues3.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues3.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj9 = defaultKeyedValues3.clone();
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues3);
        defaultKeyedValues3.addValue((java.lang.Comparable) 35.0d, (java.lang.Number) 10L);
        defaultKeyedValues3.insertValue((int) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Number) 100.0d);
        defaultKeyedValues3.addValue((java.lang.Comparable) 10.0d, (double) 2);
        defaultKeyedValues3.removeValue((java.lang.Comparable) 97.0d);
        defaultKeyedValues3.addValue((java.lang.Comparable) 10.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        java.lang.Number number37 = defaultKeyedValues0.getValue(0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues40 = new org.jfree.data.DefaultKeyedValues();
        int int42 = defaultKeyedValues40.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues40.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues40.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list49 = defaultKeyedValues40.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues50 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues50.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues50.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable58 = defaultKeyedValues50.getKey((int) (short) 0);
        boolean boolean59 = defaultKeyedValues40.equals((java.lang.Object) defaultKeyedValues50);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D60 = new org.jfree.data.DefaultKeyedValues2D();
        int int62 = defaultKeyedValues2D60.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D60.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D60.clear();
        defaultKeyedValues2D60.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D60.clear();
        defaultKeyedValues2D60.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D60.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D60.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100);
        boolean boolean82 = defaultKeyedValues50.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass83 = defaultKeyedValues50.getClass();
        boolean boolean84 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues50);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 0);
        int int88 = defaultKeyedValues0.getIndex((java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + number37 + "' != '" + 0L + "'", number37, 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertEquals("'" + comparable58 + "' != '" + (short) 0 + "'", comparable58, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 1, (double) 1L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean30 = defaultKeyedValues22.equals((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultKeyedValues22.clone();
        boolean boolean33 = defaultKeyedValues22.equals((java.lang.Object) (byte) 10);
        int int34 = defaultKeyedValues22.getItemCount();
        defaultKeyedValues22.addValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 100);
        boolean boolean38 = defaultKeyedValues0.equals((java.lang.Object) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 97.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        int int18 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        defaultKeyedValues2D8.clear();
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
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        java.lang.Object obj33 = defaultKeyedValues18.clone();
        org.jfree.chart.util.SortOrder sortOrder34 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues18.sortByValues(sortOrder34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + number32 + "' != '" + 0 + "'", number32, 0);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.setValue((java.lang.Number) 6, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 52.0d);
        java.lang.Object obj17 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        java.lang.Number number25 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 0);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 'a', (double) (byte) 10);
        int int31 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 97.0d + "'", number25, 97.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.clear();
        java.util.List list12 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        java.util.List list38 = defaultKeyedValues2D0.getRowKeys();
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
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues3 = new org.jfree.data.DefaultKeyedValues();
        int int5 = defaultKeyedValues3.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues3.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj9 = defaultKeyedValues3.clone();
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues3);
        defaultKeyedValues3.addValue((java.lang.Comparable) 35.0d, (java.lang.Number) 10L);
        defaultKeyedValues3.insertValue((int) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Number) 100.0d);
        defaultKeyedValues3.addValue((java.lang.Comparable) 10.0d, (double) 2);
        java.lang.Object obj21 = defaultKeyedValues3.clone();
        int int22 = defaultKeyedValues3.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        java.util.List list81 = defaultKeyedValues2D42.getColumnKeys();
        defaultKeyedValues2D42.clear();
        java.lang.Object obj83 = defaultKeyedValues2D42.clone();
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
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertNotNull(obj83);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.util.List list6 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) 100);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues0.getKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 1.0d);
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
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D0.clear();
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        int int13 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0);
        int int15 = defaultKeyedValues2D0.getRowCount();
        int int16 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list17 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        int int13 = defaultKeyedValues2D1.getRowCount();
        int int15 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
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
        defaultKeyedValues7.addValue((java.lang.Comparable) 100.0d, (java.lang.Number) 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) 10L);
        int int17 = defaultKeyedValues0.getItemCount();
        int int19 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (java.lang.Number) 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        java.util.List list13 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        java.lang.Object obj28 = defaultKeyedValues2D0.clone();
        int int29 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) 2, (java.lang.Number) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = defaultKeyedValues2D0.getColumnKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) false, (java.lang.Comparable) 3);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list13 = defaultKeyedValues2D12.getRowKeys();
        int int14 = defaultKeyedValues2D12.getRowCount();
        int int15 = defaultKeyedValues2D12.getRowCount();
        int int17 = defaultKeyedValues2D12.getRowIndex((java.lang.Comparable) '4');
        int int18 = defaultKeyedValues2D12.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean27 = defaultKeyedValues19.equals((java.lang.Object) 0L);
        int int29 = defaultKeyedValues19.getIndex((java.lang.Comparable) 1L);
        int int31 = defaultKeyedValues19.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj32 = defaultKeyedValues19.clone();
        boolean boolean33 = defaultKeyedValues2D12.equals(obj32);
        java.util.List list34 = defaultKeyedValues2D12.getRowKeys();
        defaultKeyedValues2D12.removeValue((java.lang.Comparable) "", (java.lang.Comparable) '4');
        defaultKeyedValues2D12.addValue((java.lang.Number) (short) 1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues42 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues42.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues42.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues42.setValue((java.lang.Comparable) true, (double) '4');
        int int52 = defaultKeyedValues42.getItemCount();
        boolean boolean53 = defaultKeyedValues2D12.equals((java.lang.Object) int52);
        defaultKeyedValues2D12.addValue((java.lang.Number) 0.0f, (java.lang.Comparable) 100.0d, (java.lang.Comparable) 1);
        boolean boolean58 = defaultKeyedValues2D1.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "hi!");
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0.0d);
        int int15 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        defaultKeyedValues2D0.removeRow((int) (short) 1);
        int int27 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeColumn(2);
        int int30 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        defaultKeyedValues0.clear();
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        int int17 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 35.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1));
        int int17 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        java.lang.Comparable comparable32 = defaultKeyedValues2D0.getRowKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable34 = defaultKeyedValues2D0.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) -1 + "'", comparable32, (short) -1);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        java.util.List list11 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues51 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues51.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues51.clear();
        defaultKeyedValues51.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable60 = defaultKeyedValues51.getKey(0);
        defaultKeyedValues51.insertValue(0, (java.lang.Comparable) 10L, (double) (short) -1);
        boolean boolean65 = defaultKeyedValues2D0.equals((java.lang.Object) (short) -1);
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
        org.junit.Assert.assertEquals("'" + comparable60 + "' != '" + "" + "'", comparable60, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        java.util.List list41 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '4');
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
        org.junit.Assert.assertNotNull(list41);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int5 = defaultKeyedValues2D0.getColumnCount();
        int int6 = defaultKeyedValues2D0.getRowCount();
        int int7 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) (-1L));
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
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
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
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        int int29 = defaultKeyedValues0.getIndex((java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D0.removeRow((int) (byte) 0);
        java.lang.Object obj21 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D();
        int int28 = defaultKeyedValues2D26.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D26.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D26.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues33 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues33.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues37 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues37.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean41 = defaultKeyedValues33.equals((java.lang.Object) 0L);
        int int43 = defaultKeyedValues33.getIndex((java.lang.Comparable) 1L);
        int int45 = defaultKeyedValues33.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj46 = defaultKeyedValues33.clone();
        boolean boolean47 = defaultKeyedValues2D26.equals((java.lang.Object) defaultKeyedValues33);
        defaultKeyedValues33.addValue((java.lang.Comparable) 10.0f, (double) (byte) 1);
        java.lang.Object obj51 = defaultKeyedValues33.clone();
        java.lang.Object obj52 = defaultKeyedValues33.clone();
        defaultKeyedValues33.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) (byte) 10);
        defaultKeyedValues33.setValue((java.lang.Comparable) (-1L), (java.lang.Number) (byte) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D59 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D59.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list63 = defaultKeyedValues2D59.getColumnKeys();
        defaultKeyedValues2D59.clear();
        boolean boolean65 = defaultKeyedValues33.equals((java.lang.Object) defaultKeyedValues2D59);
        boolean boolean66 = defaultKeyedValues0.equals((java.lang.Object) boolean65);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 35.0d + "'", number23, 35.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        java.lang.Comparable comparable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) "hi!", comparable29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        java.util.List list22 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj23 = defaultKeyedValues2D0.clone();
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
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        defaultKeyedValues2D0.removeColumn(0);
        int int35 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues35 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues35.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D39 = new org.jfree.data.DefaultKeyedValues2D();
        int int41 = defaultKeyedValues2D39.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D39.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D39.clear();
        defaultKeyedValues2D39.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D39.removeColumn((java.lang.Comparable) 10L);
        boolean boolean52 = defaultKeyedValues35.equals((java.lang.Object) defaultKeyedValues2D39);
        defaultKeyedValues35.insertValue((int) (short) 1, (java.lang.Comparable) 1, (double) 1L);
        java.lang.Class<?> wildcardClass57 = defaultKeyedValues35.getClass();
        boolean boolean58 = defaultKeyedValues2D13.equals((java.lang.Object) defaultKeyedValues35);
        int int59 = defaultKeyedValues2D13.getColumnCount();
        defaultKeyedValues2D13.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 10.0d);
        java.lang.Number number22 = defaultKeyedValues0.getValue((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 100, (java.lang.Comparable) (short) 1, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 35.0d + "'", number22, 35.0d);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        defaultKeyedValues2D18.clear();
        java.util.List list26 = defaultKeyedValues2D18.getColumnKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D27 = new org.jfree.data.DefaultKeyedValues2D();
        int int29 = defaultKeyedValues2D27.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D27.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D27.clear();
        defaultKeyedValues2D27.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D27.clear();
        defaultKeyedValues2D27.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D27.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D27.removeRow((int) (byte) 0);
        java.lang.Object obj48 = defaultKeyedValues2D27.clone();
        boolean boolean49 = defaultKeyedValues2D18.equals(obj48);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) false, (java.lang.Comparable) 3);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 100);
        java.lang.Object obj13 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list15 = defaultKeyedValues2D14.getRowKeys();
        int int16 = defaultKeyedValues2D14.getRowCount();
        int int17 = defaultKeyedValues2D14.getRowCount();
        boolean boolean19 = defaultKeyedValues2D14.equals((java.lang.Object) 10.0f);
        int int21 = defaultKeyedValues2D14.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list23 = defaultKeyedValues2D22.getRowKeys();
        int int24 = defaultKeyedValues2D22.getRowCount();
        int int25 = defaultKeyedValues2D22.getRowCount();
        boolean boolean27 = defaultKeyedValues2D22.equals((java.lang.Object) 10.0f);
        int int29 = defaultKeyedValues2D22.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D22.clear();
        boolean boolean34 = defaultKeyedValues2D14.equals((java.lang.Object) defaultKeyedValues2D22);
        defaultKeyedValues2D14.removeColumn((java.lang.Comparable) 100.0f);
        int int37 = defaultKeyedValues2D14.getRowCount();
        int int38 = defaultKeyedValues2D14.getColumnCount();
        int int39 = defaultKeyedValues2D14.getColumnCount();
        defaultKeyedValues2D14.removeColumn((java.lang.Comparable) 100L);
        boolean boolean42 = defaultKeyedValues2D1.equals((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1L));
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D12 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D12.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D12.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        boolean boolean20 = defaultKeyedValues2D0.equals((java.lang.Object) (byte) 1);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) -1, (java.lang.Comparable) 0.0d, (java.lang.Comparable) '4');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 10, (java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D0.getValue((-1), 3);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, (java.lang.Number) 10L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 6, (double) (-1.0f));
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable18, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (short) -1, (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        java.lang.Number number42 = defaultKeyedValues0.getValue((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + number42 + "' != '" + 0L + "'", number42, 0L);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        int int65 = defaultKeyedValues2D22.getColumnCount();
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues3 = new org.jfree.data.DefaultKeyedValues();
        int int5 = defaultKeyedValues3.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues3.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj9 = defaultKeyedValues3.clone();
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues3);
        defaultKeyedValues3.addValue((java.lang.Comparable) 35.0d, (java.lang.Number) 10L);
        defaultKeyedValues3.insertValue((int) (byte) 1, (java.lang.Comparable) 0.0d, (java.lang.Number) 100.0d);
        defaultKeyedValues3.removeValue((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.removeValue(1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) (-1L));
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }
}

