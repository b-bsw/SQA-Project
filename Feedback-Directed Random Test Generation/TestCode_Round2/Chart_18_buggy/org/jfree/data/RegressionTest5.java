package org.jfree.data;

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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) '#', (double) 'a');
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) 10.0f);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D();
        int int7 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D5.getColumnKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues0.getKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) false, (java.lang.Comparable) 3);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        int int15 = defaultKeyedValues13.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues13.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list22 = defaultKeyedValues13.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues23.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable31 = defaultKeyedValues23.getKey((int) (short) 0);
        boolean boolean32 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues23);
        defaultKeyedValues13.setValue((java.lang.Comparable) '#', (java.lang.Number) 10.0d);
        defaultKeyedValues13.setValue((java.lang.Comparable) 100L, (java.lang.Number) (byte) 1);
        boolean boolean39 = defaultKeyedValues2D1.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (short) 0 + "'", comparable31, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        defaultKeyedValues7.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues7.removeValue(comparable28);
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
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        java.lang.Comparable comparable43 = defaultKeyedValues2D0.getRowKey(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 100.0f + "'", comparable43, 100.0f);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
        java.util.List list16 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) "", (java.lang.Comparable) 1.0f);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1), (java.lang.Comparable) 5, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.clear();
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        int int16 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 'a', (java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 100);
        org.jfree.chart.util.SortOrder sortOrder42 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder42);
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
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
            java.lang.Number number26 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 97.0d, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        defaultKeyedValues2D20.addValue((java.lang.Number) 5, (java.lang.Comparable) 97.0d, (java.lang.Comparable) (-1.0d));
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
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) '#', (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) '4', (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1), (java.lang.Comparable) (-1L), (java.lang.Comparable) 0.0f);
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 100.0d, (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) '#', (double) 'a');
        java.util.List list15 = defaultKeyedValues0.getKeys();
        java.util.List list16 = defaultKeyedValues0.getKeys();
        int int18 = defaultKeyedValues0.getIndex((java.lang.Comparable) ' ');
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 97.0d, (java.lang.Comparable) true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: true");
        } catch (org.jfree.data.UnknownKeyException e) {
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
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
            defaultKeyedValues2D5.removeRow((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        int int22 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder23 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultKeyedValues2D0.getRowKey((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) true);
        int int13 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        int int33 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list19 = defaultKeyedValues2D18.getRowKeys();
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) list19);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) (-1.0f), 97.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        int int19 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) -1 + "'", comparable18, (byte) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (-1.0d));
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
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        java.lang.Number number16 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, number16);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        int int21 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) 10);
        boolean boolean22 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D19);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) (short) 10, (java.lang.Number) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable28 = defaultKeyedValues0.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = defaultKeyedValues2D0.getValue(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        boolean boolean28 = defaultKeyedValues2D0.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) 100, (java.lang.Comparable) '4');
        java.util.List list19 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.clear();
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.setValue((java.lang.Number) 0L, comparable22, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        java.util.List list38 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) 35.0d, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 100.0d + "'", comparable37, 100.0d);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (double) (-1));
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues0.getValue((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        defaultKeyedValues2D19.removeColumn((java.lang.Comparable) 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        java.lang.Comparable comparable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) -1, comparable25, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        java.lang.Class<?> wildcardClass24 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean30 = defaultKeyedValues22.equals((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultKeyedValues22.clone();
        boolean boolean33 = defaultKeyedValues22.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues22.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 10);
        boolean boolean37 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues22);
        int int39 = defaultKeyedValues22.getIndex((java.lang.Comparable) 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = defaultKeyedValues22.getValue((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        defaultKeyedValues2D0.removeRow((int) (byte) 0);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) '4');
        int int18 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (double) (short) 100);
        defaultKeyedValues0.clear();
        java.util.List list20 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue(0);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        java.lang.Number number17 = null;
        defaultKeyedValues2D0.setValue(number17, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 3);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 0);
        int int23 = defaultKeyedValues2D0.getColumnCount();
        int int24 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 0L, (java.lang.Comparable) (byte) 1);
        java.lang.Comparable comparable30 = defaultKeyedValues2D0.getRowKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + 0.0d + "'", comparable30, 0.0d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj7 = defaultKeyedValues2D0.clone();
        java.util.List list8 = defaultKeyedValues2D0.getColumnKeys();
        int int9 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        int int45 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 3, (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 2");
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
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.addValue((java.lang.Number) 0L, (java.lang.Comparable) 0, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues27.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable35 = defaultKeyedValues27.getKey((int) (short) 0);
        defaultKeyedValues27.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable39 = defaultKeyedValues27.getKey(0);
        int int41 = defaultKeyedValues27.getIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj42 = defaultKeyedValues27.clone();
        boolean boolean43 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues27);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (short) 0 + "'", comparable35, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + (short) 0 + "'", comparable39, (short) 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) "", 0.0d);
        defaultKeyedValues0.removeValue((int) (byte) 1);
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
            java.lang.Comparable comparable31 = defaultKeyedValues2D0.getRowKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D0.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
            java.lang.Comparable comparable21 = defaultKeyedValues2D0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0f);
        int int21 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) false, (java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Number) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) true);
        int int14 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        int int25 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 35.0d + "'", number23, 35.0d);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 0L, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultKeyedValues2D0.getColumnKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues30.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues30.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues30.setValue((java.lang.Comparable) true, (double) '4');
        int int40 = defaultKeyedValues30.getItemCount();
        boolean boolean41 = defaultKeyedValues2D0.equals((java.lang.Object) int40);
        java.util.List list42 = defaultKeyedValues2D0.getColumnKeys();
        int int43 = defaultKeyedValues2D0.getRowCount();
        java.util.List list44 = defaultKeyedValues2D0.getColumnKeys();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (double) 100.0f);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 10.0f, (java.lang.Number) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 100, (double) (byte) 0);
        int int23 = defaultKeyedValues0.getIndex((java.lang.Comparable) 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 10.0f);
        int int21 = defaultKeyedValues2D0.getRowCount();
        int int22 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        int int7 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) '4', (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1), (java.lang.Comparable) (-1L), (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 52.0d, (java.lang.Comparable) (-1L));
        int int16 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        java.lang.Comparable comparable35 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues7.setValue(comparable35, (java.lang.Number) 97.0d);
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
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 1.0d + "'", number31, 1.0d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int6 = defaultKeyedValues2D1.getColumnCount();
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D1.getColumnKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(6, (java.lang.Comparable) 100, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1), (java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        defaultKeyedValues2D0.clear();
        int int22 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D();
        int int7 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D5.getColumnKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) -1);
        int int15 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        java.util.List list33 = defaultKeyedValues0.getKeys();
        java.util.List list34 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        int int19 = defaultKeyedValues2D17.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D23 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list24 = defaultKeyedValues2D23.getRowKeys();
        defaultKeyedValues2D23.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D23.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int33 = defaultKeyedValues2D23.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list34 = defaultKeyedValues2D23.getColumnKeys();
        defaultKeyedValues2D23.removeColumn((java.lang.Comparable) (-1L));
        boolean boolean37 = defaultKeyedValues2D17.equals((java.lang.Object) (-1L));
        int int39 = defaultKeyedValues2D17.getColumnIndex((java.lang.Comparable) ' ');
        boolean boolean40 = defaultKeyedValues2D0.equals((java.lang.Object) ' ');
        int int42 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 4);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, 1.0d);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
        defaultKeyedValues0.removeValue(1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 97.0d, (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 0.0f);
        java.lang.Comparable comparable18 = defaultKeyedValues2D0.getRowKey(0);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) (byte) 1, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj4 = defaultKeyedValues2D1.clone();
        java.lang.Object obj5 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        int int8 = defaultKeyedValues2D6.getRowCount();
        int int9 = defaultKeyedValues2D6.getRowCount();
        int int11 = defaultKeyedValues2D6.getRowIndex((java.lang.Comparable) '4');
        int int12 = defaultKeyedValues2D6.getRowCount();
        java.util.List list13 = defaultKeyedValues2D6.getRowKeys();
        defaultKeyedValues2D6.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 35.0d);
        defaultKeyedValues2D6.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1));
        defaultKeyedValues2D6.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 2);
        java.util.List list26 = defaultKeyedValues2D6.getRowKeys();
        boolean boolean27 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D6);
        java.lang.Comparable comparable28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = defaultKeyedValues2D6.getColumnIndex(comparable28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 0, (java.lang.Comparable) (-1.0d));
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
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        int int12 = defaultKeyedValues2D8.getColumnCount();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) int12);
        int int15 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        int int23 = defaultKeyedValues3.getItemCount();
        java.lang.Object obj24 = defaultKeyedValues3.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 0L, (java.lang.Comparable) false, (java.lang.Comparable) 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues0.getKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        int int18 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        int int21 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D19.clear();
        defaultKeyedValues2D19.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D19.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj32 = defaultKeyedValues2D19.clone();
        defaultKeyedValues2D19.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
        boolean boolean37 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D19);
        java.util.List list38 = defaultKeyedValues2D19.getRowKeys();
        java.util.List list39 = defaultKeyedValues2D19.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        int int14 = defaultKeyedValues2D0.getRowCount();
        int int16 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D20 = new org.jfree.data.DefaultKeyedValues2D();
        int int22 = defaultKeyedValues2D20.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D20.clear();
        defaultKeyedValues2D20.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D20.clear();
        java.util.List list32 = defaultKeyedValues2D20.getRowKeys();
        int int34 = defaultKeyedValues2D20.getColumnIndex((java.lang.Comparable) 1.0f);
        int int36 = defaultKeyedValues2D20.getRowIndex((java.lang.Comparable) 100.0d);
        int int37 = defaultKeyedValues2D20.getColumnCount();
        int int39 = defaultKeyedValues2D20.getRowIndex((java.lang.Comparable) 10L);
        java.util.List list40 = defaultKeyedValues2D20.getColumnKeys();
        boolean boolean41 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D20);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues30.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues30.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues30.setValue((java.lang.Comparable) true, (double) '4');
        int int40 = defaultKeyedValues30.getItemCount();
        boolean boolean41 = defaultKeyedValues2D0.equals((java.lang.Object) int40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number44 = defaultKeyedValues2D0.getValue(2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        int int24 = defaultKeyedValues0.getIndex((java.lang.Comparable) 2);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1L, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 0 + "'", comparable22, (short) 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        java.lang.Comparable comparable49 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int50 = defaultKeyedValues2D0.getColumnIndex(comparable49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 35.0d + "'", number22, 35.0d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        int int21 = defaultKeyedValues2D0.getColumnCount();
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
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues10.insertValue(3, (java.lang.Comparable) (-1.0d), (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        int int17 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues0.getValue((java.lang.Comparable) 5);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 5");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        int int23 = defaultKeyedValues2D0.getRowCount();
        int int24 = defaultKeyedValues2D0.getColumnCount();
        int int26 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 35.0d);
        java.util.List list27 = defaultKeyedValues2D0.getRowKeys();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) "");
        java.util.List list10 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D0.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) 0.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        java.util.List list4 = defaultKeyedValues2D1.getRowKeys();
        int int5 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultKeyedValues2D1.getValue((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable45 = defaultKeyedValues2D35.getRowKey((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues2D0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = defaultKeyedValues0.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        int int56 = defaultKeyedValues2D8.getRowCount();
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number61 = defaultKeyedValues2D8.getValue((java.lang.Comparable) 2, (java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        java.lang.Number number16 = defaultKeyedValues0.getValue((int) (short) 1);
        java.lang.Comparable comparable18 = defaultKeyedValues0.getKey(0);
        int int20 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 100L + "'", number16, 100L);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
        int int11 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        defaultKeyedValues17.insertValue(4, (java.lang.Comparable) 2, (java.lang.Number) 100.0d);
        defaultKeyedValues17.setValue((java.lang.Comparable) 4, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        int int7 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        java.lang.Object obj27 = defaultKeyedValues2D0.clone();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D();
        int int37 = defaultKeyedValues2D35.getRowIndex((java.lang.Comparable) 10);
        int int38 = defaultKeyedValues2D35.getRowCount();
        defaultKeyedValues2D35.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int43 = defaultKeyedValues2D35.getRowCount();
        java.util.List list44 = defaultKeyedValues2D35.getColumnKeys();
        defaultKeyedValues2D35.removeColumn((int) (byte) 0);
        defaultKeyedValues2D35.removeRow((int) (byte) 0);
        int int49 = defaultKeyedValues2D35.getColumnCount();
        defaultKeyedValues2D35.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 1.0d, (java.lang.Comparable) (-1));
        defaultKeyedValues2D35.removeColumn((int) (short) 0);
        boolean boolean56 = defaultKeyedValues2D0.equals((java.lang.Object) (short) 0);
        java.util.List list57 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, 97.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) (byte) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 4, (java.lang.Comparable) 10L);
        int int19 = defaultKeyedValues2D0.getRowCount();
        int int21 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 0);
        java.util.List list22 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), (double) (-1.0f));
        defaultKeyedValues0.removeValue((java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100, (java.lang.Comparable) 1.0d);
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
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        java.lang.Object obj30 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues31.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues31.clear();
        defaultKeyedValues31.clear();
        defaultKeyedValues31.addValue((java.lang.Comparable) ' ', (double) 100);
        boolean boolean40 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues31);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, (java.lang.Number) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "");
        defaultKeyedValues0.clear();
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues17.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues17.setValue((java.lang.Comparable) true, (double) '4');
        int int27 = defaultKeyedValues17.getItemCount();
        defaultKeyedValues17.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        java.lang.Number number33 = null;
        defaultKeyedValues17.setValue((java.lang.Comparable) 3, number33);
        java.lang.Object obj35 = defaultKeyedValues17.clone();
        boolean boolean36 = defaultKeyedValues0.equals(obj35);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1));
        java.util.List list8 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D1.getRowKey(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        java.lang.Object obj12 = defaultKeyedValues0.clone();
        java.util.List list13 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.clear();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        int int6 = defaultKeyedValues2D1.getRowCount();
        java.util.List list7 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj9 = defaultKeyedValues2D1.clone();
        java.util.List list10 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        defaultKeyedValues2D18.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        int int42 = defaultKeyedValues2D26.getColumnIndex((java.lang.Comparable) 100.0d);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        int int28 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1.0f);
        defaultKeyedValues7.removeValue(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) (short) 10, (java.lang.Comparable) 52.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj2 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = defaultKeyedValues2D0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 2);
        java.lang.Object obj9 = defaultKeyedValues2D0.clone();
        int int10 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D0.getColumnKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj2 = defaultKeyedValues2D0.clone();
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        int int6 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0L);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        int int61 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 2);
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass10 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, (double) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (java.lang.Number) 100);
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
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (java.lang.Number) 100L);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (java.lang.Number) 3);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 100, (java.lang.Comparable) 0.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '4');
        java.util.List list28 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
            java.lang.Number number18 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 1, (java.lang.Comparable) ' ');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey:  ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, 97.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues0.getValue((java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 3");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        int int40 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 52.0d, (double) (short) 1);
        java.lang.Number number46 = defaultKeyedValues0.getValue(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number48 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
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
        org.junit.Assert.assertEquals("'" + number46 + "' != '" + 0L + "'", number46, 0L);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100.0f);
        int int13 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 4, (java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        int int18 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 1L, (java.lang.Number) 10L);
        java.util.List list18 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100, (double) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (java.lang.Number) 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '#', (java.lang.Comparable) 100.0f, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        defaultKeyedValues2D4.addValue((java.lang.Number) (byte) 0, (java.lang.Comparable) (short) 10, (java.lang.Comparable) 10.0f);
        int int23 = defaultKeyedValues2D4.getColumnIndex((java.lang.Comparable) "");
        defaultKeyedValues2D4.setValue((java.lang.Number) 10L, (java.lang.Comparable) (-1L), (java.lang.Comparable) 100.0f);
        int int28 = defaultKeyedValues2D4.getRowCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, 10.0d);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0d));
        java.lang.Number number22 = defaultKeyedValues0.getValue(0);
        org.jfree.chart.util.SortOrder sortOrder23 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0L + "'", number22, 0L);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        java.lang.Number number20 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 10);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 1L + "'", number20, 1L);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) "", 0.0d);
        defaultKeyedValues0.removeValue((int) (byte) 1);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (short) 0);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
        java.lang.Class<?> wildcardClass16 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) false, (java.lang.Comparable) 3);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 3);
        java.lang.Object obj14 = defaultKeyedValues2D1.clone();
        int int16 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10.0f);
        int int18 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), 0.0d);
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
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) 1L);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 0L + "'", number21, 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) (-1), (java.lang.Comparable) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable35 = defaultKeyedValues2D0.getRowKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
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
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        int int16 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = defaultKeyedValues0.getValue((java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 3");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
        java.lang.Object obj30 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues31.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues31.clear();
        defaultKeyedValues31.clear();
        defaultKeyedValues31.addValue((java.lang.Comparable) ' ', (double) 100);
        boolean boolean40 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues31);
        java.lang.Object obj41 = defaultKeyedValues0.clone();
        int int43 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues37 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues37.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues41 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues41.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean45 = defaultKeyedValues37.equals((java.lang.Object) 0L);
        int int47 = defaultKeyedValues37.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues37.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues37.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D55 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj56 = defaultKeyedValues2D55.clone();
        boolean boolean57 = defaultKeyedValues37.equals((java.lang.Object) defaultKeyedValues2D55);
        defaultKeyedValues37.removeValue((java.lang.Comparable) false);
        defaultKeyedValues37.clear();
        java.util.List list61 = defaultKeyedValues37.getKeys();
        boolean boolean62 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues37);
        defaultKeyedValues37.setValue((java.lang.Comparable) 0.0d, (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
        int int17 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
            java.lang.Comparable comparable25 = defaultKeyedValues2D0.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
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
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        java.util.List list4 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 4, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        int int16 = defaultKeyedValues2D0.getRowCount();
        int int17 = defaultKeyedValues2D0.getRowCount();
        int int19 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 6);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 100, (java.lang.Number) 100L);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 1, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.addValue((java.lang.Number) 52.0d, (java.lang.Comparable) 2, (java.lang.Comparable) 100.0f);
        java.util.List list19 = defaultKeyedValues2D0.getColumnKeys();
        int int20 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D0.getValue((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        defaultKeyedValues10.insertValue((int) (short) 1, (java.lang.Comparable) 97.0d, (java.lang.Number) 10.0f);
        int int47 = defaultKeyedValues10.getItemCount();
        java.lang.Object obj48 = defaultKeyedValues10.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0f, (java.lang.Comparable) 2, (java.lang.Comparable) 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1), (java.lang.Comparable) 1, (java.lang.Comparable) 1.0d);
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        java.util.List list15 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Class<?> wildcardClass16 = list15.getClass();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        java.lang.Object obj22 = defaultKeyedValues0.clone();
        int int23 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (java.lang.Number) 10.0d);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D();
        int int7 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D5.getColumnKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        java.lang.Object obj13 = defaultKeyedValues2D5.clone();
        int int15 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D5.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        int int19 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0d));
        int int21 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) (short) 100);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = defaultKeyedValues0.getValue((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean24 = defaultKeyedValues16.equals((java.lang.Object) 0L);
        int int26 = defaultKeyedValues16.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues16.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues16.removeValue((java.lang.Comparable) 10L);
        int int33 = defaultKeyedValues16.getIndex((java.lang.Comparable) (byte) 100);
        java.lang.Object obj34 = defaultKeyedValues16.clone();
        java.lang.Class<?> wildcardClass35 = defaultKeyedValues16.getClass();
        boolean boolean36 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 1, (java.lang.Number) (-1));
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (double) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        java.lang.Comparable comparable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable32, 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '#', (java.lang.Comparable) 52.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 100, (java.lang.Comparable) (-1L), (java.lang.Comparable) 10L);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        java.util.List list21 = defaultKeyedValues2D18.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D18.removeRow((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) -1 + "'", comparable18, (byte) -1);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int4 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Number number5 = null;
        defaultKeyedValues2D0.addValue(number5, (java.lang.Comparable) '#', (java.lang.Comparable) (-1.0f));
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        java.lang.Object obj32 = defaultKeyedValues2D0.clone();
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
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 1L, (java.lang.Number) 10L);
        org.jfree.chart.util.SortOrder sortOrder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultKeyedValues2D0.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        int int18 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = defaultKeyedValues0.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        java.lang.Class<?> wildcardClass17 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 1L);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 2);
        java.lang.Number number16 = defaultKeyedValues0.getValue((int) (short) 1);
        int int18 = defaultKeyedValues0.getIndex((java.lang.Comparable) 35.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (short) 1 + "'", number16, (short) 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 97.0d, (double) (byte) 0);
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        org.jfree.chart.util.SortOrder sortOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        int int12 = defaultKeyedValues2D8.getColumnCount();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) int12);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) '#', (java.lang.Comparable) 3);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (double) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (java.lang.Number) 0.0f);
        defaultKeyedValues0.removeValue(5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        int int23 = defaultKeyedValues0.getItemCount();
        java.lang.Comparable comparable25 = defaultKeyedValues0.getKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = defaultKeyedValues0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 0L + "'", comparable25, 0L);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10L);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list19 = defaultKeyedValues2D18.getRowKeys();
        boolean boolean20 = defaultKeyedValues0.equals((java.lang.Object) list19);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        int int14 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.lang.Object obj15 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) ' ');
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues18.clear();
        defaultKeyedValues18.clear();
        defaultKeyedValues18.setValue((java.lang.Comparable) (byte) 1, (java.lang.Number) 35.0d);
        boolean boolean27 = defaultKeyedValues2D0.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 4, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0L);
        int int19 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0.0d);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        java.lang.Object obj9 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((int) (short) 0);
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 3);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 3, (java.lang.Comparable) 1L);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 2);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) 10L, (java.lang.Comparable) (short) 10);
        int int18 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
            java.lang.Comparable comparable25 = defaultKeyedValues2D0.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
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
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(false);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1.0d));
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list30 = defaultKeyedValues2D29.getRowKeys();
        int int31 = defaultKeyedValues2D29.getRowCount();
        int int32 = defaultKeyedValues2D29.getRowCount();
        boolean boolean34 = defaultKeyedValues2D29.equals((java.lang.Object) 10.0f);
        boolean boolean35 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = defaultKeyedValues2D0.getValue(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        defaultKeyedValues10.clear();
        int int22 = defaultKeyedValues10.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues10.clear();
        java.lang.Object obj24 = null;
        boolean boolean25 = defaultKeyedValues10.equals(obj24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.addValue((java.lang.Number) (-1.0d), (java.lang.Comparable) (-1.0d), comparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        int int13 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1L, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        java.lang.Comparable comparable70 = defaultKeyedValues2D22.getColumnKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable72 = defaultKeyedValues2D22.getRowKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
        org.junit.Assert.assertEquals("'" + comparable70 + "' != '" + 100 + "'", comparable70, 100);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int6 = defaultKeyedValues2D1.getColumnCount();
        int int8 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean17 = defaultKeyedValues9.equals((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultKeyedValues9.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean27 = defaultKeyedValues19.equals((java.lang.Object) 0L);
        int int29 = defaultKeyedValues19.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues19.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean32 = defaultKeyedValues9.equals((java.lang.Object) 0.0d);
        defaultKeyedValues9.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues9.removeValue((java.lang.Comparable) (short) 1);
        int int39 = defaultKeyedValues9.getIndex((java.lang.Comparable) "hi!");
        int int40 = defaultKeyedValues9.getItemCount();
        defaultKeyedValues9.removeValue((java.lang.Comparable) (byte) 1);
        defaultKeyedValues9.insertValue(2, (java.lang.Comparable) 10L, (java.lang.Number) (-1.0f));
        int int48 = defaultKeyedValues9.getIndex((java.lang.Comparable) 4);
        defaultKeyedValues9.addValue((java.lang.Comparable) (byte) 1, (java.lang.Number) 100.0d);
        boolean boolean52 = defaultKeyedValues2D1.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 4, (java.lang.Comparable) 10L);
        int int19 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) 35.0d);
        defaultKeyedValues2D0.addValue((java.lang.Number) 97.0d, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 35.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, (java.lang.Number) 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
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
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) -1);
        org.jfree.chart.util.SortOrder sortOrder25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (double) 100.0f);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (-1.0d));
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable9 = defaultKeyedValues0.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = defaultKeyedValues18.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 1L, (java.lang.Number) 10L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (double) 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        java.lang.Comparable comparable70 = defaultKeyedValues2D22.getColumnKey(0);
        int int71 = defaultKeyedValues2D22.getRowCount();
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
        org.junit.Assert.assertEquals("'" + comparable70 + "' != '" + 100 + "'", comparable70, 100);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues3 = new org.jfree.data.DefaultKeyedValues();
        int int5 = defaultKeyedValues3.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues3.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj9 = defaultKeyedValues3.clone();
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues3);
        defaultKeyedValues3.addValue((java.lang.Comparable) 35.0d, (java.lang.Number) 10L);
        java.lang.Number number15 = defaultKeyedValues3.getValue(0);
        int int17 = defaultKeyedValues3.getIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1L) + "'", number15, (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        int int33 = defaultKeyedValues7.getIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues7.addValue((java.lang.Comparable) 97.0d, (double) (byte) -1);
        defaultKeyedValues7.setValue((java.lang.Comparable) 6, (java.lang.Number) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals("'" + number31 + "' != '" + 1.0d + "'", number31, 1.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        java.util.List list41 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list41);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (double) ' ');
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        int int21 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 6, (java.lang.Comparable) "");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        defaultKeyedValues3.addValue((java.lang.Comparable) (-1), (java.lang.Number) (byte) 10);
        defaultKeyedValues3.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, 1.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues0.getValue((java.lang.Comparable) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 0L, (double) (-1.0f));
        java.util.List list26 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        defaultKeyedValues7.removeValue((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int5 = defaultKeyedValues2D0.getColumnCount();
        int int6 = defaultKeyedValues2D0.getRowCount();
        int int7 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D0.getValue(100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.util.List list18 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) ' ', (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(5, (java.lang.Comparable) (-1), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        int int27 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        int int28 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (java.lang.Number) 0);
        org.jfree.chart.util.SortOrder sortOrder32 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues0.getValue((java.lang.Comparable) 97.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 97.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        int int27 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1, (java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int3 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues2D0.getValue((int) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D22.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D22.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable31 = defaultKeyedValues2D22.getColumnKey((int) (byte) 0);
        java.lang.Comparable comparable33 = defaultKeyedValues2D22.getRowKey(0);
        defaultKeyedValues2D22.addValue((java.lang.Number) 4, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D22.addValue((java.lang.Number) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) "hi!");
        defaultKeyedValues2D22.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) 97.0d, (java.lang.Comparable) 100.0f);
        int int47 = defaultKeyedValues2D22.getColumnIndex((java.lang.Comparable) 100.0d);
        boolean boolean48 = defaultKeyedValues2D0.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 10L + "'", comparable31, 10L);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + 10.0f + "'", comparable33, 10.0f);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        java.util.List list23 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        int int45 = defaultKeyedValues7.getIndex((java.lang.Comparable) 10);
        defaultKeyedValues7.setValue((java.lang.Comparable) 6, (double) 4);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        java.lang.Comparable comparable43 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, comparable43, (java.lang.Number) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.setValue((java.lang.Number) 0, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 1.0d);
        java.util.List list10 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D0.getColumnKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 0, (double) 3);
        int int36 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) 0);
        int int15 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D0.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        int int32 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1);
        int int8 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 2, (java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        int int32 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) false);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) '#', (java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) "");
        int int13 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) 52.0d);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.util.List list6 = defaultKeyedValues0.getKeys();
        java.util.List list7 = defaultKeyedValues0.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list9 = defaultKeyedValues2D8.getRowKeys();
        int int10 = defaultKeyedValues2D8.getRowCount();
        int int11 = defaultKeyedValues2D8.getRowCount();
        boolean boolean13 = defaultKeyedValues2D8.equals((java.lang.Object) 10.0f);
        int int15 = defaultKeyedValues2D8.getColumnIndex((java.lang.Comparable) 0.0f);
        int int17 = defaultKeyedValues2D8.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D8.removeColumn((java.lang.Comparable) 100.0f);
        int int20 = defaultKeyedValues2D8.getColumnCount();
        java.lang.Object obj21 = defaultKeyedValues2D8.clone();
        boolean boolean22 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D8);
        int int23 = defaultKeyedValues2D8.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0);
        int int15 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D17 = new org.jfree.data.DefaultKeyedValues2D();
        int int19 = defaultKeyedValues2D17.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D17.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D17.clear();
        int int24 = defaultKeyedValues2D17.getRowCount();
        defaultKeyedValues2D17.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10, (java.lang.Comparable) false);
        defaultKeyedValues2D17.addValue((java.lang.Number) 100, (java.lang.Comparable) false, (java.lang.Comparable) (-1L));
        java.util.List list33 = defaultKeyedValues2D17.getColumnKeys();
        boolean boolean34 = defaultKeyedValues2D1.equals((java.lang.Object) list33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        defaultKeyedValues17.setValue((java.lang.Comparable) 10.0f, (java.lang.Number) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable44 = defaultKeyedValues17.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) "hi!");
        int int11 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 100L);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 6);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues0.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean24 = defaultKeyedValues16.equals((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultKeyedValues16.clone();
        boolean boolean27 = defaultKeyedValues16.equals((java.lang.Object) (byte) 10);
        int int28 = defaultKeyedValues16.getItemCount();
        defaultKeyedValues16.setValue((java.lang.Comparable) 100.0d, (double) 0.0f);
        boolean boolean32 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D20.removeColumn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        defaultKeyedValues0.insertValue(4, (java.lang.Comparable) 2, (java.lang.Number) (-1.0f));
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
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        java.lang.Number number11 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) (short) 0);
        int int16 = defaultKeyedValues0.getItemCount();
        int int17 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        java.util.List list36 = defaultKeyedValues2D16.getRowKeys();
        java.lang.Object obj37 = defaultKeyedValues2D16.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        int int17 = defaultKeyedValues0.getItemCount();
        int int18 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        java.lang.Object obj53 = defaultKeyedValues18.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number55 = defaultKeyedValues18.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (java.lang.Number) 52.0d);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list20 = defaultKeyedValues2D19.getRowKeys();
        int int21 = defaultKeyedValues2D19.getRowCount();
        int int22 = defaultKeyedValues2D19.getRowCount();
        int int24 = defaultKeyedValues2D19.getRowIndex((java.lang.Comparable) '4');
        int int25 = defaultKeyedValues2D19.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues30.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean34 = defaultKeyedValues26.equals((java.lang.Object) 0L);
        int int36 = defaultKeyedValues26.getIndex((java.lang.Comparable) 1L);
        int int38 = defaultKeyedValues26.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj39 = defaultKeyedValues26.clone();
        boolean boolean40 = defaultKeyedValues2D19.equals(obj39);
        defaultKeyedValues2D19.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) (short) 0, (java.lang.Comparable) "hi!");
        boolean boolean45 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (java.lang.Number) 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0d, (java.lang.Comparable) 100L, (java.lang.Comparable) 35.0d);
        defaultKeyedValues2D0.addValue((java.lang.Number) 97.0d, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (-1.0d));
        java.lang.Comparable comparable15 = defaultKeyedValues2D0.getColumnKey(1);
        java.lang.Object obj16 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (-1.0d) + "'", comparable15, (-1.0d));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) "");
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1.0d));
        java.util.List list14 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        defaultKeyedValues7.setValue((java.lang.Comparable) (short) 1, (java.lang.Number) (byte) 0);
        defaultKeyedValues7.addValue((java.lang.Comparable) 0.0f, (double) (byte) -1);
        defaultKeyedValues7.addValue((java.lang.Comparable) 0.0f, (java.lang.Number) (short) 10);
        defaultKeyedValues7.setValue((java.lang.Comparable) 100.0f, (java.lang.Number) 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (double) 10);
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number46 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
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
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        java.lang.Comparable comparable20 = defaultKeyedValues2D4.getRowKey(0);
        defaultKeyedValues2D4.addValue((java.lang.Number) 35.0d, (java.lang.Comparable) 52.0d, (java.lang.Comparable) 10);
        int int26 = defaultKeyedValues2D4.getColumnIndex((java.lang.Comparable) 0.0d);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 52.0d, (java.lang.Comparable) '4');
        java.lang.Object obj30 = defaultKeyedValues2D4.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) 100 + "'", comparable20, (byte) 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        int int13 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D0.getValue((int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        int int7 = defaultKeyedValues0.getIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues0.getValue((java.lang.Comparable) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        int int13 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        int int27 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj28 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable30 = defaultKeyedValues2D0.getRowKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) 3);
        defaultKeyedValues0.clear();
        java.util.List list9 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean21 = defaultKeyedValues13.equals((java.lang.Object) 0L);
        int int23 = defaultKeyedValues13.getIndex((java.lang.Comparable) 1L);
        int int25 = defaultKeyedValues13.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj26 = defaultKeyedValues13.clone();
        int int27 = defaultKeyedValues13.getItemCount();
        defaultKeyedValues13.insertValue(1, (java.lang.Comparable) (-1.0f), (double) (-1L));
        java.util.List list32 = defaultKeyedValues13.getKeys();
        boolean boolean33 = defaultKeyedValues2D0.equals((java.lang.Object) list32);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 35.0d);
        java.lang.Comparable comparable38 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.addValue((java.lang.Number) (-1), (java.lang.Comparable) '#', comparable38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean21 = defaultKeyedValues13.equals((java.lang.Object) 0L);
        int int23 = defaultKeyedValues13.getIndex((java.lang.Comparable) 1L);
        int int25 = defaultKeyedValues13.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj26 = defaultKeyedValues13.clone();
        int int27 = defaultKeyedValues13.getItemCount();
        defaultKeyedValues13.insertValue(1, (java.lang.Comparable) (-1.0f), (double) (-1L));
        java.util.List list32 = defaultKeyedValues13.getKeys();
        boolean boolean33 = defaultKeyedValues2D0.equals((java.lang.Object) list32);
        java.util.List list34 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list35 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 10);
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 10);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        defaultKeyedValues0.removeValue(0);
        int int36 = defaultKeyedValues0.getIndex((java.lang.Comparable) 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100L);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 100 + "'", comparable23, 100);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list9 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        defaultKeyedValues2D0.clear();
        int int17 = defaultKeyedValues2D0.getColumnCount();
        int int19 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int20 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultKeyedValues2D0.getColumnKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0f, (double) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list26 = defaultKeyedValues2D25.getRowKeys();
        int int27 = defaultKeyedValues2D25.getRowCount();
        int int28 = defaultKeyedValues2D25.getRowCount();
        int int30 = defaultKeyedValues2D25.getRowIndex((java.lang.Comparable) '4');
        int int31 = defaultKeyedValues2D25.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues32 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues32.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues36 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues36.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean40 = defaultKeyedValues32.equals((java.lang.Object) 0L);
        int int42 = defaultKeyedValues32.getIndex((java.lang.Comparable) 1L);
        int int44 = defaultKeyedValues32.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj45 = defaultKeyedValues32.clone();
        boolean boolean46 = defaultKeyedValues2D25.equals(obj45);
        defaultKeyedValues2D25.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) (short) 0, (java.lang.Comparable) "hi!");
        java.lang.Comparable comparable52 = defaultKeyedValues2D25.getRowKey(0);
        boolean boolean53 = defaultKeyedValues0.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + (short) 0 + "'", comparable52, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (short) 100, (java.lang.Number) 4);
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
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        java.lang.Object obj26 = null;
        boolean boolean27 = defaultKeyedValues8.equals(obj26);
        defaultKeyedValues8.setValue((java.lang.Comparable) '#', (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) (byte) 100);
        java.lang.Class<?> wildcardClass23 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (java.lang.Number) (byte) 10);
        java.lang.Object obj17 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100L);
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues0.getValue((java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (byte) -1, (java.lang.Number) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
            java.lang.Comparable comparable15 = defaultKeyedValues2D0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        java.util.List list8 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 0);
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        java.lang.Object obj12 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
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
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 6, (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) -1, (java.lang.Comparable) 0L, (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, 1.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean27 = defaultKeyedValues19.equals((java.lang.Object) 0L);
        int int29 = defaultKeyedValues19.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues19.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues19.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj37 = defaultKeyedValues19.clone();
        defaultKeyedValues19.addValue((java.lang.Comparable) '4', (double) 10L);
        java.lang.Comparable comparable42 = defaultKeyedValues19.getKey(0);
        java.util.List list43 = defaultKeyedValues19.getKeys();
        defaultKeyedValues19.addValue((java.lang.Comparable) (-1.0d), (double) 100L);
        defaultKeyedValues19.addValue((java.lang.Comparable) 100.0d, (java.lang.Number) (short) 0);
        boolean boolean50 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + 100 + "'", comparable42, 100);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getColumnKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (byte) 100, (double) '#');
        java.lang.Number number18 = defaultKeyedValues0.getValue((int) (byte) 0);
        java.util.List list19 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 35.0d + "'", number18, 35.0d);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) "");
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.clear();
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 35.0d);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) 4);
        int int14 = defaultKeyedValues0.getItemCount();
        int int15 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        java.util.List list20 = defaultKeyedValues2D4.getRowKeys();
        java.lang.Object obj21 = defaultKeyedValues2D4.clone();
        defaultKeyedValues2D4.setValue((java.lang.Number) (short) -1, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues30.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean34 = defaultKeyedValues26.equals((java.lang.Object) 0L);
        defaultKeyedValues26.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int39 = defaultKeyedValues26.getIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D40 = new org.jfree.data.DefaultKeyedValues2D();
        int int42 = defaultKeyedValues2D40.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D40.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D40.clear();
        defaultKeyedValues2D40.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D40.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj53 = defaultKeyedValues2D40.clone();
        boolean boolean54 = defaultKeyedValues26.equals(obj53);
        boolean boolean55 = defaultKeyedValues2D4.equals((java.lang.Object) boolean54);
        java.util.List list56 = defaultKeyedValues2D4.getColumnKeys();
        int int57 = defaultKeyedValues2D4.getColumnCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) '4', (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (java.lang.Number) 0L);
        org.jfree.chart.util.SortOrder sortOrder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1L));
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues12 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues12.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean20 = defaultKeyedValues12.equals((java.lang.Object) 0L);
        int int22 = defaultKeyedValues12.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues12.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues12.removeValue((java.lang.Comparable) 10L);
        java.util.List list28 = defaultKeyedValues12.getKeys();
        boolean boolean29 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues12);
        org.jfree.chart.util.SortOrder sortOrder30 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues12.sortByKeys(sortOrder30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues0.getValue((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) true);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 3, (java.lang.Comparable) 1L);
        defaultKeyedValues2D0.removeColumn(0);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 4, (java.lang.Comparable) "");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: ");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        java.lang.Object obj11 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues7.removeValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
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
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
        java.lang.Object obj41 = defaultKeyedValues2D18.clone();
        java.util.List list42 = defaultKeyedValues2D18.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) "", (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (short) 100, (-1.0d));
        defaultKeyedValues0.insertValue(4, (java.lang.Comparable) (byte) -1, 100.0d);
        java.util.List list34 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 0 + "'", comparable22, (short) 0);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 4);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        int int15 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D13.clear();
        defaultKeyedValues2D13.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D13.clear();
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D13.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100);
        java.lang.Object obj35 = defaultKeyedValues2D13.clone();
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) "", (java.lang.Comparable) 100);
        defaultKeyedValues2D13.addValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 0, (java.lang.Comparable) 35.0d);
        boolean boolean43 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D13);
        defaultKeyedValues2D13.removeColumn((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        int int7 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10, (java.lang.Comparable) false);
        defaultKeyedValues2D0.addValue((java.lang.Number) 100, (java.lang.Comparable) false, (java.lang.Comparable) (-1L));
        java.util.List list16 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues2D0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 10.0d);
        int int18 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable20 = defaultKeyedValues0.getKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        int int20 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 2);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj25 = defaultKeyedValues21.clone();
        int int27 = defaultKeyedValues21.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues21.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        java.util.List list31 = defaultKeyedValues21.getKeys();
        java.lang.Number number34 = null;
        defaultKeyedValues21.insertValue((int) (byte) 0, (java.lang.Comparable) '#', number34);
        java.lang.Comparable comparable37 = defaultKeyedValues21.getKey((int) (byte) 1);
        boolean boolean38 = defaultKeyedValues2D0.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + (short) 10 + "'", comparable37, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
            defaultKeyedValues2D22.removeColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
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
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        int int33 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) ' ');
        java.lang.Object obj7 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, 10.0d);
        java.lang.Number number20 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', number20);
        int int22 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0f, (double) '#');
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = defaultKeyedValues0.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        java.util.List list5 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (java.lang.Number) 100L);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (double) 'a');
        defaultKeyedValues0.removeValue(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        org.jfree.chart.util.SortOrder sortOrder36 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder36);
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
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultKeyedValues0.equals(obj11);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0d);
        org.jfree.chart.util.SortOrder sortOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) "", (java.lang.Number) 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues42 = new org.jfree.data.DefaultKeyedValues();
        int int44 = defaultKeyedValues42.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues42.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues42.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list51 = defaultKeyedValues42.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues52 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues52.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues52.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable60 = defaultKeyedValues52.getKey((int) (short) 0);
        boolean boolean61 = defaultKeyedValues42.equals((java.lang.Object) defaultKeyedValues52);
        boolean boolean62 = defaultKeyedValues0.equals((java.lang.Object) boolean61);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertEquals("'" + comparable60 + "' != '" + (short) 0 + "'", comparable60, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 3);
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D11 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list12 = defaultKeyedValues2D11.getRowKeys();
        int int13 = defaultKeyedValues2D11.getRowCount();
        int int14 = defaultKeyedValues2D11.getRowCount();
        boolean boolean16 = defaultKeyedValues2D11.equals((java.lang.Object) 10.0f);
        int int18 = defaultKeyedValues2D11.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list20 = defaultKeyedValues2D19.getRowKeys();
        int int21 = defaultKeyedValues2D19.getRowCount();
        int int22 = defaultKeyedValues2D19.getRowCount();
        boolean boolean24 = defaultKeyedValues2D19.equals((java.lang.Object) 10.0f);
        int int26 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D19.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D19.clear();
        boolean boolean31 = defaultKeyedValues2D11.equals((java.lang.Object) defaultKeyedValues2D19);
        java.util.List list32 = defaultKeyedValues2D11.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues33 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues33.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues37 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues37.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean41 = defaultKeyedValues33.equals((java.lang.Object) 0L);
        int int43 = defaultKeyedValues33.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues33.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues33.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        java.lang.Object obj51 = defaultKeyedValues33.clone();
        defaultKeyedValues33.addValue((java.lang.Comparable) '4', (double) 10L);
        java.lang.Comparable comparable56 = defaultKeyedValues33.getKey(0);
        boolean boolean57 = defaultKeyedValues2D11.equals((java.lang.Object) defaultKeyedValues33);
        defaultKeyedValues2D11.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) '4');
        boolean boolean62 = defaultKeyedValues2D0.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals("'" + comparable56 + "' != '" + 100 + "'", comparable56, 100);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D38 = new org.jfree.data.DefaultKeyedValues2D();
        int int40 = defaultKeyedValues2D38.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D38.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D38.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues45 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues45.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues49 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues49.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean53 = defaultKeyedValues45.equals((java.lang.Object) 0L);
        int int55 = defaultKeyedValues45.getIndex((java.lang.Comparable) 1L);
        int int57 = defaultKeyedValues45.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj58 = defaultKeyedValues45.clone();
        boolean boolean59 = defaultKeyedValues2D38.equals((java.lang.Object) defaultKeyedValues45);
        java.util.List list60 = defaultKeyedValues2D38.getColumnKeys();
        int int62 = defaultKeyedValues2D38.getColumnIndex((java.lang.Comparable) 52.0d);
        boolean boolean63 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D38);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        java.util.List list27 = defaultKeyedValues2D0.getColumnKeys();
        int int28 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
        java.lang.Comparable comparable37 = defaultKeyedValues2D0.getRowKey((int) (short) 0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 10.0d + "'", comparable37, 10.0d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
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
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        int int15 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) (byte) 10);
        int int27 = defaultKeyedValues0.getIndex((java.lang.Comparable) 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 0 + "'", comparable22, (short) 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (double) 100.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (java.lang.Number) 100.0d);
        int int16 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        defaultKeyedValues2D0.clear();
        java.lang.Object obj7 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
        java.lang.Object obj24 = defaultKeyedValues2D0.clone();
        java.lang.Object obj25 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list27 = defaultKeyedValues2D26.getRowKeys();
        int int28 = defaultKeyedValues2D26.getRowCount();
        int int29 = defaultKeyedValues2D26.getRowCount();
        boolean boolean31 = defaultKeyedValues2D26.equals((java.lang.Object) 10.0f);
        java.util.List list32 = defaultKeyedValues2D26.getColumnKeys();
        java.util.List list33 = defaultKeyedValues2D26.getColumnKeys();
        java.util.List list34 = defaultKeyedValues2D26.getRowKeys();
        java.lang.Object obj35 = defaultKeyedValues2D26.clone();
        boolean boolean36 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D26);
        int int38 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100);
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
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        int int13 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.clear();
        java.lang.Object obj18 = defaultKeyedValues2D0.clone();
        java.lang.Comparable comparable19 = null;
        defaultKeyedValues2D0.removeColumn(comparable19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
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
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean24 = defaultKeyedValues16.equals((java.lang.Object) 0L);
        defaultKeyedValues16.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int29 = defaultKeyedValues16.getIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj30 = defaultKeyedValues16.clone();
        int int31 = defaultKeyedValues16.getItemCount();
        int int33 = defaultKeyedValues16.getIndex((java.lang.Comparable) "");
        java.lang.Class<?> wildcardClass34 = defaultKeyedValues16.getClass();
        boolean boolean35 = defaultKeyedValues2D0.equals((java.lang.Object) wildcardClass34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (double) 10.0f);
        org.jfree.chart.util.SortOrder sortOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        java.lang.Comparable comparable14 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) 0);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 0 + "'", comparable14, (short) 0);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (double) (short) 100);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 1.0f);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
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
        java.lang.Object obj22 = defaultKeyedValues2D10.clone();
        java.lang.Comparable comparable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D10.setValue((java.lang.Number) 97.0d, (java.lang.Comparable) 100.0f, comparable25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D5 = new org.jfree.data.DefaultKeyedValues2D();
        int int7 = defaultKeyedValues2D5.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D5.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list11 = defaultKeyedValues2D5.getColumnKeys();
        boolean boolean12 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D5);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues0.getKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.clear();
        int int18 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues22.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        java.util.List list29 = defaultKeyedValues22.getKeys();
        java.lang.Object obj30 = defaultKeyedValues22.clone();
        boolean boolean31 = defaultKeyedValues0.equals(obj30);
        java.lang.Object obj32 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) 0);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 52.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (double) (byte) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (java.lang.Number) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (java.lang.Number) 1.0d);
        int int33 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        java.lang.Object obj7 = null;
        boolean boolean8 = defaultKeyedValues0.equals(obj7);
        org.jfree.chart.util.SortOrder sortOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 'a');
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
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
        java.lang.Comparable comparable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 1, comparable26, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
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
        java.lang.Comparable comparable22 = defaultKeyedValues0.getKey((int) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 0 + "'", comparable22, (short) 0);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        int int22 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1.0");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
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
        java.lang.Comparable comparable35 = defaultKeyedValues0.getKey((int) (byte) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) false);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10 + "'", comparable35, 10);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) ' ');
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (double) 2);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        org.jfree.chart.util.SortOrder sortOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) 0.0d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        java.lang.Comparable comparable17 = defaultKeyedValues0.getKey((int) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) 1.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) (byte) -1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) "hi!", 52.0d);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 0 + "'", comparable17, (short) 0);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.clear();
        int int18 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
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
        defaultKeyedValues2D0.removeColumn((int) (short) 0);
        java.lang.Object obj21 = null;
        boolean boolean22 = defaultKeyedValues2D0.equals(obj21);
        java.lang.Object obj23 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 'a');
        java.util.List list9 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = defaultKeyedValues2D0.getColumnIndex(comparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) '4', (java.lang.Comparable) 52.0d);
        java.util.List list22 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
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
        java.util.List list37 = defaultKeyedValues10.getKeys();
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
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues37 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues37.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues41 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues41.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean45 = defaultKeyedValues37.equals((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultKeyedValues37.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues47 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues47.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues51 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues51.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean55 = defaultKeyedValues47.equals((java.lang.Object) 0L);
        int int57 = defaultKeyedValues47.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues47.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean60 = defaultKeyedValues37.equals((java.lang.Object) 0.0d);
        defaultKeyedValues37.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues37.removeValue((java.lang.Comparable) (short) 1);
        defaultKeyedValues37.addValue((java.lang.Comparable) 1, 10.0d);
        java.lang.Object obj69 = defaultKeyedValues37.clone();
        boolean boolean70 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues37);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) 5, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
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
        java.lang.Comparable comparable42 = defaultKeyedValues0.getKey(1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
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
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + 0.0f + "'", comparable42, 0.0f);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        java.lang.Object obj3 = defaultKeyedValues0.clone();
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues5 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues5.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues9 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues9.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean13 = defaultKeyedValues5.equals((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultKeyedValues5.clone();
        defaultKeyedValues5.setValue((java.lang.Comparable) true, (double) '4');
        defaultKeyedValues5.addValue((java.lang.Comparable) (byte) 1, 0.0d);
        defaultKeyedValues5.addValue((java.lang.Comparable) (short) 0, (java.lang.Number) 52.0d);
        boolean boolean24 = defaultKeyedValues0.equals((java.lang.Object) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 97.0d);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass14 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
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
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
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
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        java.util.List list12 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0L);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        java.lang.Number number13 = null;
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) '#', number13);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0f), (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(4, (java.lang.Comparable) 6, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        java.lang.Number number15 = defaultKeyedValues0.getValue((int) (byte) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(100, (java.lang.Comparable) (short) 100, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        java.lang.Object obj24 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 10, (java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
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
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) "");
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        int int7 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) 4);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (java.lang.Number) 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (java.lang.Number) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) -1, (java.lang.Comparable) true, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        java.lang.Number number11 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) (short) 0);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) ' ', (java.lang.Number) 100L);
        java.lang.Comparable comparable21 = defaultKeyedValues0.getKey(1);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 100.0d + "'", comparable21, 100.0d);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int5 = defaultKeyedValues2D0.getColumnCount();
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 1);
        java.util.List list10 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues2D0.getRowKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        java.lang.Object obj7 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
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
        int int52 = defaultKeyedValues0.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        java.lang.Number number16 = null;
        defaultKeyedValues0.addValue((java.lang.Comparable) true, number16);
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (java.lang.Number) 0);
        org.jfree.chart.util.SortOrder sortOrder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
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
        defaultKeyedValues2D0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues19.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues19.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues19.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 1L);
        defaultKeyedValues19.addValue((java.lang.Comparable) 4, (java.lang.Number) 4);
        java.lang.Class<?> wildcardClass35 = defaultKeyedValues19.getClass();
        boolean boolean36 = defaultKeyedValues2D0.equals((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
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
        int int25 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        java.lang.Object obj46 = defaultKeyedValues10.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 35.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 52.0d, (double) 10L);
        java.lang.Object obj19 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
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
        defaultKeyedValues10.insertValue((int) (short) 1, (java.lang.Comparable) 97.0d, (java.lang.Number) 10.0f);
        defaultKeyedValues10.insertValue((int) (short) 0, (java.lang.Comparable) 0.0f, (double) (byte) 1);
        defaultKeyedValues10.setValue((java.lang.Comparable) 2, (java.lang.Number) 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, (java.lang.Number) 10L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 6, (double) (-1.0f));
        org.jfree.chart.util.SortOrder sortOrder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (double) (byte) 10);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues46 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues46.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues50 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues50.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean54 = defaultKeyedValues46.equals((java.lang.Object) 0L);
        java.lang.Object obj55 = defaultKeyedValues46.clone();
        java.lang.Number number57 = null;
        defaultKeyedValues46.setValue((java.lang.Comparable) (-1), number57);
        defaultKeyedValues46.clear();
        java.lang.Object obj60 = defaultKeyedValues46.clone();
        defaultKeyedValues46.addValue((java.lang.Comparable) (short) 0, (java.lang.Number) (short) 10);
        boolean boolean64 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues46);
        defaultKeyedValues46.addValue((java.lang.Comparable) 'a', (double) 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable39 = defaultKeyedValues0.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
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
        defaultKeyedValues2D16.removeColumn((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1), (java.lang.Comparable) 1.0d, (java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
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
            defaultKeyedValues2D0.removeRow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues56 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues56.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues56.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues56.removeValue((java.lang.Comparable) (byte) 0);
        int int65 = defaultKeyedValues56.getItemCount();
        defaultKeyedValues56.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj69 = defaultKeyedValues56.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D70 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list71 = defaultKeyedValues2D70.getRowKeys();
        int int72 = defaultKeyedValues2D70.getRowCount();
        int int73 = defaultKeyedValues2D70.getRowCount();
        boolean boolean75 = defaultKeyedValues2D70.equals((java.lang.Object) 10.0f);
        java.lang.Object obj76 = defaultKeyedValues2D70.clone();
        defaultKeyedValues2D70.clear();
        boolean boolean78 = defaultKeyedValues56.equals((java.lang.Object) defaultKeyedValues2D70);
        java.lang.Object obj79 = defaultKeyedValues56.clone();
        boolean boolean80 = defaultKeyedValues2D0.equals(obj79);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100);
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getItemCount();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) "hi!");
        int int17 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
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
        java.util.List list20 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        int int15 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D13.clear();
        defaultKeyedValues2D13.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D13.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj26 = defaultKeyedValues2D13.clone();
        int int27 = defaultKeyedValues2D13.getColumnCount();
        java.util.List list28 = defaultKeyedValues2D13.getColumnKeys();
        int int30 = defaultKeyedValues2D13.getColumnIndex((java.lang.Comparable) "");
        java.util.List list31 = defaultKeyedValues2D13.getColumnKeys();
        boolean boolean32 = defaultKeyedValues0.equals((java.lang.Object) list31);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        int int22 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 4);
        int int24 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 35.0d);
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
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 52.0d, (java.lang.Number) 2);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D18 = new org.jfree.data.DefaultKeyedValues2D();
        int int20 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) 10);
        int int22 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D18.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) '4', (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D18.addValue((java.lang.Number) (-1), (java.lang.Comparable) (-1L), (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D18.removeValue((java.lang.Comparable) 52.0d, (java.lang.Comparable) (-1L));
        boolean boolean34 = defaultKeyedValues0.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        defaultKeyedValues7.setValue((java.lang.Comparable) 35.0d, (double) (byte) 0);
        org.jfree.chart.util.SortOrder sortOrder43 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues7.sortByValues(sortOrder43);
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
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        java.lang.Number number16 = defaultKeyedValues0.getValue((int) (short) 1);
        java.lang.Object obj17 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues18.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues18.removeValue((java.lang.Comparable) (byte) 0);
        int int27 = defaultKeyedValues18.getItemCount();
        defaultKeyedValues18.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj31 = defaultKeyedValues18.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D32 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list33 = defaultKeyedValues2D32.getRowKeys();
        int int34 = defaultKeyedValues2D32.getRowCount();
        int int35 = defaultKeyedValues2D32.getRowCount();
        boolean boolean37 = defaultKeyedValues2D32.equals((java.lang.Object) 10.0f);
        java.lang.Object obj38 = defaultKeyedValues2D32.clone();
        defaultKeyedValues2D32.clear();
        boolean boolean40 = defaultKeyedValues18.equals((java.lang.Object) defaultKeyedValues2D32);
        java.lang.Object obj41 = defaultKeyedValues18.clone();
        int int43 = defaultKeyedValues18.getIndex((java.lang.Comparable) 100L);
        boolean boolean44 = defaultKeyedValues0.equals((java.lang.Object) 100L);
        int int46 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 100L + "'", number16, 100L);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        boolean boolean10 = defaultKeyedValues2D0.equals((java.lang.Object) "hi!");
        defaultKeyedValues2D0.clear();
        int int12 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 4);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) -1, (-1.0d));
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, 10.0d);
        java.util.List list17 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(100, (java.lang.Comparable) ' ', (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), 1.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) (short) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues20.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues20.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues20.clear();
        java.util.List list32 = defaultKeyedValues20.getKeys();
        java.lang.Object obj33 = defaultKeyedValues20.clone();
        boolean boolean34 = defaultKeyedValues0.equals(obj33);
        int int35 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        java.lang.Number number16 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, number16);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues0.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        java.lang.Object obj9 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int10 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D0.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        java.lang.Number number11 = defaultKeyedValues0.getValue((int) (byte) 0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) (short) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean24 = defaultKeyedValues16.equals((java.lang.Object) 0L);
        defaultKeyedValues16.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues16.addValue((java.lang.Comparable) (short) 10, 1.0d);
        defaultKeyedValues16.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 10.0d);
        boolean boolean34 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues16);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
        defaultKeyedValues2D22.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number69 = defaultKeyedValues2D22.getValue((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 4, (java.lang.Comparable) 10L);
        int int19 = defaultKeyedValues2D0.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues24 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues24.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean28 = defaultKeyedValues20.equals((java.lang.Object) 0L);
        int int30 = defaultKeyedValues20.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues20.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues20.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues20.removeValue(0);
        defaultKeyedValues20.addValue((java.lang.Comparable) 0L, (double) 2);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues43 = new org.jfree.data.DefaultKeyedValues();
        int int45 = defaultKeyedValues43.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues43.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj49 = defaultKeyedValues43.clone();
        java.lang.Object obj50 = null;
        boolean boolean51 = defaultKeyedValues43.equals(obj50);
        boolean boolean52 = defaultKeyedValues20.equals((java.lang.Object) defaultKeyedValues43);
        boolean boolean53 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues43);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D54 = new org.jfree.data.DefaultKeyedValues2D();
        int int56 = defaultKeyedValues2D54.getRowIndex((java.lang.Comparable) 10);
        int int57 = defaultKeyedValues2D54.getRowCount();
        defaultKeyedValues2D54.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) 0);
        boolean boolean62 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        defaultKeyedValues0.removeValue(1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        java.lang.Number number16 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, number16);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 0L, (double) 1.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list23 = defaultKeyedValues2D22.getRowKeys();
        int int24 = defaultKeyedValues2D22.getRowCount();
        int int25 = defaultKeyedValues2D22.getRowCount();
        defaultKeyedValues2D22.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int30 = defaultKeyedValues2D22.getRowCount();
        defaultKeyedValues2D22.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (short) 10, (java.lang.Comparable) 35.0d);
        boolean boolean35 = defaultKeyedValues0.equals((java.lang.Object) 35.0d);
        java.util.List list36 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
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
        int int46 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
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
        java.util.List list28 = defaultKeyedValues2D12.getRowKeys();
        defaultKeyedValues2D12.removeValue((java.lang.Comparable) (-1), (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D12.removeRow(3);
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
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues13.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean21 = defaultKeyedValues13.equals((java.lang.Object) 0L);
        int int23 = defaultKeyedValues13.getIndex((java.lang.Comparable) 1L);
        int int25 = defaultKeyedValues13.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj26 = defaultKeyedValues13.clone();
        int int27 = defaultKeyedValues13.getItemCount();
        defaultKeyedValues13.insertValue(1, (java.lang.Comparable) (-1.0f), (double) (-1L));
        java.util.List list32 = defaultKeyedValues13.getKeys();
        boolean boolean33 = defaultKeyedValues2D0.equals((java.lang.Object) list32);
        java.util.List list34 = defaultKeyedValues2D0.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues35 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues35.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues39 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues39.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean43 = defaultKeyedValues35.equals((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultKeyedValues35.clone();
        boolean boolean46 = defaultKeyedValues35.equals((java.lang.Object) (byte) 10);
        int int47 = defaultKeyedValues35.getItemCount();
        defaultKeyedValues35.removeValue((java.lang.Comparable) (byte) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues50 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues50.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj54 = defaultKeyedValues50.clone();
        int int56 = defaultKeyedValues50.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues50.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        boolean boolean60 = defaultKeyedValues35.equals((java.lang.Object) (-1.0f));
        int int61 = defaultKeyedValues35.getItemCount();
        defaultKeyedValues35.addValue((java.lang.Comparable) (short) -1, 1.0d);
        java.lang.Object obj65 = defaultKeyedValues35.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues66 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues66.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues66.clear();
        defaultKeyedValues66.clear();
        defaultKeyedValues66.addValue((java.lang.Comparable) ' ', (double) 100);
        boolean boolean75 = defaultKeyedValues35.equals((java.lang.Object) defaultKeyedValues66);
        java.lang.Object obj76 = defaultKeyedValues35.clone();
        boolean boolean77 = defaultKeyedValues2D0.equals(obj76);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 4, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) "hi!");
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) 97.0d, (java.lang.Comparable) 100.0f);
        int int25 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        java.util.List list17 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) 97.0d);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues21.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        boolean boolean28 = defaultKeyedValues2D0.equals((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        int int26 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1.0d);
        int int27 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
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
        java.util.List list56 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Comparable comparable58 = defaultKeyedValues2D0.getRowKey((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable60 = defaultKeyedValues2D0.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
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
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertEquals("'" + comparable58 + "' != '" + (short) 0 + "'", comparable58, (short) 0);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int1 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 'a');
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list10 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
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
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(obj83);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D13 = new org.jfree.data.DefaultKeyedValues2D();
        int int15 = defaultKeyedValues2D13.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D13.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) "");
        boolean boolean22 = defaultKeyedValues0.equals((java.lang.Object) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues0.getValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) (short) 100);
        int int36 = defaultKeyedValues0.getIndex((java.lang.Comparable) ' ');
        defaultKeyedValues0.addValue((java.lang.Comparable) ' ', (double) (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        java.util.List list31 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = defaultKeyedValues0.getValue((java.lang.Comparable) 5);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 5");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 3, (java.lang.Comparable) (byte) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D();
        int int16 = defaultKeyedValues2D14.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D14.clear();
        defaultKeyedValues2D14.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int26 = defaultKeyedValues2D14.getRowIndex((java.lang.Comparable) 100.0f);
        java.util.List list27 = defaultKeyedValues2D14.getRowKeys();
        int int29 = defaultKeyedValues2D14.getColumnIndex((java.lang.Comparable) 100.0f);
        boolean boolean30 = defaultKeyedValues2D0.equals((java.lang.Object) int29);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
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
        java.util.List list30 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 0);
        int int17 = defaultKeyedValues2D0.getColumnCount();
        int int18 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D0.clear();
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 0);
        int int16 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        java.util.List list17 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 0.0f);
        java.lang.Comparable comparable18 = defaultKeyedValues2D0.getRowKey(0);
        defaultKeyedValues2D0.setValue((java.lang.Number) 2, (java.lang.Comparable) (-1), (java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) '#', (double) 'a');
        java.util.List list15 = defaultKeyedValues0.getKeys();
        java.lang.Comparable comparable17 = defaultKeyedValues0.getKey(2);
        java.lang.Number number19 = defaultKeyedValues0.getValue((int) (byte) 1);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + '#' + "'", comparable17, '#');
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 10 + "'", number19, 10);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int3 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (byte) 100);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        int int9 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues2D1.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
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
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1);
        int int15 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D0.getRowKey((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
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
        int int18 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues19 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues19.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean27 = defaultKeyedValues19.equals((java.lang.Object) 0L);
        int int29 = defaultKeyedValues19.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues19.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues19.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D37 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj38 = defaultKeyedValues2D37.clone();
        boolean boolean39 = defaultKeyedValues19.equals((java.lang.Object) defaultKeyedValues2D37);
        defaultKeyedValues19.removeValue((java.lang.Comparable) false);
        defaultKeyedValues19.clear();
        java.util.List list43 = defaultKeyedValues19.getKeys();
        boolean boolean44 = defaultKeyedValues2D0.equals((java.lang.Object) list43);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (java.lang.Number) 0L);
        int int23 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D0.getRowKey((int) (short) 0);
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
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 0, (double) (byte) 10);
        int int26 = defaultKeyedValues0.getItemCount();
        java.lang.Comparable comparable28 = defaultKeyedValues0.getKey((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (short) 0 + "'", comparable28, (short) 0);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 2);
        java.lang.Number number22 = defaultKeyedValues0.getValue(1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 35.0d + "'", number22, 35.0d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (double) (short) 100);
        defaultKeyedValues0.clear();
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
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
        defaultKeyedValues2D0.removeRow((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
            java.lang.Comparable comparable20 = defaultKeyedValues2D0.getColumnKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D0.getRowKey(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable10 = defaultKeyedValues2D0.getRowKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list4 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1));
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 1, (double) 10);
        org.jfree.chart.util.SortOrder sortOrder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
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
        int int12 = defaultKeyedValues2D8.getColumnCount();
        boolean boolean13 = defaultKeyedValues2D0.equals((java.lang.Object) int12);
        int int15 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 0L);
        java.lang.Object obj20 = defaultKeyedValues2D0.clone();
        java.lang.Object obj21 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D39 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list40 = defaultKeyedValues2D39.getRowKeys();
        int int41 = defaultKeyedValues2D39.getRowCount();
        defaultKeyedValues2D39.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        defaultKeyedValues2D39.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) "");
        boolean boolean48 = defaultKeyedValues0.equals((java.lang.Object) "");
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D51 = new org.jfree.data.DefaultKeyedValues2D();
        int int53 = defaultKeyedValues2D51.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D51.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D51.clear();
        defaultKeyedValues2D51.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D51.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj64 = defaultKeyedValues2D51.clone();
        defaultKeyedValues2D51.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
        java.lang.Object obj69 = defaultKeyedValues2D51.clone();
        int int71 = defaultKeyedValues2D51.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D51.addValue((java.lang.Number) (-1.0f), (java.lang.Comparable) (short) -1, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D51.removeColumn((java.lang.Comparable) (short) 10);
        boolean boolean78 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D51);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
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
            defaultKeyedValues0.insertValue((int) (short) -1, (java.lang.Comparable) 10L, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (java.lang.Number) 100L);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.clear();
        java.util.List list12 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 4);
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        defaultKeyedValues0.clear();
        java.lang.Object obj17 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.clear();
        java.util.List list17 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
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
        int int32 = defaultKeyedValues2D0.getColumnCount();
        int int33 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        int int9 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 1L, (java.lang.Number) 10L);
        java.util.List list18 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number39 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "");
        defaultKeyedValues0.clear();
        java.util.List list13 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10L, (java.lang.Number) 1.0d);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 97.0d);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 4);
        int int20 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues30.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj34 = defaultKeyedValues30.clone();
        int int36 = defaultKeyedValues30.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues30.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        defaultKeyedValues30.removeValue((java.lang.Comparable) "");
        boolean boolean42 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues30);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0, (java.lang.Comparable) "", (java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
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
        java.util.List list21 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) 10L, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
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
        java.lang.Object obj37 = defaultKeyedValues28.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues38 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues38.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues42 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues42.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean46 = defaultKeyedValues38.equals((java.lang.Object) 0L);
        int int48 = defaultKeyedValues38.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues38.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean51 = defaultKeyedValues28.equals((java.lang.Object) 0.0d);
        defaultKeyedValues28.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 100L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D55 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D55.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D55.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable64 = defaultKeyedValues2D55.getColumnKey((int) (byte) 0);
        boolean boolean65 = defaultKeyedValues28.equals((java.lang.Object) (byte) 0);
        boolean boolean66 = defaultKeyedValues0.equals((java.lang.Object) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) '4', (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + comparable64 + "' != '" + 10L + "'", comparable64, 10L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        defaultKeyedValues2D0.clear();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) ' ');
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getRowKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
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
        java.util.List list20 = defaultKeyedValues2D4.getRowKeys();
        java.lang.Object obj21 = defaultKeyedValues2D4.clone();
        int int23 = defaultKeyedValues2D4.getColumnIndex((java.lang.Comparable) 97.0d);
        int int25 = defaultKeyedValues2D4.getColumnIndex((java.lang.Comparable) 2);
        int int27 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 35.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
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
        int int28 = defaultKeyedValues7.getIndex((java.lang.Comparable) 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1), (java.lang.Comparable) 1, (java.lang.Comparable) 1.0d);
        java.lang.Object obj14 = defaultKeyedValues2D0.clone();
        int int16 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (double) 0L);
        java.util.List list11 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 97.0d, (java.lang.Number) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 10L);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (double) 0L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) "hi!");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues13 = new org.jfree.data.DefaultKeyedValues();
        int int15 = defaultKeyedValues13.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues13.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues13.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        java.util.List list22 = defaultKeyedValues13.getKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues23.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable31 = defaultKeyedValues23.getKey((int) (short) 0);
        boolean boolean32 = defaultKeyedValues13.equals((java.lang.Object) defaultKeyedValues23);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D();
        int int35 = defaultKeyedValues2D33.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D33.clear();
        defaultKeyedValues2D33.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D33.clear();
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D33.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100);
        boolean boolean55 = defaultKeyedValues23.equals((java.lang.Object) true);
        defaultKeyedValues23.removeValue((java.lang.Comparable) ' ');
        int int58 = defaultKeyedValues23.getItemCount();
        boolean boolean59 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues23);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (short) 0 + "'", comparable31, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        int int8 = defaultKeyedValues2D6.getRowCount();
        int int9 = defaultKeyedValues2D6.getRowCount();
        boolean boolean10 = defaultKeyedValues2D1.equals((java.lang.Object) int9);
        int int11 = defaultKeyedValues2D1.getRowCount();
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) ' ', (java.lang.Comparable) 3);
        int int12 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0.0f);
        java.util.List list13 = defaultKeyedValues2D1.getColumnKeys();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues14.insertValue((int) (short) 1, (java.lang.Comparable) (short) 100, (java.lang.Number) 10);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D22 = new org.jfree.data.DefaultKeyedValues2D();
        int int24 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) 10);
        int int25 = defaultKeyedValues2D22.getRowCount();
        java.lang.Object obj26 = defaultKeyedValues2D22.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues31.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean35 = defaultKeyedValues27.equals((java.lang.Object) 0L);
        int int37 = defaultKeyedValues27.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues27.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean40 = defaultKeyedValues2D22.equals((java.lang.Object) defaultKeyedValues27);
        defaultKeyedValues2D22.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) 2, (java.lang.Comparable) 4);
        boolean boolean45 = defaultKeyedValues14.equals((java.lang.Object) defaultKeyedValues2D22);
        defaultKeyedValues14.addValue((java.lang.Comparable) 10.0d, (java.lang.Number) (short) 100);
        int int50 = defaultKeyedValues14.getIndex((java.lang.Comparable) ' ');
        defaultKeyedValues14.removeValue((java.lang.Comparable) (short) -1);
        boolean boolean53 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
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
        int int18 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D19 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list20 = defaultKeyedValues2D19.getRowKeys();
        int int21 = defaultKeyedValues2D19.getRowCount();
        int int22 = defaultKeyedValues2D19.getRowCount();
        boolean boolean24 = defaultKeyedValues2D19.equals((java.lang.Object) 10.0f);
        int int26 = defaultKeyedValues2D19.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D27 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list28 = defaultKeyedValues2D27.getRowKeys();
        int int29 = defaultKeyedValues2D27.getRowCount();
        int int30 = defaultKeyedValues2D27.getRowCount();
        boolean boolean32 = defaultKeyedValues2D27.equals((java.lang.Object) 10.0f);
        int int34 = defaultKeyedValues2D27.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D27.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D27.clear();
        boolean boolean39 = defaultKeyedValues2D19.equals((java.lang.Object) defaultKeyedValues2D27);
        defaultKeyedValues2D19.removeColumn((java.lang.Comparable) 100.0f);
        boolean boolean42 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D19);
        defaultKeyedValues0.setValue((java.lang.Comparable) ' ', (java.lang.Number) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 3, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 1);
        int int33 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        int int34 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) '4');
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 97.0d, (java.lang.Number) 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        java.util.List list9 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (-1.0d));
        int int25 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) 10);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) 3, (java.lang.Number) (byte) 100);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (byte) 100, 97.0d);
        java.lang.Comparable comparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = defaultKeyedValues0.getIndex(comparable17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.clear();
        java.lang.Object obj4 = defaultKeyedValues2D1.clone();
        java.lang.Object obj5 = defaultKeyedValues2D1.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D6 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list7 = defaultKeyedValues2D6.getRowKeys();
        int int8 = defaultKeyedValues2D6.getRowCount();
        int int9 = defaultKeyedValues2D6.getRowCount();
        int int11 = defaultKeyedValues2D6.getRowIndex((java.lang.Comparable) '4');
        int int12 = defaultKeyedValues2D6.getRowCount();
        java.util.List list13 = defaultKeyedValues2D6.getRowKeys();
        defaultKeyedValues2D6.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 35.0d);
        defaultKeyedValues2D6.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (-1));
        defaultKeyedValues2D6.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 2);
        java.util.List list26 = defaultKeyedValues2D6.getRowKeys();
        boolean boolean27 = defaultKeyedValues2D1.equals((java.lang.Object) defaultKeyedValues2D6);
        defaultKeyedValues2D6.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) ' ');
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, 10.0d);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1.0d));
        java.lang.Number number22 = defaultKeyedValues0.getValue(0);
        java.lang.Object obj23 = defaultKeyedValues0.clone();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0L + "'", number22, 0L);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
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
        defaultKeyedValues3.addValue((java.lang.Comparable) 1L, (double) '4');
        defaultKeyedValues3.removeValue(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (double) (-1.0f));
        java.lang.Object obj20 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0);
        int int15 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 97.0d, (java.lang.Comparable) 52.0d, (java.lang.Comparable) 1.0d);
        int int20 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), 1.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) (short) 100);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues20.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues20.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues20.clear();
        java.util.List list32 = defaultKeyedValues20.getKeys();
        java.lang.Object obj33 = defaultKeyedValues20.clone();
        boolean boolean34 = defaultKeyedValues0.equals(obj33);
        java.lang.Comparable comparable36 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', comparable36, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        java.util.List list18 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "hi!");
        int int13 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0L, (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) false, (java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) 5, (java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
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
        int int31 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) true);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D32 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list33 = defaultKeyedValues2D32.getRowKeys();
        int int34 = defaultKeyedValues2D32.getRowCount();
        int int35 = defaultKeyedValues2D32.getRowCount();
        boolean boolean37 = defaultKeyedValues2D32.equals((java.lang.Object) 10.0f);
        int int38 = defaultKeyedValues2D32.getColumnCount();
        int int40 = defaultKeyedValues2D32.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D32.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0d);
        int int45 = defaultKeyedValues2D32.getRowIndex((java.lang.Comparable) 100L);
        int int47 = defaultKeyedValues2D32.getRowIndex((java.lang.Comparable) (-1.0f));
        boolean boolean48 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D32);
        defaultKeyedValues2D32.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) '4', (java.lang.Comparable) "hi!");
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
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
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
        java.lang.Class<?> wildcardClass21 = list19.getClass();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0f, (java.lang.Number) 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
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
        java.util.List list37 = defaultKeyedValues0.getKeys();
        java.lang.Object obj38 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(obj38);
    }
}

