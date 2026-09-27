package org.jfree.data;

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
        int int44 = defaultKeyedValues0.getIndex((java.lang.Comparable) (-1.0f));
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 35.0d, (java.lang.Comparable) 'a');
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) 35.0d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = defaultKeyedValues2D0.getValue(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 0);
        int int18 = defaultKeyedValues2D1.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.setValue((java.lang.Number) 6, (java.lang.Comparable) 1.0f, (java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Byte (java.lang.Float and java.lang.Byte are in module java.base of loader 'bootstrap')");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        java.util.List list37 = defaultKeyedValues2D19.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1));
        int int9 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) 52.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        java.lang.Number number16 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, number16);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 0L, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) 3);
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) -1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        defaultKeyedValues2D0.clear();
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        java.util.List list36 = defaultKeyedValues0.getKeys();
        java.util.List list37 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (short) 100, (java.lang.Number) 4);
        java.lang.Number number19 = defaultKeyedValues0.getValue(0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (java.lang.Number) (-1.0f));
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 4 + "'", number19, 4);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        java.lang.Class<?> wildcardClass26 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.jfree.chart.util.SortOrder sortOrder49 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues15.sortByValues(sortOrder49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D35 = new org.jfree.data.DefaultKeyedValues2D();
        int int37 = defaultKeyedValues2D35.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D35.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D35.clear();
        defaultKeyedValues2D35.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int47 = defaultKeyedValues2D35.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D35.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 0);
        int int52 = defaultKeyedValues2D35.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D53 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list54 = defaultKeyedValues2D53.getRowKeys();
        int int55 = defaultKeyedValues2D53.getRowCount();
        int int56 = defaultKeyedValues2D53.getRowCount();
        boolean boolean58 = defaultKeyedValues2D53.equals((java.lang.Object) 10.0f);
        int int60 = defaultKeyedValues2D53.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D61 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list62 = defaultKeyedValues2D61.getRowKeys();
        int int63 = defaultKeyedValues2D61.getRowCount();
        int int64 = defaultKeyedValues2D61.getRowCount();
        boolean boolean66 = defaultKeyedValues2D61.equals((java.lang.Object) 10.0f);
        int int68 = defaultKeyedValues2D61.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D61.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D61.clear();
        boolean boolean73 = defaultKeyedValues2D53.equals((java.lang.Object) defaultKeyedValues2D61);
        java.util.List list74 = defaultKeyedValues2D61.getRowKeys();
        boolean boolean75 = defaultKeyedValues2D35.equals((java.lang.Object) defaultKeyedValues2D61);
        java.util.List list76 = defaultKeyedValues2D35.getColumnKeys();
        boolean boolean77 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) ' ', (java.lang.Comparable) (-1.0d), (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable12, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        java.util.List list19 = defaultKeyedValues5.getKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D20 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list21 = defaultKeyedValues2D20.getRowKeys();
        int int22 = defaultKeyedValues2D20.getRowCount();
        int int23 = defaultKeyedValues2D20.getRowCount();
        defaultKeyedValues2D20.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int28 = defaultKeyedValues2D20.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues33 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues33.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean37 = defaultKeyedValues29.equals((java.lang.Object) 0L);
        int int39 = defaultKeyedValues29.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues29.removeValue((java.lang.Comparable) 0.0d);
        int int43 = defaultKeyedValues29.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues29.removeValue((java.lang.Comparable) "hi!");
        defaultKeyedValues29.setValue((java.lang.Comparable) 0.0f, (java.lang.Number) 100);
        defaultKeyedValues29.clear();
        boolean boolean50 = defaultKeyedValues2D20.equals((java.lang.Object) defaultKeyedValues29);
        boolean boolean51 = defaultKeyedValues5.equals((java.lang.Object) defaultKeyedValues2D20);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues52 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues52.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues56 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues56.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean60 = defaultKeyedValues52.equals((java.lang.Object) 0L);
        int int62 = defaultKeyedValues52.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues52.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues52.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues52.addValue((java.lang.Comparable) 0, (double) (short) 1);
        java.lang.Object obj73 = defaultKeyedValues52.clone();
        java.lang.Number number75 = defaultKeyedValues52.getValue(0);
        java.lang.Object obj76 = defaultKeyedValues52.clone();
        boolean boolean77 = defaultKeyedValues5.equals(obj76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals("'" + number75 + "' != '" + 35.0d + "'", number75, 35.0d);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues24 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues24.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues28 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues28.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean32 = defaultKeyedValues24.equals((java.lang.Object) 0L);
        int int34 = defaultKeyedValues24.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues24.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues24.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues24.removeValue(0);
        boolean boolean44 = defaultKeyedValues2D0.equals((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable46 = defaultKeyedValues2D0.getColumnKey((-1));
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        int int24 = defaultKeyedValues2D8.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D25 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list26 = defaultKeyedValues2D25.getRowKeys();
        int int27 = defaultKeyedValues2D25.getRowCount();
        int int28 = defaultKeyedValues2D25.getRowCount();
        boolean boolean30 = defaultKeyedValues2D25.equals((java.lang.Object) 10.0f);
        int int32 = defaultKeyedValues2D25.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list34 = defaultKeyedValues2D33.getRowKeys();
        int int35 = defaultKeyedValues2D33.getRowCount();
        int int36 = defaultKeyedValues2D33.getRowCount();
        boolean boolean38 = defaultKeyedValues2D33.equals((java.lang.Object) 10.0f);
        int int40 = defaultKeyedValues2D33.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D33.clear();
        boolean boolean45 = defaultKeyedValues2D25.equals((java.lang.Object) defaultKeyedValues2D33);
        java.util.List list46 = defaultKeyedValues2D33.getRowKeys();
        defaultKeyedValues2D33.removeColumn((java.lang.Comparable) 10.0f);
        java.lang.Object obj49 = defaultKeyedValues2D33.clone();
        boolean boolean50 = defaultKeyedValues2D8.equals((java.lang.Object) defaultKeyedValues2D33);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        java.lang.Object obj27 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "");
        defaultKeyedValues0.clear();
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(100, (java.lang.Comparable) 6, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (byte) -1, (java.lang.Number) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 10.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) "");
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 0);
        java.util.List list14 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0L, (java.lang.Comparable) (short) 0);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1.0f));
        org.jfree.data.DefaultKeyedValues defaultKeyedValues14 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues14.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues18 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues18.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean22 = defaultKeyedValues14.equals((java.lang.Object) 0L);
        int int24 = defaultKeyedValues14.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues14.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues14.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues14.addValue((java.lang.Comparable) (byte) 100, (double) (short) 100);
        java.lang.Class<?> wildcardClass35 = defaultKeyedValues14.getClass();
        boolean boolean36 = defaultKeyedValues2D0.equals((java.lang.Object) wildcardClass35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number39 = defaultKeyedValues2D0.getValue((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        int int7 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) false, (java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = defaultKeyedValues2D1.getValue((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        java.util.List list23 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 4);
        java.lang.Comparable comparable38 = defaultKeyedValues0.getKey((int) (byte) 1);
        int int40 = defaultKeyedValues0.getIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + true + "'", comparable38, true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) "");
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) true, (java.lang.Comparable) 100L);
        java.lang.Object obj15 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10.0f, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        java.util.List list28 = defaultKeyedValues2D0.getRowKeys();
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
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean19 = defaultKeyedValues11.equals((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultKeyedValues11.clone();
        defaultKeyedValues11.setValue((java.lang.Comparable) true, (double) '4');
        java.lang.Object obj24 = defaultKeyedValues11.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues29 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues29.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean33 = defaultKeyedValues25.equals((java.lang.Object) 0L);
        int int35 = defaultKeyedValues25.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues25.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues25.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues25.removeValue(0);
        boolean boolean45 = defaultKeyedValues11.equals((java.lang.Object) 0);
        defaultKeyedValues11.removeValue((java.lang.Comparable) 4);
        java.lang.Comparable comparable49 = defaultKeyedValues11.getKey((int) (byte) 1);
        defaultKeyedValues11.setValue((java.lang.Comparable) 10, 100.0d);
        boolean boolean53 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues11);
        java.lang.Comparable comparable54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number55 = defaultKeyedValues11.getValue(comparable54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + true + "'", comparable49, true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        java.lang.Class<?> wildcardClass39 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D();
        int int16 = defaultKeyedValues2D14.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D14.clear();
        java.lang.Object obj21 = defaultKeyedValues2D14.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues22 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues22.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean30 = defaultKeyedValues22.equals((java.lang.Object) 0L);
        int int32 = defaultKeyedValues22.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues22.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues22.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D40 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj41 = defaultKeyedValues2D40.clone();
        boolean boolean42 = defaultKeyedValues22.equals((java.lang.Object) defaultKeyedValues2D40);
        java.lang.Comparable comparable44 = defaultKeyedValues22.getKey(1);
        defaultKeyedValues22.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) (byte) 10);
        boolean boolean48 = defaultKeyedValues2D14.equals((java.lang.Object) (short) 100);
        java.lang.Object obj49 = defaultKeyedValues2D14.clone();
        boolean boolean50 = defaultKeyedValues2D0.equals(obj49);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + (short) 0 + "'", comparable44, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        int int14 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 35.0d, (java.lang.Comparable) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (short) 10);
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 5, (java.lang.Comparable) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 2");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
            defaultKeyedValues2D0.removeColumn((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
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
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        int int23 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 1, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        int int18 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj19 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1));
        java.util.List list16 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        defaultKeyedValues21.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable18 = defaultKeyedValues0.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 35.0d);
        int int12 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0L, (java.lang.Comparable) 97.0d, (java.lang.Comparable) 10.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        int int12 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getItemCount();
        java.lang.Number number16 = defaultKeyedValues0.getValue((int) (short) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 'a', (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0L + "'", number16, 0L);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        java.lang.Object obj9 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 3);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(0);
        int int12 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (java.lang.Number) 10);
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
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        java.lang.Comparable comparable27 = defaultKeyedValues0.getKey(0);
        java.lang.Object obj28 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 100 + "'", comparable27, 100);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) (short) 10, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues30.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues30.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues30.setValue((java.lang.Comparable) true, (double) '4');
        int int41 = defaultKeyedValues30.getIndex((java.lang.Comparable) 100L);
        int int42 = defaultKeyedValues30.getItemCount();
        boolean boolean43 = defaultKeyedValues0.equals((java.lang.Object) int42);
        java.util.List list44 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) 10.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        int int21 = defaultKeyedValues2D0.getColumnCount();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultKeyedValues2D0.getRowKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        defaultKeyedValues2D22.removeRow((int) (short) 0);
        int int74 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) true);
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        java.lang.Object obj67 = defaultKeyedValues2D22.clone();
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
        org.junit.Assert.assertNotNull(obj67);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (java.lang.Number) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 10L);
        int int22 = defaultKeyedValues0.getIndex((java.lang.Comparable) 6);
        java.lang.Comparable comparable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = defaultKeyedValues0.getIndex(comparable23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        int int14 = defaultKeyedValues2D1.getRowCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        java.lang.Number number23 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, number23);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '4', (java.lang.Comparable) (short) 10, (java.lang.Number) 52.0d);
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
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.clear();
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) (-1), (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (java.lang.Number) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.clear();
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        java.util.List list13 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 0);
        java.lang.Comparable comparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10.0f, comparable17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
            java.lang.Number number23 = defaultKeyedValues2D0.getValue((int) '#', (int) (short) 0);
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
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable25 = defaultKeyedValues0.getKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        int int70 = defaultKeyedValues2D22.getRowIndex((java.lang.Comparable) "");
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        defaultKeyedValues7.removeValue((java.lang.Comparable) "hi!");
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
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable28 = defaultKeyedValues2D0.getColumnKey(0);
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
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.removeValue(3);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) 4, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        java.lang.Comparable comparable17 = defaultKeyedValues0.getKey((int) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) 1.0d);
        defaultKeyedValues0.clear();
        java.lang.Object obj22 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable24 = defaultKeyedValues0.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 0 + "'", comparable17, (short) 0);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultKeyedValues0.equals(obj11);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0d);
        int int15 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) "");
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
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
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) -1, (java.lang.Comparable) 10L, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        java.lang.Class<?> wildcardClass15 = defaultKeyedValues11.getClass();
        boolean boolean16 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues11);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0d, (java.lang.Number) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultKeyedValues0.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) ' ', (java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        int int30 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable32 = defaultKeyedValues2D0.getRowKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable82 = defaultKeyedValues2D42.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
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
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        java.util.List list39 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        java.lang.Object obj41 = defaultKeyedValues2D21.clone();
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
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number45 = defaultKeyedValues2D19.getValue(2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        defaultKeyedValues2D0.removeRow((int) (byte) 0);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0d, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 4);
        java.util.List list18 = defaultKeyedValues2D0.getRowKeys();
        int int20 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int4 = defaultKeyedValues0.getItemCount();
        int int5 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 2, (double) (short) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 0, (double) 100.0f);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 10.0f, (java.lang.Number) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0d, 0.0d);
        java.lang.Object obj19 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 3);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) 35.0d);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        int int35 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (short) 0 + "'", comparable30, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        int int16 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) "hi!");
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
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        int int34 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.removeValue(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (short) 100, (java.lang.Number) 4);
        int int19 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        java.lang.Number number21 = defaultKeyedValues0.getValue(0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 4 + "'", number21, 4);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) '#', (double) 'a');
        java.util.List list15 = defaultKeyedValues0.getKeys();
        java.util.List list16 = defaultKeyedValues0.getKeys();
        java.lang.Number number18 = defaultKeyedValues0.getValue(0);
        org.jfree.chart.util.SortOrder sortOrder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 1L + "'", number18, 1L);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        java.util.List list14 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0);
        int int15 = defaultKeyedValues2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 0, (java.lang.Comparable) ' ', (java.lang.Comparable) 10.0f);
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
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        defaultKeyedValues0.insertValue(2, (java.lang.Comparable) '#', (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) ' ');
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (double) 2);
        java.lang.Object obj10 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = defaultKeyedValues0.getValue((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) "");
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 10");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getColumnCount();
        java.util.List list4 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) false, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, (java.lang.Number) 35.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        org.jfree.chart.util.SortOrder sortOrder33 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues18.sortByValues(sortOrder33);
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
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number53 = defaultKeyedValues2D0.getValue(3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        java.util.List list26 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 4, (java.lang.Comparable) '4', (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 4, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) "hi!");
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 1, (java.lang.Comparable) '4', (java.lang.Comparable) 10.0d);
        int int24 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues23 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues23.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues23.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues23.removeValue((java.lang.Comparable) (byte) 0);
        java.lang.Object obj32 = defaultKeyedValues23.clone();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        boolean boolean34 = defaultKeyedValues2D0.equals(obj32);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, 97.0d);
        org.jfree.chart.util.SortOrder sortOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) 4);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) ' ');
        defaultKeyedValues0.removeValue(0);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 0.0f);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        org.jfree.chart.util.SortOrder sortOrder30 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder30);
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
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.clear();
        int int15 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        java.lang.Object obj7 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 5, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) false, (java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (-1.0d));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues0.getValue((java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: false");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = defaultKeyedValues2D0.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        int int37 = defaultKeyedValues2D16.getColumnCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1), (java.lang.Comparable) 1, (java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable52 = defaultKeyedValues0.getKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        int int19 = defaultKeyedValues0.getItemCount();
        java.util.List list20 = defaultKeyedValues0.getKeys();
        int int22 = defaultKeyedValues0.getIndex((java.lang.Comparable) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        int int47 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10L);
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable22 = defaultKeyedValues2D0.getRowKey(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        java.util.List list23 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        int int16 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        int int14 = defaultKeyedValues2D0.getRowCount();
        int int15 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        int int17 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.clear();
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
        int int42 = defaultKeyedValues26.getIndex((java.lang.Comparable) 'a');
        int int44 = defaultKeyedValues26.getIndex((java.lang.Comparable) 4);
        boolean boolean45 = defaultKeyedValues2D0.equals((java.lang.Object) 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1L), (java.lang.Comparable) 1L, (java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(comparable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 1);
        int int27 = defaultKeyedValues2D8.getColumnCount();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1);
        java.lang.Number number15 = defaultKeyedValues0.getValue((int) (short) 1);
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (short) 1 + "'", number15, (short) 1);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        org.jfree.chart.util.SortOrder sortOrder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 1.0d + "'", number11, 1.0d);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 100.0d + "'", comparable21, 100.0d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1));
        java.util.List list8 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
            defaultKeyedValues0.sortByKeys(sortOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (short) 0);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 10);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues0.getValue((java.lang.Comparable) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 4");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues0.addValue((java.lang.Comparable) 100L, (java.lang.Number) 10L);
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) 35.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.addValue((java.lang.Comparable) 52.0d, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        int int23 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        org.jfree.chart.util.SortOrder sortOrder39 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        defaultKeyedValues2D0.clear();
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
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = defaultKeyedValues2D16.getValue(2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
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
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultKeyedValues0.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (byte) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, 0.0d);
        org.jfree.chart.util.SortOrder sortOrder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        java.util.List list14 = defaultKeyedValues2D0.getColumnKeys();
        boolean boolean16 = defaultKeyedValues2D0.equals((java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues2D0.getValue((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues27.clear();
        defaultKeyedValues27.clear();
        defaultKeyedValues27.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        int int36 = defaultKeyedValues27.getItemCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D37 = new org.jfree.data.DefaultKeyedValues2D();
        int int39 = defaultKeyedValues2D37.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D37.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D37.clear();
        defaultKeyedValues2D37.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D37.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj50 = defaultKeyedValues2D37.clone();
        int int51 = defaultKeyedValues2D37.getColumnCount();
        java.util.List list52 = defaultKeyedValues2D37.getColumnKeys();
        boolean boolean53 = defaultKeyedValues27.equals((java.lang.Object) list52);
        java.lang.Object obj54 = defaultKeyedValues27.clone();
        boolean boolean55 = defaultKeyedValues2D8.equals(obj54);
        java.util.List list56 = defaultKeyedValues2D8.getRowKeys();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(list56);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 97.0d);
        java.util.List list15 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        int int14 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        int int18 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        int int8 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 4, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 10, (java.lang.Comparable) 10.0d, (java.lang.Comparable) "hi!");
        int int20 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list22 = defaultKeyedValues2D21.getRowKeys();
        int int23 = defaultKeyedValues2D21.getRowCount();
        int int24 = defaultKeyedValues2D21.getRowCount();
        boolean boolean26 = defaultKeyedValues2D21.equals((java.lang.Object) 10.0f);
        int int28 = defaultKeyedValues2D21.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list30 = defaultKeyedValues2D29.getRowKeys();
        int int31 = defaultKeyedValues2D29.getRowCount();
        int int32 = defaultKeyedValues2D29.getRowCount();
        boolean boolean34 = defaultKeyedValues2D29.equals((java.lang.Object) 10.0f);
        int int36 = defaultKeyedValues2D29.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D29.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D29.clear();
        boolean boolean41 = defaultKeyedValues2D21.equals((java.lang.Object) defaultKeyedValues2D29);
        defaultKeyedValues2D21.removeColumn((java.lang.Comparable) 100.0f);
        int int44 = defaultKeyedValues2D21.getRowCount();
        int int45 = defaultKeyedValues2D21.getColumnCount();
        defaultKeyedValues2D21.removeColumn((java.lang.Comparable) '#');
        boolean boolean48 = defaultKeyedValues2D0.equals((java.lang.Object) '#');
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
            defaultKeyedValues0.insertValue((int) (short) 10, (java.lang.Comparable) 6, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
            defaultKeyedValues0.insertValue((int) '#', (java.lang.Comparable) (byte) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        java.lang.Object obj7 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1L), (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0d);
        int int13 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable13 = defaultKeyedValues0.getKey(0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (short) 0 + "'", comparable13, (short) 0);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        int int24 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues2D0.getValue(2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        java.util.List list5 = defaultKeyedValues2D0.getRowKeys();
        int int6 = defaultKeyedValues2D0.getRowCount();
        int int7 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        int int18 = defaultKeyedValues0.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) '#');
        java.util.List list18 = defaultKeyedValues0.getKeys();
        org.jfree.chart.util.SortOrder sortOrder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) "", (java.lang.Comparable) 1.0f);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) 35.0d);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "hi!", (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
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
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        int int24 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        java.lang.Comparable comparable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.addValue((java.lang.Number) 1L, comparable26, (java.lang.Comparable) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
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
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        defaultKeyedValues2D12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable30 = defaultKeyedValues2D12.getRowKey((int) (byte) -1);
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
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
        int int19 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable21 = defaultKeyedValues2D0.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) "", (java.lang.Comparable) (byte) 100);
        int int14 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + number25 + "' != '" + 97.0d + "'", number25, 97.0d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) 3, (java.lang.Comparable) 10L, (java.lang.Comparable) (short) -1);
        int int24 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 5, (double) 6);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues0.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
            java.lang.Number number28 = defaultKeyedValues0.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
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
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.util.List list6 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) (-1.0f));
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 1);
        int int15 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        java.lang.Comparable comparable57 = defaultKeyedValues2D42.getColumnKey(0);
        java.lang.Object obj58 = defaultKeyedValues2D42.clone();
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
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + 3 + "'", comparable57, 3);
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 2, (java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean29 = defaultKeyedValues21.equals((java.lang.Object) 0L);
        int int31 = defaultKeyedValues21.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues21.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues21.setValue((java.lang.Comparable) false, (java.lang.Number) 100.0d);
        boolean boolean39 = defaultKeyedValues0.equals((java.lang.Object) false);
        java.lang.Number number41 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) ' ', number41);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) 10.0d, (-1.0d));
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (java.lang.Number) (short) 1);
        defaultKeyedValues0.clear();
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D14.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int22 = defaultKeyedValues2D14.getColumnCount();
        java.util.List list23 = defaultKeyedValues2D14.getRowKeys();
        defaultKeyedValues2D14.removeColumn((java.lang.Comparable) (byte) 1);
        boolean boolean26 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D14);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 4);
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
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) ' ', (java.lang.Comparable) 2, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        defaultKeyedValues0.removeValue(0);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
            defaultKeyedValues2D0.removeColumn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0);
        int int15 = defaultKeyedValues2D0.getRowCount();
        int int17 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 3);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj2 = defaultKeyedValues2D0.clone();
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int4 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Number number5 = null;
        defaultKeyedValues2D0.addValue(number5, (java.lang.Comparable) '#', (java.lang.Comparable) (-1.0f));
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        int int12 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        int int20 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        int int6 = defaultKeyedValues2D0.getRowCount();
        java.util.List list7 = defaultKeyedValues2D0.getRowKeys();
        java.util.List list8 = defaultKeyedValues2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 1L, (java.lang.Number) 10L);
        java.util.List list18 = defaultKeyedValues0.getKeys();
        java.lang.Object obj19 = defaultKeyedValues0.clone();
        org.jfree.chart.util.SortOrder sortOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) "", (java.lang.Comparable) 1.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean19 = defaultKeyedValues11.equals((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultKeyedValues11.clone();
        boolean boolean22 = defaultKeyedValues11.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues11.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 10);
        defaultKeyedValues11.setValue((java.lang.Comparable) 10L, (java.lang.Number) 100);
        boolean boolean29 = defaultKeyedValues2D0.equals((java.lang.Object) 100);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) false, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 100.0f, (java.lang.Comparable) "", (java.lang.Comparable) 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        defaultKeyedValues2D20.removeColumn((java.lang.Comparable) 10.0f);
        int int39 = defaultKeyedValues2D20.getColumnCount();
        java.lang.Object obj40 = defaultKeyedValues2D20.clone();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1L), (java.lang.Comparable) "", (java.lang.Comparable) 1.0f);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues11 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues11.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues15 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues15.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean19 = defaultKeyedValues11.equals((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultKeyedValues11.clone();
        boolean boolean22 = defaultKeyedValues11.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues11.addValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 10);
        defaultKeyedValues11.setValue((java.lang.Comparable) 10L, (java.lang.Number) 100);
        boolean boolean29 = defaultKeyedValues2D0.equals((java.lang.Object) 100);
        java.util.List list30 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        int int3 = defaultKeyedValues2D1.getRowCount();
        defaultKeyedValues2D1.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (byte) 100);
        int int8 = defaultKeyedValues2D1.getColumnCount();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeColumn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1));
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        defaultKeyedValues0.insertValue(5, (java.lang.Comparable) false, (double) 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 0L);
        org.jfree.chart.util.SortOrder sortOrder38 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 6, (java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        java.lang.Class<?> wildcardClass11 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, 1.0d);
        java.util.List list15 = defaultKeyedValues0.getKeys();
        java.lang.Class<?> wildcardClass16 = list15.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        int int24 = defaultKeyedValues2D18.getRowIndex((java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues22.insertValue(6, (java.lang.Comparable) 4, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
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
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        defaultKeyedValues2D0.clear();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) ' ');
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) 100.0d, (java.lang.Comparable) 100L);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        int int26 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 1, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        int int33 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        java.util.List list28 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) ' ', (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        defaultKeyedValues0.insertValue(1, (java.lang.Comparable) 100.0d, (java.lang.Number) 10);
        int int11 = defaultKeyedValues0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 1.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0d, (double) (short) -1);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues0.getKey((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = defaultKeyedValues0.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 52.0d, (java.lang.Number) 10.0d);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        int int14 = defaultKeyedValues0.getItemCount();
        int int16 = defaultKeyedValues0.getIndex((java.lang.Comparable) "hi!");
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        int int18 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        org.jfree.chart.util.SortOrder sortOrder28 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder28);
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
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0f));
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        java.lang.Object obj17 = defaultKeyedValues2D0.clone();
        int int18 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) 0L, (java.lang.Comparable) 100, (java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 52.0d, (double) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 1L, (double) 100L);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
            defaultKeyedValues2D0.removeColumn((int) '4');
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        int int18 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 0L + "'", number17, 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        java.lang.Comparable comparable26 = defaultKeyedValues0.getKey((int) (short) 1);
        defaultKeyedValues0.removeValue((int) (byte) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D();
        int int31 = defaultKeyedValues2D29.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D29.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list35 = defaultKeyedValues2D29.getColumnKeys();
        defaultKeyedValues2D29.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1L));
        java.util.List list40 = defaultKeyedValues2D29.getRowKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D41 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D41.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D41.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        boolean boolean49 = defaultKeyedValues2D29.equals((java.lang.Object) (byte) 1);
        boolean boolean50 = defaultKeyedValues0.equals((java.lang.Object) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100L, (java.lang.Number) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (short) 0 + "'", comparable26, (short) 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        int int14 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1));
        int int15 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Object obj16 = defaultKeyedValues2D0.clone();
        java.util.List list17 = defaultKeyedValues2D0.getRowKeys();
        int int19 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
            java.lang.Comparable comparable20 = defaultKeyedValues2D0.getRowKey((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
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
        java.lang.Object obj36 = defaultKeyedValues2D6.clone();
        boolean boolean37 = defaultKeyedValues2D0.equals(obj36);
        int int38 = defaultKeyedValues2D0.getColumnCount();
        int int39 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
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
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1), (java.lang.Number) (byte) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, 0.0d);
        java.lang.Object obj22 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        org.jfree.chart.util.SortOrder sortOrder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0f);
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list15 = defaultKeyedValues2D14.getRowKeys();
        int int16 = defaultKeyedValues2D14.getRowCount();
        int int17 = defaultKeyedValues2D14.getRowCount();
        boolean boolean19 = defaultKeyedValues2D14.equals((java.lang.Object) 10.0f);
        int int21 = defaultKeyedValues2D14.getColumnIndex((java.lang.Comparable) 0.0f);
        int int23 = defaultKeyedValues2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int24 = defaultKeyedValues2D14.getColumnCount();
        java.lang.Number number25 = null;
        defaultKeyedValues2D14.setValue(number25, (java.lang.Comparable) "hi!", (java.lang.Comparable) 1);
        boolean boolean29 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D14);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 0);
        java.util.List list32 = defaultKeyedValues2D0.getRowKeys();
        int int34 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 35.0d + "'", number23, 35.0d);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getRowKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) (short) 0, (java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Short (java.lang.Double and java.lang.Short are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultKeyedValues2D0.getRowKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1L), (java.lang.Comparable) 1L, (java.lang.Comparable) (short) 0);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) "");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) 3);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, 0.0d);
        int int21 = defaultKeyedValues0.getIndex((java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, (java.lang.Number) (short) 0);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = defaultKeyedValues0.getValue((java.lang.Comparable) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
            java.lang.Number number23 = defaultKeyedValues2D0.getValue((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.clear();
        java.util.List list15 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (java.lang.Number) 100);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1.0f);
        java.lang.Object obj15 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        int int26 = defaultKeyedValues2D18.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues27 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues27.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues31 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues31.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean35 = defaultKeyedValues27.equals((java.lang.Object) 0L);
        java.lang.Object obj36 = defaultKeyedValues27.clone();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues37 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues37.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues41 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues41.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean45 = defaultKeyedValues37.equals((java.lang.Object) 0L);
        int int47 = defaultKeyedValues37.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues37.removeValue((java.lang.Comparable) 0.0d);
        boolean boolean50 = defaultKeyedValues27.equals((java.lang.Object) 0.0d);
        defaultKeyedValues27.addValue((java.lang.Comparable) "hi!", (java.lang.Number) 100);
        defaultKeyedValues27.removeValue((java.lang.Comparable) (short) 1);
        defaultKeyedValues27.addValue((java.lang.Comparable) '4', (java.lang.Number) 1.0d);
        int int59 = defaultKeyedValues27.getItemCount();
        defaultKeyedValues27.addValue((java.lang.Comparable) 0, (double) 3);
        boolean boolean63 = defaultKeyedValues2D18.equals((java.lang.Object) defaultKeyedValues27);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getItemCount();
        java.util.List list11 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 1.0f, (java.lang.Number) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues0.getValue((java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.removeValue(0);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) 10);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        java.util.List list37 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) true);
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
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        java.lang.Object obj11 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int5 = defaultKeyedValues2D0.getColumnCount();
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 1);
        defaultKeyedValues2D0.clear();
        int int11 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues2D0.getColumnKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) -1);
        defaultKeyedValues2D0.removeRow(0);
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
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 2");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = defaultKeyedValues0.getValue((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: hi!");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 100, (java.lang.Comparable) 1, (java.lang.Comparable) (byte) 10);
        java.util.List list17 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.setValue(comparable22, (double) 1L);
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
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        defaultKeyedValues2D0.removeRow((java.lang.Comparable) '#');
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
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
            java.lang.Comparable comparable19 = defaultKeyedValues2D0.getRowKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable6 = defaultKeyedValues0.getKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D4.removeColumn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        int int19 = defaultKeyedValues2D4.getRowCount();
        java.util.List list20 = defaultKeyedValues2D4.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D4.getValue((java.lang.Comparable) 4, (java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int6 = defaultKeyedValues2D0.getColumnCount();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 0.0d);
        int int13 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100L);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) (-1.0d));
        java.lang.Object obj17 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        defaultKeyedValues9.addValue((java.lang.Comparable) 100, (double) (byte) -1);
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
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) -1);
        java.util.List list5 = defaultKeyedValues2D0.getColumnKeys();
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.setValue((java.lang.Number) 0, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 3);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        defaultKeyedValues28.setValue((java.lang.Comparable) (short) -1, (double) (byte) 0);
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
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
            java.lang.Number number19 = defaultKeyedValues0.getValue((java.lang.Comparable) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '#');
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int7 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) (-1));
        java.util.List list8 = defaultKeyedValues2D1.getColumnKeys();
        java.util.List list9 = defaultKeyedValues2D1.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D1.removeRow((java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        java.lang.Comparable comparable12 = defaultKeyedValues0.getKey(0);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D();
        int int17 = defaultKeyedValues2D15.getRowIndex((java.lang.Comparable) 10);
        int int18 = defaultKeyedValues2D15.getRowCount();
        defaultKeyedValues2D15.removeValue((java.lang.Comparable) (byte) 0, (java.lang.Comparable) ' ');
        defaultKeyedValues2D15.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) (byte) 10);
        java.util.List list25 = defaultKeyedValues2D15.getRowKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list27 = defaultKeyedValues2D26.getRowKeys();
        defaultKeyedValues2D26.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D26.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int35 = defaultKeyedValues2D26.getColumnCount();
        defaultKeyedValues2D26.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 3, (java.lang.Comparable) (byte) 1);
        boolean boolean40 = defaultKeyedValues2D15.equals((java.lang.Object) (byte) 10);
        defaultKeyedValues2D15.addValue((java.lang.Number) 0.0d, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0.0f);
        java.lang.Comparable comparable46 = defaultKeyedValues2D15.getRowKey((int) (byte) 0);
        boolean boolean47 = defaultKeyedValues0.equals((java.lang.Object) comparable46);
        int int48 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + 100.0f + "'", comparable46, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable35 = defaultKeyedValues0.getKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 10);
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
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = defaultKeyedValues2D1.getColumnKey(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = defaultKeyedValues2D0.getValue((int) (short) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (short) 0);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 35.0d);
        java.util.List list14 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 1.0d, (java.lang.Number) (byte) 100);
        int int35 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        int int14 = defaultKeyedValues2D0.getRowCount();
        int int15 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0L, (java.lang.Comparable) 1, (java.lang.Comparable) 100.0f);
        int int21 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) '#', (java.lang.Comparable) (byte) 0, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        java.lang.Number number13 = null;
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) '#', number13);
        java.lang.Comparable comparable16 = defaultKeyedValues0.getKey((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, (java.lang.Comparable) '4', (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        int int7 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D0.getValue((int) (short) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.lang.Object obj6 = defaultKeyedValues0.clone();
        int int7 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.clear();
        int int10 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) "");
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) "");
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1));
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D0.getValue(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) false);
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable14 = defaultKeyedValues2D0.getRowKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
            defaultKeyedValues0.sortByKeys(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
            java.lang.Number number13 = defaultKeyedValues2D0.getValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 100");
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
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
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
        java.lang.Object obj32 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0L, (java.lang.Comparable) 'a', (java.lang.Comparable) (short) 10);
        int int37 = defaultKeyedValues2D0.getColumnCount();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        java.lang.Object obj28 = defaultKeyedValues2D0.clone();
        java.util.List list29 = defaultKeyedValues2D0.getRowKeys();
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
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        java.lang.Object obj57 = defaultKeyedValues2D20.clone();
        defaultKeyedValues2D20.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) ' ');
        java.lang.Object obj61 = defaultKeyedValues2D20.clone();
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
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 3, (java.lang.Comparable) 1L);
        defaultKeyedValues2D0.removeColumn(0);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0);
        defaultKeyedValues2D0.setValue((java.lang.Number) 2, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (byte) -1);
        java.lang.Object obj17 = defaultKeyedValues2D0.clone();
        int int18 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) -1);
        java.util.List list5 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        java.util.List list15 = defaultKeyedValues0.getKeys();
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
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        int int29 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
        java.lang.Object obj16 = defaultKeyedValues0.clone();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 1L);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 2);
        java.lang.Number number16 = defaultKeyedValues0.getValue((int) (short) 1);
        org.jfree.chart.util.SortOrder sortOrder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (short) 1 + "'", number16, (short) 1);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 4);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) false, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable48 = defaultKeyedValues2D0.getRowKey((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals("'" + comparable45 + "' != '" + 100 + "'", comparable45, 100);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Class<?> wildcardClass9 = list8.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        int int31 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        defaultKeyedValues0.removeValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) 10, (java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + number37 + "' != '" + 0L + "'", number37, 0L);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0L, (java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int4 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Number number5 = null;
        defaultKeyedValues2D0.addValue(number5, (java.lang.Comparable) '#', (java.lang.Comparable) (-1.0f));
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10L, (java.lang.Comparable) true);
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 4, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        int int16 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj17 = defaultKeyedValues2D0.clone();
        int int18 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        java.lang.Comparable comparable13 = null;
        defaultKeyedValues2D1.removeColumn(comparable13);
        defaultKeyedValues2D1.removeValue((java.lang.Comparable) 5, (java.lang.Comparable) (-1L));
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
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1), (java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable15 = defaultKeyedValues2D0.getRowKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        int int18 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list19 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) '4');
        int int46 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        int int18 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 0);
        java.util.List list19 = defaultKeyedValues2D1.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        java.util.List list24 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable26 = defaultKeyedValues0.getKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey(0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (-1));
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultKeyedValues0.equals(obj11);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.clear();
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.clear();
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        java.util.List list17 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        int int7 = defaultKeyedValues2D0.getRowCount();
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = defaultKeyedValues2D0.getValue(comparable8, (java.lang.Comparable) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1), (java.lang.Comparable) 10.0d, (java.lang.Comparable) 5);
        java.lang.Class<?> wildcardClass28 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list4 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D8 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D8.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D8.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        boolean boolean16 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D8);
        java.lang.Object obj17 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 35.0d, (java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues0.clear();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        int int21 = defaultKeyedValues17.getItemCount();
        java.util.List list22 = defaultKeyedValues17.getKeys();
        boolean boolean23 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 10L);
        int int17 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 100, comparable19, (java.lang.Number) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        int int19 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj20 = defaultKeyedValues0.clone();
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (java.lang.Number) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
        java.util.List list21 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) false, (java.lang.Comparable) (-1L));
        int int14 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 100, (java.lang.Number) 100);
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = defaultKeyedValues0.getIndex(comparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
        java.lang.Comparable comparable22 = defaultKeyedValues2D4.getRowKey(0);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D4.removeRow(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (byte) 100 + "'", comparable22, (byte) 100);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        boolean boolean2 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list3 = defaultKeyedValues2D0.getRowKeys();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        int int18 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.lang.Class<?> wildcardClass19 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.removeValue(0);
        defaultKeyedValues0.clear();
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
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.addValue((java.lang.Number) 3, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D0.getValue((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable12 = defaultKeyedValues2D0.getRowKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (short) 1, (java.lang.Number) (-1L));
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D33 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D33.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list37 = defaultKeyedValues2D33.getColumnKeys();
        defaultKeyedValues2D33.clear();
        boolean boolean39 = defaultKeyedValues7.equals((java.lang.Object) defaultKeyedValues2D33);
        java.lang.Object obj40 = defaultKeyedValues2D33.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) '4');
        java.util.List list6 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1L), (java.lang.Comparable) 1L, (java.lang.Comparable) (short) 0);
        java.util.List list11 = defaultKeyedValues2D0.getRowKeys();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        java.lang.Comparable comparable11 = defaultKeyedValues2D0.getRowKey(0);
        defaultKeyedValues2D0.addValue((java.lang.Number) 4, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable17 = defaultKeyedValues2D0.getColumnKey((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D43 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D43.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list47 = defaultKeyedValues2D43.getColumnKeys();
        defaultKeyedValues2D43.removeValue((java.lang.Comparable) (short) 0, (java.lang.Comparable) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D51 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D51.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D51.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        boolean boolean59 = defaultKeyedValues2D43.equals((java.lang.Object) defaultKeyedValues2D51);
        java.lang.Object obj60 = defaultKeyedValues2D43.clone();
        defaultKeyedValues2D43.removeValue((java.lang.Comparable) 35.0d, (java.lang.Comparable) (byte) 0);
        boolean boolean64 = defaultKeyedValues2D0.equals((java.lang.Object) 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number67 = defaultKeyedValues2D0.getValue(6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) 100L);
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
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        java.lang.Object obj25 = defaultKeyedValues0.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 100 + "'", comparable23, 100);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj14 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1L, 1.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (java.lang.Number) (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0f, (java.lang.Comparable) (short) 100, (java.lang.Comparable) (short) 0);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) -1);
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (short) 10);
        java.lang.Object obj8 = defaultKeyedValues2D0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D9 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list10 = defaultKeyedValues2D9.getRowKeys();
        int int11 = defaultKeyedValues2D9.getRowCount();
        int int12 = defaultKeyedValues2D9.getRowCount();
        boolean boolean14 = defaultKeyedValues2D9.equals((java.lang.Object) 10.0f);
        java.util.List list15 = defaultKeyedValues2D9.getColumnKeys();
        java.util.List list16 = defaultKeyedValues2D9.getRowKeys();
        java.lang.Object obj17 = defaultKeyedValues2D9.clone();
        boolean boolean18 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues2D9);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable31 = defaultKeyedValues0.getKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 35.0d + "'", number23, 35.0d);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0f, (double) 100.0f);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable16 = defaultKeyedValues0.getKey((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
        java.util.List list41 = defaultKeyedValues2D18.getColumnKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(list41);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        int int24 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int25 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 100L, (java.lang.Comparable) 'a', (java.lang.Comparable) 1L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0L, (java.lang.Comparable) (short) 0);
        int int13 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable13 = defaultKeyedValues0.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
        defaultKeyedValues2D18.setValue((java.lang.Number) 10, (java.lang.Comparable) true, (java.lang.Comparable) "");
        defaultKeyedValues2D18.addValue((java.lang.Number) 3, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1), (java.lang.Comparable) (short) 100, (java.lang.Comparable) (-1.0d));
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) (-1.0d), (java.lang.Comparable) (-1), (java.lang.Comparable) (byte) 0);
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
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 3, (java.lang.Comparable) 1L);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 2);
        java.lang.Comparable comparable14 = defaultKeyedValues2D0.getRowKey((int) (short) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 3 + "'", comparable14, 3);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) '4');
        int int25 = defaultKeyedValues2D0.getRowCount();
        java.util.List list26 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        java.lang.Comparable comparable50 = defaultKeyedValues15.getKey((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number52 = defaultKeyedValues15.getValue((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: -1.0");
        } catch (org.jfree.data.UnknownKeyException e) {
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
        org.junit.Assert.assertEquals("'" + comparable50 + "' != '" + "hi!" + "'", comparable50, "hi!");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number58 = defaultKeyedValues2D0.getValue(6, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 100);
        int int6 = defaultKeyedValues2D1.getRowCount();
        java.lang.Object obj7 = defaultKeyedValues2D1.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        int int10 = defaultKeyedValues0.getItemCount();
        java.lang.Object obj11 = null;
        boolean boolean12 = defaultKeyedValues0.equals(obj11);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0d, 0.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        int int11 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        int int12 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 0.0d);
        int int14 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) 'a', (double) '#');
        java.util.List list18 = defaultKeyedValues0.getKeys();
        int int19 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        defaultKeyedValues2D0.setValue((java.lang.Number) 100.0d, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (byte) 100);
        defaultKeyedValues2D0.clear();
        java.util.List list13 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 10);
        int int7 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj10 = defaultKeyedValues2D0.clone();
        defaultKeyedValues2D0.addValue((java.lang.Number) 10.0f, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) -1, (java.lang.Comparable) 10L, (java.lang.Comparable) 0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) 1L, (java.lang.Number) 10L);
        java.util.List list18 = defaultKeyedValues0.getKeys();
        java.lang.Object obj19 = defaultKeyedValues0.clone();
        int int20 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
            defaultKeyedValues10.removeValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int4 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 100, (java.lang.Comparable) 3, (java.lang.Comparable) 1L);
        defaultKeyedValues2D0.removeColumn(0);
        int int12 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0);
        defaultKeyedValues2D0.setValue((java.lang.Number) 2, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) (byte) -1);
        java.util.List list17 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj13 = defaultKeyedValues2D0.clone();
        int int14 = defaultKeyedValues2D0.getColumnCount();
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
        defaultKeyedValues0.removeValue((java.lang.Comparable) ' ');
        defaultKeyedValues0.removeValue((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        int int8 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getColumnCount();
        int int9 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) false, (java.lang.Comparable) (-1L));
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 0, (double) 0);
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
            java.lang.Number number16 = defaultKeyedValues2D0.getValue(3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
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
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) ' ', (java.lang.Comparable) 100.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) 100, (java.lang.Comparable) 100L, (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        boolean boolean11 = defaultKeyedValues0.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) 1.0f, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0d), (java.lang.Comparable) 10L, (java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
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
        int int23 = defaultKeyedValues2D18.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        java.lang.Comparable comparable69 = defaultKeyedValues2D22.getColumnKey(0);
        int int70 = defaultKeyedValues2D22.getRowCount();
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
        org.junit.Assert.assertEquals("'" + comparable69 + "' != '" + 100 + "'", comparable69, 100);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.clear();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues26 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues26.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues30.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean34 = defaultKeyedValues26.equals((java.lang.Object) 0L);
        int int36 = defaultKeyedValues26.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues26.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues26.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues44 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues44.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues48 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues48.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean52 = defaultKeyedValues44.equals((java.lang.Object) 0L);
        int int54 = defaultKeyedValues44.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues44.insertValue(0, (java.lang.Comparable) 100, (double) '#');
        defaultKeyedValues44.addValue((java.lang.Comparable) '#', (java.lang.Number) 0);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D62 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj63 = defaultKeyedValues2D62.clone();
        boolean boolean64 = defaultKeyedValues44.equals((java.lang.Object) defaultKeyedValues2D62);
        boolean boolean65 = defaultKeyedValues26.equals((java.lang.Object) boolean64);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D66 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list67 = defaultKeyedValues2D66.getRowKeys();
        int int68 = defaultKeyedValues2D66.getRowCount();
        int int69 = defaultKeyedValues2D66.getRowCount();
        int int71 = defaultKeyedValues2D66.getRowIndex((java.lang.Comparable) '4');
        int int72 = defaultKeyedValues2D66.getRowCount();
        java.util.List list73 = defaultKeyedValues2D66.getRowKeys();
        boolean boolean74 = defaultKeyedValues26.equals((java.lang.Object) list73);
        defaultKeyedValues26.setValue((java.lang.Comparable) 0.0d, (double) (short) 0);
        boolean boolean78 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues26);
        java.lang.Comparable comparable79 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues26.setValue(comparable79, (double) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) 10L);
        int int17 = defaultKeyedValues0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (short) -1, (java.lang.Comparable) 35.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        defaultKeyedValues2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable30 = defaultKeyedValues2D0.getRowKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
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
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
        defaultKeyedValues10.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + number47 + "' != '" + (short) 1 + "'", number47, (short) 1);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1L), (java.lang.Number) (byte) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) 10L);
        int int22 = defaultKeyedValues0.getIndex((java.lang.Comparable) 6);
        defaultKeyedValues0.removeValue((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, 10.0d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        java.lang.Number number59 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 97.0d, number59);
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
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 2, (java.lang.Comparable) (-1.0f));
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
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (-1.0f), (java.lang.Number) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 0 + "'", comparable22, (short) 0);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int4 = defaultKeyedValues2D0.getColumnCount();
        java.lang.Number number5 = null;
        defaultKeyedValues2D0.addValue(number5, (java.lang.Comparable) '#', (java.lang.Comparable) (-1.0f));
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultKeyedValues2D0.getValue((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        java.util.List list27 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(100, (java.lang.Comparable) ' ', (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) ' ');
        java.lang.Number number32 = null;
        defaultKeyedValues2D0.addValue(number32, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
        defaultKeyedValues2D0.clear();
        int int29 = defaultKeyedValues2D0.getColumnCount();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable33 = defaultKeyedValues2D0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) "hi!", (double) 10L);
        int int18 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (short) 100, (java.lang.Number) 4);
        java.lang.Number number19 = defaultKeyedValues0.getValue(0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 10, (java.lang.Number) (-1.0f));
        java.util.List list23 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + number19 + "' != '" + 4 + "'", number19, 4);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        int int5 = defaultKeyedValues2D0.getColumnCount();
        int int6 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) -1, (java.lang.Comparable) 1);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) -1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) '4');
        java.lang.Comparable comparable47 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), comparable47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
            java.lang.Number number28 = defaultKeyedValues2D0.getValue((int) (byte) 0, 100);
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
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (double) ' ');
        defaultKeyedValues0.setValue((java.lang.Comparable) 0.0f, (double) 2);
        java.lang.Object obj10 = null;
        boolean boolean11 = defaultKeyedValues0.equals(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj4 = defaultKeyedValues2D0.clone();
        java.lang.Object obj5 = defaultKeyedValues2D0.clone();
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
        java.lang.Object obj36 = defaultKeyedValues2D6.clone();
        boolean boolean37 = defaultKeyedValues2D0.equals(obj36);
        int int38 = defaultKeyedValues2D0.getColumnCount();
        int int40 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
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
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1L), 1.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) 100.0d, (java.lang.Number) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (-1L));
        int int15 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) -1);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        int int26 = defaultKeyedValues2D18.getColumnCount();
        java.lang.Object obj27 = defaultKeyedValues2D18.clone();
        defaultKeyedValues2D18.removeColumn((java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        java.lang.Number number15 = defaultKeyedValues0.getValue((int) (byte) 1);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues16 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues16.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues20 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues20.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean24 = defaultKeyedValues16.equals((java.lang.Object) 0L);
        int int26 = defaultKeyedValues16.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues16.removeValue((java.lang.Comparable) 0.0d);
        defaultKeyedValues16.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 1);
        defaultKeyedValues16.clear();
        defaultKeyedValues16.addValue((java.lang.Comparable) 0.0d, (double) 1L);
        int int37 = defaultKeyedValues16.getIndex((java.lang.Comparable) (-1));
        defaultKeyedValues16.addValue((java.lang.Comparable) (-1), (java.lang.Number) 10.0d);
        java.lang.Object obj41 = defaultKeyedValues16.clone();
        boolean boolean42 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues16);
        defaultKeyedValues16.addValue((java.lang.Comparable) 10.0f, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues16.insertValue(100, (java.lang.Comparable) (-1), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 100.0d + "'", number15, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
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
            java.lang.Number number16 = defaultKeyedValues0.getValue((java.lang.Comparable) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 100.0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) 3);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, 0.0d);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 1, (java.lang.Number) 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.lang.Number number9 = null;
        defaultKeyedValues2D0.addValue(number9, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) 0, (java.lang.Comparable) 1, (java.lang.Comparable) 0.0f);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 10, (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.removeValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 0 + "'", comparable12, (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0L + "'", number22, 0L);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int5 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (short) 10);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int9 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1);
        java.util.List list10 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.removeValue((java.lang.Comparable) 3);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) 10, 100.0d);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
            defaultKeyedValues2D0.removeRow((java.lang.Comparable) (short) 10);
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
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1), (java.lang.Number) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list8 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.addValue((java.lang.Number) 10L, (java.lang.Comparable) '4', (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        java.lang.Class<?> wildcardClass44 = defaultKeyedValues2D0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        defaultKeyedValues2D0.setValue((java.lang.Number) (short) 10, (java.lang.Comparable) 100L, (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        defaultKeyedValues2D0.addValue((java.lang.Number) 52.0d, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 100);
        defaultKeyedValues2D0.removeRow((int) (byte) 0);
        int int33 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) 10L, (java.lang.Comparable) 5, (java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        int int26 = defaultKeyedValues2D0.getRowCount();
        java.lang.Object obj27 = defaultKeyedValues2D0.clone();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int12 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) (short) 100);
        java.lang.Class<?> wildcardClass16 = defaultKeyedValues0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        int int7 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (short) 0, (java.lang.Comparable) 10, (java.lang.Comparable) false);
        defaultKeyedValues2D0.addValue((java.lang.Number) 100, (java.lang.Comparable) false, (java.lang.Comparable) (-1L));
        java.util.List list16 = defaultKeyedValues2D0.getColumnKeys();
        java.lang.Class<?> wildcardClass17 = defaultKeyedValues2D0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        defaultKeyedValues0.insertValue((int) (short) 0, (java.lang.Comparable) (byte) 0, (java.lang.Number) (byte) 1);
        java.util.List list14 = defaultKeyedValues0.getKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = defaultKeyedValues0.getValue((java.lang.Comparable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: 1");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) 4);
        defaultKeyedValues0.setValue((java.lang.Comparable) '#', (double) ' ');
        int int19 = defaultKeyedValues0.getItemCount();
        java.lang.Comparable comparable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.addValue(comparable20, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        org.jfree.data.DefaultKeyedValues defaultKeyedValues30 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues30.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D34 = new org.jfree.data.DefaultKeyedValues2D();
        int int36 = defaultKeyedValues2D34.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D34.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D34.clear();
        defaultKeyedValues2D34.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D34.removeColumn((java.lang.Comparable) 10L);
        boolean boolean47 = defaultKeyedValues30.equals((java.lang.Object) defaultKeyedValues2D34);
        int int48 = defaultKeyedValues2D34.getColumnCount();
        java.lang.Comparable comparable50 = defaultKeyedValues2D34.getRowKey(0);
        defaultKeyedValues2D34.addValue((java.lang.Number) 35.0d, (java.lang.Comparable) 52.0d, (java.lang.Comparable) 10);
        boolean boolean55 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D34);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 35.0d + "'", number23, 35.0d);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + comparable50 + "' != '" + (byte) 100 + "'", comparable50, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        int int4 = defaultKeyedValues2D0.getColumnCount();
        int int6 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.addValue((java.lang.Number) 6, (java.lang.Comparable) '#', (java.lang.Comparable) (short) 10);
        java.util.List list11 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        int int11 = defaultKeyedValues2D0.getColumnCount();
        int int12 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 52.0d);
        java.lang.Comparable comparable16 = defaultKeyedValues2D0.getColumnKey(0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 1.0f + "'", comparable16, 1.0f);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) (byte) 100, (java.lang.Number) (byte) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (double) (short) 0);
        java.lang.Number number13 = defaultKeyedValues0.getValue(1);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 0.0d + "'", number13, 0.0d);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        org.jfree.chart.util.SortOrder sortOrder25 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByKeys(sortOrder25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) false, (java.lang.Comparable) 3);
        java.lang.Comparable comparable12 = defaultKeyedValues2D1.getRowKey(0);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + false + "'", comparable12, false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        java.util.List list7 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.setValue((java.lang.Number) (byte) -1, (java.lang.Comparable) (short) -1, (java.lang.Comparable) "");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (-1.0d), (java.lang.Comparable) (byte) 10);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10L, (java.lang.Comparable) 100L, (java.lang.Comparable) 1.0f);
        int int10 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '4');
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 'a', (java.lang.Comparable) (byte) 10);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D15 = new org.jfree.data.DefaultKeyedValues2D();
        int int17 = defaultKeyedValues2D15.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D15.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D15.clear();
        defaultKeyedValues2D15.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D15.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj28 = defaultKeyedValues2D15.clone();
        defaultKeyedValues2D15.addValue((java.lang.Number) 0, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10L);
        boolean boolean33 = defaultKeyedValues2D0.equals((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        defaultKeyedValues2D0.setValue((java.lang.Number) 5, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 5);
        java.util.List list12 = defaultKeyedValues2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
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
        defaultKeyedValues0.addValue((java.lang.Comparable) '#', (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        int int30 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeColumn((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        java.lang.Object obj25 = defaultKeyedValues0.clone();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D26 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list27 = defaultKeyedValues2D26.getRowKeys();
        int int28 = defaultKeyedValues2D26.getRowCount();
        int int29 = defaultKeyedValues2D26.getRowCount();
        boolean boolean31 = defaultKeyedValues2D26.equals((java.lang.Object) 10.0f);
        int int33 = defaultKeyedValues2D26.getColumnIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D34 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list35 = defaultKeyedValues2D34.getRowKeys();
        int int36 = defaultKeyedValues2D34.getRowCount();
        int int37 = defaultKeyedValues2D34.getRowCount();
        int int38 = defaultKeyedValues2D34.getColumnCount();
        boolean boolean39 = defaultKeyedValues2D26.equals((java.lang.Object) int38);
        boolean boolean40 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D26);
        int int41 = defaultKeyedValues0.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 35.0d + "'", number23, 35.0d);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
            java.lang.Comparable comparable20 = defaultKeyedValues2D0.getRowKey(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 10 + "'", number18, 10);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.insertValue(0, (java.lang.Comparable) (-1), (double) (byte) 1);
        java.lang.Number number16 = null;
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, number16);
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) 0L, (double) 1.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 4, (java.lang.Number) 3);
        defaultKeyedValues0.setValue((java.lang.Comparable) "", (double) (byte) 0);
        java.lang.Object obj28 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        java.lang.Object obj9 = defaultKeyedValues0.clone();
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) 1.0f, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
            java.lang.Comparable comparable20 = defaultKeyedValues0.getKey((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.util.List list6 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 2);
        int int9 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 10, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 10L);
        java.lang.Comparable comparable9 = defaultKeyedValues2D0.getColumnKey((int) (byte) 0);
        int int10 = defaultKeyedValues2D0.getColumnCount();
        defaultKeyedValues2D0.setValue((java.lang.Number) (-1.0f), (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0);
        int int15 = defaultKeyedValues2D0.getRowCount();
        int int16 = defaultKeyedValues2D0.getColumnCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues17 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues17.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean25 = defaultKeyedValues17.equals((java.lang.Object) 0L);
        int int27 = defaultKeyedValues17.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues17.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues17.addValue((java.lang.Comparable) (-1L), 1.0d);
        boolean boolean34 = defaultKeyedValues2D0.equals((java.lang.Object) defaultKeyedValues17);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10L + "'", comparable9, 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (byte) 0);
        int int9 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.addValue((java.lang.Comparable) 0.0f, (double) 0.0f);
        java.lang.Object obj13 = defaultKeyedValues0.clone();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (double) 100.0f);
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 10, (java.lang.Number) (byte) 10);
        defaultKeyedValues0.removeValue(3);
        java.util.List list22 = defaultKeyedValues0.getKeys();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) 0, (double) (byte) 100);
        defaultKeyedValues0.insertValue((int) (short) 1, (java.lang.Comparable) "", 0.0d);
        defaultKeyedValues0.removeValue((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) (byte) 10, (java.lang.Comparable) (byte) 10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
            defaultKeyedValues9.insertValue(100, (java.lang.Comparable) (-1L), (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
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
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        java.util.List list4 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100L, (java.lang.Comparable) 1);
        java.util.List list9 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        int int3 = defaultKeyedValues2D0.getRowCount();
        boolean boolean5 = defaultKeyedValues2D0.equals((java.lang.Object) 10.0f);
        java.lang.Object obj6 = defaultKeyedValues2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = defaultKeyedValues2D0.getValue((java.lang.Comparable) (byte) 1, (java.lang.Comparable) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Unrecognised columnKey: 0");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) (byte) 1, (-1.0d));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 0L + "'", comparable25, 0L);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) "", (double) 1.0f);
        java.lang.Comparable comparable9 = defaultKeyedValues0.getKey(0);
        int int10 = defaultKeyedValues0.getItemCount();
        defaultKeyedValues0.setValue((java.lang.Comparable) "hi!", (java.lang.Number) 100.0d);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "" + "'", comparable9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        java.util.List list6 = defaultKeyedValues2D1.getColumnKeys();
        defaultKeyedValues2D1.addValue((java.lang.Number) 1.0f, (java.lang.Comparable) false, (java.lang.Comparable) 3);
        java.util.List list11 = defaultKeyedValues2D1.getRowKeys();
        int int13 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 3);
        java.lang.Object obj14 = defaultKeyedValues2D1.clone();
        int int16 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) 10.0f);
        java.lang.Object obj17 = defaultKeyedValues2D1.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        java.lang.Object obj4 = defaultKeyedValues0.clone();
        int int6 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0f), (java.lang.Number) 0);
        java.util.List list10 = defaultKeyedValues0.getKeys();
        java.lang.Number number13 = null;
        defaultKeyedValues0.insertValue((int) (byte) 0, (java.lang.Comparable) '#', number13);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.setValue((java.lang.Comparable) 5, (double) 2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (java.lang.Number) 10.0d);
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 1, (double) 0L);
        java.util.List list11 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) 52.0d, (double) (short) 0);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10L, (java.lang.Number) 2);
        java.lang.Object obj18 = defaultKeyedValues0.clone();
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D1 = new org.jfree.data.DefaultKeyedValues2D(true);
        int int3 = defaultKeyedValues2D1.getRowIndex((java.lang.Comparable) '#');
        int int5 = defaultKeyedValues2D1.getColumnIndex((java.lang.Comparable) (-1.0d));
        defaultKeyedValues2D1.clear();
        defaultKeyedValues2D1.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) ' ', (java.lang.Comparable) 3);
        defaultKeyedValues2D1.removeColumn((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 10.0d, (java.lang.Number) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 100 + "'", comparable23, 100);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        int int10 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (-1.0d), (double) 100);
        defaultKeyedValues0.clear();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 100, (java.lang.Number) (byte) -1);
        defaultKeyedValues0.setValue((java.lang.Comparable) 3, (java.lang.Number) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
            java.lang.Comparable comparable28 = defaultKeyedValues0.getKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        defaultKeyedValues0.setValue((java.lang.Comparable) true, (double) '4');
        int int11 = defaultKeyedValues0.getIndex((java.lang.Comparable) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list15 = defaultKeyedValues2D14.getRowKeys();
        int int16 = defaultKeyedValues2D14.getRowCount();
        int int17 = defaultKeyedValues2D14.getRowCount();
        int int19 = defaultKeyedValues2D14.getRowIndex((java.lang.Comparable) '4');
        int int20 = defaultKeyedValues2D14.getRowCount();
        org.jfree.data.DefaultKeyedValues defaultKeyedValues21 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues21.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues25 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues25.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean29 = defaultKeyedValues21.equals((java.lang.Object) 0L);
        int int31 = defaultKeyedValues21.getIndex((java.lang.Comparable) 1L);
        int int33 = defaultKeyedValues21.getIndex((java.lang.Comparable) (byte) 10);
        java.lang.Object obj34 = defaultKeyedValues21.clone();
        boolean boolean35 = defaultKeyedValues2D14.equals(obj34);
        defaultKeyedValues2D14.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) (short) 0, (java.lang.Comparable) "hi!");
        java.lang.Comparable comparable41 = defaultKeyedValues2D14.getRowKey(0);
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) 100, (java.lang.Comparable) '4');
        int int45 = defaultKeyedValues2D14.getColumnCount();
        boolean boolean46 = defaultKeyedValues0.equals((java.lang.Object) int45);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue((int) 'a', (java.lang.Comparable) 97.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + (short) 0 + "'", comparable41, (short) 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.addValue((java.lang.Comparable) (short) 10, (java.lang.Number) 1L);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D4 = new org.jfree.data.DefaultKeyedValues2D();
        int int6 = defaultKeyedValues2D4.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D4.clear();
        defaultKeyedValues2D4.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D4.removeColumn((java.lang.Comparable) 10L);
        boolean boolean17 = defaultKeyedValues0.equals((java.lang.Object) defaultKeyedValues2D4);
        defaultKeyedValues2D4.removeValue((java.lang.Comparable) (byte) -1, (java.lang.Comparable) (-1));
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D21 = new org.jfree.data.DefaultKeyedValues2D();
        int int23 = defaultKeyedValues2D21.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D21.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D21.clear();
        defaultKeyedValues2D21.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int33 = defaultKeyedValues2D21.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D21.removeValue((java.lang.Comparable) 10L, (java.lang.Comparable) 0L);
        java.util.List list37 = defaultKeyedValues2D21.getRowKeys();
        java.lang.Number number38 = null;
        defaultKeyedValues2D21.addValue(number38, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) (byte) 1);
        boolean boolean42 = defaultKeyedValues2D4.equals((java.lang.Object) (byte) 0);
        java.util.List list43 = defaultKeyedValues2D4.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        defaultKeyedValues2D0.removeRow((int) (byte) 0);
        int int15 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 1);
        java.util.List list16 = defaultKeyedValues2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        int int28 = defaultKeyedValues2D0.getRowCount();
        java.lang.Comparable comparable29 = null;
        java.lang.Comparable comparable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeValue(comparable29, comparable30);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        int int3 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.addValue((java.lang.Number) (byte) 100, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        int int8 = defaultKeyedValues2D0.getRowCount();
        java.util.List list9 = defaultKeyedValues2D0.getColumnKeys();
        defaultKeyedValues2D0.removeColumn((int) (byte) 0);
        defaultKeyedValues2D0.removeRow((int) (byte) 0);
        int int14 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = defaultKeyedValues2D0.getValue(3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
            java.lang.Comparable comparable15 = defaultKeyedValues2D0.getRowKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 4, (double) (short) 0);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.util.List list1 = defaultKeyedValues2D0.getRowKeys();
        int int2 = defaultKeyedValues2D0.getRowCount();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 10, (java.lang.Comparable) 1L);
        int int7 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues2D0.removeRow(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0f, (java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = defaultKeyedValues2D0.getValue(2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        org.jfree.data.DefaultKeyedValues defaultKeyedValues4 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues4.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        boolean boolean8 = defaultKeyedValues0.equals((java.lang.Object) 0L);
        defaultKeyedValues0.addValue((java.lang.Comparable) (byte) -1, (java.lang.Number) 100L);
        int int13 = defaultKeyedValues0.getIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D14 = new org.jfree.data.DefaultKeyedValues2D();
        int int16 = defaultKeyedValues2D14.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D14.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D14.clear();
        defaultKeyedValues2D14.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D14.removeColumn((java.lang.Comparable) 10L);
        java.lang.Object obj27 = defaultKeyedValues2D14.clone();
        boolean boolean28 = defaultKeyedValues0.equals(obj27);
        defaultKeyedValues0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = defaultKeyedValues0.getValue((java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Key not found: a");
        } catch (org.jfree.data.UnknownKeyException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        int int21 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        defaultKeyedValues0.clear();
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        defaultKeyedValues0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 0 + "'", comparable18, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        int int12 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        defaultKeyedValues2D0.setValue((java.lang.Number) 10.0f, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (byte) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.clear();
        int int19 = defaultKeyedValues2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = defaultKeyedValues2D0.getValue((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        defaultKeyedValues2D0.removeColumn((java.lang.Comparable) 1.0d);
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
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        int int43 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 52.0d);
        int int45 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable47 = defaultKeyedValues2D0.getColumnKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        java.lang.Comparable comparable26 = defaultKeyedValues0.getKey((int) (short) 1);
        defaultKeyedValues0.removeValue((int) (byte) 1);
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D29 = new org.jfree.data.DefaultKeyedValues2D();
        int int31 = defaultKeyedValues2D29.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D29.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        java.util.List list35 = defaultKeyedValues2D29.getColumnKeys();
        defaultKeyedValues2D29.setValue((java.lang.Number) 1.0d, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1L));
        java.util.List list40 = defaultKeyedValues2D29.getRowKeys();
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D41 = new org.jfree.data.DefaultKeyedValues2D();
        defaultKeyedValues2D41.removeValue((java.lang.Comparable) (short) 1, (java.lang.Comparable) '#');
        defaultKeyedValues2D41.addValue((java.lang.Number) 0, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (byte) 1);
        boolean boolean49 = defaultKeyedValues2D29.equals((java.lang.Object) (byte) 1);
        boolean boolean50 = defaultKeyedValues0.equals((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number52 = defaultKeyedValues0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (short) 0 + "'", comparable26, (short) 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        defaultKeyedValues0.setValue((java.lang.Comparable) (short) 0, (java.lang.Number) 0L);
        defaultKeyedValues0.setValue((java.lang.Comparable) 10, (java.lang.Number) (short) 1);
        java.lang.Comparable comparable8 = defaultKeyedValues0.getKey((int) (short) 0);
        defaultKeyedValues0.removeValue((java.lang.Comparable) (short) 100);
        defaultKeyedValues0.setValue((java.lang.Comparable) 2, (double) 0L);
        int int15 = defaultKeyedValues0.getIndex((java.lang.Comparable) true);
        java.lang.Comparable comparable17 = defaultKeyedValues0.getKey((int) (byte) 0);
        defaultKeyedValues0.addValue((java.lang.Comparable) 3, (java.lang.Number) 1.0d);
        defaultKeyedValues0.clear();
        java.util.List list22 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.insertValue(100, (java.lang.Comparable) 3, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 0 + "'", comparable8, (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 0 + "'", comparable17, (short) 0);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        java.util.List list22 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.setValue((java.lang.Comparable) (-1.0d), (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + 0L + "'", number21, 0L);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
            defaultKeyedValues0.sortByKeys(sortOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        java.lang.Object obj1 = defaultKeyedValues2D0.clone();
        int int3 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 1.0f, (java.lang.Comparable) 3);
        java.util.List list8 = defaultKeyedValues2D0.getRowKeys();
        int int9 = defaultKeyedValues2D0.getRowCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        int int17 = defaultKeyedValues2D1.getColumnCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
        defaultKeyedValues0.setValue((java.lang.Comparable) 35.0d, (java.lang.Number) 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.jfree.data.DefaultKeyedValues defaultKeyedValues0 = new org.jfree.data.DefaultKeyedValues();
        int int2 = defaultKeyedValues0.getIndex((java.lang.Comparable) 10.0f);
        defaultKeyedValues0.addValue((java.lang.Comparable) 0L, (java.lang.Number) (-1L));
        java.util.List list6 = defaultKeyedValues0.getKeys();
        java.util.List list7 = defaultKeyedValues0.getKeys();
        defaultKeyedValues0.addValue((java.lang.Comparable) 100.0d, (java.lang.Number) (-1));
        org.jfree.chart.util.SortOrder sortOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultKeyedValues0.sortByValues(sortOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.jfree.data.DefaultKeyedValues2D defaultKeyedValues2D0 = new org.jfree.data.DefaultKeyedValues2D();
        int int2 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 10);
        defaultKeyedValues2D0.removeValue((java.lang.Comparable) 100.0d, (java.lang.Comparable) 0);
        defaultKeyedValues2D0.clear();
        defaultKeyedValues2D0.setValue((java.lang.Number) 10, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0d);
        defaultKeyedValues2D0.clear();
        java.util.List list12 = defaultKeyedValues2D0.getRowKeys();
        int int14 = defaultKeyedValues2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int16 = defaultKeyedValues2D0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list17 = defaultKeyedValues2D0.getRowKeys();
        int int18 = defaultKeyedValues2D0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }
}

